import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {

    public Menu() {

        JFrame frame = new JFrame();

        frame.getContentPane().setLayout(new GridLayout(1,7));

        JButton btn1 = new JButton("Start Game");
        JButton btn2 = new JButton("Cancel Game");
        JButton btn3 = new JButton("Insert User");
        JButton btn4 = new JButton("Show Users History");
        JButton btn5 = new JButton("Game explained");
        JButton btn6 = new JButton("About");
        JButton btn7 = new JButton("Exit");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);

        frame.setTitle("Game");
        frame.setSize(1200, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About about = new About();
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }



}
