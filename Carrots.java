/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display an overloaded method with 3 carrots for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Carrots extends Thread
{ // creates an instance variable of Console
    private Console c;
    private Color carrot;
    private int movx;
    private int movy;

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

    // Draws the overloaded carrots going to the left
    public void carrots ()
    {
	Color stemGreen = new Color (113, 206, 70); //carrot stem colour
	Color floor = new Color (145, 149, 153); //floor colour

	// Draws the overloaded carrots
	for (int m = 1 ; m <= 700 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect ((485 + movx) - m, 295 + movy, 57, 77); // carrot erase

	    c.setColor (carrot);
	    c.fillArc ((500 + movx) - m, 260 + movy, 25, 100, 180, 180); // carrot body
	    c.setColor (stemGreen);
	    c.fillRect ((500 + movx) - m, 295 + movy, 3, 15); // line left most
	    c.fillRect ((505 + movx) - m, 295 + movy, 3, 15); // line left middle
	    c.fillRect ((510 + movx) - m, 295 + movy, 3, 15); // line middle
	    c.fillRect ((515 + movx) - m, 295 + movy, 3, 15); // line right middle
	    c.fillRect ((520 + movx) - m, 295 + movy, 3, 15); // line right
	    c.setColor (Color.black);
	    c.fillOval ((505 + movx) - m, 320 + movy, 4, 4); // eye right
	    c.fillOval ((515 + movx) - m, 320 + movy, 4, 4); // eye left
	    c.drawArc ((510 + movx) - m, 325 + movy, 3, 3, 180, 180); // mouth
	    c.drawArc ((485 + movx) - m, 322 + movy, 15, 10, 180, 180); // arm left
	    c.drawArc ((525 + movx) - m, 322 + movy, 15, 10, 180, 180); // arm right
	    c.drawLine ((505 + movx) - m, 355 + movy, (500 + movx) - m, 370 + movy); // leg left
	    c.drawLine ((518 + movx) - m, 355 + movy, (523 + movx) - m, 370 + movy); // leg right

	    try
	    {
		sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Carrots (Console con)
    {
	c = con;
	carrot = new Color (255, 148, 15);
    }


    public Carrots (Console con, Color n, int x)
    {
	c = con;
	carrot = n;
	movx = x;
    }


    public Carrots (Console con, Color n, int x, int y)
    {
	c = con;
	carrot = n;
	movx = x;
	movy = y;
    }


    public void run ()
    {
	scientist ();
	carrots ();
    }
}


