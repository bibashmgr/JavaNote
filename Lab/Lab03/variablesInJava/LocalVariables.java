package javalab.Lab03.variablesInJava;

public class LocalVariables{

    public void methodLocal(){

        int num1 = 10 ; //local variable declared inside method

        System.out.println("The First local number is:" + num1);
        
    }

    public void main(String args[]){
        
        int num2 = 20 ; //local variables declared inside main()
        int num3 = 30 ;
        int num4 = num2 + num3 ;
        
        // displaying local variables that is declared inside the method

        LocalVariables obj = new LocalVariables();
        obj.methodLocal();

        // displaying local variables that is declared inside main() method
        System.out.println("The Second local number is:" + num4 );


    }
}