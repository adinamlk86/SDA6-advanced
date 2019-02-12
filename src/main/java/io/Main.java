package io;

import java.io.*;


public class Main {

    public static void writeToFile(File file, String stringToBeWritten) throws IOException {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            String writeLine=stringToBeWritten;
            writer.write(writeLine);
            writer.close();
        } finally {
            System.out.println("Wrote line");
        }
    }

    public static void readFromFile(File file) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String fileLine;
            while ((fileLine = reader.readLine())!=null){
                System.out.println(fileLine);
            }
        } finally {
            System.out.println("The End");
        }
    }

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\LENOVO\\IdeaProjects\\SDA6-advanced\\src\\main\\resources\\io\\firstFile.txt");
        file.createNewFile();

        writeToFile(file,"line one\n");
        writeToFile(file,"line two\n");
        writeToFile(file,"line three\n");
        writeToFile(file,"line four\n");


        readFromFile(file);

    }
}
