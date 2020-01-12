package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape { // klassh gia to sxhma tou tetragwnou


	public Square(Color color) {
		super(color);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.drawRect(15,15,15,15);
	}

}
