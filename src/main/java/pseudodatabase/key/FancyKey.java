package pseudodatabase.key;

public class FancyKey implements Key{
    private final int key;

    public FancyKey(int key) {
        System.out.println("Key created!");
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Key - "+ key;
    }

    @Override
    public boolean equals(Key key) {
        FancyKey keyToCompareWith = (FancyKey) key;
        return this.key == keyToCompareWith.getKey();
    }
}
