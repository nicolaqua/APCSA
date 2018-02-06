package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
      bodyandarms(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("Nico's Robot ", 35, 35);

      window.setColor(Color.GREEN);
      window.fillOval( 205, 50, 200, 200 );

      
      window.setColor(Color.BLACK);
      window.fillOval( 225, 135, 25, 25 );
     // window.fillOval( 310, 100, 50, 50 );
		//add more code here

      window.fillOval( 325, 135, 25, 25 );

      window.setColor(Color.RED);
      window.fillOval(220, 150, 100, 25);
      
      window.setColor(Color.BLACK);
      window.drawArc(250, 160, 100, 50, 0, -180);
      
     
   }
   
   public void bodyandarms ( Graphics window )
   {
   window.fillRect(150, 240, 250, 250);
   window.setColor(Color.ORANGE);
   window.fillRect(250, 240, 250, 75);
   window.fillRect(50, 240, 250, 75);
   
   }
}