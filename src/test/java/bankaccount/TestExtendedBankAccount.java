package bankaccount;

import org.junit.Test;

public class TestExtendedBankAccount {
    @Test
    public void testIfExtendedBankAccountWorks(){
        ExtendedBankAccount extendedAccount = new ExtendedBankAccount(200,100);
        System.out.println(extendedAccount.toString());
        extendedAccount.addMonthlyInterest();
        System.out.println(extendedAccount.toString());
        extendedAccount.addMonthlyInterest();
        System.out.println(extendedAccount.toString());





    }
}
