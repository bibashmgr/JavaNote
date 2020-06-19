//this Java Program to demonstrate the use of static variable

//package JavaNote.JavaOOPCs.StaticKeyword;

class StudentOne{ 

    int rollNum;  
    String name;  
    static String college ="ITS";

    StudentOne(int r, String n){ 

    rollNum = r;  
    name = n;

    }  
     
    void display (){

        System.out.println(rollNum + " " + name + " " + college);

    }

}
 
 
public class StaticVarDemo{  
    public static void main(String args[]){  
  
    StudentOne obj1 = new StudentOne(111,"Karan");  
    StudentOne obj2 = new StudentOne(222,"Aryan");  
    
    obj1.display();  
    obj2.display();

  }

 } 