package javalab.Lab04.exceptionHandlingInJava;

import java.io.*;

class Test{

 void subTest()throws IOException{

  throw new IOException("ERROR 404:"); 

 } 

} 

public class ThrowsKeyword{ 

   public static void main(String args[]){  

    try{ 

     Test obj = new Test();  
     obj.subTest();

    }catch(Exception e){

        System.out.println("Exception handled.");
    
    }     
  
    System.out.println("Rest of the code.");

  }  

}  