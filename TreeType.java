public class TreeType {
	private String nome;
	private String textura;
	private String corbase;

	public TreeType(String nome, String textura, String corbase) {
		this.nome = nome;
		this.textura = textura;
		this.corbase = corbase;
	}

	public void draw(int x, int y, int altura) {
		System.out.printf("Desenhando a árvore %s na posição (%d, %d)", nome, x, y);
	}
}