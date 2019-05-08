/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a chicken that breathes fire for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Chicken2 extends Thread
{ // creates an instance variable of Console
    private Console c;

    // Draws the chicken going left
    public void chicken2 ()
    {
	Color floor = new Color (145, 149, 153); //floor colour
	Color darkYellow = new Color (255, 204, 53); //chicken2 beak+leg colour
	Color darkRed = new Color (255, 30, 30); //chicken2 comb colour

	for (int m = 1 ; m <= 490 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect (689 - m, 380, 87, 75);

	    c.setColor (darkYellow);
	    c.fillRect (688 - m, 400, 17, 5); //beak top
	    c.fillRect (688 - m, 405, 17, 5); //beak bottom
	    c.drawLine (750 - m, 440, 740 - m, 450); //leg
	    c.fillOval (732 - m, 450, 10, 5); //foot

	    c.setColor (darkRed);
	    c.fillOval (713 - m, 383, 6, 12); //chicken2 comb left
	    c.fillOval (718 - m, 380, 6, 16); //chicken2 comb middle
	    c.fillOval (723 - m, 383, 6, 12); //chicken2 comb right

	    c.setColor (Color.white);
	    c.fillOval (705 - m, 390, 32, 32); //head
	    c.fillArc (720 - m, 380, 55, 60, 180, 180); //body

	    c.setColor (Color.black);
	    c.fillOval (713 - m, 398, 7, 7); //eye
	    
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    public Chicken2 (Console con)    // Chicken2 class constructor
    {
	c = con;
    }


    public void run ()
    {
	chicken2 ();
    }
}


