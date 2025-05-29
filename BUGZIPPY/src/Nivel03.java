import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel03 {
    private String p1 = "\n[Capítulo 5, pág. 172]\n" +
            "O que o comando switch faz no Java? Escolha a melhor explicação:\n" +
            "Imagine que você tem várias opções e precisa escolher apenas uma, como em um cardápio. O switch ajuda o computador a escolher o que fazer com base em um valor.\n" +
            " 1) Repete um bloco de código várias vezes\n" +
            " 2) Compara uma variável com vários valores possíveis\n" +
            " 3) Cria um novo método no programa\n" +
            " 4) Serve para fazer contas de matemática\n" +
            " 5) Mostra mensagens na tela\n" +
            " 6) Deixa o programa mais lento\n";
    private String p2 = "\n[Capítulo 5, pág. 173]\n" +
            "Para que serve o comando break dentro de um switch?\n" +
            " 1) Para fazer uma pausa no teclado\n" +
            " 2) Para encerrar o programa inteiro\n" +
            " 3) Para sair do switch depois que a opção correta foi encontrada\n" +
            " 4) Para repetir o mesmo código várias vezes\n" +
            " 5) Para pular para o próximo case\n" +
            " 6) Para escrever uma nova variável\n";
    private String p3 = "\n[Capítulo 5, pág. 173]\n" +
            "O que acontece se esquecermos o break dentro do switch?\n" +
            " 1) Ele para automaticamente\n" +
            " 2) Mostra um erro na tela\n" +
            " 3) Executa os cases abaixo\n" +
            " 4) Ignora o switch completamente\n" +
            " 5) Ele volta para o início do programa\n" +
            " 6) Nada acontece\n";
    private String p4 = "\n[Capítulo 5, pág. 172]\n" +
            "Qual destas opções mostra a forma correta de escrever um switch básico?\n" +
            " 1) switch x { \ncase 1: \nbreak; }\n" +
            " 2) switch(x) { \ncase 1: \nSystem.out.println(\"Um\"); \nbreak; }\n" +
            " 3) switch(x) [ \ncase 1; \nbreak; ]\n" +
            " 4) switch = x { 1 -> System.out.println(\"Um\"); }\n" +
            " 5) switch(x) case 1: System.out.println(\"Um\")\n" +
            " 6) switched(x) { case 1: break; }\n";
    private String p5 = "\n[Capítulo 5, pág. 174]\n" +
            "O que será impresso na tela?\n" +
            "int dia = 2;\n" +
            "switch (dia) {\n    " +
            "   case 1: System.out.println(\"Domingo\"); break;\n    " +
            "   case 2: System.out.println(\"Segunda\"); break;\n}\n" +
            " 1) Domingo\n" +
            " 2) Segunda\n" +
            " 3) Nada\n" +
            " 4) Erro de compilação\n" +
            " 5) Terça\n" +
            " 6) Segunda e Terça\n";
    private String p6 = "\n[Capítulo 5, pág. 174]\n" +
            "O que acontece com este código?\nint x = 3;\nswitch(x) {\n case 1: System.out.println(\"Um\");\n case 2: System.out.println(\"Dois\");\n case 3: System.out.println(\"Três\");\n}\n" +
            " 1) Imprime “Três”\n" +
            " 2) Não imprime nada\n" +
            " 3) Imprime “Três” apenas\n" +
            " 4) Imprime “Três” e dá erro\n" +
            " 5) Imprime “Três”, “Dois” e “Um”\n" +
            " 6) Imprime “Três” e continua com os outros case\n";
    private String p7 = "\n[Capítulo 5, pág. 172]\n" +
            "Qual tipo de variável é mais usada no switch?\n" +
            " 1) boolean\n" +
            " 2) double\n" +
            " 3) float\n" +
            " 4) int\n" +
            " 5) String apenas\n" +
            " 6) long apenas\n";
    private String p8 = "\n[Capítulo 5, pág. 174]\n" +
            "Complete a frase: o switch é melhor usado quando...\n" +
            " 1) Temos poucas opções de escolha\n" +
            " 2) Queremos repetir várias vezes\n" +
            " 3) Precisamos verificar muitos valores de uma variável\n" +
            " 4) Queremos comparar dois valores apenas\n" +
            " 5) Queremos que o código seja mais difícil de ler\n" +
            " 6) Queremos usar apenas if e else\n";
    private String p9 = "\n[Capítulo 5, pág. 175]\n" +
            "Qual dessas situações é uma boa ideia para usar switch em vez de if?\n" +
            " 1) Quando queremos somar dois números\n" +
            " 2) Quando temos várias opções fixas, como dias da semana\n" +
            " 3) Quando temos que verificar se um número é par\n" +
            " 4) Quando lemos um número aleatório\n" +
            " 5) Quando lidamos com textos longos\n" +
            " 6) Quando precisamos de loops (for ou while)\n";
    private String p10 = "\n[Capítulo 5, pág. 176]\n" +
            "Em qual dessas situações o uso do switch é mais indicado?\n" +
            " 1) Para calcular a média de notas de um aluno\n" +
            " 2) Para verificar se um número é maior que 100\n" +
            " 3) Para escolher uma ação com base no botão pressionado (A, B, C...)\n" +
            " 4) Para contar até 10 com um loop\n" +
            " 5) Para comparar nomes completos\n" +
            " 6) Para validar se uma senha tem mais de 8 caracteres\n";

    public Nivel03() {
    }

    public void ChamaNivel3(String nome) {

        int res = 0, cc = 18;

        ArrayList<String> perguntasN3 = new ArrayList<>();

        perguntasN3.add(this.p1);
        perguntasN3.add(this.p2);
        perguntasN3.add(this.p3);
        perguntasN3.add(this.p4);
        perguntasN3.add(this.p5);
        perguntasN3.add(this.p6);
        perguntasN3.add(this.p7);
        perguntasN3.add(this.p8);
        perguntasN3.add(this.p9);
        perguntasN3.add(this.p10);
        Collections.shuffle(perguntasN3);

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 03 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        try {
            System.out.println("Imagine que você tem um controle remoto com vários botões. ");
            System.out.println("Cada botão faz uma coisa diferente: um liga a TV, outro muda o canal, outro aumenta o volume...");
            System.out.println("O switch case no Java funciona como esse controle remoto!");

            System.out.println("\nVocê diz: 'Se eu apertar o botão 1, faça isso. Se for o botão 2, faça aquilo.'");
            System.out.println("É como dar comandos diferentes para cada número!");

            System.out.println("\nVeja um exemplo:");
            System.out.println("int botão = 2;");
            System.out.println("switch (botão) {");
            System.out.println("    case 1:");
            System.out.println("        System.out.println(\"Ligando a TV!\");");
            System.out.println("        break;");
            System.out.println("    case 2:");
            System.out.println("        System.out.println(\"Mudando de canal!\");");
            System.out.println("        break;");
            System.out.println("    case 3:");
            System.out.println("        System.out.println(\"Aumentando o volume!\");");
            System.out.println("        break;");
            System.out.println("    default:");
            System.out.println("        System.out.println(\"Botão desconhecido!\");");
            System.out.println("}");
            System.out.println("\nO 'case' é cada botão diferente que você pode apertar.");
            System.out.println("O 'break' é como dizer: 'pronto, parei por aqui'. Ele evita que o código continue executando os próximos botões.");
            System.out.println("E o 'default' é o que acontece se apertarmos um botão que não existe! ");

            System.out.println("\nCom o switch case, seu programa pode escolher o que fazer com base em um número, uma letra ou até uma palavra!");

            System.out.print("Clique ENTER se voce entendeu");
            sc.nextLine();

            System.out.println("");
            System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                    "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");

            System.out.println("\n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao meu destino: " + cc-- +
                    "\n");

            for (int i = 0; i < perguntasN3.size(); i++) {
                if (i < 3) {
                    if (perguntasN3.get(i).equals(this.p1)) {
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
                    } else if (perguntasN3.get(i).equals(this.p2)) {
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
                    } else if (perguntasN3.get(i).equals(this.p3)) {
                        System.out.print(this.p3);
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
                    } else if (perguntasN3.get(i).equals(this.p4)) {
                        System.out.print(this.p4);
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
                    } else if (perguntasN3.get(i).equals(this.p5)) {
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
                    } else if (perguntasN3.get(i).equals(this.p6)) {
                        System.out.print(this.p6);
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
                    } else if (perguntasN3.get(i).equals(this.p7)) {
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
                    } else if (perguntasN3.get(i).equals(this.p8)) {
                        System.out.print(this.p8);
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
                    } else if (perguntasN3.get(i).equals(this.p9)) {
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
                    } else if (perguntasN3.get(i).equals(this.p10)) {
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
            Nivel04 nvl04 = new Nivel04();
            nvl04.ChamaNivel4(nome);
        } catch (Exception e) {
            System.out.println("❌ Ocorreu um erro. Por favor, digite apenas números válidos.");
        }
    }
}
