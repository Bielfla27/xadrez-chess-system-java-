package Xadrez;

import PecasDeXadrez.King;
import PecasDeXadrez.Torre;
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
	
	private void colocarNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).paraPosicao());
	}
	
	private void inicioDoJogo() {
		colocarNovaPeca('b',6, new Torre(tabuleiro,Cor.WHITE));
		colocarNovaPeca('e',8,new King(tabuleiro,Cor.BLACK));
		colocarNovaPeca('e',1,new King(tabuleiro,Cor.WHITE));
	}
	

}
