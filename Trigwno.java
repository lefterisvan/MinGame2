import java.awt.Color;
import java.awt.Graphics;

public class Trigwno extends Sxhma{
	
	public Trigwno(String id, boolean selected, Color color) { // klassh gia to sxhma tou trigwnou
		super(id, selected, color);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.drawPolygon(new int[] {15,20,25}, new int[] {40,10,40}, 3);
	}

}
