package JavaNote.ArrayInJava.AnonymousArrays;

public class Example01 {
    public static void main(String args[]){

        Task obj = new Task() ;
        obj.sumOfArrays(new int[]{5, 6, 4, 3, 5, 6}) ;

    }

    public void sumOfArrays(int a[]){

        int total = 0 ;

        for(int i: a){
      
            total = total + i ;
            
            System.out.println("The Total sum is : ") ;

        }

    } 
  
}
    
