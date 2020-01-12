import Shapes.Circle;
import Shapes.Shape;
import Shapes.Square;
import Shapes.Triangle;

import javax.swing.JButton;

public class Button extends JButton { // i klassh Button anaferetai stis kartes pou tha exei to tamplo mas pairnontas ws orisma id kai sxhma
	
	
	Shape sxhma;

	public Button(Shape sxhma) {
		super();
                this.sxhma=sxhma;
		
	}

    public Shape getSxhma() {
        return sxhma;
    }
        

	

	
	
	

}
