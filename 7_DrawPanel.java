import java.awt.Graphics;
import java.awt.Color;

public class DrawPanel{
   public static void main(String[] args) {
   DrawingPanel panel = new DrawingPanel(220, 150);
   Graphics g = panel.getGraphics();
   g.setColor(Color.BLUE);
   g.drawOval(50, 25, 40, 40);
   g.fillOval(50, 25, 40, 40);
   g.drawOval(130, 25, 40, 40);
   g.fillOval(130, 25, 40, 40);
   g.setColor(Color.RED);
   g.drawRect(70, 45, 80, 80);
   g.fillRect(70, 45, 80, 80);
   g.setColor(Color.BLACK);
   g.drawLine(70, 85, 150, 85);
   }
}




NOTES:
// draw lines on panel
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;

public class DrawLine {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(300, 400); // panel range (width, height)
      Graphics g = panel.getGraphics();
      panel.setBackground(Color.PINK);
      // panel.setBackground(new Color()); put RGB value in the bracket

      g.setColor(new Color()); // set the color for fill
      g.drawLine(25, 75, 175, 25);
      g.drawRect(25, 20, 20, 20); (x, y, width, height)
      g.fillRect( #same as above
      g.setColor(
      g.drawOval(20, 20, 25, 30); (x, y, width, height) draw oval inside rectangle
      g.fillOval( #same as above
        
      int x1, x2, y1, y2;
      x1 = 1; x2 = 2;
      y1 = 4; y2 = 5;
      drawLine(g, x1, x2, y1, y2);
   }
   public static void drawLine(Graphics g, int x1, int x2, int y1, int y2) {
      g.drawLine(x1, y2, x2, y1);
   }
}



// multiple patterns
public class DrawLine {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(300, 400); // panel range (width, height)
      Graphics g = panel.getGraphics();
      // g.drawRect(0,0,50,25);
      // g.drawRect(50,25,50,25);
      // g.drawRect(100,50,50,25);
      // g.drawRect(150,75,50,25);
      for (int i=0; i<4; i++) {
         g.drawRect(50*i, 25*i, 50, 25);
      }
   }



      


   
