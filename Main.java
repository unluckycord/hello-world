import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("text editor");
		
		JTextField tf = new JTextField();
		
		JButton b = new JButton("Save");
		
		b.setBounds(20, 20, 100, 30);
		tf.setBounds(20, 80, 200, 30);
		
		
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				try {
					
					String string = tf.getText().toString();
					
					BufferedWriter writer = new BufferedWriter ( new FileWriter("TEXT.txt") );
				
					writer.write(string);
					
					writer.close();
					
				} catch (IOException el) {
					// TODO Auto-generated catch block
					el.printStackTrace();
				}
			}});  
		f.add(tf);f.add(b);
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
