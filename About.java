import javax.swing.*;
import java.awt.*;

public class About {
	
    public About() {
        JFrame frame = new JFrame();

        frame.getContentPane().setLayout(null);

        JLabel jl = new JLabel("icsd123456");
        JLabel txt = new JLabel("Aggelikh Vakra");
        jl.setBounds( 100, 100, 200, 60 );
        txt.setBounds( 100, 150, 200, 60 );

        frame.add(txt);
        frame.add(jl);

        frame.setTitle("About us");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}
