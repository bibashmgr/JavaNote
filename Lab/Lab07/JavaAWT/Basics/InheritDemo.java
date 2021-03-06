package javalab.Lab07.JavaAWT.Basics;

import java.awt.*;

class InheritDemo extends Frame{

    InheritDemo(){

        Button btn = new Button("Click Me");
        btn.setBounds(120,20,120,20);

        add(btn);

        setVisible(true);
        setSize(300,300);
        setLayout(null);

    }

    public static void main(String[] args) {
        
        new InheritDemo();

    }

}