
import java.util.Arrays;

public class Nivel07 extends Nivel {

    public Nivel07() {
        super("Nível 07: Arrays Multidimensionais", 3,
                "Lembre-se do nosso ônibus de Arrays, com assentos numerados de 0 em diante?\nAgora, imagine que nosso ônibus cresceu e virou um *ônibus de dois andares*!\n" +
                        "Ou, melhor ainda, imagine que ele tem *várias filas de assentos*, como em um cinema ou em um teatro.\nUma *Matriz* no Java é como essa organização de assentos: você tem *linhas* e *colunas*!\n" +
                        "Para encontrar um passageiro, você precisa dizer duas coisas: *em qual fil** ele está e *em qual assento (coluna)* daquela fila.\nNo Java, a fila e o assento (coluna) também começam do *zero (0)*!\n" +
                        "Vamos ver como funciona nossa \"tabela de passageiros\":\nString[][] nomes = new String[2][3]; // Criamos uma tabela com 2 filas e 3 assentos por fila\n// As filas são: Fila 0 e Fila 1\n" +
                        "// Os assentos em cada fila são: Assento 0, Assento 1, Assento 2\nPara colocar passageiros, dizemos a fila e o assento:\nnomes[0][0] = \"João\";   // João está na Fila 0, Assento 0\n" +
                        "nomes[0][1] = \"Maria\";  // Maria está na Fila 0, Assento 1\nnomes[0][2] = \"Pedro\";  // Pedro está na Fila 0, Assento 2\nnomes[1][0] = \"Ana\";    // Ana está na Fila 1, Assento 0\n" +
                        "nomes[1][1] = \"Lucas\";  // Lucas está na Fila 1, Assento 1\nnomes[1][2] = \"Sofia\";  // Sofia está na Fila 1, Assento 2\nPara saber quem está em um lugar específico, usamos os dois números:\n" +
                        "System.out.println(nomes[1][0]); // Isso vai mostrar 'Ana', que está na Fila 1, Assento 0!\n\n*Super Dica para Matrizes*: Assim como no ônibus simples, você pode preencher a tabela de uma vez só, como se ela já viesse organizada:\n" +
                        "int[][] notas = {{80, 75, 90}, {60, 85, 70}}; // Duas filas de notas!\nSystem.out.println(notas[0][2]); // Mostra 90, que é a terceira nota da primeira fila!\n" +
                        "As *Matrizes* são super úteis para organizar informações que precisam de mais de um 'endereço' para serem encontradas, como um placar de jogo, um mapa de tesouro ou notas de alunos organizadas por turma e prova!\n" +
                        "Lembre-se sempre: comece a contar as filas e os assentos (colunas) do *zero (0)*!");
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
                        "int lugares[] = new int[3][2];"
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