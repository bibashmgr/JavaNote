//Java Program to demonstrate the use of a static method.

//package JavaNote.JavaOOPCs.StaticKeyword;

class StudentDemoTwo{

    int rollno;  
    String name;  
    static String college = "GBS";  
    
    static void change(){

       college = "GCES";

    }  
     
    StudentDemoTwo(int r, String n){

       rollno = r;  
       name = n; 

    }  
     
    void display(){

       System.out.println(rollno+" "+name+" "+college);

    }

}

public class StaticMethodDemo { 
  
   public static void main(String args[]){

      StudentDemoTwo.change();  
    
      StudentDemoTwo s1 = new StudentDemoTwo(111,"Sumit");  
      StudentDemoTwo s2 = new StudentDemoTwo(222,"Rahapal");  
      StudentDemoTwo s3 = new StudentDemoTwo(333,"Rajan");  
    
      s1.display();  
      s2.display();  
      s3.display();
    
    }

}