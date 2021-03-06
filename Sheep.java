/*  Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a sheep for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Sheep extends Thread
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


    // Draws a sheep going to the left
    public void sheep ()
    {
	Color floor = new Color (145, 149, 153); //floor colour
	Color skin = new Color (255, 246, 219); //skin colour

	for (int m = 1 ; m <= 310 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect (131 - m, 360, 177, 110); //erase

	    c.setColor (skin);
	    c.fillRect (170 - m, 440, 20, 30); //leg left
	    c.fillRect (270 - m, 440, 20, 30); //leg right
	    c.setColor (Color.white);
	    c.fillRoundRect (160 - m, 380, 140, 60, 20, 20); //body
	    c.fillOval (287 - m, 375, 20, 20); //tail
	    c.setColor (skin);
	    c.fillOval (140 - m, 360, 40, 40); //head
	    c.fillOval (130 - m, 362, 20, 10); //ear left
	    c.fillOval (170 - m, 362, 20, 10); //ear right
	    c.setColor (Color.black);
	    c.drawArc (150 - m, 375, 7, 7, 15, 180); //eye left
	    c.drawArc (162 - m, 375, 7, 7, 15, 180); //eye right
	    c.fillArc (156 - m, 378, 10, 10, 180, 180); //mouth

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Sheep (Console con)    // Sheep class constructor
    {
	c = con;
    }


    public void run ()
    {
	scientist ();
	sheep ();
    }
}
