// This Java program demonstrate how switch statement really works

package JavaNote.ControlStatementsInJava.SwitchInJava;

public class SwitchStatement{

    public static void main(String[] args) {

        String today="Thu"

        switch(today){

            case "Sun" : 
            System.out.println("Today is Sunday.");
            break;

            case "Mon" : 
            System.out.println("Today is Monday.");
            break;

            case "Tue" : 
            System.out.println("Today is Tuesday.");
            break;

            case "Wed" : 
            System.out.println("Today is Wednesday.");
            break;

            case "Thu" : 
            System.out.println("Today is Thursday.");
            break;

            case "Fri" : 
            System.out.println("Today is Friday.");
            break;

            case "Sat" : 
            System.out.println("Today is Saturday.");
            break;

            default:
            System.out.println("Invalid value");
            break;

        }
        
    }

}