package Shapes;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Joker extends Circle {

	public Joker( Color color) { // klassh gia to sxhma tou Shapes.Joker
		super(color);
		
	}
	public void paint(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillOval(5,8,40,40);
		g.drawOval(5,8,40,40);

		
		 FontMetrics fm = g.getFontMetrics();
         double textWidth = fm.getStringBounds("JOKER", g).getWidth();
         g.setColor(Color.RED);
         g.drawString("JOKER", (int) (25 - textWidth/2),  (int) (25 + fm.getMaxAscent() / 2));
		
	}
}
