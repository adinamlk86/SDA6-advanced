package io.serializable;

import java.io.*;


public class Main {

    public static void serialize(Person p, File file) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(p);
        } finally {
            System.out.println("Done.");
        }
    }

    public static Person deserialize(File file) throws IOException, ClassNotFoundException {
        Person p;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            p = (Person) objectInputStream.readObject();
        }
        return p;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p1 = new Person("Ana", "Banarescu");

        File file = new File("C:\\Users\\LENOVO\\IdeaProjects\\SDA6-advanced\\src\\main\\resources\\serializable\\file.txt");

        serialize(p1, file);
        Person p2 = deserialize(file);
        System.out.println(p2);


    }
}
