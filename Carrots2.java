/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display an overloaded method with 3 carrots2 for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Carrots2 extends Thread
{ // creates an instance variable of Console

    private Console c;
    private Color carrot;
    private int movx;
    private int movy;

    // Draws the overloaded carrots moving to the left
    public void carrots2 ()
    {
	Color stemGreen = new Color (113, 206, 70); //carrot stem colour
	Color floor = new Color (145, 149, 153); //floor colour

	for (int m = 1 ; m <= 265 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect ((685 + movx) - m, 295 + movy, 57, 77); //carrot erase

	    c.setColor (carrot);
	    c.fillArc ((700 + movx) - m, 260 + movy, 25, 100, 180, 180); //carrot body
	    c.setColor (stemGreen);
	    c.fillRect ((700 + movx) - m, 295 + movy, 3, 15); // line left most
	    c.fillRect ((705 + movx) - m, 295 + movy, 3, 15); // line left middle
	    c.fillRect ((710 + movx) - m, 295 + movy, 3, 15); // line middle
	    c.fillRect ((715 + movx) - m, 295 + movy, 3, 15); // line right middle
	    c.fillRect ((720 + movx) - m, 295 + movy, 3, 15); // line right
	    c.setColor (Color.black);
	    c.fillOval ((705 + movx) - m, 320 + movy, 4, 4); //eye right
	    c.fillOval ((715 + movx) - m, 320 + movy, 4, 4); //eye left
	    c.drawArc ((710 + movx) - m, 325 + movy, 3, 3, 180, 180); //mouth
	    c.drawArc ((685 + movx) - m, 322 + movy, 15, 10, 180, 180); //arm left
	    c.drawArc ((725 + movx) - m, 322 + movy, 15, 10, 180, 180); //arm right
	    c.drawLine ((705 + movx) - m, 355 + movy, (700 + movx) - m, 370 + movy); //leg left
	    c.drawLine ((718 + movx) - m, 355 + movy, (723 + movx) - m, 370 + movy); //leg right

	    try
	    {
		sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    public Carrots2 (Console con)
    {
	c = con;
	carrot = new Color (255, 148, 15);
    }


    public Carrots2 (Console con, Color n, int x)
    {
	c = con;
	carrot = n;
	movx = x;
    }


    public Carrots2 (Console con, Color n, int x, int y)
    {
	c = con;
	carrot = n;
	movx = x;
	movy = y;
    }


    public void run ()
    {
	carrots2 ();
    }
}


