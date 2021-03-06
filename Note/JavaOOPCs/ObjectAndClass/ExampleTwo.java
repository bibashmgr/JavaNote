// this java program demonstrates having the main method in another class

package JavaNote.JavaOOPCs.ObjectAndClass;

class Student {

    int idNumber = 2123 ;
    String studentName= "Yoddha" ;

}

public class ExampleTwo {

    public static void main(String[] args) {
        
        Student obj = new Student();

        System.out.println("The identification number of " + obj.studentName + " is " + obj.idNumber + "." );

    }
    
}