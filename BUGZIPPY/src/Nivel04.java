
import java.util.Arrays;

public class Nivel04 extends Nivel {

    public Nivel04() {
        super("Nível 04: Laços (for)", 3,
                "Imagina que você vai contar de 1 até 5.\nEm vez de dizer 1, 2, 3, 4, 5 sozinho, você pode mandar o computador fazer isso com o comando \"for\".\n" +
                        "Veja como é:\nfor (int i = 1; i <= 5; i++) {\n    System.out.println(i);\n}\n\n" +
                        "=Vamos entender cada parte:=\nint i = 1;     -> Comece no número 1\ni <= 5;        -> Continue enquanto o número for até 5\n" +
                        "i++            -> Aumente de 1 em 1\n{ ... }        -> Aqui dentro você coloca o que quer fazer\n" +
                        "Então, é como brincar com 5 brinquedos:\nBrinque com o número 1, depois o 2, até chegar no 5.\n" +
                        "E a cada vez, o computador faz o que você mandar.\nO \"for\" é uma forma do computador repetir alguma coisa várias vezes!\n"
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
                        "Fazer cálculos com variáveis",
                        "Repetir um bloco de código um número definido de vezes",
                        "Ler dados do usuário"
                ),
                3
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
                        "Atualiza o valor do contador a cada repetição",
                        "Executa o código dentro do laço",
                        "Verifica se o laço deve continuar executando"
                ),
                4
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 175]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "O que o 'contador' (variável de controle) de um laço for normalmente faz?",
                Arrays.asList(
                        "Controla quantas vezes o laço irá repetir",
                        "Guarda um texto",
                        "Faz somas",
                        "Imprime mensagens"
                ),
                1
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
                        "For é mais rápido que while",
                        "For é para repetir um número definido de vezes, while é para repetir enquanto uma condição for verdadeira",
                        "Não há diferença"
                ),
                3
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
                2
                // 'for (;;)' ou 'for (int i=0; true; i++)'
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 181]", // Provavelmente erro no Cap/Pág aqui, deve ser sobre for
                "O que a instrução 'continue;' faz em um laço for?",
                Arrays.asList(
                        "Para o laço completamente",
                        "Reinicia o laço do começo",
                        "Pula a iteração atual e vai para a próxima",
                        "Gera um erro"
                ),
                3
        ));
    }
}