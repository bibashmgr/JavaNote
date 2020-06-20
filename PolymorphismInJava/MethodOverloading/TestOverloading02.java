//this java program how overloading is done in Java by changing the data types of arguments.

package JavaNote.PolymorphismInJava.MethodOverloading;

class Adder02{

    static int add(int a,int b){

        return a+b;
        
    }

    static float add(float a,float b){

        return a+b;

    }

}

public class TestOverloading02 { 
    public static void main(String[] args){ 

        System.out.println(Adder02.add(11,11));  
        System.out.println(Adder02.add(15.5f,15.2f));  
    
    }
    
}