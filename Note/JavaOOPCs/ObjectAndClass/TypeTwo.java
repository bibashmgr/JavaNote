// this java program demonstrates how to initialize the object through method

package JavaNote.JavaOOPCs.ObjectAndClass;

public class TypeTwo {

    int rollNum ;
    char grade ;

    void insertData(int r,char g){

        rollNum = r ;
        grade = g ;

    }

    void displayData(){

        System.out.println( " The grade of student who has roll number " + " ' " + rollNum + " ' " + " is " + grade + "." );

    }

    public static void main(String[] args) {
        
        TypeTwo obj1 = new TypeTwo();
        TypeTwo obj2 = new TypeTwo();

        obj1.insertData(121, 'A');
        obj1.displayData();

        obj2.insertData(55, 'C');
        obj2.displayData();

    }
    
}