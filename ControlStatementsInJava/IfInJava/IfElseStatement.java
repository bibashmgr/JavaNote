// this program demonstrate the use of if else statement

package java.Note.ControlStatementsInJava.IfInJava;

public class IfElseStatement {

    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 10;

        if (num1 % 2 == 0){

            System.out.println("Even");

        }
        else{

            System.out.println("Odd");

        }

    //USING TERNARY OPERATOR

    String result = (num2 % 2 ==0 )?"Even":"Odd";
    System.out.println(result);
    /*
    Here,if the condition is true then the result of ? is returned. 
    But, if the condition is false, the result of : is returned.
    */

    }

}