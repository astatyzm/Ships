package Statki;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel1 extends JPanel implements ActionListener{
	
	JLabel labelA, labelB, labelC, labelD, labelE, labelF, labelG, labelH, labelI, labelJ;
	JLabel labelA_Wroga, labelB_Wroga, labelC_Wroga, labelD_Wroga, labelE_Wroga, labelF_Wroga, labelG_Wroga, labelH_Wroga, labelI_Wroga, labelJ_Wroga;
	JLabel mojePole, poleWroga;
	
	JLabel[] tabLab = new JLabel[10];
	JLabel[] tabLabWroga = new JLabel[10];
	String[] tabString = {"1","2","3","4","5","6","7","8","9","10"};
	Graphics2D[] lines_ver = new Graphics2D [tabLab.length+1];
	Graphics2D[] lines_hor = new Graphics2D [tabLab.length+1];
	
	
	
	private final int x_size = 25;
	private final int y_size = 50;
	private final int x_col  = 25;
	
		
	public MyPanel1(){
	
		this.setLayout(null);
		//this.setBounds(0, 0, 1500, 999);
		this.setBounds(0, 0, 1200, 550);
		
		
		mojePole = new JLabel("Moje Pole");
		mojePole.setBounds(50,0,100,30);
		mojePole.setFont(new Font ("Dialog", Font.BOLD, 18));
		this.add(mojePole);
		
		for (int i=0; i < tabLab.length; i ++) {		
			tabLab[i] = new JLabel();
			tabLab[i].setBounds(((i+1)*50)+20, 10, x_size, y_size); 
			tabLab[i].setText(tabString[i]);
			this.add(tabLab[i]);
		//	System.out.println(tabLab[i]+tabString[i]);
		}
		
		labelA =  new JLabel("A");				
		labelA.setBounds(x_col, 50, x_size, y_size);
		this.add(labelA);	
		
		labelB =  new JLabel("B");
		labelB.setBounds(x_col, 100, x_size, y_size);
		this.add(labelB);
		
		labelC =  new JLabel("C");
		labelC.setBounds(x_col, 150, x_size, y_size);
		this.add(labelC);

		labelD =  new JLabel("D");
		labelD.setBounds(x_col, 200, x_size, y_size);
		this.add(labelD);

		labelE =  new JLabel("E");
		labelE.setBounds(x_col, 250, x_size, y_size);
		this.add(labelE);
		
		labelF =  new JLabel("F");
		labelF.setBounds(x_col, 300, x_size, y_size);
		this.add(labelF);
		
		labelG =  new JLabel("G");
		labelG.setBounds(x_col, 350, x_size, y_size);
		this.add(labelG);
		
		labelH =  new JLabel("H");
		labelH.setBounds(x_col, 400, x_size, y_size);
		this.add(labelH);
		
		labelI =  new JLabel("I");
		labelI.setBounds(x_col, 450, x_size, y_size);
		this.add(labelI);
		
	    labelJ =  new JLabel("J");
		labelJ.setBounds(x_col, 500, x_size, y_size);
		this.add(labelJ);	
	

		
		poleWroga = new JLabel("Strza³y w Pole Wroga");
		poleWroga.setBounds(600,0,200,30);
		poleWroga.setFont(new Font ("Dialog", Font.BOLD, 18));
		this.add(poleWroga);
		
		for(int i = 0;  i< tabLab.length; i++)
		{
			tabLabWroga[i] = new JLabel();
			tabLabWroga[i].setBounds((i+1)*50+620,10, x_size, y_size); 
			tabLabWroga[i].setText(tabString[i]);
			add(tabLabWroga[i]);			
		}
		labelA_Wroga =  new JLabel("A");				
		labelA_Wroga.setBounds(x_col+600, 50, x_size, y_size);
		this.add(labelA_Wroga);	
		
		labelB_Wroga =  new JLabel("B");
		labelB_Wroga.setBounds(x_col+600, 100, x_size, y_size);
		this.add(labelB_Wroga);
		
		labelC_Wroga =  new JLabel("C");
		labelC_Wroga.setBounds(x_col+600, 150, x_size, y_size);
		this.add(labelC_Wroga);

		labelD_Wroga =  new JLabel("D");
		labelD_Wroga.setBounds(x_col+600, 200, x_size, y_size);
		this.add(labelD_Wroga);

		labelE_Wroga =  new JLabel("E");
		labelE_Wroga.setBounds(x_col+600, 250, x_size, y_size);
		this.add(labelE_Wroga);
		
		labelF_Wroga =  new JLabel("F");
		labelF_Wroga.setBounds(x_col+600, 300, x_size, y_size);
		this.add(labelF_Wroga);
		
		labelG_Wroga =  new JLabel("G");
		labelG_Wroga.setBounds(x_col+600, 350, x_size, y_size);
		this.add(labelG_Wroga);
		
		labelH_Wroga =  new JLabel("H");
		labelH_Wroga.setBounds(x_col+600, 400, x_size, y_size);
		this.add(labelH_Wroga);
		
		labelI_Wroga =  new JLabel("I");
		labelI_Wroga.setBounds(x_col+600, 450, x_size, y_size);
		this.add(labelI_Wroga);
		
	    labelJ_Wroga =  new JLabel("J");
		labelJ_Wroga.setBounds(x_col+600, 500, x_size, y_size);
		this.add(labelJ_Wroga);	
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

	

