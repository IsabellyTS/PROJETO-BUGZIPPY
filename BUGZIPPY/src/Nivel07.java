import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel07 {
    private String p1 = "\n[Cap. 7, pág. 214]\n" +
            "Qual dessas opções cria um ônibus com 3 fileiras e 2 assentos por fileira?\n" +
            " 1) int[][] lugares = new int[3][2];\n" +
            " 2) int lugares[3][2];\n" +
            " 3) int lugares = new int(3,2);\n" +
            " 4) int lugares[] = new int[3][2];\n" +
            " 5) int lugares[2][3];\n" +
            " 6) int lugares = new int[2][3];\n";
    private String p2 = "\n[Cap. 7, pág. 214]\n" +
            "Em lugares[1][0], o que significa o número 1?\n" +
            " 1) Número do assento\n" +
            " 2) Número da janela\n" +
            " 3) Número da fileira\n" +
            " 4) Número do passageiro\n" +
            " 5) Número do ônibus\n" +
            " 6) Número de assentos\n";
    private String p3 = "\n[Cap. 7, pág. 214]\n" +
            "Qual linha coloca o número 5 na segunda fileira, terceiro assento de uma matriz numeros?\n" +
            " 1) numeros[1][2] = 5;\n" +
            " 2) numeros[2][3] = 5;\n" +
            " 3) numeros[2][1] = 5;\n" +
            " 4) numeros[3][2] = 5;\n" +
            " 5) numeros[2,3] = 5;\n" +
            " 6) numeros[1:2] = 5;\n";
    private String p4 = "\n[Cap. 7, pág. 214]\n" +
            "O que essa linha imprime?\n" +
            "int[][] tabela = {\n" +
            "  {1, 2},\n" +
            "  {3, 4}\n" +
            "};\n" +
            "System.out.println(tabela[0][1]);\n" +
            "\n" +
            " 1) 0\n" +
            " 2) 1\n" +
            " 3) 2\n" +
            " 4) 3\n" +
            " 5) 4\n" +
            " 6) Erro de compilação\n";
    private String p5 = "\n[Cap. 7, pág. 214]\n" +
            "O que for (int i = 0; i < matriz.length; i++) percorre?\n" +
            " 1) Os assentos de cada fileira\n" +
            " 2) Todas as colunas\n" +
            " 3) As fileiras da matriz\n" +
            " 4) Os valores da matriz\n" +
            " 5) As linhas e colunas ao mesmo tempo\n" +
            " 6) Os nomes dos assentos\n";
    private String p6 = "\n[Cap. 7, pág. 213]\n" +
            "Qual opção cria e preenche uma matriz com os valores abaixo?\n" +
            "1 2  \n" +
            "3 4  \n" +
            "\n" +
            " 1) int[][] m = { 1, 2, 3, 4 };\n" +
            " 2) int[][] m = new int[2][2]{1,2,3,4};\n" +
            " 3) int[][] m = {{1, 2}, {3, 4}};\n" +
            " 4) int[][] m = { {1 2}, {3 4} };\n" +
            " 5) int[2][2] m = {{1,2},{3,4}};\n" +
            " 6) int m[][] = new int[2][2]{1,2,3,4};\n";

    private String p7 = "\n[Cap. 7, pág. 214]\n" +
            "Em lugares[0][1], o que o número 0 representa?\n" +
            " 1) A coluna\n" +
            " 2) A letra do alfabeto\n" +
            " 3) A quantidade total de assentos\n" +
            " 4) O número do ônibus\n" +
            " 5) Um número aleatório\n" +
            " 6) A fileira";
    private String p8 = "\n[Cap. 7, pág. 214]\n" +
            "Qual dessas opções guarda o número 7 na primeira fileira e segundo assento?\n" +
            " 1) matriz[0][1] = 7;\n" +
            " 2) matriz[1][0] = 7;\n" +
            " 3) matriz[7] = 0.1;\n" +
            " 4) matriz[1][7] = 0;\n" +
            " 5) matriz[0][0] = 7;\n" +
            " 6) matriz[2] = 7;";

    private String p9 = "\n[Cap. 7, pág. 214]\n" +
            "Quantos elementos cabem em uma matriz int[][] m = new int[2][2];?\n" +
            " 1) 2\n" +
            " 2) 4\n" +
            " 3) 6\n" +
            " 4) 8\n" +
            " 5) 1\n" +
            " 6) 3";
    private String p10 = "\n[Cap. 7, pág. 214]\n" +
            "O que essa linha faz?\n" +
            "System.out.println(matriz[1][0]);\n" +
            " 1) Coloca um valor na matriz\n" +
            " 2) Soma os valores da matriz\n" +
            " 3) Cria uma nova matriz\n" +
            " 4) Imprime o valor da segunda fileira, primeiro assento\n" +
            " 5) Apaga um valor da matriz\n" +
            " 6) Mostra o tamanho da matriz";

    public Nivel07() {
    }

    public void ChamaNivel7(String nome) {

        int res = 0, cc = 6;

        ArrayList<String> perguntasN7 = new ArrayList<>();

        perguntasN7.add(this.p1);
        perguntasN7.add(this.p2);
        perguntasN7.add(this.p3);
        perguntasN7.add(this.p4);
        perguntasN7.add(this.p5);
        perguntasN7.add(this.p6);
        perguntasN7.add(this.p7);
        perguntasN7.add(this.p8);
        perguntasN7.add(this.p9);
        perguntasN7.add(this.p10);
        Collections.shuffle(perguntasN7); //embaralha as posições do arraylist

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 07 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");

        try {
            System.out.println("Lembre-se do nosso ônibus de Arrays, com assentos numerados de 0 em diante?");
            System.out.println("Agora, imagine que nosso ônibus cresceu e virou um **ônibus de dois andares**!");
            System.out.println("Ou, melhor ainda, imagine que ele tem **várias filas de assentos**, como em um cinema ou em um teatro.");
            System.out.println("Uma **Matriz** no Java é como essa organização de assentos: você tem **linhas** e **colunas**!");

            System.out.println("\nPara encontrar um passageiro, você precisa dizer duas coisas: **em qual fila** ele está e **em qual assento (coluna)** daquela fila.");
            System.out.println("No Java, a fila e o assento (coluna) também começam do **zero (0)**!");

            System.out.println("\nVamos ver como funciona nossa 'tabela de passageiros':");
            System.out.println("String[][] nomes = new String[2][3]; // Criamos uma tabela com 2 filas e 3 assentos por fila");
            System.out.println("// As filas são: Fila 0 e Fila 1");
            System.out.println("// Os assentos em cada fila são: Assento 0, Assento 1, Assento 2");

            System.out.println("\nPara colocar passageiros, dizemos a fila e o assento:");
            System.out.println("nomes[0][0] = \"João\";   // João está na Fila 0, Assento 0");
            System.out.println("nomes[0][1] = \"Maria\";  // Maria está na Fila 0, Assento 1");
            System.out.println("nomes[0][2] = \"Pedro\";  // Pedro está na Fila 0, Assento 2");
            System.out.println("nomes[1][0] = \"Ana\";    // Ana está na Fila 1, Assento 0");
            System.out.println("nomes[1][1] = \"Lucas\";  // Lucas está na Fila 1, Assento 1");
            System.out.println("nomes[1][2] = \"Sofia\";  // Sofia está na Fila 1, Assento 2");

            System.out.println("\nPara saber quem está em um lugar específico, usamos os dois números:");
            System.out.println("System.out.println(nomes[1][0]); // Isso vai mostrar 'Ana', que está na Fila 1, Assento 0!");

            System.out.println("\n**Super Dica para Matrizes**: Assim como no ônibus simples, você pode preencher a tabela de uma vez só, como se ela já viesse organizada:");
            System.out.println("int[][] notas = {{80, 75, 90}, {60, 85, 70}}; // Duas filas de notas!");
            System.out.println("System.out.println(notas[0][2]); // Mostra 90, que é a terceira nota da primeira fila!");

            System.out.println("\nAs **Matrizes** são super úteis para organizar informações que precisam de mais de um 'endereço' para serem encontradas, como um placar de jogo, um mapa de tesouro ou notas de alunos organizadas por turma e prova!");
            System.out.println("Lembre-se sempre: comece a contar as filas e os assentos (colunas) do **zero (0)**!");

            System.out.print("clique ENTER se voce entendeu");
            sc.nextLine();

            System.out.println("");
            System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                    "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");

            System.out.println("\n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao meu destino: " + cc-- +
                    "\n");

            for (int i = 0; i < perguntasN7.size(); i++) {
                if (i < 3) {
                    if (perguntasN7.get(i).equals(this.p1)) {
                        System.out.print(this.p1);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 1)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p2)) {
                        System.out.print(this.p2);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 3)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p3)) {
                        System.out.print(this.p3);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 1)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p4)) {
                        System.out.print(this.p4);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 3)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p5)) {
                        System.out.print(this.p5);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 3)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p6)) {
                        System.out.print(this.p6);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 3)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p7)) {
                        System.out.print(this.p7);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 6) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 6)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p8)) {
                        System.out.print(this.p8);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 1)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p9)) {
                        System.out.print(this.p9);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 2)");
                        }
                    } else if (perguntasN7.get(i).equals(this.p10)) {
                        System.out.print(this.p10);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 4)");
                        }
                    }
                }
            }
            System.out.print("\n\n");
            Nivel08 nvl08 = new Nivel08();
            nvl08.ChamaNivel8(nome);
        } catch (Exception e) {
            System.out.println("❌ Ocorreu um erro. Por favor, digite apenas números válidos.");
        }
    }
}
