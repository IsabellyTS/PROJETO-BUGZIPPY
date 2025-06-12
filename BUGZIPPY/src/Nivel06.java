
import java.util.Arrays;

public class Nivel06 extends Nivel {

    public Nivel06() {
        super("Nível 06: Arrays", 3,
                "\nUfa! Estou quase lá! Mas o caminho está bagunçado e preciso organizar meus suprimentos para a jornada final. \n" +
                        "Vamos organizar tudo em ARRAYS? \n" +
                        "Acerte 10 perguntas para que eu organize tudo e chegue no formigueiro!");
    }

    @Override
    protected void carregarPerguntas() {
        perguntasDoNivel.clear();

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 194]",
                "Qual opção cria um ônibus com 4 assentos (um array de 4 inteiros)?",
                Arrays.asList(
                        "int idades = new int[4];",
                        "int[4] idades = new int;",
                        "int[] idades = new int[4];",
                        "array int idades = 4;",
                        "new int idades[4];",
                        "int idades(4);"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 193]",
                "Verdadeiro ou Falso: o primeiro assento (índice) de um array em Java é 1.",
                Arrays.asList(
                        "Verdadeiro",
                        "Falso",
                        "Somente em alguns casos"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 195]",
                "Se você tem 'String[] nomes = {\"Ana\", \"Bruno\", \"Carla\"};', qual é o índice de \"Bruno\"?",
                Arrays.asList(
                        "1",
                        "2",
                        "0",
                        "3"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 196]",
                "Como você acessa o primeiro elemento de um array chamado 'numeros'?",
                Arrays.asList(
                        "numeros[1]",
                        "numeros.get(0)",
                        "numeros[0]",
                        "numeros.first()"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 197]",
                "Para saber quantos elementos tem um array 'cores', qual propriedade você usa?",
                Arrays.asList(
                        "cores.size()",
                        "cores.length()",
                        "cores.count",
                        "cores.length"
                ),
                4
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 198]",
                "Se um array tem tamanho 5, quais são os índices válidos para seus elementos?",
                Arrays.asList(
                        "1 a 5",
                        "0 a 4",
                        "0 a 5",
                        "1 a 4"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 199]",
                "Qual o nome do erro que ocorre se você tentar acessar um índice que não existe em um array (ex: array[10] em um array de tamanho 5)?",
                Arrays.asList(
                        "NullPointerException",
                        "ArrayIndexOutOfBoundsException",
                        "InputMismatchException",
                        "StackOverflowError"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 200]",
                "Para mudar o valor do terceiro elemento de um array 'precos' para 99.99, como você faria?",
                Arrays.asList(
                        "precos[3] = 99.99;",
                        "precos.set(2, 99.99);",
                        "precos[2] = 99.99;",
                        "set precos to 99.99;"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 201]",
                "Qual é a melhor maneira de percorrer todos os elementos de um array em Java?",
                Arrays.asList(
                        "Usar um laço while",
                        "Usar um laço for (ou for-each)",
                        "Acessar cada elemento manualmente",
                        "Não é possível percorrer arrays"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 202]",
                "Arrays em Java podem armazenar diferentes tipos de dados ao mesmo tempo?",
                Arrays.asList(
                        "Sim, sempre",
                        "Não, um array só pode armazenar elementos do mesmo tipo",
                        "Apenas se forem números",
                        "Apenas se forem textos"
                ),
                2
        ));
    }
}