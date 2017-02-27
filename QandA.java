package dsh;

import javax.imageio.ImageIO;
import javax.swing.*;

import org.omg.CORBA.portable.InputStream;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class QandA {
	
	private ImageIcon bg=new ImageIcon("pic/java.png");;
	private JFrame frame;
	private JPanel p1, p2, p3;
	private JLabel[] arrayLabels;
	private JRadioButton[] arrayRButtons;
	private ButtonGroup[] arrayGroups;
	private JPanel[] arrayPanels;
	private CardLayout cl;
	private JLabel lb1;
	private JButton btn1, btn2;
	private int  s;

	
	public QandA() {
		prepareGUI();
	}

	private void prepareGUI() {

	
		frame = new JFrame();
		frame.setSize(850, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());

		p1 = new JPanel();
		p1.setLayout(new FlowLayout());

		lb1 = new JLabel("Kuiz Java");

		cl = new CardLayout();

		p2 = new JPanel();
		p2.setLayout(cl);

		// panelat qe tregojn pyetje dhe pergjigjje
		arrayPanels = new JPanel[20];

		for (int i = 0; i < arrayPanels.length; i++) {

			arrayPanels[i] = new JPanel();
			p2.add(arrayPanels[i], String.valueOf(i));
			arrayPanels[i].setLayout(new GridLayout(0, 1));

		}

		// radio butonat me pergjigjje
		arrayRButtons = new JRadioButton[40];

		for (int i = 0; i < arrayRButtons.length; i++) {
			arrayRButtons[i] = new JRadioButton();

			switch (i) {
			case 0:
				arrayRButtons[i].setText("Private");
				break;
			case 1:
				arrayRButtons[i].setText("Protected");
				break;
			case 2:
				arrayRButtons[i].setText("Static, Final");
				break;
			case 3:
				arrayRButtons[i].setText("Public,Private");
				break;
			case 4:
				arrayRButtons[i].setText("Mund ti therras metodat pa ndonje kusht");
				break;
			case 5:
				arrayRButtons[i].setText("Duhet të jetë nënklase e klases se mbrojtur");
				break;
			case 6:
				arrayRButtons[i].setText("Jo");
				break;
			case 7:
				arrayRButtons[i].setText("Po");
				break;
			case 8:
				arrayRButtons[i].setText("Krijimin e klasave dhe metodave abstrakte");
				break;
			case 9:
				arrayRButtons[i].setText("Krijimin e Objekteve");
				break;
			case 10:
				arrayRButtons[i].setText("Parametrat");
				break;
			case 11:
				arrayRButtons[i].setText("Konstruktori");
				break;
			case 12:
				arrayRButtons[i].setText("Public dhe Void");
				break;
			case 13:
				arrayRButtons[i].setText("Static dhe Final");
				break;
			case 14:
				arrayRButtons[i].setText("Mund te qaset nga klase jashte pakos");
				break;
			case 15:
				arrayRButtons[i].setText("Nuk mund te qaset nga klase jashte pakos");
				break;
			case 16:
				arrayRButtons[i].setText("Nje gabim qe ndodh gjat ekzekutimit te programit");
				break;
			case 17:
				arrayRButtons[i].setText("Nje gabim qe ndodh gjat kompajlimit te programit");
				break;
			case 18:
				arrayRButtons[i].setText("Deklarimi , Instantimi dhe Inicializimi");
				break;
			case 19:
				arrayRButtons[i].setText("Inicializimi , Instantimi dhe Deklarimi");
				break;
			case 20:
				arrayRButtons[i].setText("Kur deshiron ti perdoresh metodat e klases prind");
				break;
			case 21:
				arrayRButtons[i].setText("Kur deshiron qe nje klase te permbaj nje metode nga\n klasa prind( Abstrakte) por implementimi\n te behet nga klasa femi(child class)");
				break;
			case 22:
				arrayRButtons[i].setText("Teknike per shkurtimin e kodit");
				break;
			case 23:
				arrayRButtons[i].setText("Teknike ku fushat e nje klase behen private\n dhe qasen nga metodat publike te\n klases dhe fshihen nga klasat e tjera");
				break;
			case 24:
				arrayRButtons[i].setText("Jo");
				break;
			case 25:
				arrayRButtons[i].setText("Po");
				break;
			case 26:
				arrayRButtons[i].setText("Abstrakte");
				break;
			case 27:
				arrayRButtons[i].setText("Publike");
				break;
			case 28:
				arrayRButtons[i].setText("Disa nga metodat ne interface definohen ne klase");
				break;
			case 29:
				arrayRButtons[i].setText("Te gjitha metodat ne interface definohen ne klase");
				break;
			case 30:
				arrayRButtons[i].setText("dataType = new arraySize [arrayName]");
				break;
			case 31:
				arrayRButtons[i].setText("arrayName=new dataType[arraySize]");
				break;
			case 32:
				arrayRButtons[i].setText("Jo");
				break;
			case 33:
				arrayRButtons[i].setText("Po");
				break;
			case 34:
				arrayRButtons[i].setText("Static");
				break;
			case 35:
				arrayRButtons[i].setText("Private");
				break;
			case 36:
				arrayRButtons[i].setText("Jo");
				break;
			case 37:
				arrayRButtons[i].setText("Po");
				break;
			case 38:
				arrayRButtons[i].setText("po");
				break;
			case 39:
				arrayRButtons[i].setText("Jo");
				break;

			}
		}

		// grupet e pergjigjjeve
		arrayGroups = new ButtonGroup[20];

		int j = 0;
		for (int i = 0; i < arrayGroups.length; i++) {

			arrayGroups[i] = new ButtonGroup();

			arrayGroups[i].add(arrayRButtons[j]);
			arrayGroups[i].add(arrayRButtons[j + 1]);
			j += 2;
		}

		arrayLabels = new JLabel[20];

		for (int i = 0; i < arrayLabels.length; i++) {
			arrayLabels[i] = new JLabel();
			switch (i) {
			case 0:
				arrayLabels[i].setText("Cila nga access modifiers ka nivelin më restriktiv të qasjes?");
				break;
			case 1:
				arrayLabels[i].setText("Cilat nga këto janë non-access modifier?");
				break;
			case 2:
				arrayLabels[i].setText("Për ti ju qasur metodave te nje klasë te mbrojtur(protected) nga një klasëe pakos(package) tjetër , klasa aktuale :");
				break;
			case 3:
				arrayLabels[i]
						.setText("A mund ti qasen metodave të nje klase te mbrojtur(protected) klasat e te njejtes pako?");
				break;
			case 4:
				arrayLabels[i].setText("Qka sherben abstract modifier?");
				break;
			case 5:
				arrayLabels[i].setText("Cila nga keto eshte forme e variablave?");
				break;
			case 6:
				arrayLabels[i].setText("Cilet modifiers mundesojne krijimin e konstanteve ?");
				break;
			case 7:
				arrayLabels[i].setText("Nese nje variable nuk ka ndonje access modifier ajo:");
				break;
			case 8:
				arrayLabels[i].setText("Qka eshte nje exception?");
				break;
			case 9:
				arrayLabels[i].setText("Hapat e Krijimit te Objektit te nje Klase jane: ");
				break;
			case 10:
				arrayLabels[i].setText("Kur perdoren metodat Abstrakte ?");
				break;
			case 11:
				arrayLabels[i].setText("Qka eshte enkapsulimi?");
				break;
			case 12:
				arrayLabels[i].setText("A mund te instantohet Interface?");
				break;
			case 13:
				arrayLabels[i].setText("Qfar metoda permban Interface?");
				break;
			case 14:
				arrayLabels[i].setText("Nese nje klase implementon nje Interface ateher:");
				break;
			case 15:
				arrayLabels[i].setText("Cila eshte forma me instantu nje varg ?");
				break;
			case 16:
				arrayLabels[i].setText("A eshte ne rregull ky inicializim: int [][] t=new int [1][3]; t[0][3]=9");
				break;
			case 17:
				arrayLabels[i].setText("Ne menyr qe nje metode te konsiderohet pjese e klases\n dhe jo vetem e objektit ajo duhet te permbaj ne\n deklarimin e saj:");
				break;
			case 18:
				arrayLabels[i].setText("A mund te rishkruhen metodat statike te klases prind :");
				break;
			case 19:
				arrayLabels[i].setText("A mund ta zgjerosh (extend) nje klase finale (final):");
				break;

			}
		}

		p3 = new JPanel();
		p3.setLayout(new FlowLayout());

		// Rrotullimi i paneleve me pergjigjje
		btn1 = new JButton("Pytja tjeter");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next(p2);
				btn1.setEnabled(false);
				btn2.setEnabled(true);
				btn1.setText("Pytja tjeter");
			}
		});

		btn2 = new JButton("Kontrollo pergjigjjen");
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);

				if (arrayRButtons[0].isSelected() || arrayRButtons[2].isSelected() || arrayRButtons[5].isSelected()
						|| arrayRButtons[7].isSelected() || arrayRButtons[8].isSelected()
						|| arrayRButtons[10].isSelected() || arrayRButtons[13].isSelected()
						|| arrayRButtons[15].isSelected() || arrayRButtons[16].isSelected()
						|| arrayRButtons[18].isSelected() || arrayRButtons[21].isSelected()
						|| arrayRButtons[23].isSelected() || arrayRButtons[24].isSelected()
						|| arrayRButtons[26].isSelected() || arrayRButtons[29].isSelected()
						|| arrayRButtons[31].isSelected() || arrayRButtons[33].isSelected()
						|| arrayRButtons[36].isSelected() || arrayRButtons[34].isSelected()) {
					s += 5;
					JOptionPane.showMessageDialog(null, "Sakte");
				} else if (arrayRButtons[39].isSelected()) {
					s += 5;
					JOptionPane.showMessageDialog(null, "Sakt, Ke fituar: " + s + " poena");
					btn1.setText("Start again quiz");
				} else if (arrayRButtons[38].isSelected()) {
					JOptionPane.showMessageDialog(null, "Gabim, Ke fituar: " + s + " poena");
					btn1.setText("Start again quiz");
				} else {
					JOptionPane.showMessageDialog(null, "Gabim");
				}
				for (int i = 0; i < 20; i++) {
					arrayGroups[i].clearSelection();
				}
				btn2.setEnabled(true);
			}

		});

	}

	private void start_quiz() {
		p1.add(lb1);

		p3.add(btn1);
		p3.add(btn2);

		int q = 0;
		for (int w = 0; w < 20; w++) {

			arrayPanels[w].add(arrayLabels[w]);
			arrayPanels[w].add(arrayRButtons[q]);
			arrayPanels[w].add(arrayRButtons[q + 1]);

			q += 2;
		}

		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.CENTER);
		frame.add(p3, BorderLayout.SOUTH);
		frame.setResizable(false);
		cl.show(p2, "0");
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		QandA start = new QandA();
		start.start_quiz();
	}

}
