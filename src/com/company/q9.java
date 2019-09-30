package com.company;

import java.io.*;

public class q9 {

    // Displaying file property
    public static void main(String[] args) {

        //write the content in file
        try(FileWriter fileWriter = new FileWriter("Heelo.txt")) {
            String fileContent = "This is a sample text.";
            fileWriter.write(fileContent);
        } catch (IOException e) {
            // exception handling
        }

// read the content from file
        int count =0;
        try(FileReader fileReader = new FileReader("Heelo.txt")) {
            int ch = fileReader.read();
            while(ch != -1) {
                System.out.print((char)ch);
                ch = fileReader.read();
                count++;
            }
        } catch (FileNotFoundException e) {
            // exception handling
        } catch (IOException e) {
            // exception handling
        }
        System.out.println();
        System.out.println("frequency :"+count);
    }
}
