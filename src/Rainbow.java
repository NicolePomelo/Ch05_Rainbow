// Chapter 5 Question 27

// @author Nicole Palmero

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  Color skyColor = Color.CYAN;

 public Rainbow()
  {
   setBackground(skyColor);
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    
    int xCenter = width/2;
    int yCenter = 3*height/4; 
    
    int largeRadius = width/4;
    g.setColor(Color.RED);
    g.fillArc(xCenter-largeRadius/2,yCenter-largeRadius/2,largeRadius,largeRadius,0,180);
    
    int smallRadius = height/4;
    
    int mediumRadius = (int)Math.sqrt(smallRadius*largeRadius);
    g.setColor(Color.GREEN);
    g.fillArc(xCenter-mediumRadius/2, yCenter-mediumRadius/2, mediumRadius, mediumRadius, 0, 180);
    
    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter-smallRadius/2,yCenter-smallRadius/2,smallRadius,smallRadius,0,180);
    
    int skyRadius = (int)Math.sqrt((smallRadius*largeRadius)/5);
    g.setColor(Color.CYAN);
    g.fillArc(xCenter-skyRadius/2, yCenter-skyRadius/2, skyRadius, skyRadius, 0, 180);
 // I couldn't figure out how to incorporate the arithmetic mean of the widths into the skyRadius. I also couldn't make sure that it's scaled proportionally to the window.  
    
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
