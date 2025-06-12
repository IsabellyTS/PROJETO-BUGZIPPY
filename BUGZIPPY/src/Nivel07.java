
import java.util.Arrays;

public class Nivel07 extends Nivel {

    public Nivel07() {
        super("Nível 07: Arrays Multidimensionais", 3,
                "\nQuase consegui! Mas me deparei com um labirinto cheio de portas em fileiras e colunas. \n" +
                        "Preciso usar ARRAYS MULTIDIMENSIONAIS para navegar. \n" +
                        "Se você acertar 10 perguntas, estarei em casa!");
    }

    @Override
    protected void carregarPerguntas() {
        perguntasDoNivel.clear();

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 214]",
                "Qual dessas opções cria um ônibus com 3 fileiras e 2 assentos por fileira?",
                Arrays.asList(
                        "int[][] lugares = new int[3][2];",
                        "int lugares[3][2];",
                        "int lugares = new int(3,2);",
                        "int lugares[] = new int[3][2];",
                        "int lugares[2][3];",
                        "int lugares = new int[2][3];"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 214]",
                "Em lugares[1][0], o que significa o número 1?",
                Arrays.asList(
                        "Número do assento",
                        "Número da janela",
                        "Número da fileira (índice da primeira dimensão)",
                        "Número da porta"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 215]",
                "Se você tem 'int[][] matriz = new int[2][3];', quantos elementos (números) essa matriz pode guardar no total?",
                Arrays.asList(
                        "2",
                        "3",
                        "5",
                        "6"
                ),
                4
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 215]",
                "Para acessar o elemento na segunda fileira e terceiro assento (índices 1 e 2) de 'int[][] assentos', como você faria?",
                Arrays.asList(
                        "assentos[2][3]",
                        "assentos[1][2]",
                        "assentos[0][1]",
                        "assentos[1][1]"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 216]",
                "Qual é o tipo de dado que um array bidimensional guarda?",
                Arrays.asList(
                        "Apenas Strings",
                        "Apenas números inteiros",
                        "Arrays de outros tipos (Arrays de Arrays)",
                        "Objetos gráficos"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 217]",
                "Como você pode obter o número de fileiras de uma matriz chamada 'tabela'?",
                Arrays.asList(
                        "tabela.columns",
                        "tabela.length",
                        "tabela.rows",
                        "tabela[0].length"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 217]",
                "Como você pode obter o número de colunas (assentos em uma fileira) da primeira fileira de uma matriz 'tabela'?",
                Arrays.asList(
                        "tabela[0].length",
                        "tabela.length",
                        "tabela.columns",
                        "tabela[0].size()"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 218]",
                "O que o laço aninhado (um for dentro do outro) é frequentemente usado para fazer com arrays multidimensionais?",
                Arrays.asList(
                        "Criar um novo array",
                        "Ordenar os elementos",
                        "Percorrer todos os elementos da matriz",
                        "Remover elementos"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 219]",
                "Qual das seguintes declarações é um array multidimensional válido?",
                Arrays.asList(
                        "int numeros[3];",
                        "String[][] palavras;",
                        "double[][] dados = new double[][];",
                        "boolean[] flags = new boolean[2][2];"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Cap. 7, pág. 220]",
                "Você pode ter arrays com mais de duas dimensões em Java (ex: um cubo de dados)?",
                Arrays.asList(
                        "Não, Java suporta apenas arrays unidimensionais",
                        "Não, Java suporta apenas arrays bidimensionais",
                        "Sim, pode ter quantas dimensões precisar",
                        "Apenas em versões antigas do Java"
                ),
                3
        ));
    }
}