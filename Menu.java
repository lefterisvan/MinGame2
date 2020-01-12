import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {
    static String name=""; // to onoma tou User

    public Menu() { // To grafiko gia to menu

        // Dhmiourgia enos Frame me 2 JPanels. To 1o panel pairnei ola ta koumpia-leitourgies.
        // to 2o panel pairnei tin eikona.
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2,1));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1,7));
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

        try { // Topothethsh eikonas sto 2o panel
            JLabel image = new JLabel(new ImageIcon(ImageIO.read(new File("gamePic.jpg"))));
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

        // me thn methodo addActionListener dinoume leitourgikothta sta koumpia
        // ta koumpia einai me thn seira pou exoun dilwthei panw kai antistoixoun stin leitourgeia pou exoun stin parametro
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ean o paikths patisei na paiksei xwris na exei valei onoma,
                // tou petagetai to parathuro gia na valei to onoma.

                if (name.length()!=0) {
                    CardBoard t1 = new CardBoard();
                    t1.graphicEasy(new JFrame("Titlos"), new GridLayout(5,5));
                }
                else {
                    btn3.doClick(); // antistoixei sto parathuro pou ekxwreis to onoma
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.getContentPane().setLayout(new GridLayout(1,3));

                JLabel nameLabel = new JLabel("Insert your name:");
                JTextField nameInsert = new JTextField();
                JButton ok = new JButton("OK");

                frame.add(nameLabel);
                frame.add(nameInsert);
                frame.add(ok);
                frame.setTitle("Insert user name");
                frame.setSize(400, 80);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                frame.setVisible(true);

                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                     name = nameInsert.getText();
                     frame.dispose();
                    }
                });
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ObjectInputStream in=null;
                FileInputStream in1;
                String results="";
                User user;
                int count=0;

                try {
                    in1=new FileInputStream("users.txt");
                    if(in1.available()!=0)
                        in=new ObjectInputStream(in1);

                    while(in!=null && in1.available()!=0){

                        user = ((User) in.readObject());
                        results= results +user.getName()+"  -->  "+user.getScore()+System.lineSeparator();
                        count++;

                    } // emfanizoume ta apotelesmata mesw TextPage antikeimenou
                    TextPage text = new TextPage(results,"Users history");
                    if(count==0){
                        JOptionPane.showMessageDialog(null, "Den vrethikan apotelesmata", "Πληροφορίες", JOptionPane.INFORMATION_MESSAGE);}
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
        }});

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TextPage perigrafh = new TextPage("Perigrafh paixnidiou: \nO paikths dialegei epipedo duskolias, ekxwrei to onoma tou kai ksekinaei to paixnidi." +
                        "\nPrepei na vrei ola ta zeugh twn kartwn gia na kerdisei i alliws na vrei to JOKER." +
                        "\nO paikths exei 6 prospattheies gia na vrei ta zeugh.","Game details");
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextPage about = new TextPage("Name: Aggelikh Vakra. \nAM: icsd12345","About us");
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
