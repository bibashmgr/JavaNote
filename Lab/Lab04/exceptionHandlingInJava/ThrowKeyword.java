package javalab.Lab04.exceptionHandlingInJava;

public class ThrowKeyword{

    public static void main(String args[]) {

        int age = 17;

        if(age<18){
                
                throw new ArithmeticException("Sorry , you arenot allowed to enter this page. ");
    
         }
         
        else{
    
        System.out.println("Welocome to the page.");
        }

        System.out.println("Rest of the code");
 
    }
}