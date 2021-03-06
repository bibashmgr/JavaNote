package javalab.Lab03.inheritanceInJava;

class HierarchicalInheritanceOne // parent class
{ 
    public void helloWorld() // parent method
    { 
        System.out.println("Hello World"); 
    } 
} 
  
class HierarchicalInheritanceTwo extends HierarchicalInheritanceOne // first child class inheriting the above parent class
{ 
    public void welcomeToJava() // child method
    { 
        System.out.println("Welcome To Java"); 
    } 
}

class HierarchicalInheritanceThree extends HierarchicalInheritanceOne // second child class inheriting the same parent class
{
    public void beginTheClass()
    {
        System.out.println("Lets begin the class");
    }
}

public class HierarchicalInheritance
{ 
    public static void main(String[] args) 
    { 
        // Creating object for first child class
        HierarchicalInheritanceTwo obj1 = new HierarchicalInheritanceTwo(); 

       // inheriting the method of parent class
        obj1.welcomeToJava();
        obj1.helloWorld();

        // Creating object for second child class
        HierarchicalInheritanceThree obj2 = new HierarchicalInheritanceThree();

        // inheriting the method of parent class
        obj2.beginTheClass();
        obj2.helloWorld();

     
    } 
} 