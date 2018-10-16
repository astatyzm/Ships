package Statki;



import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MyPanel1_3WrogaStatki2 extends JPanel implements ActionListener{
	
	JLabel[] tabLab1 = new JLabel[10];
	// Buttony
	final int buttonSize = 20;
	final int buttonYstart = 65;
	final int size = 10;
	
	public static JButton[][] StatekWroga = new JButton[10][10];
	
	//linie siatki 
	int wsp_x1 = 25;
	int wsp_y1 = 25;
	int wsp_x2 = 550;
	int wsp_y2 = 550;
	
	JLabel[] tabLab = new JLabel[10];

	Graphics2D[] lines_ver_wroga = new Graphics2D [tabLab.length+1];
	Graphics2D[] lines_hor_wroga = new Graphics2D [tabLab.length+1];
	
	public static boolean flags[][] = new boolean[10][10];
	
	private int x_size = 25;
	private int y_size = 50;
	private int x_col  = 25;
	
	
	public MyPanel1_3WrogaStatki2() {		
	
		this.setBounds(650,50, 500, 500); //jak tu boundsy zmienie to rozciagna sie guziki  :( 
		this.setLayout(new GridLayout(10, 10, 5,5));	
		
		
		for (int i = 0; i < 10; i++) {	
			for(int j = 0; j < 10; j++){
				StatekWroga[i][j]= new JButton();
				StatekWroga[i][j].setBounds((i+1)*55,(j+1)*55,buttonSize,buttonSize);  //(i+1)*50+5
				StatekWroga[i][j].addActionListener(this);
				add(StatekWroga[i][j]);		
				}	
	     	}
		}
	// Tworzenie siatki 
	@Override
	protected void paintComponent(Graphics g) {  //paintComponent to STANDARDOWA !
		super.paintComponent(g);
		
			for (int i = 0; i < tabLab.length+1; i++) {		

				lines_ver_wroga[i] = (Graphics2D) g;
				lines_hor_wroga[i] = (Graphics2D) g;
				
				lines_ver_wroga[i].drawLine((i+1)*50, wsp_y1, (i+1)*50, wsp_y2);
				lines_hor_wroga[i].drawLine(wsp_x1, (i+1)*50, wsp_x2, (i+1)*50);	
				
				}
		}

	// zrób tablice boolean 10x10 i w momencie zmiany koloru ustaw true w odpowiednim miejscu tabeli
	@Override  
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i ++) {
			for (int j = 0; j <10; j++) {
				if(e.getSource() == StatekWroga[i][j]) {
					StatekWroga[i][j].setBackground(Color.BLUE);
					flags[i][j] = true;
					
				}
			}
		}
		ShotsLogic.check();
		ShotsLogic.paintRed();
		
	}
}
	
		

