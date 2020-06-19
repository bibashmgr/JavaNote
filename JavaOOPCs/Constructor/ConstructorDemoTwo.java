//this java program demonstrates how parameterized constructor are created.

package JavaNote.JavaOOPCs.Constructor;

public class ConstructorDemoTwo {

    int rollNum;
    String studentName;

    ConstructorDemoTwo(int r,String s){

        System.out.println( r + " " + s);

    }

    public static void main(String[] args) {
        
        ConstructorDemoTwo obj = new ConstructorDemoTwo(63,"Buddho");

    }
    
}