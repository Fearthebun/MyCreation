/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display an elephant for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Elephant extends Thread
{ // creates an instance variable of Console
    private Console c;

    // Draws a scientist 
    public void scientist ()
    {
	Color skin = new Color (255, 220, 145); //skin
	Color hair = new Color (121, 130, 135); //hair colour

	for (int x = 0 ; x <= 70 ; x++)
	{
	    c.setColor (hair);
	    c.drawOval (200 - x / 2, 60 - x / 2, x, x); //hair
	}

	for (int x = 0 ; x <= 60 ; x++)
	{
	    c.setColor (skin);
	    c.drawOval (200 - x / 2, 65 - x / 2, x, x); //hair
	}

	for (int x = 0 ; x <= 70 ; x++)
	{
	    c.setColor (Color.yellow);
	    c.fillRoundRect (167, 133 - x / 2, 65, x, 30, 30); //body
	}

	for (int x = 0 ; x <= 20 ; x++)
	{
	    c.setColor (skin);
	    c.drawLine (189 + x, 88, 189 + x, 98); //neck
	    c.fillOval (249 - x / 2, 110 - x / 2, x, x); //hand right
	    c.fillOval (150 - x / 2, 110 - x / 2, x, x); //hand left
	    c.setColor (Color.blue);
	    c.drawLine (170 + x, 168, 170 + x, 218); // leg left
	    c.drawLine (209 + x, 168, 209 + x, 218); //leg right

	    c.setColor (Color.black);
	    c.fillArc (180 - x / 2, 210, x, 19, 0, 180); //foot right
	    c.fillArc (219 - x / 2, 210, x, 19, 0, 180); //foot left
	}

	for (int x = 0 ; x <= 20 ; x++)
	{
	    c.setColor (Color.white);
	    c.drawLine (167 + x, 98, 167 + x, 188); //coat left
	    c.drawLine (212 + x, 98, 212 + x, 188); //coat right
	}

	for (int x = 0 ; x <= 60 ; x++)
	{
	    c.setColor (skin);
	    c.drawOval (200 - x / 2, 65 - x / 2, x, x); //hair
	}

	for (int x = 30 ; x <= 0 ; x--)
	{
	    c.setColor (Color.yellow);
	    c.fillRoundRect (167 + x, 98 + x, 65, 70, x, x); //body
	}

	for (int x = 0 ; x <= 10 ; x++)
	{
	    c.setColor (Color.black);
	    c.fillOval (185, 60 - x / 2, 7, x); //eye left
	    c.fillOval (205, 60 - x / 2, 7, x); //eye right
	}

	c.drawArc (195, 65, 7, 5, 180, 180); //mouth
    }

    // Draws elephant going to the left
    public void elephant ()
    {
	Color floor = new Color (145, 149, 153); //floor colour
	Color elephantPink = new Color (255, 117, 170); //elephant colour

	for (int m = 1 ; m <= 200 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect (109 - m, 266, 70, 47); //elephant erase

	    c.setColor (elephantPink);
	    c.fillOval (125 - m, 268, 20, 20); //head
	    c.fillRoundRect (135 - m, 280, 30, 25, 10, 10); //body
	    c.fillRect (136 - m, 303, 8, 10); //leg left
	    c.fillRect (156 - m, 303, 8, 10); //leg right
	    c.fillArc (109 - m, 265, 20, 20, 180, 180); //trunk
	    c.fillArc (163 - m, 280, 15, 15, 180, 180); //tail
	    c.fillArc (137 - m, 266, 12, 12, 315, 180); //ear

	    c.setColor (floor);
	    c.fillArc (114 - m, 270, 10, 10, 180, 180); //trunk erase
	    c.fillArc (165 - m, 282, 10, 10, 180, 180); //trunk erase

	    c.setColor (Color.black);
	    c.fillArc (125 - m, 270, 8, 8, 180, 180); //sunglasses

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Elephant (Console con)    // Elephant class constructor
    {
	c = con;
    }


    public void run ()
    {
	scientist ();
	elephant ();
    }
}


