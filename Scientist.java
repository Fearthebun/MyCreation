/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a scientist for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Scientist implements Runnable
{ // creates an instance variable of Console
    private Console c;

    // Draws a scientist grabbing a beaker then exiting to the right
    public void scientist ()
    {

	Color skin = new Color (255, 220, 145); //skin
	Color hair = new Color (121, 130, 135); //hair colour
	Color wall = new Color (184, 214, 239);  // wall colour
	Color cylinder = new Color (159, 184, 224); //cylinders colour
	Color liquid3 = new Color (77, 104, 38); //liquid3 colour

	// Moves the scientist
	for (int m = 1 ; m <= 420 ; m++)
	{   // Loops the clock in the background
	    for (int x = 0 ; x <= 70 ; x++)
	    {
		c.setColor (Color.white);
		c.drawOval (300 - x / 2, 70 - x / 2, x, x); // clock
		c.setColor (Color.black);
		c.drawOval (265, 35, 70, 70); // rim
		c.drawOval (300, 70, 2, 2); // middle circle
		c.drawLine (300, 70, 300, 55); // minute hand
		c.drawLine (300, 70, 330, 70); // hour hand
	    }
	    
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
 
	// Moves the scientist hand 
	for (int h = 1 ; h <= 18 ; h++)
	{
	    c.setColor (wall);
	    c.fillOval (231 - h, 100, 20, 20); //hand left erase
	    c.setColor (skin);
	    c.fillOval (230 - h, 100, 20, 20); //hand left
	    try
	    {

		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// Moves the hand back
	for (int h = 1 ; h <= 18 ; h++)
	{
	    c.setColor (wall);
	    c.fillOval (210 + h, 100, 20, 20); //hand left erase
	    c.fillRect (190 + h, 100, 20, 21); //cylinder bottom erase
	    c.fillRect (195 + h, 85, 10, 15); //cylinder top erase

	    c.setColor (skin);
	    c.fillOval (212 + h, 100, 20, 20); //hand left

	    c.setColor (cylinder);
	    c.fillRect (191 + h, 100, 20, 21); //cylinder bottom
	    c.fillRect (196 + h, 85, 10, 15); //cylinder top
	    c.setColor (liquid3);
	    c.fillRect (191 + h, 107, 20, 13); //liquid
	    try
	    {

		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
	
	// Moves the scientist to the right
	for (int m = 1 ; m <= 440 ; m++)
	{   // Loops the clock in the background
	    for (int x = 0 ; x <= 70 ; x++)
	    {
		c.setColor (Color.white);
		c.drawOval (300 - x / 2, 70 - x / 2, x, x); // clock
		c.setColor (Color.black);
		c.drawOval (265, 35, 70, 70); // rim
		c.drawOval (300, 70, 2, 2); // middle circle
		c.drawLine (300, 70, 300, 55); // minute hand
		c.drawLine (300, 70, 330, 70); // hour hand
	    }

	    c.setColor (wall);
	    c.fillRect (229 + m, 25, 120, 194); //erase
	    c.fillRect (208 + m, 100, 20, 21); //cylinder bottom erase
	    c.fillRect (213 + m, 85, 10, 15); //cylinder top erase

	    c.setColor (hair);
	    c.fillOval (255 + m, 25, 70, 70); //hair
	    c.setColor (skin);
	    c.fillOval (260 + m, 35, 60, 60); //head
	    c.fillRect (279 + m, 88, 20, 10); //neck
	    c.fillOval (329 + m, 100, 20, 20); //hand right
	    c.fillOval (230 + m, 100, 20, 20); //hand left
	    c.setColor (Color.blue);
	    c.fillRect (260 + m, 168, 20, 51); // leg left
	    c.fillRect (299 + m, 168, 20, 51); //leg right
	    c.setColor (Color.yellow);
	    c.fillRoundRect (257 + m, 98, 65, 70, 30, 30); //body
	    c.setColor (Color.white);
	    c.fillRect (257 + m, 98, 20, 90); //coat left
	    c.fillRect (302 + m, 98, 20, 90); //coat right
	    c.setColor (Color.black);
	    c.fillOval (275 + m, 55, 7, 10); //eye left
	    c.fillOval (295 + m, 55, 7, 10); //eye right
	    c.drawArc (285 + m, 65, 7, 5, 180, 180); //mouth
	    c.fillArc (260 + m, 210, 20, 19, 0, 180); //foot right
	    c.fillArc (299 + m, 210, 20, 19, 0, 180); //foot left

	    c.setColor (cylinder);
	    c.fillRect (209 + m, 100, 20, 21); //cylinder bottom
	    c.fillRect (214 + m, 85, 10, 15); //cylinder top
	    c.setColor (liquid3);
	    c.fillRect (209 + m, 107, 20, 13); //liquid

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Scientist (Console con)    // Scientist class constructor
    {
	c = con;
    }


    public void run ()
    {
	scientist ();
    }
}

