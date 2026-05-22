import java.util.HashMap;

public class TreeFactory {
    private static HashMap<String, TreeType> treeFactoryPool = new HashMap<>();

    public TreeFactory() {}

    public TreeType getTreeType(String nome, String textura, String corbase) {
        String id = nome + textura + corbase;

        if (treeFactoryPool.containsKey(id)) {
            return treeFactoryPool.get(id);
        }
        
        TreeType newTreeType = new TreeType(nome, textura, corbase);

        treeFactoryPool.put(id, newTreeType);

        return treeFactoryPool.get(id);
    }
}
