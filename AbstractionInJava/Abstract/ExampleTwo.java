// this java program demonstrates how abstract class is used in Java
// here ,abstract method is used

//package JavaNote.AbstractionInJava.Abstract;

abstract class TaskDemo02{

    abstract void toDo();

}

public class ExampleTwo extends TaskDemo02{

    void toDo(){

        System.out.println("This Java program is running.");

    }

    public static void main(String[] args) {

            ExampleTwo obj = new ExampleTwo();

            obj.toDo();
        
    }
    
}