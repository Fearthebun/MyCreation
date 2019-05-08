/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a chicken that breathes fire for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Chicken extends Thread
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


    // Draws the chicken going left
    public void chicken ()
    {
	Color floor = new Color (145, 149, 153); //floor colour
	Color darkYellow = new Color (255, 204, 53); //chicken beak+leg colour
	Color darkRed = new Color (255, 30, 30); //chicken comb colour

	for (int m = 1 ; m <= 1 ; m++)
	{
	    c.setColor (darkYellow);
	    c.fillRect (388 - m, 400, 17, 5); //beak top
	    c.fillRect (388 - m, 405, 17, 5); //beak bottom
	    c.drawLine (450 - m, 440, 440, 450); //leg
	    c.fillOval (432 - m, 450, 10, 5); //foot

	    c.setColor (darkRed);
	    c.fillOval (413 - m, 383, 6, 12); //chicken comb left
	    c.fillOval (418 - m, 380, 6, 16); //chicken comb middle
	    c.fillOval (423 - m, 383, 6, 12); //chicken comb right

	    c.setColor (Color.white);
	    c.fillOval (405 - m, 390, 32, 32); //head
	    c.fillArc (420 - m, 380, 55, 60, 180, 180); //body

	    c.setColor (Color.black);
	    c.fillOval (413 - m, 398, 7, 7); //eye
	}

	for (int b = 1 ; b <= 5 ; b++)
	{
	    c.setColor (floor);
	    c.fillRect (387, 401 - b, 17, 5); //beak top
	    c.fillRect (387, 404 + b, 17, 5); //beak bottom

	    c.setColor (darkYellow);
	    c.fillRect (387, 400 - b, 17, 5); //beak top
	    c.fillRect (387, 405 + b, 17, 5); //beak bottom

	    try
	    {
		Thread.sleep (50);
	    }
	    catch (Exception e)
	    {
	    }
	}

	for (int f = 1 ; f <= 400 ; f++)
	{
	    c.setColor (floor);
	    c.fillOval (390 - f, 401, 9, 9); //fireball erase

	    c.setColor (Color.red);
	    c.fillOval (389 - f, 401, 9, 9); //fireball
	    c.setColor (Color.orange);
	    c.fillOval (389 - f, 401, 7, 7); //fireball inside
	    c.setColor (Color.yellow);
	    c.fillOval (389 - f, 401, 5, 5); //fireball inside

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}

	for (int b = 1 ; b <= 5 ; b++)
	{
	    c.setColor (floor);
	    c.fillRect (387, 394 + b, 17, 5); //beak top
	    c.fillRect (387, 411 - b, 17, 5); //beak bottom

	    c.setColor (darkYellow);
	    c.fillRect (387, 395 + b, 17, 5); //beak top
	    c.fillRect (387, 410 - b, 17, 5); //beak bottom

	    try
	    {
		Thread.sleep (50);
	    }
	    catch (Exception e)
	    {
	    }
	}

	for (int m = 1 ; m <= 500 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect (388 - m, 380, 87, 75);

	    c.setColor (darkYellow);
	    c.fillRect (387 - m, 400, 17, 5); //beak top
	    c.fillRect (387 - m, 405, 17, 5); //beak bottom
	    c.drawLine (449 - m, 440, 440 - m, 450); //leg
	    c.fillOval (431 - m, 450, 10, 5); //foot

	    c.setColor (darkRed);
	    c.fillOval (412 - m, 383, 6, 12); //chicken comb left
	    c.fillOval (417 - m, 380, 6, 16); //chicken comb middle
	    c.fillOval (422 - m, 383, 6, 12); //chicken comb right

	    c.setColor (Color.white);
	    c.fillOval (404 - m, 390, 32, 32); //head
	    c.fillArc (419 - m, 380, 55, 60, 180, 180); //body

	    c.setColor (Color.black);
	    c.fillOval (412 - m, 398, 7, 7); //eye

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Chicken (Console con)    // Chicken class constructor
    {
	c = con;
    }


    public void run ()
    {
	scientist ();
	chicken ();
    }
}


