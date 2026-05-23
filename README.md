João Pedro Navarro Okita RA: 176.530

João Pedro Soldera Snabaitis Markues RA: 176.531

# Padrão Flyweight - Plantando Árvores

IMplementação padrão de projeto **Flyweight** no contexto da geração de objetos do tipo árvore em um game 2D, além de parâmetros de comparação para visualizar a economia de memória na prática do computador.

A gente fez uma simulação plantando 1 milhão de árvores no código. Primeiro, a gente cria as árvores do jeito normal, onde cada árvore guarda todas as suas próprias informações (nome, textura, cor, posição, etc). Depois, a gente faz a mesma coisa usando o Flyweight, que basicamente separa o que é repetido (tipo o nome, textura e a cor da árvore) em um objeto só e compartilha com todo mundo, guardando apenas a posição e a altura de cada uma separadamente.

Rodando o `Main.java`, o código imprime a diferença de memória gasta entre os dois jeitos. Dá pra ver direitinho como o Flyweight faz uma diferença gigante na hora de otimizar as coisas!
