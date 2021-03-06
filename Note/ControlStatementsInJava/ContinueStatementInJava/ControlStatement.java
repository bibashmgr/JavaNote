//This Java Program demonstrate the use of continue statement. 

package JavaNote.ControlStatementsInJava.ContinueStatementInJava;

public class ControlStatement {

    public static void main(String[] args) {  
 
        for(int i=1;i<=10;i++){

            if(i==5){

                continue;//it will skip the rest statement
                  
            } 

            System.out.println(i); 

        }

    }  
    
}