package sk.ssnd.kandrac.hodina_2_4.swingfibonacci;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {  
		JFrame f = new JFrame();//creating instance of JFrame  
        
		JButton b = new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  

		JLabel l = new JLabel("Vysledok");//creating instance of JButton  
		l.setBounds(130,200,200, 40);//x axis, y axis, width, height  

		JTextField input = new JTextField();//creating instance of JButton  
		input.setBounds(130,300,200, 40);//x axis, y axis, width, height  

		f.add(b); 
		f.add(l); 
		f.add(input); 
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible
		
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int inputNum = Integer.parseInt(input.getText());
				int fibonacci = getFibonacci(inputNum);
				l.setText(input.getText() + ". Fibonacciho cislo je: " + fibonacci);
			}
			
		});
	}  
	
	static int getFibonacci(int n) {
		if (n == 0 || n == 1) return 1;
		int a = 1;
		int b = 1;
		for (int actual = 2; actual < n; actual++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

}
