// this java program demonstrates how abstract class is used in Java

package JavaNote.AbstractionInJava.Abstract;

abstract class TaskDemo01{

    abstract void toDo();

}

public class ExampleOne{

    void toDo(){

        System.out.println("The Java program is compiled and ready to run.");

    }

    public static void main(String[] args){

        ExampleOne obj = new ExampleOne();
        
        obj.toDo();

    } 

}