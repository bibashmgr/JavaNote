package javalab.Lab03.variablesInJava;

class InstanceVariables{

    int num1 ;  // instance variables are declared outside method
    int num2 ;

}
      
    class InstanceVariablesDemo { 
        public static void main(String args[]) 
        { 
            // creating objects

            InstanceVariables obj1 = new InstanceVariables(); 
            obj1.num1 = 10; 
            obj1.num2 = 20;  
      
             
            InstanceVariables obj2 = new InstanceVariables(); 
            obj2.num1 = 30; 
            obj2.num2 = 40;  
      
            // displaying results

            System.out.println("The total is:" + obj1.num1 + obj1.num2 );

            System.out.println("The total is:" + obj2.num1 + obj2.num2 );
        }

}