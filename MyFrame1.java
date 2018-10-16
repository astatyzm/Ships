package Statki;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.peer.WindowPeer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class MyFrame1 extends JFrame implements ActionListener{
	
	public static JButton Tury = new JButton(); 
	public static JButton Reset = new JButton("Reset Gry");
	public JPanel MyPanel1 = new MyPanel1();
	public JPanel MyPanel1_2 = new MyPanel1_2MojeStatki();
	public JPanel MyPanel1_21 = new MyPanel1_2MojeStatki2();
	public JPanel MyPanel1_3 = new MyPanel1_3WrogaStatki2();
	public JPanel MyPanel1_31 = new MyPanel1_3WrogaStatki();
	public JPanel ChatPanel = new Chat();
	
	public static boolean show = false;
	public boolean resetBool = false;
	public boolean  chatPaneldisp = false;	
	
	
	public MyFrame1() {
		
				
		this.setAlwaysOnTop(false);
		this.setResizable(false);
		this.setSize(1200,900);
		setTitle("Gra w statki");
		this.setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	    setLayout(null);
	    setAlwaysOnTop(false);
	    revalidate();
		setVisible(true);
			
		
				
	    Tury.setBounds(450, 600, 250, 50);
	    Tury.setFont(new Font ("Dialog", Font.BOLD, 25));
	    Tury.addActionListener(this);
	    Tury.setText("Start");	   
	    add(Tury);

	    Reset.setBounds(100, 600, 100, 50);
	    Reset.setText("Reset Gry");
	    Reset.addActionListener(this);
	  //  add(Reset);
	    ChatPanel.setVisible(false);
	    add(ChatPanel);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub+		
			if(e.getSource() == Reset) {				
				System.out.println("Reset Gry");				
				for(int i = 0; i < 10; i++) {
					for(int j = 0; j < 10; j++) {
					//	MyPanel1_2.removeAll();
						MyPanel1_2.revalidate();
						MyPanel1_2.repaint();
						MyPanel1_2MojeStatki.Statek[i][j] = new JButton();
						this.add(MyPanel1_2);
						resetBool = true;						
						;						
					}
				}
				System.out.println("ResetBool "+resetBool);
			}	
		
			
			if (e.getSource() == Tury &&  show == false) {
				ChatPanel.setVisible(true);
				chatPaneldisp = true;
				System.out.println("chatPaneldisp "+chatPaneldisp);
				}
			
			if( show == false &&Chat.player1==true && Chat.player2==true && chatPaneldisp == true ) {			
				Tury.setText(Chat.userName1_Player);
				MyPanel1_3.setVisible(false);
				MyPanel1_31.setVisible(false);				
				getContentPane().add(MyPanel1_2);
				getContentPane().add(MyPanel1_21);
				MyPanel1_2.setVisible(true);
				MyPanel1_21.setVisible(true);
				show = true;
				System.out.println("Gracz: "+show);	
				this.add(Reset);
				}
	  		  
			
		 //  stary warunek  else if(e.getSource() == Tury && show == true && chatPaneldisp == true) {		    	
			else if(show == true && Chat.player1==true && Chat.player2==true && chatPaneldisp == true) {	
				Tury.setText(Chat.userName2_Player);				
				MyPanel1_2.setVisible(false);
		    	MyPanel1_21.setVisible(false);
		    	MyPanel1.setVisible(true);
		    	getContentPane().add(MyPanel1_3);
		    	getContentPane().add(MyPanel1_31);
		    	MyPanel1_3.setVisible(true);
		    	MyPanel1_31.setVisible(true);
		    	show = false;
		    	System.out.println("Gracz: "+show);
		    	}											
			}
}
	
	






