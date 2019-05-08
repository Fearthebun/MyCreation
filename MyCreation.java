/*      Name: Nayaab Ali
	Teacher: Ms. Krasteva
	Date: October 22, 2018
	Assignment: This program will display MyCreation.
*/

import java.awt.*;      // gives access to java command libraries
import hsa.Console;     // gives access to Console class file
import java.lang.*;     // to access Thread class

public class MyCreation
{
    Console c;           // The output console

    public MyCreation ()
    {
	c = new Console ("Amateur Scientist");
    }


    public void background ()
    {
	Background b = new Background (c);
    }


    public void background2 ()
    {
	Background2 b2 = new Background2 (c);
    }


    public void scientist ()
    {
	Scientist s = new Scientist (c);
	s.run ();
    }


    public void dialogue ()
    {
	Dialogue d = new Dialogue (c);
    }


    public void scientist2 ()
    {
	Scientist2 s2 = new Scientist2 (c);
	s2.run ();
    }


    public void carrots () // overloaded
    {
	synchronized (c)
	{
	    Color red = new Color (193, 34, 5);

	    Carrots ca = new Carrots (c);
	    ca.start (); 
	    Carrots ca2 = new Carrots (c, Color.yellow, 62);
	    ca2.start ();
	    Carrots ca3 = new Carrots (c, red, 124, -20);
	    ca3.start ();
	}

    }


    public void rabbitPanda ()
    {
	RabbitPanda rP = new RabbitPanda (c);
	rP.start ();
    }


    public void scientistExitLab ()
    {
	ScientistExitLab sc3 = new ScientistExitLab (c);
	sc3.run ();
    }


    public void elephant ()
    {
	Elephant e = new Elephant (c);
	e.start ();
    }


    public void chicken ()
    {
	Chicken ch = new Chicken (c);
	ch.start ();
    }


    public void sheep ()
    {
	Sheep sh = new Sheep (c);
	sh.start ();
    }


    public void scientistEnterDesk ()
    {
	ScientistEnterDesk sc4 = new ScientistEnterDesk (c);
	sc4.run ();
    }


    public void sheep2 ()
    {
	Sheep2 sh2 = new Sheep2 (c);
	sh2.start ();
	
	try
	{
	    sh2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void chicken2 ()
    {
	Chicken2 ch2 = new Chicken2 (c);
	ch2.start ();
	
	try
	{
	    ch2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void elephant2 ()
    {
	Elephant2 e2 = new Elephant2 (c);
	e2.start ();
	
	try
	{
	    e2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void rabbitPanda2 ()
    {
	RabbitPanda2 rP2 = new RabbitPanda2 (c);
	rP2.start ();
	
	try
	{
	    rP2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void carrots2 ()
    {
	synchronized (c)
	{
	    Color red = new Color (193, 34, 5);

	    Carrots2 ca = new Carrots2 (c);
	    ca.start ();
	    Carrots2 ca2 = new Carrots2 (c, Color.yellow, 62);
	    ca2.start ();
	    Carrots2 ca3 = new Carrots2 (c, red, 124, -20);
	    ca3.start ();
	}
    }


    public void jump ()
    {
	Jump j = new Jump (c);
	j.start ();
    }


    public static void main (String[] args)
    {
	MyCreation myC = new MyCreation ();
	myC.background ();
	myC.scientist ();
	myC.dialogue ();
	myC.background2 ();
	myC.scientist2 ();
	myC.background2 ();
	myC.carrots ();
	myC.scientistExitLab ();
	myC.scientist2 ();
	myC.background2 ();
	myC.rabbitPanda ();
	myC.scientistExitLab ();
	myC.scientist2 ();
	myC.background2 ();
	myC.elephant ();
	myC.scientistExitLab ();
	myC.scientist2 ();
	myC.background2 ();
	myC.chicken ();
	myC.scientistExitLab ();
	myC.scientist2 ();
	myC.background2 ();
	myC.sheep ();
	myC.scientistExitLab ();
	myC.background ();
	myC.sheep2 ();
	myC.chicken2 ();
	myC.elephant2 ();
	myC.rabbitPanda2 ();
	myC.carrots2 ();
	myC.scientistEnterDesk ();
	myC.jump ();
    }
} // MyCreation class
