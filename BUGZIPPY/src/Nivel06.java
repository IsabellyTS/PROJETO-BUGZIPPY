import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel06 {
    public Nivel06() {

    }
    public void ChamaNivel6(String nome) {

        int res = 0, cc = 9;

        ArrayList<String> perguntasN6 = new ArrayList<>();
        String p1 = "\n[Cap. 7, pág. 194]\n" +
                "Qual opção cria um ônibus com 4 assentos (um array de 4 inteiros)?\n" +
                " 1) int idades = new int[4];\n" +
                " 2) int[4] idades = new int;\n" +
                " 3) int[] idades = new int[4];\n" +
                " 4) array int idades = 4;\n" +
                " 5) new int idades[4];\n" +
                " 6) int idades(4);\n";
        
        String p2 = "\n[Cap. 7, pág. 193]\n" +
                "Verdadeiro ou Falso: o primeiro assento (índice) de um array em Java é 1.\n" +
                " 1) Verdadeiro\n" +
                " 2) Falso \n" +
                " 3) Somente em arrays de texto\n" +
                " 4) Somente em arrays de números\n" +
                " 5) Depende do computador\n" +
                " 6) Depende do compilador\n";
        
        String p3 = "\n[Cap. 7, pág. 193]\n" +
                "Complete o código para colocar a idade 30 no segundo assento do array idades.\n" +
                "int[] idades = new int[3];\n" +
                "___________________________\n" +
                "\n" +
                " 1) idades(1) = 30;\n" +
                " 2) idades[2] = 30;\n" +
                " 3) idades[1] = 30;\n" +
                " 4) idades = 30[1];\n" +
                " 5) idades = {30};\n" +
                " 6) idades:1 = 30;\n";
        
        String p4 = "\n[Cap. 7, pág. 195]\n" +
                "O que será exibido?\n" +
                "int[] numeros = { 5, 8, 3 };\n" +
                "System.out.println( numeros[0] );\n" +
                "\n" +
                " 1) 0\n" +
                " 2) 3\n" +
                " 3) 8\n" +
                " 4) 5\n" +
                " 5) Erro de compilação\n" +
                " 6) “numeros[0]”\n";
        
        String p5 = "\n[Cap. 7, pág. 195]\n" +
                "Qual linha imprime quantos assentos existem no array nomes?\n" +
                "String[] nomes = new String[10];\n" +
                "\n" +
                " 1) System.out.println( nomes.size );\n" +
                " 2) System.out.println( nomes.length );\n" +
                " 3) System.out.println( length(nomes) );\n" +
                " 4) System.out.println( nomes.length() );\n" +
                " 5) System.out.println( nomes.count );\n" +
                " 6) System.out.println( nomes.tamanho );\n";
        
        String p6 = "\n[Cap. 7, pág. 196]\n" +
                "Qual alternativa cria e preenche um array com os números 2, 4 e 6?\n" +
                " 1) int[] pares = new int{2,4,6};\n" +
                " 2) int[] pares = (2,4,6);\n" +
                " 3) array pares = {2,4,6};\n" +
                " 4) int pares = {2;4;6};\n" +
                " 5) int pares[] = { 2, 4, 6 };\n" +
                " 6) {2,4,6} -> int[] pares;\n";
        
        String p7 = "\n[Cap. 7, pág. 195]\n" +
                "Verdadeiro ou Falso: em um array de int, se você não preencher um assento, ele vale 0.\n" +
                " 1) Verdadeiro\n" +
                " 2) Falso\n" +
                " 3) Vale -1\n" +
                " 4) Vale null\n" +
                " 5) Vale “vazio”\n" +
                " 6) Depende do sistema operacional\n";
        
        String p8 = "\n[Cap. 7, pág. 195]\n" +
                "Qual das alternativas abaixo representa corretamente um Array que pode guardar 10 nomes de pessoas?\n" +
                " 1) String nomes[10];\n" +
                " 2) String[] nomes = new String[10];\n" +
                " 3) int[] nomes = new String[10];\n" +
                " 4) String nomes = new String[10];\n" +
                " 5) nomes = String[10];\n" +
                " 6) String nomes = 10;";
        
        String p9 = "\n[Cap. 7, pág. 194]\n" +
                "Qual palavra em Java usamos para criar um novo Array?\n" +
                " 1) create\n" +
                " 2) make\n" +
                " 3) new\n" +
                " 4) build\n" +
                " 5) array\n" +
                " 6) start";
        
        String p10 = "\n[Cap. 7, pág. 196]\n" +
                "Complete o código para colocar o número 30 no assento 2 do Array numeros:\n" +
                "int[] numeros = new int[5];\n" +
                "___________ = 30;\n" +
                "\n" +
                " 1) numeros[3]\n" +
                " 2) numeros[2]\n" +
                " 3) numeros(2)\n" +
                " 4) numeros.set(2)\n" +
                " 5) numeros[0]\n" +
                " 6) numeros = 2";

        perguntasN6.add(p1);
        perguntasN6.add(p2);
        perguntasN6.add(p3);
        perguntasN6.add(p4);
        perguntasN6.add(p5);
        perguntasN6.add(p6);
        perguntasN6.add(p7);
        perguntasN6.add(p8);
        perguntasN6.add(p9);
        perguntasN6.add(p10);
        Collections.shuffle(perguntasN6); //embaralha as posições do arraylist

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 06 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");

        try {
            System.out.println("Pense em um ônibus com vários assentos, e cada assento tem um número para você se sentar.");
            System.out.println("Mas aqui tem um segredo: no Java, o primeiro assento do ônibus é sempre o assento zero (0)!");
            System.out.println("Um Array é como esse ônibus: um conjunto de 'lugares' onde você pode guardar várias informações (passageiros) do mesmo tipo.");

            System.out.println("\nCada assento no ônibus é um índice do seu Array.");
            System.out.println("E você pode colocar um 'passageiro' (um valor) em cada assento ou pegá-lo de volta, sabendo o número do assento.");

            System.out.println("\nVeja como podemos usar nosso ônibus:");
            System.out.println("int[] idades = new int[4]; // Criamos um ônibus com 4 assentos para idades");
            System.out.println("idades[0] = 25;           // A idade 25 senta no assento 0");
            System.out.println("idades[1] = 30;           // A idade 30 senta no assento 1");
            System.out.println("idades[2] = 18;           // A idade 18 senta no assento 2");
            System.out.println("idades[3] = 40;           // A idade 40 senta no assento 3");

            System.out.println("\nPara saber a idade de alguém que está no assento, fazemos assim:");
            System.out.println("System.out.println(idades[2]); // Isso vai mostrar a idade 18, do assento 2!");

            System.out.println("\nSuper Dica: Você pode até encher o ônibus com passageiros direto, logo que ele é criado!");
            System.out.println("É como se todos os passageiros já estivessem esperando para entrar em seus lugares certinhos:");
            System.out.println("String[] nomes = {\"Ana\", \"Bruno\", \"Carla\"}; // Um ônibus de nomes já com 3 passageiros!");
            System.out.println("System.out.println(nomes[0]); // Mostra 'Ana', a passageira do assento 0!");

            System.out.println("\nCom os Arrays, você organiza dados de um jeito super prático, como uma lista de números, de palavras ou de qualquer outra coisa!");
            System.out.println("E o legal é que todos os 'passageiros' no mesmo ônibus são do mesmo tipo (são todas idades, ou todos nomes, etc.).");
            System.out.println("Nunca se esqueça: o primeiro assento é sempre o zero (0)!");

            System.out.print("Clique ENTER se voce entendeu");
            sc.nextLine();

           System.out.println("");
        System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");

        System.out.println("\n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao meu destino: " + cc-- +
                "\n");

            for (int i = 0; i < perguntasN6.size(); i++) {
                if (i < 3) {
                    if (perguntasN6.get(i).equals(p1)) {
                        System.out.print(p1);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p2)) {
                        System.out.print(p2);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p3)) {
                        System.out.print(p3);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p4)) {
                        System.out.print(p4);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p5)) {
                        System.out.print(p5);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p6)) {
                        System.out.print(p6);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 5) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p7)) {
                        System.out.print(p7);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p8)) {
                        System.out.print(p8);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p9)) {
                        System.out.print(p9);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN6.get(i).equals(p10)) {
                        System.out.print(p10);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n"); 
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    }
                }
            }
            System.out.print("\n\n");
            Nivel07 nvl07 = new Nivel07();
            nvl07.ChamaNivel7(nome);
        } catch (Exception e) {
            System.out.println("❌ Ocorreu um erro. Por favor, digite apenas números válidos.");
        }
    }
}
