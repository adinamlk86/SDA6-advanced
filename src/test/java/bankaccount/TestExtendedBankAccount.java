package bankaccount;

import org.junit.Test;

public class TestExtendedBankAccount {
    @Test
    public void testIfExtendedBankAccountWorks(){
        ExtendedBankAccount extendedAccount = new ExtendedBankAccount(200,15);
        System.out.println(extendedAccount.toString());
        extendedAccount.addMonthlyInterest();
        System.out.println(extendedAccount.toString());
        extendedAccount.addMonthlyInterest();
        System.out.println(extendedAccount.toString());

        BankAccount newAccount = new ExtendedBankAccount(100,5);
        System.out.println(newAccount.toString());








    }
}
