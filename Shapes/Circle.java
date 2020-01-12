package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape { // klassh gia to sxhma tou kuklou
	public Circle(String id, boolean selected, Color color) { // klassh gia to sxhma tou kuklou
		super(id, selected, color);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(10,10,20,20);
	}

}
