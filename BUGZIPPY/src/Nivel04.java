
import java.util.Arrays;

public class Nivel04 extends Nivel {

    public Nivel04() {
        super("Nível 04: Laços (for)", 3,
                "\nEstou vendo o formigueiro, mas tem uma barreira! Preciso fazer uma série de ações repetidas para derrubá-la. \n" +
                        "É hora de usar o laço FOR! \n" +
                        "Acerte 10 perguntas e me ajude a quebrar essa barreira!"
        );
    }

    @Override
    protected void carregarPerguntas() {
        perguntasDoNivel.clear();

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 172]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "Para que serve o laço for em Java?",
                Arrays.asList(
                        "Criar uma nova janela",
                        "Repetir um bloco de código um número definido de vezes",
                        "Fazer cálculos com variáveis",
                        "Ler dados do usuário",
                        "Mostrar mensagens de erro",
                        "Organizar as pastas do projeto"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 173]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "Qual é a estrutura básica de um laço for em Java?",
                Arrays.asList(
                        "for (início; condição; atualização)",
                        "for {início, condição, atualização}",
                        "loop (início:condição:atualização)",
                        "for-in (variável)"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 174]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "No laço for, o que a 'condição' (segunda parte) faz?",
                Arrays.asList(
                        "Define o valor inicial do contador",
                        "Verifica se o laço deve continuar executando",
                        "Atualiza o valor do contador a cada repetição",
                        "Executa o código dentro do laço"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 175]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "O que o 'contador' (variável de controle) de um laço for normalmente faz?",
                Arrays.asList(
                        "Guarda um texto",
                        "Controla quantas vezes o laço irá repetir",
                        "Faz somas",
                        "Imprime mensagens"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 176]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "for (int i = 0; i < 5; i++) { ... } - Quantas vezes esse laço irá repetir?",
                Arrays.asList(
                        "4 vezes",
                        "5 vezes",
                        "6 vezes",
                        "Infinitamente"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 177]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "O que 'i++' significa em um laço for?",
                Arrays.asList(
                        "Diminuir i em 1",
                        "Multiplicar i por 2",
                        "Adicionar 1 a i",
                        "Subtrair 1 de i"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 178]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "Qual é a diferença principal entre for e while?",
                Arrays.asList(
                        "For é para números, while é para textos",
                        "For é para repetir um número definido de vezes, while é para repetir enquanto uma condição for verdadeira",
                        "For é mais rápido que while",
                        "Não há diferença"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 179]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "Quando você usaria um laço for-each (for aprimorado) em Java?",
                Arrays.asList(
                        "Para criar uma nova lista",
                        "Para iterar sobre coleções (Arrays, ArrayLists, etc.) de forma simples",
                        "Para fazer cálculos complexos",
                        "Para desenhar gráficos"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 180]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "Qual dessas opções representa um loop infinito usando 'for'?",
                Arrays.asList(
                        "for (int i = 0; i < 10; i--)",
                        "for (;;)",
                        "for (int i = 0; i > 0; i++)",
                        "for (int i = 1; i == 1; i = i)"
                ),
                2 // 'for (;;)' ou 'for (int i=0; true; i++)'
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 181]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "O que a instrução 'continue;' faz em um laço for?",
                Arrays.asList(
                        "Para o laço completamente",
                        "Pula a iteração atual e vai para a próxima",
                        "Reinicia o laço do começo",
                        "Gera um erro"
                ),
                2
        ));
    }
}