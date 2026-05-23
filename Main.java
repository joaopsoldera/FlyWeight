public class Main {

    public static void main(String[] args) {
        final int QUANTIDADE = 1000000;

        // Sem o flywight

        Runtime runtime = Runtime.getRuntime();

        runtime.gc();

        long memoriaAntesSem = runtime.totalMemory() - runtime.freeMemory();
        TreeSemFlyweight[] florestaSem = new TreeSemFlyweight[QUANTIDADE];

        for (int i = 0; i < QUANTIDADE; i++) {
            florestaSem[i] = new TreeSemFlyweight(i, i, 10, "Carvalho", "textura.png", "Verde");
        }

        long memoriaDepoisSem = runtime.totalMemory() - runtime.freeMemory();

        long usoSemFlyweight = memoriaDepoisSem - memoriaAntesSem;

        System.out.println("Sem Flyweight");
        System.out.println("Memória usada: " + usoSemFlyweight / 1024 + " KB");


        // Com o Flyweight

        runtime.gc();
        long memoriaAntesCom = runtime.totalMemory() - runtime.freeMemory();

        Game game = new Game();

        for (int i = 0; i < QUANTIDADE; i++) {
            game.plantarTree(i, i, 10, "Carvalho", "textura.png", "Verde");
        }

        long memoriaDepoisCom = runtime.totalMemory() - runtime.freeMemory();

        long usoComFlyweight = memoriaDepoisCom - memoriaAntesCom;

        System.out.println("Com Flyweight");
        System.out.println("Memória usada: " + usoComFlyweight / 1024 + " KB");

        System.out.println("TreeTypes criados: " + TreeFactory.getPoolSize());
    }
}
