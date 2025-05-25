import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel01 {
    public void Nivel01() {

    }

    public void ChamaNivel1(String nome) {
        int res = 0;


        ArrayList<String> perguntasN1 = new ArrayList<>();
        String p1 = "O que é uma variável?\n" +
                "1) Um botão secreto no teclado\n" +
                "2) Um lugar para guardar valores, como números e textos \n" +
                "3) Um tipo de erro\n" +
                "4) Uma função mágica\n" +
                "5) Um comando que fecha o programa\n" +
                "6) Um vírus de computador\n";

        String p2 = "Qual linha cria uma variável inteira com valor 12?\n" +
                "1) int idade = 12; \n" +
                "2) idade = int 12;\n" +
                "3) idade := 12;\n" +
                "4) String idade = 12;\n" +
                "5) double idade = idade;\n" +
                "6) idade int = '12';\n";

        String p3 =  "Como somar os valores das variáveis a e b e guardar o resultado?\n" +
                "1) total = a mais b\n" +
                "2) String total = a + b\n" +
                "3) int total = a + b\n" +
                "4) char total = a + b\n";

        String p4 = "O tipo boolean guarda que tipo de informação?\n" +
                "1) Números inteiros\n" +
                "2) Letras\n" +
                "3) Palavras longas\n" +
                "4) Verdadeiro ou falso \n" +
                "5) Fotos\n" +
                "6) Vídeos\n";

        String p5 = "Se eu tenho 10 balas e como 3, qual é a fórmula para saber quantas sobraram?\n" +
                "1) int sobrou = 10 + 3\n" +
                "2) int sobrou = 10 * 3\n" +
                "3) int sobrou = 10 - 3\n" +
                "4) int sobrou = 10 / 3\n";

        String p6 = "Qual dessas é uma forma correta de criar uma variável?\n" +
                "1) 12 idade = int;\n" +
                "2) idade: int = 12;\n" +
                "3) var idade = 12;\n" +
                "4) int idade = 12; \n" +
                "5) idade := 12;\n" +
                "6) idade = '12';\n";

        String p7 = "Como juntar os valores 5 e 3 para fazer uma subtração?\n" +
                "1) int resultado = 5 - 3\n" +
                "2) int resultado = 5 + 3\n" +
                "3) int resultado = 5 * 3\n" +
                "4) int resultado = 5 / 3\n";

        String p8 =  "Para que serve uma variável além de guardar valores?\n" +
                "1) Só para escrever o nome do jogador\n" +
                "2) Para decorar o código\n" +
                "3) Para guardar imagens\n" +
                "4) Para usar em contas e decisões \n" +
                "5) Para imprimir na tela com println\n" +
                "6) Para fazer desenhos\n";

        String p9 =  "O que significa a palavra int em Java?\n" +
                "1) Iniciar um programa\n" +
                "2) Mostrar uma mensagem\n" +
                "3) Guardar um número inteiro \n" +
                "4) Criar uma nova janela\n" +
                "5) Ligar a internet\n" +
                "6) Apagar um valor\n";

        String p10 =  "Qual nome é válido para uma variável?\n" +
                "1) 1nome\n" +
                "2) meu nome\n" +
                "3) nome_do_usuario \n" +
                "4) nome-do-usuário\n" +
                "5) nome@com\n" +
                "6) class\n";

        perguntasN1.add(p1);
        perguntasN1.add(p2);
        perguntasN1.add(p3);
        perguntasN1.add(p4);
        perguntasN1.add(p5);
        perguntasN1.add(p6);
        perguntasN1.add(p7);
        perguntasN1.add(p8);
        perguntasN1.add(p9);
        perguntasN1.add(p10);
        Collections.shuffle(perguntasN1);

        int cc = 24;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 01 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(
                ">> O que é Programação?\n" +
                        "[Capítulo 1 – Página 25]\n\n" +
                        "Programação é quando damos instruções bem certinhas para o computador seguir.\n" +
                        "Essas instruções dizem exatamente o que ele deve fazer: mostrar uma mensagem,\n" +
                        "somar números, tocar um som ou até criar um jogo!\n" +
                        "Quem escreve essas instruções é chamado de programador.\n" +
                        "Com a programação, ensinamos o computador a pensar do nosso jeito!\n\n" +

                        "-------------------------------------------------------------\n\n" +

                        ">> O que é Java?\n" +
                        "[Capítulo 1 – Página 27]\n\n" +
                        "Java é uma linguagem de programação, ou seja, uma forma de conversar com o computador.\n" +
                        "Ela é usada no mundo todo porque funciona em vários tipos de computadores.\n" +
                        "Frase famosa: \"Escreva uma vez e execute em qualquer lugar\".\n" +
                        "Isso quer dizer que um programa em Java pode rodar em muitos lugares sem mudar nada.\n\n" +

                        "-------------------------------------------------------------\n\n" +

                        ">> O que são Variáveis?\n" +
                        "[Capítulo 2 – Página 37]\n\n" +
                        "Variáveis são como caixinhas que guardam informações.\n" +
                        "Por exemplo, podemos ter uma variável chamada idade que guarda o número 12,\n" +
                        "ou uma chamada nome que guarda o texto \"Maria\".\n\n" +

                        "Exemplo:\n" +
                        "int idade = 12;\n" +
                        "String nome = \"Maria\";\n\n" +

                        "-------------------------------------------------------------\n\n" +

                        ">> Tipos de variáveis\n" +
                        "[Capítulo 2 – Página 37-38]\n\n" +
                        "int     - guarda números inteiros (ex: 5, 10, 99)\n" +
                        "double  - guarda números com vírgula (ex: 3.14, 8.5)\n" +
                        "char    - guarda um caractere, como 'A' ou '7'\n" +
                        "boolean - guarda true ou false (verdadeiro ou falso)\n" +
                        "String  - guarda palavras ou frases como \"Olá\"\n" +
                        "float   - também guarda números com vírgula (menos preciso que double)\n\n" +

                        "-------------------------------------------------------------\n\n" +

                        ">> Regras de Nomes para Variáveis\n" +
                        "[Capítulo 2 – Página 36]\n\n" +
                        "1. Deve começar com letra (ex: idade, nomeAluno)\n" +
                        "2. Pode usar números, mas não no começo (ex: nota1, não 1nota)\n" +
                        "3. Pode usar _ (underline) ou $ (mas evite se puder)\n" +
                        "4. Não pode ter espaços (ex: nome do aluno <-ERRADO, nomeDoAluno <-CERTO)\n" +
                        "5. Não pode usar símbolos especiais como @, #, %, etc.\n" +
                        "6. Não pode usar palavras reservadas do Java (como int, for, class, etc.)\n\n" +

                        "-------------------------------------------------------------\n\n" +

                        ">> O que são Fórmulas?\n" +
                        "[Capítulo 2 – Página 41-42]\n\n" +
                        "Fórmulas são operações que usamos para calcular algum valor usando variáveis.\n" +
                        "É como fazer contas com números que estão guardados nas caixinhas (variáveis).\n\n" +
                        "\"Operador\\t     O que faz\\t           Exemplo (a = 6, b = 3)\n"+
                        "   +              Soma                       a + b = 9 +\n" +
                        "   -              Subtração                  a - b = 3 +\n" +
                        "   *              Multiplicação              a * b = 18+\n" +
                        "   /              Divisão                    a / b = 2\n" +
                        "   %              Resto da divisão           a % b = 0\n");
        System.out.print("clique ENTER se voce entendeu");
        sc.nextLine();

        System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");


            for (int i = 0; i < perguntasN1.size(); i++) {
                if (i < 3) {
                    if (perguntasN1.get(i).equals(p1)) {
                        System.out.print(p1);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p2)) {
                        System.out.print(p2);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p3)) {
                        System.out.print(p3);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p4)) {
                        System.out.print(p4);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p5)) {
                        System.out.print(p5);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p6)) {
                        System.out.print(p6);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p7)) {
                        System.out.print(p7);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p8)) {
                        System.out.print(p8);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p9)) {
                        System.out.print(p9);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    } else if (perguntasN1.get(i).equals(p10)) {
                        System.out.print(p10);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("ERROU!☹");
                        }
                    }
                    System.out.print("\n\n");
                    Nivel02 nvl02 = new Nivel02();
                    nvl02.ChamaNivel2(nome);
                }
            }
        }
    }

