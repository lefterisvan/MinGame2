import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Menu {

    public Menu() {

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2,1));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1,7));
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());


        try {
            JLabel image = new JLabel(new ImageIcon(ImageIO.read(new File("gamePic.jpg"))));
            //image.setBounds(0,0,500,600);
            panel2.add(image);
        } catch (IOException e) {
            e.printStackTrace();
        };



        JButton btn1 = new JButton("Start Game");
        JButton btn2 = new JButton("Cancel Game");
        JButton btn3 = new JButton("Insert User");
        JButton btn4 = new JButton("Show Users History");
        JButton btn5 = new JButton("Game explained");
        JButton btn6 = new JButton("About");
        JButton btn7 = new JButton("Exit");

        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);
        panel1.add(btn6);
        panel1.add(btn7);

        frame.add(panel1);
        frame.add(panel2);

        frame.setTitle("Game Menu");
        frame.setSize(1200, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardBoard t1 = new CardBoard();
                t1.graphicEasy(new JFrame("Titlos"), new GridLayout(5,5));
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.getContentPane().setLayout(new FlowLayout());

                JLabel name = new JLabel("Insert your name:");
                JTextField insertName = new JTextField();

                frame.setTitle("Insert user name");
                frame.setSize(500, 500);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                frame.setVisible(true);
            }
        });

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
