public class Tree {
	private int x;
	private int y;
	private int altura;

	private TreeType tree;

	public Tree(int x, int y, int altura, TreeType tree) {
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.tree = tree;
	}

	public void draw() {
		tree.draw(x, y, altura);
	}
}