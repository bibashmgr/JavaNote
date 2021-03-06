package javalab.Lab04.packagesInJava.exampleOfPackage;

import javalab.Lab04.packagesInJava.exampleOfPackage.packageone.*;
import javalab.Lab04.packagesInJava.exampleOfPackage.packagetwo.*;

public class Task{
    
    public static void main(String[] args) {
        
        FirstClass obj1 = new FirstClass();
        SecondClass obj2 = new SecondClass();

        obj1.msgOne();
        obj2.msgtwo();

    }  
}