package pseudodatabase.record;

import pseudodatabase.key.Key;

public class FancyRecord implements Record {

    private final Key key;

    public FancyRecord(Key key) {
        System.out.println("Record created!");
        this.key = key;
    }


    @Override
    public Key getKey() {

        return key;
    }

    @Override
    public String toString() {
        return "FancyRecord{" +
                "key=" + key +
                '}';
    }
}
