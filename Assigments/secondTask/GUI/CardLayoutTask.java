package java.Assigments.secondTask.GUI;
import java.awt.*;

  
class CardLayoutTask
{  

    CardLayoutTask()
    {  
           
        Frame f = new Frame("Card layout");

        

        Button b1 = new Button("Apple");  
        Button b2 = new Button("Boy");  
        Button b3 = new Button("Cat");    
              
        f.add(b1);
        f.add(b2);
        f.add(b3);  
              
        f.setLayout(new CardLayout(20, 30));

        f.setVisible(true);
        f.setSize(300, 300);
    }  
  
    public static void main(String[] args) 
    {  
        new CardLayoutTask();  
    }  
} 