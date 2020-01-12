package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape { // klassh gia to sxhma tou tetragwnou


	public Square(String id, boolean selected, Color color) {
		super(id, selected, color);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(15,15,15,15);
	}

}
