package generics;

import bankaccount.BankAccount;
import org.junit.Test;

public class TestMyClass {

    @Test
    public void test(){

        MyClass<String> a= new MyClass<>("first word", "second word");
        MyClass<Integer> b = new MyClass<>(1,5);
        MyClass c = new MyClass(new BankAccount(500), new BankAccount(1500));

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());


    }

}
