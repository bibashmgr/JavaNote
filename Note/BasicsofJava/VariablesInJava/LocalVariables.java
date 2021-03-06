// This program defines what local variables are.

package java.Note.BasicsofJava.VariablesInJava;

public class LocalVariables {

    public void methodDemo(){

        // local variable declared inside method
        int num2 = 200 ;

        System.out.println("Second number:" + num2);

    }

    public static void main(String[] args) {

        // local variable declared inside main()
        int num1 = 100;

        System.out.println("First number:" + num1);
 
        // calling the method where local variable was declared earlier.
        LocalVariables obj = new LocalVariables();

        obj.methodDemo();

    }

}