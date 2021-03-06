package javalab.Lab03.variablesInJava;

class StaticVariables{

   static int num1 ;  // static variables are declared
   static int num2 ;

}
      
    class StaticVariablesDemo { 
        public static void main(String args[]) 
        {   
            // accessing static variables without using object
            StaticVariables.num1 = 10;
            StaticVariables.num2 = 20;  
      

            // displaying results

            System.out.println("The total is:" + StaticVariables.num1 + StaticVariables.num2 );

        }

}