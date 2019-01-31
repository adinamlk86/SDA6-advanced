package bankaccount;

import org.junit.Test;

public class TestBankAccount {

    @Test
    public void testIfBankAccountWorks(){

        BankAccount firstAccount = new BankAccount(100);

        firstAccount.addFunds(50);
        firstAccount.removeFunds(100);

        System.out.println(firstAccount.toString());
        firstAccount.removeFunds(100);
        System.out.println(firstAccount.toString());
        firstAccount.removeFunds(50);
        System.out.println(firstAccount.toString());
    }
}
