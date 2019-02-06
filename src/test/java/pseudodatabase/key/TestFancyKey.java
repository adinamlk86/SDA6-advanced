package pseudodatabase.key;

import org.junit.Assert;
import org.junit.Test;

public class TestFancyKey {

    @Test
    public void testSuccessComparison(){

        Key myKey = new FancyKey(5);
        Key myOtherKey = new FancyKey(5);

        Assert.assertTrue(myKey.equals(myOtherKey));

        Key myBadKey = new FancyKey(6);
        Assert.assertFalse(myKey.equals(myBadKey));

    }
}
