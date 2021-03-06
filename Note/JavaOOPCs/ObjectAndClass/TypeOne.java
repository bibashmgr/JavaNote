// this java program demonstrates how to initialize the object through a reference variable.

package JavaNote.JavaOOPCs.ObjectAndClass;

public class TypeOne {

    String userName;
    int pointsMade;

    public static void main(String[] args) {
        
        TypeOne obj1 = new TypeOne();
        TypeOne obj2 = new TypeOne();

        obj1.userName = " topperKtoMoh " ;  
        obj1.pointsMade = 60 ;

        obj2.userName = " haudeyKtoMoh " ;  
        obj2.pointsMade = 100 ;
        
        
        System.out.println(obj1.userName + " : " + obj1.pointsMade );  
        System.out.println(obj2.userName + " : " + obj2.pointsMade );  

    }
    
}