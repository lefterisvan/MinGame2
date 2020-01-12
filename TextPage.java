import javax.swing.*;
import java.awt.*;


// i selida auth antistoixei se ena parathuro pou emfanizei kapoio keimeno.
// analoga me tous parametrous pou vazeis otan ftiaxneis to antikeimeno, emfanizetai to antistoixo periexomeno.
public class TextPage {
	
    public TextPage(String text, String title) {
        JFrame frame = new JFrame();

        frame.getContentPane().setLayout(new FlowLayout());

        JTextArea area= new JTextArea(25,40);
        area.setText(text);
        area.setEditable(false);
        frame.add(area);

        frame.setTitle(title);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}
