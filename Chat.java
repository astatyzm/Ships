package Statki;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chat extends JPanel implements KeyListener{
	
	private static JTextField userName1 = new JTextField(10);	
	private static JTextField userName2 = new JTextField(10);
	private static JTextField strPlayer1 = new JTextField(10);
	private static JTextField strPlayer2 = new JTextField(10);
	private static JLabel userName1_label = new JLabel();
	private static JLabel userName2_label = new JLabel();
	public static String userName1_Player;
	public static String userName2_Player;

	static boolean player1 = false;
	static boolean player2 = false;
	static boolean userNam2_disp = false;
	
	
	
	public Chat() {
		
		setBounds(0, 700, 1200, 300);
		setLayout(null);
		setBackground(Color.YELLOW);
		
		userName1_label.setBounds(350, 10, 200, 20);
		userName1_label.setFont(new Font("Dialog", Font.BOLD, 20));
		userName1_label.setText("Podaj imie Gracza 1");
		userName1_label.setVisible(true);
		add(userName1_label);
		
		userName1.setBounds(550, 10, 200, 25);
		userName1.setFont(new Font ("Dialog", Font.BOLD, 20));
		userName1.addKeyListener(this);
		userName1.setVisible(true);
		add(userName1);
		
		userName2_label.setBounds(350, 45, 200, 20);
		userName2_label.setFont(new Font("Dialog", Font.BOLD, 20));
		userName2_label.setText("Podaj imie Gracza 2");
		userName2_label.setVisible(false);
		add(userName2_label);
		
		userName2.setBounds(550, 40, 200, 25);
		userName2.setFont(new Font ("Dialog", Font.BOLD, 20));
		userName2.addKeyListener(this);
		userName2.setVisible(false);
		add(userName2);
	}
		

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

			if(userNam2_disp == true && e.getKeyChar() == KeyEvent.VK_ENTER) {
				userName2_Player = userName2.getText();	
				strPlayer2.setText(userName2_Player);
				player2 = true;
				System.out.println("jest Gracz2 " + userName2.getText().toString() + "bool player2" + player2 + "String: "+ userName2_Player + " tmpPlayer2: " + strPlayer2.getText());
				 }
			}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == KeyEvent.VK_ENTER) {
			userName1_Player = userName1.getText();	
			strPlayer1.setText(userName1_Player);
			player1 = true;
			System.out.println("jest Gracz1 " + userName1.getText().toString() + "bool player1" + player1 + "String: "+ userName1_Player + " tmpPlayer1: " + strPlayer1.getText());
			if(player1 == true){
				userName2_label.setVisible(true);				
				userName2.setVisible(true);
				userNam2_disp = true;
				}
			}		 
		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub		
	}
	

}
