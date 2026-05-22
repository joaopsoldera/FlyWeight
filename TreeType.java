public class TreeType {
	private string nome;
	private string textura;
	private string corbase;

	public TreeType(string nome, string textura, string corbase) {
		this.nome = nome;
		this.textura = textura;
		this.corbase = corbase;
	}

	public void draw(int x, int y, int altura) {
		System.out.println("Desenhando a árvore " + nome + 
			"na posição (" + x +", " + y, ")."
		)
	}
}