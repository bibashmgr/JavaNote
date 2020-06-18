// this java program illustrates how to define the class

// the main method is declared within the same class.

package JavaNote.JavaOOPCs.ObjectAndClass;

public class ExampleOne{

    //instance variables
    int idNumber = 679;
    String studentName = "Gorkheyyy";

    public static void main(String[] args) {
        
        ExampleOne obj = new ExampleOne();

        System.out.println("The identification number of " + obj.studentName + " is " + obj.idNumber + "." );

    }

}