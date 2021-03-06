package javalab.Lab06.appletInJava.PARAMtag;

import java.applet.Applet;
import java.awt.*;

public class ParamTag extends Applet
{

	public void paint(Graphics g)
	{

		String str = getParameter("message");
        g.drawString(str, 50, 50);
    
    }
    
}