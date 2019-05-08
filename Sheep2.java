/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a sheep for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Sheep2 extends Thread
{ // creates an instance variable of Console
    private Console c;

    // Draws a sheep going to the left
    public void sheep2 ()
    {
	Color floor = new Color (145, 149, 153); //floor colour
	Color skin = new Color (255, 246, 219); //skin colour

	for (int m = 1 ; m <= 725 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect (731 - m, 360, 177, 110); //erase
	   
	    c.setColor (skin);
	    c.fillRect (770 - m, 440, 20, 30); //leg left
	    c.fillRect (870 - m, 440, 20, 30); //leg right
	    c.setColor (Color.white);
	    c.fillRoundRect (760 - m, 380, 140, 60, 20, 20); //body
	    c.fillOval (887 - m, 375, 20, 20); //tail
	    c.setColor (skin);
	    c.fillOval (740 - m, 360, 40, 40); //head
	    c.fillOval (730 - m, 362, 20, 10); //ear left
	    c.fillOval (770 - m, 362, 20, 10); //ear right
	    c.setColor (Color.black);
	    c.drawArc (750 - m, 375, 7, 7, 15, 180); //eye left
	    c.drawArc (762 - m, 375, 7, 7, 15, 180); //eye right
	    c.fillArc (756 - m, 378, 10, 10, 180, 180); //mouth

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Sheep2 (Console con)    // Sheep2 class constructor
    {
	c = con;
    }

    public void run ()
    {
	sheep2 ();
    }
}
