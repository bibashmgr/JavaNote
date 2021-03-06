package javalab.Lab06.appletInJava.lifecycleOfApplet;

import java.applet.Applet;
import java.awt.*;

public class AppletLifeCycle extends Applet
{

	public void init()
	{

        System.out.println("Applet is Initialized.");
        
	}
	public void start()
	{

        System.out.println("Applet is Started.");
        
	}
	public void paint(Graphics g)
	{

        g.drawString("Applet is Painted.", 50 , 50);
        
	}
	public void stop()
	{

        System.out.println(" Applet is Stopped.");
        
	}
	public void destroy()
	{ 

        System.out.println("Applet is Destroyed");
        
    }
    
}