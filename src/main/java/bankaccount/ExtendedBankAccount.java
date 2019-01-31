package bankaccount;

public class ExtendedBankAccount extends BankAccount {

    private int interestRate;

    public ExtendedBankAccount(int funds, int interestRate) {
        super(funds);
        this.interestRate = interestRate;
    }

    public void addMonthlyInterest(){
        // D = (suma * rata dobanzii * timpul pana la scadenta) / 100*360

        int monthlyInterest = (getFunds()*interestRate*31)/(365*100);
        addFunds(monthlyInterest);

    }

    @Override
    public String toString() {
        return "ExtendedBankAccount: Funds - " + getFunds()+"; InterestRate - " + interestRate;
    }
}
