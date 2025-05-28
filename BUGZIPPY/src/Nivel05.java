import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel05 {
    public Nivel05() {

    }

    public void ChamaNivel5(String nome) {

        int res, cc = 12;

        Scanner sc = new Scanner(System.in);

        ArrayList<String> perguntasN5 = new ArrayList<>();
        String p1 = "\n[]\n" +
                "Para que serve o laço while em Java?\n" +
                " 1) Para repetir algo várias vezes\n" +
                " 2) Para pintar a tela de azul\n" +
                " 3) Para guardar números\n" +
                " 4) Para desligar o computador\n";

        String p2 = "\n[]\n" +
                "O que o while faz primeiro?\n" +
                " 1) Mostra uma mensagem\n" +
                " 2) Verifica se a condição é verdadeira\n" +
                " 3) Pede um número\n" +
                " 4) Cria um jogo\n";

        String p3 = "\n[]\n" +
                "Quando o while para de repetir?\n" +
                " 1) Quando o computador cansa\n" +
                " 2) Quando o usuário aperta Enter\n" +
                " 3) Quando a condição fica falsa\n" +
                " 4) Nunca para\n";

        String p4 = "\n[]\n" +
                "Qual a diferença do do while?\n" +
                " 1) Ele serve para decorar\n" +
                " 2) Ele nunca repete\n" +
                " 3) Ele só funciona com letras\n" +
                " 4) Ele faz primeiro e pergunta depois\n";

        String p5 = "\n[]\n" +
                "Quando é bom usar do while?\n" +
                " 1) Quando queremos que o código rode pelo menos uma vez\n" +
                " 2) Quando queremos repetir só uma vez\n" +
                " 3) Quando usamos a palavra mágica 'faça'\n" +
                " 4) Quando o código está com sono\n";

        String p6 = "\n[]\n" +
                "O que esse código faz?\nwhile (i < 3) { System.out.println(\"Oi\"); i++; }\n" +
                " 1) Escreve \"Oi\" mil vezes\n" +
                " 2) Escreve \"Oi\" três vezes\n" +
                " 3) Não escreve nada\n" +
                " 4) Mostra um erro\n";

        String p7 = "\n[]\n" +
                "Qual dessas é uma forma certa de usar do while?\n" +
                " 1) while { jogar(); }\n" +
                " 2) faça { jogar(); } até parar;\n" +
                " 3) do { System.out.println(\"Vamos jogar!\"); } while (jogar == true);\n" +
                " 4) repetir { jogar(); } se quiser\n";

        String p8 = "\n[]\n" +
                "O que acontece se a condição do while for falsa logo no começo?\n" +
                " 1) Fica preso em um loop\n" +
                " 2) Roda uma vez só\n" +
                " 3) Mostra \"erro!\"\n" +
                " 4) O código não roda\n";

        String p9 = "\n[]\n" +
                "O que o do while faz se a condição for falsa no final?\n" +
                " 1) Roda uma vez e para\n" +
                " 2) Não roda nada\n" +
                " 3) Roda mil vezes\n" +
                " 4) Muda o valor sozinho\n";

        String p10 = "\n[]\n" +
                "O que é importante lembrar sobre while e do while?\n" +
                " 1) do while é mais rápido\n" +
                " 2) while pergunta antes, do while roda antes\n" +
                " 3) while é só para números\n" +
                " 4) Eles funcionam com mágica\n";

        perguntasN5.add(p1);
        perguntasN5.add(p2);
        perguntasN5.add(p3);
        perguntasN5.add(p4);
        perguntasN5.add(p5);
        perguntasN5.add(p6);
        perguntasN5.add(p7);
        perguntasN5.add(p8);
        perguntasN5.add(p9);
        perguntasN5.add(p10);
        Collections.shuffle(perguntasN5);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 05 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        try {
            System.out.print(">>O que é while e do while?\n" +
                    "[Capítulo 5 – Páginas 171 a 180]\n" +
                    "Imagina que você está jogando um jogo onde precisa repetir uma tarefa, como pular corda, até alguém dizer “pare!”.\n" +
                    "Na programação, usamos o while e o do while para fazer coisas se repetirem várias vezes, igual no jogo.\n" +
                    "While é assim:\n" +
                    "Primeiro ele pergunta se pode fazer a tarefa.\n" +
                    "Se a resposta for “sim”, ele faz. Aí pergunta de novo.\n" +
                    "Mas se a resposta for “não” logo de cara, ele nem começa.\n" +
                    "Exemplo:\n" +
                    "Enquanto estiver sol, vou brincar lá fora.\n" +
                    "Se estiver chovendo, nem saio de casa!\n" +
                    "do while é diferente:\n" +
                    "Ele faz a tarefa uma vez primeiro, e só depois pergunta se pode continuar.\n" +
                    "Mesmo que a resposta seja “não”, ele já fez uma vez.\n" +
                    "Exemplo:\n" +
                    "Vou experimentar o sorvete e depois decido se quero mais.\n" +
                    "Mesmo que eu não goste, eu experimentei uma vez.\n" +
                    "Então:\n" +
                    "while pergunta antes de fazer.\n" +
                    "do while faz uma vez e depois pergunta.");

            System.out.print("clique ENTER se voce entendeu");
            sc.nextLine();

            System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                    "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");


            System.out.println("Passos para chegar ao meu destino: " + cc--);

            for (int i = 0; i < perguntasN5.size(); i++) {
                if (i < 3) {
                    if (perguntasN5.get(i).equals(p1)) {
                        System.out.print(p1);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p2)) {
                        System.out.print(p2);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p3)) {
                        System.out.print(p3);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p4)) {
                        System.out.print(p4);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p5)) {
                        System.out.print(p5);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p6)) {
                        System.out.print(p6);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p7)) {
                        System.out.print(p7);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p8)) {
                        System.out.print(p8);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p9)) {
                        System.out.print(p9);
                        System.out.print("\nEscreva: ");
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN5.get(i).equals(p10)) {
                        System.out.print(p10);
                        System.out.print("\nEscreva: ");
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
            Nivel06 nvl6 = new Nivel06();
            nvl6.ChamaNivel6(nome);//tem q fazer o metodo de chamar o nivel 5 aquiii
        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, digite apenas números.");
        }
    }
}
