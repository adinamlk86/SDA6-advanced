package bankaccount;

public class BankAccount {
    private int funds;

    public BankAccount(int funds) {
        this.funds = funds;
        System.out.println("Created a new bank account.");
    }

    public void addFunds(int fundsToBeAdded){
        this.funds +=fundsToBeAdded;
    }

    public boolean removeFunds(int fundsToBeRemoved){
        if(funds < fundsToBeRemoved){
            System.out.println("Not enough funds.");
            return false;
        } else {
            this.funds -=fundsToBeRemoved;
            System.out.println("Funds removed.");
            return true;
        }

    }

    public int getFunds() {
        return funds;
    }

    @Override
    public String toString() {
        return "BankAccount: " + "funds= " + funds;
    }


}
