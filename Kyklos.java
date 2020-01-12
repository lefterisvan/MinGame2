import java.awt.Color;
import java.awt.Graphics;

public class Kyklos extends Sxhma {
	public Kyklos(String id, boolean selected, Color color) { // klassh gia to sxhma tou kuklou
		super(id, selected, color);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.drawOval(10,10,20,20);
	}

}
