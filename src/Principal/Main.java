package Principal;

import java.util.Scanner;

import Xadrez.PartidaDeXadrez;
import Xadrez.PecaDeXadrez;
import Xadrez.XadrezPosicao;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaDeXadrez partida = new PartidaDeXadrez();
		while(true) {
			UI.printTabuleiro(partida.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			XadrezPosicao origem = UI.lerPosicao(sc);
			
			System.out.println();
			System.out.print("Destino: ");
			XadrezPosicao destino = UI.lerPosicao(sc);
			
			PecaDeXadrez capturarPeca = partida.executarMovimento(origem, destino);

			
		}
	}

}
