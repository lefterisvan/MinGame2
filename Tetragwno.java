import java.awt.Color;
import java.awt.Graphics;

public class Tetragwno extends Sxhma { // klassh gia to sxhma tou tetragwnou


	public Tetragwno(String id, boolean selected, Color color) {
		super(id, selected, color);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.drawRect(15,15,15,15);
	}

}
