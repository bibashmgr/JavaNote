package javalab.Lab07.JavaAWT.Basics;

import java.awt.*;

class AssocDemo{

    AssocDemo(){

        Frame f = new Frame();

        Button btn = new Button("Click me");
        // btn.setBounds(50,100,75,100);

        f.add(btn);

        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(null);

    }

    public static void main(String[] args) {
        
       AssocDemo obj = new AssocDemo();

    }

}