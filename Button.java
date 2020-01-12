import Shapes.Circle;
import Shapes.Square;
import Shapes.Triangle;

import javax.swing.JButton;

public class Button extends JButton { // i klassh Button anaferetai stis kartes pou tha exei to tamplo mas pairnontas ws orisma id kai sxhma
	
	String id;
	Object sxhma;
	boolean tetragwno, kyklos, trigwno;

	public Button(String id, Object sxhma) {
		super();
		this.id = id;
		this.sxhma=sxhma;
		
		if(sxhma instanceof Square) {
			tetragwno=true;
		}
		else if(sxhma instanceof Triangle) {
			trigwno=true;
		}
		else if(sxhma instanceof Circle) {
			kyklos=true;
		}
	}

	public String getId() {
		return id;
	}

	public boolean isTetragwno() {
		return tetragwno;
	}


	public boolean isKyklos() {
		return kyklos;
	}

	

	public boolean isTrigwno() {
		return trigwno;
	}

	
	
	

}
