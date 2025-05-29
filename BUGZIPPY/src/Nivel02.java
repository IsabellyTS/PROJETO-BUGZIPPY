import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel02 {
    public void ChamaNivel2(String nome) {
        int res = 0;


        ArrayList<String> perguntasN2 = new ArrayList<>();
        String p1 = "\n[Capítulo 4 – Página 131]\n" +
                "O que faz o if?\n" +
                " 1) Ele conta piadas\n" +
                " 2) Ele decide se algo deve acontecer \n" +
                " 3) Ele pinta a tela\n" +
                " 4) Ele cria um jogo\n";

        String p2 = "\n[Capítulo 4 – Página 131]\n" +
                "Quando usamos o else?\n" +
                " 1) Quando o if não acontece \n" +
                " 2) Quando queremos repetir algo\n" +
                " 3) Quando criamos uma variável\n" +
                " 4) Quando desenhamos na tela\n";

        String p3 = "\n[Capítulo 4 – Página 131]\n" +
                "if (sol == true) { irPraPraia(); } - O que esse código quer dizer?\n" +
                " 1) Se estiver chovendo, ir pra praia\n" +
                " 2) Sempre ir pra praia\n" +
                " 3) Dormir na praia\n" +
                " 4) Só ir pra praia se tiver sol \n";

        String p4 = "\n[Capítulo 4 – Página 132]\n" +
                "O que significa o símbolo || ?\n" +
                " 1) E\n" +
                " 2) Ou \n" +
                " 3) Não\n" +
                " 4) Igual\n";

        String p5 = "\n[Capítulo 4 – Página 132]\n" +
                "O que significa o símbolo && ?\n" +
                " 1) Ou\n" +
                " 2) Se não\n" +
                " 3) E \n" +
                " 4) Multiplica\n";

        String p6 = "\n[Capítulo 4 – Página 131]\n" +
                "O que essa parte faz: if (idade >= 12)?\n" +
                " 1) Vê se a idade é menor que 12\n" +
                " 2) Vê se a idade é 12 ou mais \n" +
                " 3) Multiplica a idade\n" +
                " 4) Cria a idade\n";

        String p7 = "\n[Capítulo 4 – Página 132]\n" +
                "O que faz o operador '!' ?\n" +
                " 1) Soma números\n" +
                " 2) Compara dois textos\n" +
                " 3) Nega uma condição \n" +
                " 4) Transforma número em texto\n";

        String p8 =  "\n[Capítulo 4 – Página 132]\n" +
                "Para que servem os operadores lógicos?\n" +
                " 1) Ajudar o programa a tomar decisões\n" +
                " 2) Repetir códigos em laços\n" +
                " 3) Criar textos coloridos\n" +
                " 4) Mudar a cor da tela\n";

        String p9 =  "\n[Capítulo 4 – Página 132]\n" +
                "Qual destas opções de operadores lógicos serve para 'Está chovendo e tem vento!'\n" +
                " 1) Chovendo && vento\n" +
                " 2) Chovendo || vento\n" +
                " 3) Chovendo + vento \n" +
                " 4) Chovendo E vento\n";
        
        String p10 =  "\n[Capítulo 4 – Página 132]\n" +
                "Qual destas frases corresponde a frase: Hoje eu NÃO vou para a aula.\n" +
                " 1) Hoje eu ! vou para a aula.\n" +
                " 2) Hoje eu && vou para a aula.\n" +
                " 3) Hoje eu || vou para a aula.\n" +
                " 4) Hoje eu + vou para a aula.\n" ;

        perguntasN2.add(p1);
        perguntasN2.add(p2);
        perguntasN2.add(p3);
        perguntasN2.add(p4);
        perguntasN2.add(p5);
        perguntasN2.add(p6);
        perguntasN2.add(p7);
        perguntasN2.add(p8);
        perguntasN2.add(p9);
        perguntasN2.add(p10);
        Collections.shuffle(perguntasN2);

        int cc = 21;
        Scanner sc = new Scanner(System.in);
        
        //Inicío jogo
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 02 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(">> O que é o if e o else?\n" +
                "[Capítulo 4 – Página 131]\n\n" +
                "O if é uma palavra usada para verificar se algo é verdadeiro.\n" +
                "Se for, o computador executa um bloco de código.\n" +
                "Se não for, podemos usar o else para fazer outra coisa.\n" +
                "É como perguntar:\n" +
                "\"Se estiver chovendo, levo guarda-chuva. Senão, vou sem ele.\"\n\n" +
                "Em Java, isso fica assim:\n" +
                "if (chovendo) {\n" +
                "    System.out.println(\"Leve o guarda-chuva.\");\n" +
                "} else {\n" +
                "    System.out.println(\"Pode sair sem guarda-chuva.\");\n" +
                "}\n" +

                "-------------------------------------------------------------\n\n" +

                ">> O que são Operadores Lógicos?\n" +
                "[Capítulo 4 – Página 132]\n\n" +
                "Operadores lógicos ajudam a fazer perguntas mais completas no if.\n" +
                "ºVeja os principais:\n" +
                "&& quer dizer E\n" +
                "A condição só é verdadeira se as duas partes forem verdadeiras.\n" +
                "-Exemplo: \"Se estiver chovendo e for segunda-feira...\"\n\n" +
                "|| quer dizer OU\n" +
                "A condição é verdadeira se pelo menos uma das partes for verdadeira.\n" +
                "-Exemplo: \"Se estiver chovendo ou nevando...\"\n\n" +
                "! quer dizer NÃO\n" +
                "Ele inverte a condição. Se era verdadeiro, vira falso.\n" +
                "-Exemplo: \"!chovendo\" significa \"não está chovendo\".");

        System.out.print("clique ENTER se voce entendeu");
        sc.nextLine();
        System.out.println("");
        System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");

        System.out.println("\n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao meu destino: " + cc-- +
                "\n");

        //Perguntas
        for (int i = 0; i < perguntasN2.size(); i++) {
            if (i < 3) {
                if (perguntasN2.get(i).equals(p1)) {
                    System.out.print(p1);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 2) {
                        System.out.println("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p2)) {
                    System.out.print(p2);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p3)) {
                    System.out.print(p3);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p4)) {
                    System.out.print(p4);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 2) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p5)) {
                    System.out.print(p5);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p6)) {
                    System.out.print(p6);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 2) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p7)) {
                    System.out.print(p7);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p8)) {
                    System.out.print(p8);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p9)) {
                    System.out.print(p9);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN2.get(i).equals(p10)) {
                    System.out.print(p10);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                         ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                }
            }
        }
        System.out.print("\n\n");
        Nivel03 nvl03 = new Nivel03();
        nvl03.ChamaNivel3(nome);
    }
}

