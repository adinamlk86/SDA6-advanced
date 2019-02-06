package pseudodatabase.record;

import org.junit.Assert;
import org.junit.Test;
import pseudodatabase.key.FancyKey;
import pseudodatabase.key.Key;


public class TestFancyRecord {

    @Test
    public void testSuccessfulGetKeyFromRecord(){

        Key myKey = new FancyKey(5);
        Record myRecord = new FancyRecord(myKey);
        System.out.println(myRecord.getKey());

    }
}
