package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import TabuleiroDoJogo.TabuleiroException;
import Xadrez.PartidaDeXadrez;
import Xadrez.PecaDeXadrez;
import Xadrez.XadrezException;
import Xadrez.XadrezPosicao;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaDeXadrez partida = new PartidaDeXadrez();
		while(true) {
			try {
				UI.clearScreen();
				UI.printTabuleiro(partida.getPecas());
				System.out.println();
				System.out.print("Origem: ");
				XadrezPosicao origem = UI.lerPosicao(sc);
				
				boolean[][] possivelMovimentos = partida.possivelMovimentos(origem);
				UI.clearScreen();
				UI.printTabuleiro(partida.getPecas(),possivelMovimentos);
				
				System.out.println();
				System.out.print("Destino: ");
				XadrezPosicao destino = UI.lerPosicao(sc);
				
				PecaDeXadrez capturarPeca = partida.executarMovimento(origem, destino);
			}catch (XadrezException e) {
				System.out.println(e.getMessage());
				sc.nextLine(); //Só pula depois de dar um enter
			}catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine(); //Só pula depois de dar um enter
			}	
			
		}
	}

}
