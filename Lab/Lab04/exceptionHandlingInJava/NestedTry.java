package javalab.Lab04.exceptionHandlingInJava;

public class NestedTry{

    public static void main(String args[]){

        try{

            try{

                int num = 1/0 ;
                System.out.println(num*0);

            }
            catch(ArithmeticException e){

                System.out.println(e);

            }

        }
        catch(Exception e){

            System.out.println("Exception occurs");

        }
        
        System.out.println("Rest of the code");

    }
}