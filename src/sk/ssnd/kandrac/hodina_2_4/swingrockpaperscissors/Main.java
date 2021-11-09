package sk.ssnd.kandrac.hodina_2_4.swingrockpaperscissors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Kamen papier noznice");
		frame.setSize(400,500);//400 width and 500 height  
		frame.setLayout(null);//using no layout managers  
		frame.setVisible(true);//making the frame visible
		
		JButton button = new JButton("Hraj");
		button.setBounds(0, 0, 400, 30);
		frame.add(button);
		
		JLabel prvy = new JLabel("Prvy Hrac");
		prvy.setBounds(0, 50, 400, 30);
		frame.add(prvy);
		
		JLabel druhy = new JLabel("Druhy hrac");
		druhy.setBounds(0, 100, 400, 30);
		frame.add(druhy);
		
		JLabel vysledok = new JLabel("Vysledok");
		vysledok.setBounds(0, 150, 400, 30);
		frame.add(vysledok);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random(System.currentTimeMillis());
				int prvyHrac = r.nextInt(3);
				int druhyHrac = r.nextInt(3);

				switch(prvyHrac) {
					case 0: prvy.setText("Kamen"); break;
					case 1: prvy.setText("Papier"); break;
					case 2: prvy.setText("Noznice");
				}

				switch(druhyHrac) {
					case 0: druhy.setText("Kamen"); break;
					case 1: druhy.setText("Papier"); break;
					case 2: druhy.setText("Noznice");
				}
				
				if (prvyHrac == druhyHrac) {
					vysledok.setText("REMIZA");
				} else if (prvyHrac == 0 && druhyHrac == 1) {
					vysledok.setText("PREHRAL PRVY");
				} else if (prvyHrac == 0 && druhyHrac == 2) {
					vysledok.setText("VYHRAL PRVY");
				} else if (prvyHrac == 1 && druhyHrac == 0) {
					vysledok.setText("VYHRAL PRVY");
				} else if (prvyHrac == 1 && druhyHrac == 2) {
					vysledok.setText("PREHRAL PRVY");
				} else if (prvyHrac == 2 && druhyHrac == 0) {
					vysledok.setText("PREHRAL PRVY");
				} else if (prvyHrac == 2 && druhyHrac == 1) {
					vysledok.setText("VYHRAL PRVY");
				}
				
			}
		});
	}

}
