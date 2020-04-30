package JavaNote.ControlStatementsInJava.SwitchInJava;

import javax.security.auth.Subject;

public class NestedSwitch {

    String year = "Second";
    String Subject ="Java";

    switch (year) {
        
        case "First":
        
            switch (Subject) {

                case "C":
                System.out.println("Lets start C class");    
                break;
            
                case "C++"
                System.out.println("Lets start C++ class");
             break;

                case "WT"
                System.out.println("Lets start WT class");
                break;
        
                default:
                System.out.println("So you are here to study physics");
                break;

            }
        break;
        
        case "Second":

            switch (Subject) {

                case "Java"
                System.out.println("Lets start Java class");
                break;
                    
                case "DSA"
                System.out.println("Lets start DSA class");
                break;
            
                default:
                System.out.println("So you are here to study the boring math class");
                break;

            }
    
        default:
        System.out.println("YOU HAVENOT REACHED THAT LEVEL YETTT.");
        break;
    }
}