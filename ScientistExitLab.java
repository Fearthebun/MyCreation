/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a scientist for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class ScientistExitLab implements Runnable
{ // creates an instance variable of Console
    private Console c;

    // Draws a scientist going to the left
    public void scientistExitLab ()
    {

	Color skin = new Color (255, 220, 145); //skin
	Color hair = new Color (121, 130, 135); //hair colour
	Color wall = new Color (184, 215, 239);  // wall colour

	for (int l = 1 ; l <= 300 ; l++)
	{
	    c.setColor (wall);
	    c.fillRect (140 - l, 25, 124, 194);

	    c.setColor (hair);
	    c.fillOval (165 - l, 25, 70, 70); //hair
	    c.setColor (skin);
	    c.fillOval (170 - l, 35, 60, 60); //head
	    c.fillRect (189 - l, 88, 20, 10); //neck
	    c.fillOval (239 - l, 100, 20, 20); //hand right
	    c.fillOval (140 - l, 100, 20, 20); //hand left
	    c.setColor (Color.blue);
	    c.fillRect (170 - l, 168, 20, 51); // leg left
	    c.fillRect (209 - l, 168, 20, 51); //leg right
	    c.setColor (Color.yellow);
	    c.fillRoundRect (167 - l, 98, 65, 70, 30, 30); //body
	    c.setColor (Color.white);
	    c.fillRect (167 - l, 98, 20, 90); //coat left
	    c.fillRect (212 - l, 98, 20, 90); //coat right
	    c.setColor (Color.black);
	    c.fillOval (185 - l, 55, 7, 10); //eye left
	    c.fillOval (205 - l, 55, 7, 10); //eye right
	    c.drawArc (195 - l, 65, 7, 5, 180, 180); //mouth
	    c.fillArc (170 - l, 210, 20, 19, 0, 180); //foot right
	    c.fillArc (209 - l, 210, 20, 19, 0, 180); //foot left

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    public ScientistExitLab (Console con)    // ScientistExitLab class constructor
    {
	c = con;
    }

    public void run ()
    {
	scientistExitLab ();
    }
}
