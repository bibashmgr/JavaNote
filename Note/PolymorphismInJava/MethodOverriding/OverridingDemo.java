//Java Program to illustrate the use of Java Method Overriding  

package JavaNote.PolymorphismInJava.MethodOverriding;

class Task{

    void toDo(){
        
        System.out.println("created a file named as OverridingDemo.java");
    } 

}  

class OverridingDemo extends Task{

    void toDo(){

        System.out.println("created a file named as OverridingDemo.java");

    }  
    
    public static void main(String args[]){

        OverridingDemo obj = new OverridingDemo();

        obj.toDo();

    }

  }  