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
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.GREEN);
      window.fillOval( 210, 100, 400, 400 );

      
      window.setColor(Color.BLACK);
      window.fillOval( 250, 270, 50, 50 );
     // window.fillOval( 310, 100, 50, 50 );
		//add more code here

      window.fillOval( 450, 270, 50, 50 );

      window.setColor(Color.RED);
      window.fillOval(240, 350, 200, 50);
      
      window.setColor(Color.BLACK);
      window.drawArc(310, 320, 200, 100, 0, -180);
   }
}