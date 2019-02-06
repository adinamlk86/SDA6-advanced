package pseudodatabase;

import pseudodatabase.key.Key;
import pseudodatabase.record.Record;

import java.util.Arrays;

public class Database {
    private Record[] data;
    private int lastEmptyIndex;

    public Database() {
        lastEmptyIndex = 0;
        data = new Record[100];
    }

    public boolean insert(Record record) {
        if (lastEmptyIndex < 100) {
            data[lastEmptyIndex] = record;
            lastEmptyIndex++;
            System.out.println("Succesfully inserted record.");
            return true;
        }
        System.out.println("Error");
        return false;

    }

    public Record find(Key k) {
        for (Record x : data) {
            if (x.getKey().equals(k)) {
                return x;
            }
        }

        return null;
    }

    public boolean delete(Key k) {

        if (lastEmptyIndex != 0) {
            for (int i = 0; i < data.length; i++) {
                if (data[i].getKey().equals(k)) {
                    data[i] = null;
                    System.out.println("Account deleted!");
                    return true;
                }
            }
        } else {
            System.out.println("Database is empty");

        }
        System.out.println("Key not found");
        return false;
    }

    @Override
    public String toString() {

        return "Database: " + Arrays.toString(data);
    }
}