package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape { // klassh gia to sxhma tou trigwnou
	
	public Triangle(Color color) { // klassh gia to sxhma tou trigwnou
		super(color);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillPolygon(new int[] {15,20,25}, new int[] {40,10,40}, 3);
	}

}
