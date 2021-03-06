package javalab.Lab05.Question01;

import java.io.FileWriter;
import java.io.IOException;

class CreateFile{
    
    public static void main(String[] args) throws IOException {

        String stringA="aa\nbb\ncc";
        String stringB="11\n22\n33";
        
        System.out.println("\nContent of a.txt:\n");
        System.out.println(stringA);

        System.out.println("\nContent b.txt:\n");
        System.out.println(stringB);

        FileWriter fa = new FileWriter("a.txt");
        FileWriter fb = new FileWriter("b.txt");

        for (int i=0; i< stringA.length();i++)
        {
            
            fa.write(stringA.charAt(i));

        }

        for (int i=0; i< stringB.length();i++)
        {

            fb.write(stringB.charAt(i));

        }

        fa.close();
        fb.close();

   }

}    