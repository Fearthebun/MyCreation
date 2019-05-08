/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display dialogue for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file

public class Dialogue
{ // creates an instance variable of Console
    private Console c;

    // Draws the background of the desk area.
    public void dialogue ()
    {

	c.setColor (Color.black);
	c.setFont (new Font ("Calibri", 0, 14));
	c.drawString ("Time to experiment!", 500, 140);
	
	try
	    {
		Thread.sleep (2000);
	    }
	    catch (Exception e)
	    {
	    }
    }
    
    public Dialogue (Console con)
    {
	c = con;
	dialogue ();
    }
}
