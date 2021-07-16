package TabuleiroDoJogo;

public class Peca {

	protected Posicao posicao; //Posicao vai ser nulo 
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
