package Statki;

import java.awt.EventQueue;


public class Testowa {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			
			// OKNO 1
			// moja mapa | wr�g
			
			//1. Gracz1 widoczny, Gracz2 niewidoczny.
			//   - gracz 1 klika swoje statki, a wtedt 2 zast�oni�ty.
			//2. Gracz 1 klika KONIC TURY.
			//3 statki 1 staj� si� niewidoczne dla gracza2, pojawia si� plansza gracza2.
			//4. Gracz 2 klika KONIEC TURY.
			// zrealizowane 03.10.2018
			
			//5. przycisk reset - resetuje gr� do ekrany startowego. (start 03.10.2018)l 
			
			//6. Start > podaj NAZW� gracza1, gracza 2, nast�pnie ustaw to na g�rze MyFrame1. KeyListener
			//	zmodyfikowane i zamianst na g�rze MyFrame1 wprowadzone imiona graczy pojawiaja si� na JButtonie Start/Gracz1/Gracz2 
			
			@Override
			public void run() {
				//new Frame();
			 new MyFrame1(); 
			

			}
		});
		
	}
}
