
import java.util.Arrays;

public class Nivel03 extends Nivel {

    public Nivel03() {
        super("Nível 03: Switch", 3,
                "\nQuase lá! Agora preciso de uma ajuda para escolher entre várias opções de caminho. \n" +
                        "No mundo da programação, usamos o SWITCH para isso. \n" +
                        "Me ajude a acertar 10 questões para eu me aproximar ainda mais do formigueiro!"
        );
    }

    @Override
    protected void carregarPerguntas() {
        perguntasDoNivel.clear();

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 172]",
                "O que o comando switch faz no Java? Escolha a melhor explicação:",
                Arrays.asList(
                        "Repete um bloco de código várias vezes",
                        "Compara uma variável com vários valores possíveis",
                        "Cria um novo método no programa",
                        "Serve para fazer contas de matemática"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 173]",
                "Para que serve o comando break dentro de um switch?",
                Arrays.asList(
                        "Para fazer uma pausa no teclado",
                        "Para sair do switch depois que uma opção é escolhida",
                        "Para pular para a próxima opção",
                        "Para recomeçar o switch"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 173]",
                "O que acontece se você esquecer o break em um case do switch?",
                Arrays.asList(
                        "O programa trava",
                        "O código continua executando os próximos cases (fall-through)",
                        "Acontece um erro de sintaxe",
                        "O switch é ignorado"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 174]",
                "Qual é a palavra-chave usada para o valor padrão (se nenhuma opção for correspondida) em um switch?",
                Arrays.asList(
                        "else",
                        "default",
                        "otherwise",
                        "fallback"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 174]",
                "Em um switch, você pode comparar strings (textos)?",
                Arrays.asList(
                        "Não, apenas números inteiros",
                        "Sim, desde o Java 7",
                        "Sim, mas apenas com o operador ==",
                        "Apenas em versões antigas do Java"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 175]",
                "Qual desses não é um tipo de dado que pode ser usado diretamente em um switch?",
                Arrays.asList(
                        "int",
                        "char",
                        "String",
                        "double"
                ),
                4
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 175]",
                "Qual é a sintaxe correta para um 'case' em um switch?",
                Arrays.asList(
                        "case valor;",
                        "case valor:",
                        "case = valor;",
                        "case (valor);"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 176]",
                "Se você tiver um switch sem um bloco 'default', e nenhuma das opções 'case' for correspondida, o que acontece?",
                Arrays.asList(
                        "O programa mostra um erro",
                        "O programa continua executando o código depois do switch",
                        "O programa trava",
                        "A última opção 'case' é executada"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 176]",
                "O comando 'switch' é uma alternativa a qual outra estrutura condicional?",
                Arrays.asList(
                        "Laço for",
                        "if-else if-else",
                        "Laço while",
                        "Métodos"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 5, pág. 172]",
                "Em um switch, cada 'case' deve ter um valor _________ para ser comparado.",
                Arrays.asList(
                        "variável",
                        "texto",
                        "constante",
                        "aleatório"
                ),
                3
        ));
    }
}