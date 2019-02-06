package pseudodatabase;

import pseudodatabase.key.FancyKey;
import pseudodatabase.key.Key;
import pseudodatabase.record.Record;

public class BankAccountForDB implements Record {
    private int funds;
    private Key key;

    public BankAccountForDB(int key, int funds) {
        this.key = new FancyKey(key);
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
        return "BankAccount: " +getKey() + ", Funds - " + funds;
    }


    @Override
    public Key getKey() {
        return key;
    }
}
