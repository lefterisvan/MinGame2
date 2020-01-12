package Shapes;

import javax.swing.JLabel;
import java.awt.*;

public class Shape extends JLabel{ // i klassh Shapes.Sxhma perilamavanei to sxhma twn kartwn
	// einai i 'mhtera' klassh opou klironomeitai apo tis upokathgories twn sxhmatwn
	
	String id;
	boolean selected ;
	Color color;

	public Shape(String id, boolean selected, Color color) {
		super();
		this.id = id;
		this.selected=selected;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
