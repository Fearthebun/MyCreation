/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a scientist for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Scientist2 implements Runnable
{ // creates an instance variable of Console
    private Console c;

    // Moves the scientist to the right
    public void scientist2 ()
    {

	Color skin = new Color (255, 220, 145); //skin
	Color hair = new Color (121, 130, 135); //hair colour
	Color wall = new Color (184, 214, 239);  // wall colour
	Color cylinder = new Color (159, 184, 224); //cylinders colour
	Color liquid3 = new Color (77, 104, 38); //liquid3 colour

	for (int m = 1 ; m <= 320 ; m++)
	{
	    c.setColor (wall);
	    c.fillRect (-131 + m, 25, 140, 194); //erase

	    c.setColor (hair);
	    c.fillOval (-105 + m, 25, 70, 70); //hair
	    c.setColor (skin);
	    c.fillOval (-100 + m, 35, 60, 60); //head
	    c.fillRect (-81 + m, 88, 20, 10); //neck
	    c.fillOval (-31 + m, 100, 20, 20); //hand right
	    c.fillOval (-130 + m, 100, 20, 20); //hand left
	    c.setColor (Color.blue);
	    c.fillRect (-100 + m, 168, 20, 51); // leg left
	    c.fillRect (-61 + m, 168, 20, 51); //leg right
	    c.setColor (Color.yellow);
	    c.fillRoundRect (-103 + m, 98, 65, 70, 30, 30); //body
	    c.setColor (Color.white);
	    c.fillRect (-103 + m, 98, 20, 90); //coat left
	    c.fillRect (-58 + m, 98, 20, 90); //coat right
	    c.setColor (Color.black);
	    c.fillOval (-85 + m, 55, 7, 10); //eye left
	    c.fillOval (-65 + m, 55, 7, 10); //eye right
	    c.drawArc (-75 + m, 65, 7, 5, 180, 180); //mouth
	    c.fillArc (-100 + m, 210, 20, 19, 0, 180); //foot right
	    c.fillArc (-61 + m, 210, 20, 19, 0, 180); //foot left

	    c.setColor (cylinder);
	    c.fillRect (-11 + m, 100, 20, 21); //cylinder bottom
	    c.fillRect (-6 + m, 85, 10, 15); //cylinder top
	    c.setColor (liquid3);
	    c.fillRect (-11 + m, 107, 20, 13); //liquid

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// Throws the flask
	for (int h = 1 ; h <= 15 ; h++)
	{
	    c.setColor (wall);
	    c.fillOval (288 + h, 101 - h, 20, 20); //hand right erase
	    c.fillRect (308 + h, 101 - h, 20, 21); //cylinder bottom erase
	    c.fillRect (313 + h, 86 - h, 10, 15); //cylinder top erase

	    c.setColor (skin);
	    c.fillOval (289 + h, 100 - h, 20, 20); //hand right
	    c.setColor (cylinder);
	    c.fillRect (309 + h, 100 - h, 20, 21); //cylinder bottom
	    c.fillRect (314 + h, 85 - h, 10, 15); //cylinder top
	    c.setColor (liquid3);
	    c.fillRect (309 + h, 107 - h, 20, 13); //liquid

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// Retracts hand
	for (int h = 1 ; h <= 15 ; h++)
	{
	    c.setColor (wall);
	    c.fillOval (305 - h, 84 + h, 20, 20); //hand right erase
	    c.fillRect (323 + h, 86 - h, 20, 21); //cylinder bottom erase
	    c.fillRect (328 + h, 71 - h, 10, 15); //cylinder top erase

	    c.setColor (skin);
	    c.fillOval (304 - h, 85 + h, 20, 20); //hand right
	    c.setColor (cylinder);
	    c.fillRect (324 + h, 85 - h, 20, 21); //cylinder bottom
	    c.fillRect (329 + h, 70 - h, 10, 15); //cylinder top
	    c.setColor (liquid3);
	    c.fillRect (324 + h, 92 - h, 20, 13); //liquid

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// Flask goes up towards container
	for (int h = 1 ; h <= 10 ; h++)
	{
	    c.setColor (wall);
	    c.fillRect (338 + h, 71 - h, 20, 21); //cylinder bottom erase
	    c.fillRect (343 + h, 56 - h, 10, 15); //cylinder top erase

	    c.setColor (cylinder);
	    c.fillRect (339 + h, 70 - h, 20, 21); //cylinder bottom
	    c.fillRect (344 + h, 55 - h, 10, 15); //cylinder top
	    c.setColor (liquid3);
	    c.fillRect (339 + h, 77 - h, 20, 13); //liquid

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// Flask goes towards container
	for (int h = 1 ; h <= 10 ; h++)
	{
	    c.setColor (wall);
	    c.fillRect (348 + h, 60, 20, 21); //cylinder bottom erase
	    c.fillRect (353 + h, 45, 10, 15); //cylinder top erase

	    c.setColor (cylinder);
	    c.fillRect (349 + h, 60, 20, 21); //cylinder bottom
	    c.fillRect (354 + h, 45, 10, 15); //cylinder top
	    c.setColor (liquid3);
	    c.fillRect (349 + h, 67, 20, 13); //liquid

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// Flask goes towards container
	for (int h = 1 ; h <= 80 ; h++)
	{
	    // Loops the inside of the container so it isn't erased
	    for (int x = 0 ; x <= 140 ; x++)
	    {
		Color inside = new Color (91, 91, 91); //inside of container colour
		c.setColor (inside);
		c.drawOval (410 - x / 2, 100, x, 20); // 
	    }
	    
	    c.setColor (wall);
	    c.fillRect (358 + h, 59 + h, 20, 21); //cylinder bottom erase
	    c.fillRect (363 + h, 44 + h, 10, 15); //cylinder top erase

	    c.setColor (cylinder);
	    c.fillRect (359 + h, 60 + h, 20, 21); //cylinder bottom
	    c.fillRect (364 + h, 45 + h, 10, 15); //cylinder top
	    c.setColor (liquid3);
	    c.fillRect (359 + h, 67 + h, 20, 13); //liquid

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	    
	    // Loops the hole-covering rect of container
	    for (int t = 1 ; t <= 141 ; t++)
	    {
		c.setColor (Color.black);
		c.drawLine (339 + t, 120, 339 + t, 225);
	    }

	    // Loops the container
	    for (int t = 1 ; t <= 10 ; t++)
	    {
		c.setColor (Color.black);
		c.drawArc (340, 105, 140, 10 + t, 180, 180); // arc 1
		c.drawArc (340, 125, 140, 10 + t, 180, 180); // arc 3
		c.drawArc (340, 145, 140, 10 + t, 180, 180); // arc 5
		c.drawArc (340, 165, 140, 10 + t, 180, 180); // arc 7
		c.drawArc (340, 185, 140, 10 + t, 180, 180); // arc 9
		c.drawArc (340, 205, 140, 10 + t, 180, 180); // arc 10
		c.setColor (Color.yellow);
		c.drawArc (340, 115, 140, 10 + t, 180, 180); // arc 2
		c.drawArc (340, 135, 140, 10 + t, 180, 180); // arc 4
		c.drawArc (340, 155, 140, 10 + t, 180, 180); // arc 6
		c.drawArc (340, 175, 140, 10 + t, 180, 180); // arc 8
		c.drawArc (340, 195, 140, 10 + t, 180, 180); // arc 10
		c.drawArc (340, 215, 140, 10 + t, 180, 180); // arc 12
	    }
	}

	// Moves scientist to left
	for (int m = 1 ; m <= 50 ; m++)
	{
	    c.setColor (wall);
	    c.fillRect (191 - m, 25, 140, 194); //erase

	    c.setColor (hair);
	    c.fillOval (215 - m, 25, 70, 70); //hair
	    c.setColor (skin);
	    c.fillOval (220 - m, 35, 60, 60); //head
	    c.fillRect (239 - m, 88, 20, 10); //neck
	    c.fillOval (289 - m, 100, 20, 20); //hand right
	    c.fillOval (190 - m, 100, 20, 20); //hand left
	    c.setColor (Color.blue);
	    c.fillRect (220 - m, 168, 20, 51); // leg left
	    c.fillRect (259 - m, 168, 20, 51); //leg right
	    c.setColor (Color.yellow);
	    c.fillRoundRect (217 - m, 98, 65, 70, 30, 30); //body
	    c.setColor (Color.white);
	    c.fillRect (217 - m, 98, 20, 90); //coat left
	    c.fillRect (262 - m, 98, 20, 90); //coat right
	    c.setColor (Color.black);
	    c.fillOval (235 - m, 55, 7, 10); //eye left
	    c.fillOval (255 - m, 55, 7, 10); //eye right
	    c.drawArc (245 - m, 65, 7, 5, 180, 180); //mouth
	    c.fillArc (220 - m, 210, 20, 19, 0, 180); //foot right
	    c.fillArc (259 - m, 210, 20, 19, 0, 180); //foot left

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}

	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}

	// Draws a transition screen
	for (int a = 1 ; a <= 640 ; a++)
	{
	    c.setColor (Color.black);
	    c.drawLine (0 + a, 0, 0 + a, 500);
	    c.setColor (Color.yellow);
	    c.drawLine (0 + a, 160, 0 + a, 270);
	}

	c.setColor (Color.black);
	c.setFont (new Font ("Times New Roman", 2, 100));
	c.drawString ("BOOM!", 163, 250);
	
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
    }

    public Scientist2 (Console con)    // Scientist2 class constructor
    {
	c = con;
    }

    public void run ()
    {
	scientist2 ();
    }
}
