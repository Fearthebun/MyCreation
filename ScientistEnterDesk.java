/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a scientist for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class ScientistEnterDesk implements Runnable
{ // creates an instance variable of Console
    private Console c;

    // Draws a scientist going to the left
    public void scientistEnterDesk ()
    {
	Color skin = new Color (255, 220, 145); // skin
	Color hair = new Color (121, 130, 135); // hair colour
	Color wall = new Color (184, 214, 239);  // wall colour

	for (int m = 1 ; m <= 300 ; m++)
	{
	    c.setColor (wall);
	    c.fillRect (650 - m, 25, 120, 194); //erase

	    c.setColor (hair);
	    c.fillOval (675 - m, 25, 70, 70); //hair
	    c.setColor (skin);
	    c.fillOval (680 - m, 35, 60, 60); //head
	    c.fillRect (699 - m, 88, 20, 10); //neck
	    c.fillOval (749 - m, 100, 20, 20); //hand right
	    c.fillOval (650 - m, 100, 20, 20); //hand left
	    c.setColor (Color.blue);
	    c.fillRect (680 - m, 168, 20, 51); // leg left
	    c.fillRect (719 - m, 168, 20, 51); //leg right
	    c.setColor (Color.yellow);
	    c.fillRoundRect (677 - m, 98, 65, 70, 30, 30); //body
	    c.setColor (Color.white);
	    c.fillRect (677 - m, 98, 20, 90); //coat left
	    c.fillRect (722 - m, 98, 20, 90); //coat right
	    c.setColor (Color.black);
	    c.fillOval (695 - m, 55, 7, 10); //eye left
	    c.fillOval (715 - m, 55, 7, 10); //eye right
	    c.drawArc (705 - m, 65, 7, 5, 180, 180); //mouth
	    c.fillArc (680 - m, 210, 20, 19, 0, 180); //foot right
	    c.fillArc (719 - m, 210, 20, 19, 0, 180); //foot left

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    public ScientistEnterDesk (Console con)    // ScientistEnterDesk class constructor
    {
	c = con;
    }


    public void run ()
    {
	scientistEnterDesk ();
    }
}
