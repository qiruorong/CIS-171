




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
