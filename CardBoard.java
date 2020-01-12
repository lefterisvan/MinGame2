import Shapes.*;
import Shapes.Shape;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;


public class CardBoard implements MouseListener { // i klassh auth perilamvanei tin dhmiourgia tou board (tamplo) tou paixnidiou

	Button buttons[] = new Button[25]; // pinakas me ta buttons/kartes tou board
	JPanel panels[] = new JPanel[25]; // pinakas me panels opou exoume ta sxhmata
        JLabel labels[] = new JLabel[25];
	JFrame frame;
	int counter=0;
	int score=0;
	int previousCard=100;
	int tries=0; // metrhths (counter) gia tis prospatheies pou exei o xrhsths | stis 4 apotuxhmenes prospatheies o paikths xanei
	FileWriter stats;
	File file = new File("users.txt");

	public void graphicEasy(JFrame frame, GridLayout grid) {
		this.frame= frame;
		ArrayList<Shape> cards = new ArrayList<>(); // i lista cards antiproswpevei ola ta sxhmata tou board mas

		for (int i = 0; i < 4; i++) { // gemizoume tin lista cards me sxhmata (idio sxhma idio xrwma mexri 2 zeugaria)
			cards.add(new Square(Color.BLACK));
		}

		for (int i = 0; i < 4; i++) {
			cards.add(new Square(Color.RED));
		}

		for (int i = 0; i < 2; i++) {
			cards.add(new Square(Color.GREEN));
		}

		for (int i = 0; i < 4; i++) {
			cards.add(new Diamond(Color.BLUE));
		}

		for (int i = 0; i < 2; i++) {
			cards.add(new Triangle(Color.GREEN));
		}

		for (int i = 0; i < 1; i++) {
			cards.add(new Joker(Color.BLACK));
		}

		for (int i = 0; i < 4; i++) {
			cards.add(new Circle(Color.BLACK));
		}

		for (int i = 0; i < 4; i++) {
			cards.add(new Circle( Color.RED));
		}

		Collections.shuffle(cards); // anakatevoume to board (tis kartes)

		for (int i = 0; i < 25; i++) {
			// to id tou button einai to id tou sxhmatos panw sto button/karta
			// gia na ksexwrisoume thn monadikothta twn zeugariwn.
			// ola ta zeugaria exoun tous idious kwdikous.
                    panels[i]=cards.get(i);


			
			
                       buttons[i]=new Button(cards.get(i));
			
			panels[i].setVisible(false);
                        frame.add(buttons[i]);
			frame.add(panels[i]);
			buttons[i].addMouseListener(this);
		}

		frame.setTitle("Game");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(grid);

		frame.setVisible(true);
	}


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("klik");
     
        for(int i=0; i<buttons.length; i++)
		{
			Button b=buttons[i];
			if(e.getSource()==b)
			{
				if (b.getSxhma() instanceof Joker || score==12) {
					for (int j=0; j<buttons.length; j++) {
						buttons[j].setVisible(false);
						panels[j].setVisible(true);
					}
					JOptionPane.showMessageDialog(null, "Game ended! You Won!", "information", JOptionPane.INFORMATION_MESSAGE);
					FileOutputStream f = null;
					ObjectOutputStream o = null;
					User user = new User("koto",12);
					try {
						if (!file.exists()) {
							f = new FileOutputStream(file);
							o = new ObjectOutputStream(f);
							o.writeObject(user);

							f.close();
							o.close();
						}
						else { // me to na kanoume reset to header mporoume na kanoume append sto arxeio mas kai na apofugoume to override
							ObjectOutputStream2 os2=new ObjectOutputStream2(new FileOutputStream(file,true));
							os2.writeObject(user);
							os2.flush();
							os2.close();
						}
					} catch (FileNotFoundException ex) {
						ex.printStackTrace();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
					frame.dispose();
				}

				if (previousCard==100) {
					previousCard=i;
				}
				buttons[i].setVisible(false);
				panels[i].setVisible(true);
				counter++;

				if (counter==2) { // sta 2 anoigmata kartwn, sugkrinoume ta ids twn buttons na doume ean einai zeugari
					if (buttons[i].getSxhma().equals((buttons[previousCard].getSxhma()))) { // ean nai tote den kanoume tipota kai ta afinoume anoikta
						counter=0;
						previousCard=100;
						score++;
					}
					else { // ean oxi, tote kleinoume tis kartes pou anoiksame
						//tries++;
						buttons[i].setVisible(true);
						panels[i].setVisible(false);
						buttons[previousCard].setVisible(true);
						panels[previousCard].setVisible(false);
						counter=0;
						previousCard=100;
					}
				}
			}

			if (tries==5) { // sthn periptwsh pou apotuxei meta apo lanthasmenes provlepseis
				JOptionPane.showMessageDialog(null, "Game ended! 5 wrong predictions for pair!", "information", JOptionPane.INFORMATION_MESSAGE);
				FileOutputStream f = null;
				ObjectOutputStream o = null;
				User user = new User("koto",score);
				try {
					if (!file.exists()) {
						f = new FileOutputStream(file);
						o = new ObjectOutputStream(f);
						o.writeObject(user);

						f.close();
						o.close();
					}
					else { // me to na kanoume reset to header mporoume na kanoume append sto arxeio mas kai na apofugoume to override
						ObjectOutputStream2 os2=new ObjectOutputStream2(new FileOutputStream(file,true));
						os2.writeObject(user);
						os2.flush();
						os2.close();
					}
				} catch (FileNotFoundException ex) {
					ex.printStackTrace();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				frame.dispose();
			}
		}
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("lets start");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited");
    }


}
