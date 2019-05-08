/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display a rabbit panda hybrid for MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class RabbitPanda2 extends Thread
{ // creates an instance variable of Console
    private Console c;

    // Draws a rabbit-panda hybrid that goes to the left
    public void rabbitPanda2 ()
    {
	Color floor = new Color (145, 149, 153); //floor colour

	for (int m = 1 ; m <= 360 ; m++)
	{
	    c.setColor (floor);
	    c.fillRect (655 - m, 235, 118, 198); //rabbit panda erase

	    c.setColor (Color.black);
	    c.fillOval (680 - m, 235, 20, 70); //ear left
	    c.fillOval (720 - m, 235, 20, 70); //ear right

	    c.setColor (Color.white);
	    c.fillOval (680 - m, 275, 65, 65); //head
	    c.fillRoundRect (673 - m, 335, 80, 80, 30, 30); //body

	    c.setColor (Color.black);
	    c.fillArc (655 - m, 345, 35, 25, 90, 180); //hand left
	    c.fillArc (737 - m, 345, 35, 25, 270, 180); //hand right
	    c.fillArc (685 - m, 398, 25, 35, 180, 180); //leg left
	    c.fillArc (715 - m, 398, 25, 35, 180, 180); //leg right
	    c.fillOval (690 - m, 293, 18, 18); //eye patch left
	    c.fillOval (714 - m, 293, 18, 18); //eye patch right
	    c.drawLine (703 - m, 317, 711 - m, 322); //mouth left
	    c.drawLine (719 - m, 317, 711 - m, 322); //mouth right

	    c.setColor (Color.white);
	    c.drawArc (696 - m, 300, 6, 6, 0, 180); //eye left
	    c.drawArc (720 - m, 300, 6, 6, 0, 180); //eye right

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public RabbitPanda2 (Console con)    // RabbitPanda2 class constructor
    {
	c = con;
    }


    public void run ()
    {
	rabbitPanda2 ();
    }
}
