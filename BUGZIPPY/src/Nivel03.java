import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel03 {
    public Nivel03() {

    }
    public void ChamaNivel3(String nome) {
        
        int res = 0, cc = 18;
        
        ArrayList<String> perguntasN3 = new ArrayList<>();
        String p1 = "\n1. [Capítulo 5, pág. 172]\n" +
                "O que o comando switch faz no Java? Escolha a melhor explicação:\n" +
                "Imagine que você tem várias opções e precisa escolher apenas uma, como em um cardápio. O switch ajuda o computador a escolher o que fazer com base em um valor.\n" +
                "1) Repete um bloco de código várias vezes\n" +
                "2) Compara uma variável com vários valores possíveis\n" +
                "3) Cria um novo método no programa\n" +
                "4) Serve para fazer contas de matemática\n" +
                "5) Mostra mensagens na tela\n" +
                "6) Deixa o programa mais lento\n" +
                "escreva: ";
        String p2 = "\n2. [Capítulo 5, pág. 173]\n" +
                "Para que serve o comando break dentro de um switch?\n" +
                "1) Para fazer uma pausa no teclado\n" +
                "2) Para encerrar o programa inteiro\n" +
                "3) Para sair do switch depois que a opção correta foi encontrada\n" +
                "4) Para repetir o mesmo código várias vezes\n" +
                "5) Para pular para o próximo case\n" +
                "6) Para escrever uma nova variável\n" +
                "escreva: ";
        String p3 = "\n3. [Capítulo 5, pág. 173]\n" +
                "O que acontece se esquecermos o break dentro do switch?\n" +
                "1) Ele para automaticamente\n" +
                "2) Mostra um erro na tela\n" +
                "3) Executa os cases abaixo\n" +
                "4) Ignora o switch completamente\n" +
                "5) Ele volta para o início do programa\n" +
                "6) Nada acontece\n" +
                "escreva: ";
        String p4 = "\n4. [Capítulo 5, pág. 172]\n" +
                "Qual destas opções mostra a forma correta de escrever um switch básico?\n" +
                "1) switch x { \ncase 1: \nbreak; }\n" +
                "2) switch(x) { \ncase 1: \nSystem.out.println(\"Um\"); \nbreak; }\n" +
                "3) switch(x) [ \ncase 1; \nbreak; ]\n" +
                "4) switch = x { 1 -> System.out.println(\"Um\"); }\n" +
                "5) switch(x) case 1: System.out.println(\"Um\")\n" +
                "6) switched(x) { case 1: break; }\n" +
                "escreva: ";
        String p5 = "\n5. [Capítulo 5, pág. 174]\n" +
                "O que será impresso na tela?\nint dia = 2;\nswitch (dia) {\n    case 1: System.out.println(\"Domingo\"); break;\n    case 2: System.out.println(\"Segunda\"); break;\n}\n" +
                "1) Domingo\n2) Segunda\n3) Nada\n4) Erro de compilação\n5) Terça\n6) Segunda e Terça\n" +
                "escreva: ";
        String p6 = "\n6. [Capítulo 5, pág. 174]\n" +
                "O que acontece com este código?\nint x = 3;\nswitch(x) {\n case 1: System.out.println(\"Um\");\n case 2: System.out.println(\"Dois\");\n case 3: System.out.println(\"Três\");\n}\n" +
                "1) Imprime “Três”\n2) Não imprime nada\n3) Imprime “Três” apenas\n4) Imprime “Três” e dá erro\n5) Imprime “Três”, “Dois” e “Um”\n6) Imprime “Três” e continua com os outros case\n" +
                "escreva: ";
        String p7 = "\n7. [Capítulo 5, pág. 172]\n" +
                "Qual tipo de variável é mais usada no switch?\n" +
                "1) boolean\n2) double\n3) float\n4) int\n5) String apenas\n6) long apenas\n" +
                "escreva: ";
        String p8 = "\n8. [Capítulo 5, pág. 174]\n" +
                "Complete a frase: o switch é melhor usado quando...\n" +
                "1) Temos poucas opções de escolha\n2) Queremos repetir várias vezes\n3) Precisamos verificar muitos valores de uma variável\n" +
                "4) Queremos comparar dois valores apenas\n5) Queremos que o código seja mais difícil de ler\n6) Queremos usar apenas if e else\n" +
                "escreva: ";
        String p9 = "\n9. [Capítulo 5, pág. 175]\n" +
                "Qual dessas situações é uma boa ideia para usar switch em vez de if?\n" +
                "1) Quando queremos somar dois números\n2) Quando temos várias opções fixas, como dias da semana\n" +
                "3) Quando temos que verificar se um número é par\n4) Quando lemos um número aleatório\n" +
                "5) Quando lidamos com textos longos\n6) Quando precisamos de loops (for ou while)\n" +
                "escreva: ";
        
        perguntasN3.add(p1);
        perguntasN3.add(p2);
        perguntasN3.add(p3);
        perguntasN3.add(p4);
        perguntasN3.add(p5);
        perguntasN3.add(p6);
        perguntasN3.add(p7);
        perguntasN3.add(p8);
        perguntasN3.add(p9);
        Collections.shuffle(perguntasN3); //embaralha as posições do arraylist
        
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
                System.out.print("\nclique ENTER se voce entendeu\n");
                sc.nextLine();
            
                for (int i = 0; i < perguntasN3.size(); i++) {
                    if (i < 3) {
                        if (perguntasN3.get(i).equals(p1)) {
                            System.out.print(p1);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 2) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
                            }
                        } else if (perguntasN3.get(i).equals(p2)) {
                            System.out.print(p2);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
                            }
                        } else if (perguntasN3.get(i).equals(p3)) {
                            System.out.print(p3);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
                            }
                        } else if (perguntasN3.get(i).equals(p4)) {
                            System.out.print(p4);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 2) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
                            }
                        } else if (perguntasN3.get(i).equals(p5)) {
                            System.out.print(p5);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 2) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
                            }
                        } else if (perguntasN3.get(i).equals(p6)) {
                            System.out.print(p6);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 6) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
                            }
                        } else if (perguntasN3.get(i).equals(p7)) {
                            System.out.print(p7);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 4) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
                            }
                        } else if (perguntasN3.get(i).equals(p8)) {
                            System.out.print(p8);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
                            }
                        } else if (perguntasN3.get(i).equals(p9)) {
                            System.out.print(p9);
                            res = sc.nextInt();
                            sc.nextLine();
                            if (res == 2) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                                ;
                            } else {
                            System.out.println("ERROU!☹");
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
