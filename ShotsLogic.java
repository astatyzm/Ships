package Statki;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ShotsLogic extends MyFrame1 implements ActionListener {
	
	private int green;
	static Color Red = new Color(255, 0, 0);
	 static boolean[][] yellow_check = new boolean[10][10];
	static boolean[][] yellow_check2 = new boolean[10][10];

	public static void check() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if ((MyPanel1_2MojeStatki.flags[i][j] == MyPanel1_3WrogaStatki2.flags[i][j])  || (MyPanel1_3WrogaStatki.flags[i][j] == MyPanel1_2MojeStatki2.flags[i][j])){
					yellow_check[i][j] = true;					
				}	
				System.out.println("Yellow check: "+i+ "  "+j+"  "+yellow_check[i][j]);
			}
			
		}		
	}
	public static void paintRed() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if((MyFrame1.show == true) && (yellow_check[i][j]== true) && (MyPanel1_2MojeStatki2.flags[i][j] && MyPanel1_3WrogaStatki.flags[i][j])){
					System.out.println("-------------------------------------------------");
					System.out.println("Statki Gracza 1");
					MyPanel1_3WrogaStatki.Statek[i][j].setBackground(Color.RED); 
					MyPanel1_2MojeStatki2.StatekWroga[i][j].setBackground(Color.YELLOW);
					System.out.println("Show: "+show);
					System.out.println("YellowCheck Gracz1 "+i+ "  "+j+"  "+yellow_check[i][j]);
					
				}
				else if((MyFrame1.show == false)  && (yellow_check[i][j]== true) && (MyPanel1_3WrogaStatki2.flags[i][j] && MyPanel1_2MojeStatki.flags[i][j])) {
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("Statki Gracza 2");						
					MyPanel1_2MojeStatki.Statek[i][j].setBackground(Color.RED);	
					MyPanel1_3WrogaStatki2.StatekWroga[i][j].setBackground(Color.YELLOW);
					System.out.println("Show "+show);
					System.out.println("YellowCheck Gracz2"+i+ "  "+j+"  "+yellow_check2[i][j]);
					
				}
			}			
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
		
		
			}
			
		

	
}
