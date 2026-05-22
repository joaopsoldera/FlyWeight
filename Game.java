import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Tree> trees = new ArrayList<>();

    public void plantarTree(int x, int y, int altura, String nome, String textura, String corbase) {
        TreeType treetype = TreeFactory.getTreeType(nome, textura, corbase);
        Tree tree = new Tree(x, y, altura, treetype);

        trees.add(tree);
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}