import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel04 {
    private String p1 = "\n[Capítulo 5, pág. 172]\n" +
            " Para que serve o laço for em Java?\n" +
            " 1) Criar uma nova janela\n" +
            " 2) Repetir um bloco de código um número definido de vezes\n" +
            " 3) Fazer cálculos com variáveis\n" +
            " 4) Ler dados do usuário\n" +
            " 5) Mostrar mensagens de erro\n" +
            " 6) Organizar as pastas do projeto\n";
    private String p2 = "\n[Capítulo 5, pág. 173]\n" +
            "Qual é a estrutura básica de um laço for em Java?\n" +
            " 1) for (início; condição; atualização)\n" +
            " 2) for {início, condição, atualização}\n" +
            " 3) loop (início:condição:atualização)\n" +
            " 4) for-in (variável)\n" +
            " 5) enquanto (condição)\n" +
            " 6) se (condição) então faça\n";
    private String p3 = "\n[Capítulo 5, pág. 175]\n" +
            "O que será impresso por: for (int i = 1; i <= 3; i++) { System.out.print(i + \" \"); }\n" +
            " 1) 0 1 2\n" +
            " 2) 1 2 3\n" +
            " 3) 1 2 3 4\n" +
            " 4) 0 1 2 3\n" +
            " 5) 2 3 4\n" +
            " 6) Nada, dá erro\n";
    private String p4 = "\n[Capítulo 5, pág. 174]\n" +
            "Em um for, qual parte verifica se o laço continua?\n" +
            " 1) A parte do início\n" +
            " 2) A parte da atualização\n" +
            " 3) A parte da condição\n" +
            " 4) O nome do laço\n" +
            " 5) A variável i\n" +
            " 6) A palavra for\n";
    private String p5 = "\n[Capítulo 5, pág. 176]\n" +
            "Qual alternativa cria um laço que conta de 10 até 1?\n" +
            " 1) for (int i = 1; i <= 10; i++)\n" +
            " 2) for (int i = 10; i >= 1; i--)\n" +
            " 3) for (int i = 0; i < 10; i++)\n" +
            " 4) for (int i = 10; i == 1; i--)\n" +
            " 5) for (int i = 1; i >= 10; i++)\n" +
            " 6) for (int i = 10; i >= 1; i++)\n";
    private String p6 = "\n[Capítulo 5, pág. 177]\n" +
            "O que esse código faz? for (int i = 0; i < 5; i++) { System.out.println(\"Olá\"); }\n" +
            " 1) Mostra “Olá” uma vez\n" +
            " 2) Mostra “Olá” cinco vezes\n" +
            " 3) Não mostra nada\n" +
            " 4) Dá erro porque falta i++\n" +
            " 5) Mostra “Olá” infinitamente\n" +
            " 6) Mostra “Olá” 4 vezes\n";
    private String p7 = "\n[Capítulo 5, pág. 177]\n" +
            "O que acontece com for (int i = 1; i > 5; i++)?\n" +
            " 1) Mostra os números de 1 a 5\n" +
            " 2) Imprime só 1\n" +
            " 3) Dá erro de compilação\n" +
            " 4) Não imprime nada\n" +
            " 5) Mostra infinitamente\n" +
            " 6) Mostra apenas 5\n";
    private String p8 = "\n[Capítulo 5, pág. 179]\n" +
            "Qual laço soma os números de 1 a 5?\n" +
            " 1) for (int i = 5; i >= 1; i++)\n" +
            " 2) for (int i = 1; i <= 5; i++) soma += i;\n" +
            " 3) for (i = 1; i < 5; i--) soma += i;\n" +
            " 4) while (i < 5) soma += i;\n" +
            " 5) for (int i = 1; i <= 5; i--) soma -= i;\n" +
            " 6) for (int i = 0; i <= 5; i++) print soma;\n";
    private String p9 = "\n[Capítulo 5, pág. 174]\n" +
            "Para que serve o i++ no for?\n" +
            " 1) Iniciar a variável i\n" +
            " 2) Verificar a condição do laço\n" +
            " 3) Incrementar a variável a cada repetição\n" +
            " 4) Encerrar o laço\n" +
            " 5) Deixar o código mais bonito\n" +
            " 6) Declarar uma nova função\n";
    private String p10 = "\n[Capítulo 5, pág. 172]\n" +
            "Qual situação é ideal para usar o laço for?\n" +
            " 1) Quando não sabemos quantas vezes vamos repetir\n" +
            " 2) Quando temos que repetir algo para sempre\n" +
            " 3) Quando queremos repetir algo um número exato de vezes\n" +
            " 4) Quando queremos testar uma condição lógica\n" +
            " 5) Quando queremos repetir só se o usuário quiser\n" +
            " 6) Quando usamos apenas switch\n";

    public Nivel04() {}
    public void ChamaNivel4(String nome) {

        int res, cc = 15;

        Scanner sc = new Scanner(System.in);

        ArrayList<String> perguntasN4 = new ArrayList<>();

        perguntasN4.add(this.p1);
        perguntasN4.add(this.p2);
        perguntasN4.add(this.p3);
        perguntasN4.add(this.p4);
        perguntasN4.add(this.p5);
        perguntasN4.add(this.p6);
        perguntasN4.add(this.p7);
        perguntasN4.add(this.p8);
        perguntasN4.add(this.p9);
        perguntasN4.add(this.p10);

        Collections.shuffle(perguntasN4);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 04 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        try {
            System.out.print("Imagina que você vai contar de 1 até 5.\n"
                    + "Em vez de dizer 1, 2, 3, 4, 5 sozinho,\n"
                    + "você pode mandar o computador fazer isso com o comando 'for'.\n\n"

                    + "Veja como é:\n"
                    + "for (int i = 1; i <= 5; i++) {\n"
                    + "    System.out.println(i);\n"
                    + "}\n\n"

                    + "Vamos entender cada parte:\n"
                    + "int i = 1;     -> Comece no número 1\n"
                    + "i <= 5;        -> Continue enquanto o número for até 5\n"
                    + "i++            -> Aumente de 1 em 1\n"
                    + "{ ... }        -> Aqui dentro você coloca o que quer fazer\n\n"

                    + "Então, é como brincar com 5 brinquedos:\n"
                    + "Brinque com o número 1, depois o 2, até chegar no 5.\n"
                    + "E a cada vez, o computador faz o que você mandar.\n\n"

                    + "O 'for' é uma forma do computador repetir alguma coisa várias vezes!");

            System.out.print("clique ENTER se voce entendeu");
            sc.nextLine();

            System.out.println("");
            System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                    "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");

            System.out.println("\n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao meu destino: " + cc-- +
                    "\n");

            for (int i = 0; i < perguntasN4.size(); i++) {
                if (i < 3) {
                    if (perguntasN4.get(i).equals(this.p1)) {
                        System.out.print(this.p1);
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
                    } else if (perguntasN4.get(i).equals(this.p2)) {
                        System.out.print(this.p2);
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
                    } else if (perguntasN4.get(i).equals(this.p3)) {
                        System.out.print(this.p3);
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
                    } else if (perguntasN4.get(i).equals(this.p4)) {
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
                    } else if (perguntasN4.get(i).equals(this.p5)) {
                        System.out.print(this.p5);
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
                    } else if (perguntasN4.get(i).equals(this.p6)) {
                        System.out.print(this.p6);
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
                    } else if (perguntasN4.get(i).equals(this.p7)) {
                        System.out.print(this.p7);
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
                    } else if (perguntasN4.get(i).equals(this.p8)) {
                        System.out.print(this.p8);
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
                    } else if (perguntasN4.get(i).equals(this.p9)) {
                        System.out.print(this.p9);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                    "\n");
                        } else {
                            System.out.println("ERROU!☹");
                            System.out.println("A resposta certa é 2)");
                        }
                    } else if (perguntasN4.get(i).equals(this.p10)) {
                        System.out.print(this.p10);
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
                    }
                }
            }
            System.out.print("\n\n");
            Nivel05 nvl5 = new Nivel05();
            nvl5.ChamaNivel5(nome);
        } catch (Exception e) {
            System.out.println("❌ Ocorreu um erro. Por favor, digite apenas números válidos.");
        }
    }
}
