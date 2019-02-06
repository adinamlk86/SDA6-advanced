package pseudodatabase;


import pseudodatabase.key.Key;

public class IntegerKey implements Key {
    private int key;

    public IntegerKey(int key) {
        this.key = key;
    }

    @Override
    public boolean equals(Key key) {

        return ( this.key == ((IntegerKey)key).getInt() );

    }

    public int getInt(){
        return key;
    }
}
