package pseudodatabase;

import org.junit.Assert;
import org.junit.Test;
import pseudodatabase.key.FancyKey;
import pseudodatabase.key.Key;
import pseudodatabase.record.Record;

public class TestDatabase {

    @Test
    public void testDatabase() {

        Database db = new Database();
        Record account = new BankAccountForDB(6, 500);
        Record account2 = new BankAccountForDB(12, 400);
        Record account3 = new BankAccountForDB(31, 4200);
        Record account4 = new BankAccountForDB(6, 1500);


        db.insert(account);
        db.insert(account2);
        db.insert(account3);
        db.insert(account4);

        System.out.println(db.toString());

        Record newAccount = db.find(account3.getKey());

        Assert.assertEquals(account3.getKey(), newAccount.getKey());

        db.delete(account.getKey());
        System.out.println(db.toString());

    }
}
