
import java.util.Arrays;

public class Nivel06 extends Nivel {

    public Nivel06() {
        super("Nível 06: Arrays", 3,
                "Pense em um ônibus com vários assentos, e cada assento tem um número para você se sentar.\nMas aqui tem um segredo: no Java, o primeiro assento do ônibus é sempre o assento zero (0)!\n" +
                        "Um Array é como esse ônibus: um conjunto de \"lugares\" onde você pode guardar várias informações (passageiros) do mesmo tipo.\nCada assento no ônibus é um índice do seu Array.\n" +
                        "E você pode colocar um \"passageiro\" (um valor) em cada assento ou pegá-lo de volta, sabendo o número do assento.\nVeja como podemos usar nosso ônibus:\n" +
                        "int[] idades = new int[4]; // Criamos um ônibus com 4 assentos para idades\"\nidades[0] = 25;           // A idade 25 senta no assento 0\n" +
                        "idades[1] = 30;           // A idade 30 senta no assento 1\nidades[2] = 18;           // A idade 18 senta no assento 2\nidades[3] = 40;           // A idade 40 senta no assento 3\n" +
                        "Para saber a idade de alguém que está no assento, fazemos assim:\nSystem.out.println(idades[2]); // Isso vai mostrar a idade 18, do assento 2!\n" +
                        "\nSuper Dica: Você pode até encher o ônibus com passageiros direto, logo que ele é criado!\n" +
                        "É como se todos os passageiros já estivessem esperando para entrar em seus lugares certinhos:\n\nString[] nomes = {\"Ana\", \"Bruno\", \"Carla\"}; // Um ônibus de nomes já com 3 passageiros!\n" +
                        "System.out.println(nomes[0]); // Mostra \"Ana\", a passageira do assento 0!\"\nCom os Arrays, você organiza dados de um jeito super prático, como uma lista de números, de palavras ou de qualquer outra coisa!\n" +
                        "E o legal é que todos os \"passageiros\" no mesmo ônibus são do mesmo tipo (são todas idades, ou todos nomes, etc.).\nNunca se esqueça: o primeiro assento é sempre o zero (0)!");
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
                        "array int idades = 4;"
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