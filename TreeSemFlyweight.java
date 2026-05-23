public class TreeSemFlyweight {

    private int x;
    private int y;
    private int altura;

    private String nome;
    private String textura;
    private String corbase;

    public TreeSemFlyweight(int x, int y, int altura,
                            String nome, String textura, String corbase) {

        this.x = x;
        this.y = y;
        this.altura = altura;

        this.nome = nome;
        this.textura = textura;
        this.corbase = corbase;
    }
}
