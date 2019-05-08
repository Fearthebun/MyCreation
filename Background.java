/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a background for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file

public class Background
{ // Creates an instance variable of Console
    private Console c;

    // Draws the background of the desk area
    public void background ()
    {
	Color wall = new Color (184, 214, 239);  // wall colour
	Color floor = new Color (145, 149, 153); // floor colour
	Color table = new Color (91, 27, 12); // table colour
	Color book1 = new Color (25, 150, 6); // book1 colour
	Color book2 = new Color (6, 128, 150); // book2 colour
	Color book3 = new Color (150, 6, 119); // book3 colour
	Color cylinder = new Color (159, 184, 224); // cylinders colour
	Color liquid1 = new Color (255, 0, 135); // liquid1 colour
	Color liquid2 = new Color (238, 255, 0); // liquid2 colour
	Color liquid3 = new Color (77, 104, 38); // liquid3 colour
	Color box = new Color (255, 110, 0); // box colour
	Color sign = new Color (255, 253, 244); // sign colour

	// Draws the floor and wall
	for (int i = 1 ; i <= 640 ; i++)
	{
	    c.setColor (wall);
	    c.drawLine (0 + i, 0, 0 + i, 220);
	    c.setColor (floor);
	    c.drawLine (0 + i, 220, 0 + i, 500);
	}
	
	// Draws the table and two cynlinders + liquids on top
	for (int t = 1 ; t <= 20 ; t++)
	{
	    c.setColor (table);
	    c.drawLine (41, 120 + t, 220, 120 + t); // top
	    c.drawLine (40 + t, 140, 40 + t, 220); // left leg
	    c.drawLine (200 + t, 140, 200 + t, 220); // right leg
	    c.setColor (cylinder);
	    c.drawLine (92 + t, 93, 92 + t, 120); // cylinder 1
	    c.drawLine (190 + t, 100, 190 + t, 120); // cynlinder 3
	    c.setColor (liquid1);
	    c.drawLine (92 + t, 100, 92 + t, 119); // liquid 1
	    c.setColor (liquid3);
	    c.drawLine (190 + t, 107, 190 + t, 119); // liquid 3
	}

	// Draws items on top of the table
	for (int b = 1 ; b <= 10 ; b++)
	{
	    c.setColor (book1);
	    c.drawLine (42, 110 + b, 82, 110 + b); // bottom book
	    c.setColor (book2);
	    c.drawLine (42, 100 + b, 80, 100 + b); // middle book
	    c.setColor (book3);
	    c.drawLine (55, 90 + b, 78, 90 + b); // top book
	    c.setColor (cylinder);
	    c.drawLine (115 + b, 80, 115 + b, 120); // cynlinder 2
	    c.drawLine (195 + b, 85, 195 + b, 100); // cylinder 3 top
	    c.setColor (liquid2);
	    c.drawLine (115 + b, 90, 115 + b, 119); // lquid 2
	    c.setColor (box);
	    c.drawLine (130, 110 + b, 145, 110 + b); // box
	}

	// Draws a clock
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

	// Draws a sign
	for (int s = 1 ; s <= 50 ; s++)
	{
	    c.setColor (sign);
	    c.drawLine (60, 20 + s, 180, 20 + s);
	}

	c.setColor (Color.black);
	c.setFont (new Font ("Calibri", 0, 12));
	c.drawString ("Nayaab Ali's", 87, 40);
	c.drawString ("Desk", 108, 56);
    }


    public Background (Console con)
    {
	c = con;
	background ();
    }
}

