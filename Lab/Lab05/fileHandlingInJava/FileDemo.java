package javalab.Lab05.fileHandlingInJava;

import java.io.*;

public class FileDemo {  
    public static void main(String[] args) {  
  
        try {  

            File file = new File("exampleFile.txt");

            if (file.createNewFile()) {

                System.out.println("New File is created!"); 

            } else {  

                System.out.println("File already exists."); 

            } 

        } catch (IOException e) { 

            e.printStackTrace(); 

        }  
  
    }  
}  