/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display an elephant for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Elephant2 extends Thread
{ // creates an instance variable of Console
    private Console c;

    // Draws elephant going to the left
    public void elephant2 ()
    {
	Color floor = new Color (145, 149, 153); //floor colour
	Color elephant2Pink = new Color (255, 117, 170); //elephant2 colour

	for (int m = 1 ; m <= 650 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect (709 - m, 266, 70, 47); //elephant2 erase

	    c.setColor (elephant2Pink);
	    c.fillOval (725 - m, 268, 20, 20); //head
	    c.fillRoundRect (735 - m, 280, 30, 25, 10, 10); //body
	    c.fillRect (736 - m, 303, 8, 10); //leg left
	    c.fillRect (756 - m, 303, 8, 10); //leg right
	    c.fillArc (709 - m, 265, 20, 20, 180, 180); //trunk
	    c.fillArc (763 - m, 280, 15, 15, 180, 180); //tail
	    c.fillArc (737 - m, 266, 12, 12, 315, 180); //ear

	    c.setColor (floor);
	    c.fillArc (714 - m, 270, 10, 10, 180, 180); //trunk erase
	    c.fillArc (765 - m, 282, 10, 10, 180, 180); //trunk erase

	    c.setColor (Color.black);
	    c.fillArc (725 - m, 270, 8, 8, 180, 180); //sunglasses

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Elephant2 (Console con)    // Elephant2 class constructor
    {
	c = con;
    }


    public void run ()
    {
	elephant2 ();
    }
}
