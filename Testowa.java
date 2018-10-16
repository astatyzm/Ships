package Statki;

import java.awt.EventQueue;


public class Testowa {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			
			// OKNO 1
			// moja mapa | wróg
			
			//1. Gracz1 widoczny, Gracz2 niewidoczny.
			//   - gracz 1 klika swoje statki, a wtedt 2 zast³oniêty.
			//2. Gracz 1 klika KONIC TURY.
			//3 statki 1 staj¹ siê niewidoczne dla gracza2, pojawia siê plansza gracza2.
			//4. Gracz 2 klika KONIEC TURY.
			// zrealizowane 03.10.2018
			
			//5. przycisk reset - resetuje grê do ekrany startowego. (start 03.10.2018)l 
			
			//6. Start > podaj NAZWÊ gracza1, gracza 2, nastêpnie ustaw to na górze MyFrame1. KeyListener
			//	zmodyfikowane i zamianst na górze MyFrame1 wprowadzone imiona graczy pojawiaja siê na JButtonie Start/Gracz1/Gracz2 
			
			@Override
			public void run() {
				//new Frame();
			 new MyFrame1(); 
			

			}
		});
		
	}
}
