package java.Assigments.secondTask.GUI;
import java.awt.*;

  
public class GridLayoutTask{

    GridLayoutTask(){ 

        Frame f = new Frame();
        
        Button color1 = new Button("red");
        Button color2 = new Button("blue");
        Button color3 = new Button("green");
        Button color4 = new Button("black");


        f.add(color1);
        f.add(color2);
        f.add(color3);
        f.add(color4);
  
        f.setLayout(new GridLayout(2,2)); 
  
        f.setSize(800,800);  
        f.setVisible(true); 

}  
public static void main(String[] args) {  

    new GridLayoutTask();

}  
}  