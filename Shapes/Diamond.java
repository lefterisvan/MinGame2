package Shapes;

import java.awt.*;
import java.awt.Graphics;

public class Diamond extends Shape { // klassh gia to sxhma tou romvou

    public Diamond(String id, boolean selected, Color color) { // klassh gia to sxhma tou trigwnou
        super(id, selected, color);
    }

    public void paint(Graphics g) {
        g.setColor(color);

        int [] x = { 25, 40, 25, 10 };
        int [] y = { 5, 20, 35, 20 };
        g.fillPolygon( x, y, 4 );

    }

}
