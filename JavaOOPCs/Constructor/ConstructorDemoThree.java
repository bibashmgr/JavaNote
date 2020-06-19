// there is no copy constructor in java but
// this Java program demonstrates how we can copythe values from one object to another object.

package JavaNote.JavaOOPCs.Constructor;

public class ConstructorDemoThree{
    
    int rollNum;  
    String userName;

    ConstructorDemoThree(int r,String s){

        rollNum = r;  
        userName = s;  
    }  
     
    ConstructorDemoThree(ConstructorDemoThree obj){

        rollNum = obj.rollNum;  
        userName = obj.userName;

    }

    void display(){
 
        System.out.println( rollNum + " " + userName );
    
    }  
   
    public static void main(String args[]){

        ConstructorDemoThree obj1 = new ConstructorDemoThree(111,"Karan");  
        ConstructorDemoThree obj2 = new ConstructorDemoThree(obj1);

        obj1.display(); 
        obj2.display();

   } 

}  