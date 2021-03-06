package javalab.Lab03.inheritanceInJava;

class SingleInheritanceOne // parent class
{ 
    public void helloWorld() // parent method
    { 
        System.out.println("Hello World"); 
    } 
} 
  
class SingleInheritanceTwo extends SingleInheritanceOne // child class
{ 
    public void welcomeToJava() // child method
    { 
        System.out.println("Welcome To Java"); 
    } 
} 

public class SingleInheritance
{ 
    public static void main(String[] args) 
    { 

        SingleInheritanceTwo obj = new SingleInheritanceTwo(); 

        obj.helloWorld();  // inheriting the method of parent class
        obj.welcomeToJava(); 
     
    } 
} 