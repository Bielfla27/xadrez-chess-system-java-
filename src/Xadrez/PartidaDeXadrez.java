package Xadrez;

import PecasDeXadrez.King;
import PecasDeXadrez.Torre;
import TabuleiroDoJogo.Posicao;
import TabuleiroDoJogo.Tabuleiro;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		inicioDoJogo();
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	
	private void inicioDoJogo() {
		tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.WHITE), new Posicao(2, 1));
		tabuleiro.colocarPeca(new King(tabuleiro,Cor.BLACK), new Posicao(2, 1));
		tabuleiro.colocarPeca(new King(tabuleiro,Cor.WHITE), new Posicao(7, 4));
	}
	
	

}
