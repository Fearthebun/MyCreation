/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a background for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file

public class Background2
{ // creates an instance variable of Console
    private Console c;

    //Draws the second background of a lab.
    public void background2 ()
    {
	Color wall = new Color (184, 214, 239);  // wall colour
	Color floor = new Color (145, 149, 153); //floor colour
	Color sign = new Color (255, 253, 244); //sign colour
	Color inside = new Color (91, 91, 91); //inside of container colour

	// Draws the floor and wall
	for (int i = 1 ; i <= 640 ; i++)
	{
	    c.setColor (wall);
	    c.drawLine (0 + i, 0, 0 + i, 220);
	    c.setColor (floor);
	    c.drawLine (0 + i, 220, 0 + i, 500);
	}

	// Fills in holes in the container with a black back
	for (int t = 1 ; t <= 141 ; t++)
	{
	    c.setColor (Color.black);
	    c.drawLine (339 + t, 120, 339 + t, 225); // covering the holer
	}

	// Draws the inside of the container
	for (int x = 0 ; x <= 140 ; x++)
	{
	    c.setColor (inside);
	    c.drawOval (410 - x / 2, 100, x, 20); // inside
	}

	// Draws the container
	for (int t = 1 ; t <= 10 ; t++)
	{
	    c.setColor (Color.black);
	    c.drawArc (340, 105, 140, 10 + t, 180, 180); // arc 1
	    c.drawArc (340, 125, 140, 10 + t, 180, 180); // arc 3
	    c.drawArc (340, 145, 140, 10 + t, 180, 180); // arc 5
	    c.drawArc (340, 165, 140, 10 + t, 180, 180); // arc 7
	    c.drawArc (340, 185, 140, 10 + t, 180, 180); // arc 9
	    c.drawArc (340, 205, 140, 10 + t, 180, 180); // arc 11
	    c.setColor (Color.yellow);
	    c.drawArc (340, 115, 140, 10 + t, 180, 180); // arc 2
	    c.drawArc (340, 135, 140, 10 + t, 180, 180); // arc 4
	    c.drawArc (340, 155, 140, 10 + t, 180, 180); // arc 6
	    c.drawArc (340, 175, 140, 10 + t, 180, 180); // arc 8
	    c.drawArc (340, 195, 140, 10 + t, 180, 180); // arc 10
	    c.drawArc (340, 215, 140, 10 + t, 180, 180); // arc 12
	}

	// Draws sign
	for (int s = 1 ; s <= 50 ; s++)
	{
	    c.setColor (sign);
	    c.drawLine (500, 20 + s, 620, 20 + s); // sign
	}

	c.setColor (Color.black);
	c.setFont (new Font ("Calibri", 0, 12));
	c.drawString ("Nayaab Ali's", 527, 40);
	c.drawString ("Lab", 548, 56);
    }


    public Background2 (Console con)    // Background2 class constructor
    {
	c = con;
	background2 ();
    }
}


