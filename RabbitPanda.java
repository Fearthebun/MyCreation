/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a rabbit panda hybrid for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class RabbitPanda extends Thread
{ // creates an instance variable of Console
    private Console c;

    // Draws the scientist
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

    // Draws a rabbit-panda hybrid that goes to the left
    public void rabbitPanda ()
    {
	Color floor = new Color (145, 149, 153); //floor colour

	for (int m = 1 ; m <= 400 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect (255 - m, 235, 118, 198); //rabbit panda erase

	    c.setColor (Color.black);
	    c.fillOval (280 - m, 235, 20, 70); //ear left
	    c.fillOval (320 - m, 235, 20, 70); //ear right

	    c.setColor (Color.white);
	    c.fillOval (280 - m, 275, 65, 65); //head
	    c.fillRoundRect (273 - m, 335, 80, 80, 30, 30); //body

	    c.setColor (Color.black);
	    c.fillArc (255 - m, 345, 35, 25, 90, 180); //hand left
	    c.fillArc (337 - m, 345, 35, 25, 270, 180); //hand right
	    c.fillArc (285 - m, 398, 25, 35, 180, 180); //leg left
	    c.fillArc (315 - m, 398, 25, 35, 180, 180); //leg right
	    c.fillOval (290 - m, 293, 18, 18); //eye patch left
	    c.fillOval (314 - m, 293, 18, 18); //eye patch right
	    c.drawLine (303 - m, 317, 311 - m, 322); //mouth left
	    c.drawLine (319 - m, 317, 311 - m, 322); //mouth right

	    c.setColor (Color.white);
	    c.drawArc (296 - m, 300, 6, 6, 0, 180); //eye left
	    c.drawArc (320 - m, 300, 6, 6, 0, 180); //eye right

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    public RabbitPanda (Console con)    // RabbitPanda class constructor
    {
	c = con;
    }


    public void run ()
    {
	scientist ();
	rabbitPanda ();
    }
}
