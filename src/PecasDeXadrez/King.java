package PecasDeXadrez;

import TabuleiroDoJogo.Tabuleiro;
import Xadrez.Cor;
import Xadrez.PecaDeXadrez;

public class King extends PecaDeXadrez{

	public King(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
