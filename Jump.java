/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display the sheep and scientist jumping 
	for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class Jump extends Thread
{ // creates an instance variable of Console
    private Console c;

    public void jump ()
    {
	Color floor = new Color (145, 149, 153); // floor colour
	Color sheepSkin = new Color (255, 246, 219); // sheep skin colour
	Color skin = new Color (255, 220, 145); // skin
	Color hair = new Color (121, 130, 135); // hair colour
	Color wall = new Color (184, 214, 239);  // wall colour

	for (int m = 1 ; m <= 15 ; m++)
	{
	    // sheep jump up
	    c.setColor (floor);
	    c.fillRect (5, 361 - m, 177, 110); //erase

	    c.setColor (sheepSkin);
	    c.fillRect (45, 440 - m, 20, 30); //leg left
	    c.fillRect (145, 440 - m, 20, 30); //leg right
	    c.setColor (Color.white);
	    c.fillRoundRect (35, 380 - m, 140, 60, 20, 20); //body
	    c.fillOval (162, 375 - m, 20, 20); //tail
	    c.setColor (sheepSkin);
	    c.fillOval (15, 360 - m, 40, 40); //head
	    c.fillOval (5, 362 - m, 20, 10); //ear left
	    c.fillOval (45, 362 - m, 20, 10); //ear right
	    c.setColor (Color.black);
	    c.drawArc (25, 375 - m, 7, 7, 15, 180); //eye left
	    c.drawArc (37, 375 - m, 7, 7, 15, 180); //eye right
	    c.fillArc (31, 378 - m, 10, 10, 180, 180); //mouth

	    // scientist jump up
	    c.setColor (wall);
	    c.fillRect (350, 26 - m, 120, 194); //erase

	    c.setColor (hair);
	    c.fillOval (375, 25 - m, 70, 70); //hair
	    c.setColor (skin);
	    c.fillOval (380, 35 - m, 60, 60); //head
	    c.fillRect (399, 88 - m, 20, 10); //neck
	    c.fillOval (449, 100 - m, 20, 20); //hand right
	    c.fillOval (350, 100 - m, 20, 20); //hand left
	    c.setColor (Color.blue);
	    c.fillRect (380, 168 - m, 20, 51); // leg left
	    c.fillRect (419, 168 - m, 20, 51); //leg right
	    c.setColor (Color.yellow);
	    c.fillRoundRect (377, 98 - m, 65, 70, 30, 30); //body
	    c.setColor (Color.white);
	    c.fillRect (377, 98 - m, 20, 90); //coat left
	    c.fillRect (422, 98 - m, 20, 90); //coat right
	    c.setColor (Color.black);
	    c.fillOval (395, 55 - m, 7, 10); //eye left
	    c.fillOval (415, 55 - m, 7, 10); //eye right
	    c.drawArc (405, 65 - m, 7, 5, 180, 180); //mouth
	    c.fillArc (380, 210 - m, 20, 19, 0, 180); //foot right
	    c.fillArc (419, 210 - m, 20, 19, 0, 180); //foot left

	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}

	for (int m = 1 ; m <= 15 ; m++)
	{
	    // sheep jump down
	    c.setColor (floor);
	    c.fillRect (5, 344 + m, 177, 110); //erase

	    c.setColor (sheepSkin);
	    c.fillRect (45, 425 + m, 20, 30); //leg left
	    c.fillRect (145, 425 + m, 20, 30); //leg right
	    c.setColor (Color.white);
	    c.fillRoundRect (35, 365 + m, 140, 60, 20, 20); //body
	    c.fillOval (162, 360 + m, 20, 20); //tail
	    c.setColor (sheepSkin);
	    c.fillOval (15, 345 + m, 40, 40); //head
	    c.fillOval (5, 347 + m, 20, 10); //ear left
	    c.fillOval (45, 347 + m, 20, 10); //ear right
	    c.setColor (Color.black);
	    c.drawArc (25, 360 + m, 7, 7, 15, 180); //eye left
	    c.drawArc (37, 360 + m, 7, 7, 15, 180); //eye right
	    c.fillArc (31, 363 + m, 10, 10, 180, 180); //mouth

	    // scientist jump up
	    c.setColor (wall);
	    c.fillRect (350, 9 + m, 120, 194); //erase

	    c.setColor (hair);
	    c.fillOval (375, 10 + m, 70, 70); //hair
	    c.setColor (skin);
	    c.fillOval (380, 20 + m, 60, 60); //head
	    c.fillRect (399, 73 + m, 20, 10); //neck
	    c.fillOval (449, 85 + m, 20, 20); //hand right
	    c.fillOval (350, 85 + m, 20, 20); //hand left
	    c.setColor (Color.blue);
	    c.fillRect (380, 153 + m, 20, 51); // leg left
	    c.fillRect (419, 153 + m, 20, 51); //leg right
	    c.setColor (Color.yellow);
	    c.fillRoundRect (377, 83 + m, 65, 70, 30, 30); //body
	    c.setColor (Color.white);
	    c.fillRect (377, 83 + m, 20, 90); //coat left
	    c.fillRect (422, 83 + m, 20, 90); //coat right
	    c.setColor (Color.black);
	    c.fillOval (395, 40 + m, 7, 10); //eye left
	    c.fillOval (415, 40 + m, 7, 10); //eye right
	    c.drawArc (405, 50 + m, 7, 5, 180, 180); //mouth
	    c.fillArc (380, 195 + m, 20, 19, 0, 180); //foot right
	    c.fillArc (419, 195 + m, 20, 19, 0, 180); //foot left

	    try
	    {
		Thread.sleep (15);
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
	
	// Draws the container
	for (int a = 1 ; a <= 640 ; a++)
	{
	    c.setColor (Color.black);
	    c.drawLine (0 + a, 0, 0 + a, 500);
	    c.setColor (Color.yellow);
	    c.drawLine (0 + a, 160, 0 + a, 270);
	}
	
	c.setColor (Color.black);
	c.setFont (new Font ("Times New Roman", 2, 100));
	c.drawString ("THE END!", 120, 250);
	
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
    }


    public Jump (Console con)    // Jump class constructor
    {
	c = con;
    }


    public void run ()
    {
	jump ();
    }
}
