package javalab.Lab04.exceptionHandlingInJava;

public class TryCatch {  
  
    public static void main(String[] args) {  
        try  
        {  

        int num = 1/0;
        System.out.println(num*0);

        }

        catch(ArithmeticException e)  
        {  
           
            System.out.println(e);

        }  
        System.out.println("Rest of the code");
          
    }  
      
}  