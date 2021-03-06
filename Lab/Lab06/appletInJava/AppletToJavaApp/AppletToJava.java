package javalab.Lab06.appletInJava.AppletToJavaApp;

// removing the import files and extended Applet class
public class AppletToJava
{
	// making the init method a constructor
	AppletToJava()
	{

        System.out.println("Applet is Initialized.");
        
	}

	public void start()
	{

        System.out.println("Applet is Started.");
        
	}
	public void stop()
	{

        System.out.println("Applet is stopped.");
        
	}
	public void destroy()
	{

        System.out.println("Applet is Destroyed");
        
	}


    // Adding main function
	public static void main(String[] args) {

		AppletToJava obj = new AppletToJava();
                
         // calling the functions

		obj.start();
		obj.stop();
        obj.destroy();
            
        }
        
}