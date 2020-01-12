import javax.swing.*;
import java.awt.*;

public class About {
	
    public About() {
        JFrame frame = new JFrame();

        frame.getContentPane().setLayout(new FlowLayout());

        JTextArea area= new JTextArea(25,40);
        area.setText("Name: Aggelikh Vakra. \nAM: icsd12345");
        frame.add(area);

        frame.setTitle("About us");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}
