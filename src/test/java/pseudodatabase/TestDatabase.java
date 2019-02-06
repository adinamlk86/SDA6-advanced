package pseudodatabase;

import org.junit.Assert;
import org.junit.Test;

import pseudodatabase.record.Record;

public class TestDatabase {

    @Test
    public void testDatabase() {

        Database db = new Database();
        Record a = new BankAccountForDB(500, new IntegerKey(1234));
        db.insert(a);
        IntegerKey k = new IntegerKey(567);
        Record b = new BankAccountForDB(1000, k);
        db.insert(b);
        Record r = db.find(k);
        System.out.println(((BankAccountForDB)r).getFunds());

        Record c = new BankAccountForDB(1500,new IntegerKey(632));
        db.insert(c);

        System.out.println(db.toString());
        db.delete(k);
        System.out.println(db.toString());


    }
}
