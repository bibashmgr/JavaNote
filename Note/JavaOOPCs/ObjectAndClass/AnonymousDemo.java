// this java program define how anonymous object are used.

package JavaNote.JavaOOPCs.ObjectAndClass;

public class AnonymousDemo{

    void fact(int  n){
        int fact=1;

        for(int i=1;i<=n;i++){

        fact=fact*i;

    }

        System.out.println("factorial is "+fact);  
    }

   public static void main(String args[]){
       
        new AnonymousDemo().fact(5);
        //calling method with anonymous object 

   }

   }  