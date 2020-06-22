// this java program demonstrates how abstract class is used in Java
// here ,abstract method is not used


package JavaNote.AbstractionInJava.Abstract;

abstract class TaskDemo01{

    public void toDo(){

        System.out.println("The Java program is compiled and ready to run.");

    }

}

public class ExampleOne extends TaskDemo01{

    public static void main(String[] args){

        ExampleOne obj = new ExampleOne();
        
        obj.toDo();

    } 

}