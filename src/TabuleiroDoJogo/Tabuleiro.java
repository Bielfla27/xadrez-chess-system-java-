package TabuleiroDoJogo;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1 ) {
			throw new TabuleiroException("Erro criando tabuleiro: tem que ter pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; //sendo instaciada igual a quantidade de linhas e colunas
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new TabuleiroException("Posiçao nao existe");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posiçao nao existe");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if(temPeca(posicao)) {
			throw new TabuleiroException("J� existe uma pe�a nessa posi��o " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca; //estou recebendo a peça 
		peca.posicao = posicao; //estou atribuindo uma posição para ela e tirando ela de null
	}
	
	public Peca removerPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posiçao nao existe");
		}
		if(peca(posicao) == null) {
			return null; 
		}
		Peca aux = peca(posicao);
		aux.posicao = null;
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;
	}
	
	public boolean posicaoExiste(int linha, int coluna) { //metodo auxilias de posicao existe
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExiste(Posicao posicao) { //verifica se posição informada existe
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temPeca(Posicao posicao) {//verifica se tem peça nessa posição 
		if (!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posiçao nao existe");
		}
		return peca(posicao) != null; 
	}
	
}
