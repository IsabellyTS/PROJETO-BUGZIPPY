

import java.util.Arrays;

public class Nivel05 extends Nivel {

    public Nivel05() {
        super("Nível 05: Laços (while/do-while)", 3,
                ">>O que é while e do while?\n[Capítulo 5 – Páginas 171 a 180]\nImagina que você está jogando um jogo onde precisa repetir uma tarefa, como pular corda, até alguém dizer “pare!”.\n" +
                        "Na programação, usamos o while e o do while para fazer coisas se repetirem várias vezes, igual no jogo.\nWhile é assim:\n" +
                        "Primeiro ele pergunta se pode fazer a tarefa.\nSe a resposta for “sim”, ele faz. Aí pergunta de novo.\nMas se a resposta for “não” logo de cara, ele nem começa.\n" +
                        "Exemplo:\nEnquanto estiver sol, vou brincar lá fora.\nSe estiver chovendo, nem saio de casa!\ndo while é diferente:\nEle faz a tarefa uma vez primeiro, e só depois pergunta se pode continuar.\n" +
                        "Mesmo que a resposta seja “não”, ele já fez uma vez.\nExemplo:\nVou experimentar o sorvete e depois decido se quero mais.\nMesmo que eu não goste, eu experimentei uma vez.\n" +
                        "Então:\nwhile pergunta antes de fazer.\ndo while faz uma vez e depois pergunta.");
    }

    @Override
    protected void carregarPerguntas() {
        perguntasDoNivel.clear();

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]", // Não há capítulo/página no original, mantendo vazio
                "Para que serve o laço while em Java?",
                Arrays.asList(
                        "Para repetir algo várias vezes",
                        "Para pintar a tela de azul",
                        "Para guardar números",
                        "Para desligar o computador"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]",
                "O que o while faz primeiro?",
                Arrays.asList(
                        "Mostra uma mensagem",
                        "Verifica se a condição é verdadeira",
                        "Pede um número",
                        "Cria um jogo"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]",
                "Quando o while para de repetir?",
                Arrays.asList(
                        "Quando o computador cansa",
                        "Quando o usuário aperta Enter",
                        "Quando a condição se torna falsa",
                        "Quando a bateria acaba"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]",
                "Qual a principal diferença entre while e do-while?",
                Arrays.asList(
                        "While é mais rápido",
                        "Do-while sempre executa o bloco de código pelo menos uma vez",
                        "While usa parênteses e do-while usa chaves",
                        "Não há diferença"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]",
                "No do-while, onde a condição é verificada?",
                Arrays.asList(
                        "No início do laço",
                        "No meio do laço",
                        "No final do laço",
                        "Nunca é verificada"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]",
                "O que um loop 'while(true)' geralmente causa?",
                Arrays.asList(
                        "Um erro de compilação",
                        "Um loop infinito",
                        "O programa executa apenas uma vez",
                        "O programa se desliga"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]",
                "Qual dessas estruturas de laço é a melhor para repetir algo um número INDEFINIDO de vezes (até uma condição ser falsa)?",
                Arrays.asList(
                        "for",
                        "if-else",
                        "while",
                        "switch"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 150 - 155]",
                "Se você quiser garantir que um bloco de código seja executado pelo menos uma vez, qual laço você usaria?",
                Arrays.asList(
                        "for",
                        "if",
                        "while",
                        "do-while"
                ),
                4
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]",
                "Em 'int contador = 0; while (contador < 3) { contador++; }', qual será o valor final de 'contador'?",
                Arrays.asList(
                        "0",
                        "2",
                        "3",
                        "4"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4, pág. 93 - 96]",
                "O que a instrução 'break;' faz em um laço while?",
                Arrays.asList(
                        "Pula a iteração atual",
                        "Sai do laço completamente",
                        "Reinicia o laço",
                        "Ignora a condição"
                ),
                2
        ));
    }
}
