//this java program how overloading is done in Java by changing the numbers of arguments.

package JavaNote.PolymorphismInJava.MethodOverloading;

class Adder01{

    static int add(int a,int b){

        return a+b;
        
    }

    static int add(int a,int b,int c){

        return a+b+c;

    }

}

public class TestOverloading01 { 
    public static void main(String[] args){ 

        System.out.println(Adder01.add(11,11));  
        System.out.println(Adder01.add(11,11,11));  
    
    }
    
}