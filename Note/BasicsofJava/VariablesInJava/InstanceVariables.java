// This program defines what instance variables are.

package java.Note.BasicsofJava.VariablesInJava;

public class Variables{

    // instance variables declared inside another class
    int num2 = 80;
    char grade2 = 'B';

    public static void main(String[] args) {
        
        System.out.println("Second number:" + num2);
        System.out.println("Grade:" + grade2);

    }

}

public class InstanceVariables {

    // instance variables declared inside the same class
    int num1 = 100;
    char grade1 = 'A';

    public static void main(String[] args) {
        
        System.out.println("First number:" + num1);
        System.out.println("Grade:" + grade1);

        // calling another class
        Variables obj = new Variables();

    }

}