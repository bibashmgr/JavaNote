package javalab.Lab04.exceptionHandlingInJava;

public class FinallyKeyword
{

    public static void main(String args[]){

        try{

            int num = 1/0 ;
            System.out.println(num*0);

        }
        catch(ArithmeticException e ){

            System.out.println(e);

        }
        finally{

            System.out.println("Final block is always executed");

        }

        System.out.println("Rest of the code");
    
    }

}