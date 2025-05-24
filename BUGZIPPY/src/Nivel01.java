import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel01 {
    public void Nivel01() {

    }

    public void ChamaNivel1(String nome) {
        int res = 0;
        ArrayList<String> perguntasN3 = new ArrayList<>();
        String p1 = "[Capitulo 1. Pagina 25]\n" +
                "Programação é quando a gente dá instruções bem certinhas para o computador fazer alguma coisa, como mostrar mensagens," +
                " somar números ou até criar jogos! \n Essas instruções são feitas por pessoas chamadas programadores.\n" +
                "----O que é programação e como ela funciona?\n" +
                " 1) Programação é um conjunto de passos escritos por pessoas (os programadores) para ensinar o computador a fazer tarefas. \n" +
                " 2) Programação é quando você digita qualquer coisa no teclado e o computador cria um jogo sozinho.\n" +
                " 3) Programar é conversar tanto com o computador que ele começa a ter sentimentos por você.\n";

        String p2 = "[Capítulo 2 - Página 39]\n" +
                "Quando usamos o teclado, o mouse ou falamos com o computador, estamos enviando informações — isso é chamado de entrada.\n" +
                "Quando o computador mostra algo na tela ou imprime, ele está nos dando a resposta — isso é chamado de saída.\n" +
                "----O que são Entrada e Saída em um computador?\n" +
                " 1) Entrada e saída são lugares onde o computador guarda jogos secretos." +
                " 2) Entrada é quando mandamos informações pro computador (como clicar ou digitar), e saída é quando ele mostra o que fez (na tela ou impressora).\n" +
                " 3) Entrada é onde o computador liga o ventilador, e saída é onde ele solta fumaça. \n";

        String p3 = "[Capítulo 1. Página 27]\n" +
                "Java é uma linguagem de programação usada por pessoas do mundo todo para criar programas.\n" +
                "Ela é conhecida pela frase: \"Escreva uma vez e execute em qualquer lugar\", porque os programas \n" +
                "feitos em Java podem funcionar em vários tipos de computadores sem precisar reescrever tudo!\n" +
                "----O que é Java?\n" +
                " 1)  É uma linguagem de programação que funciona em muitos computadores diferentes. \n" +
                " 2) É um tipo de café mágico que faz o computador trabalhar mais rápido. \n" +
                " 3) É uma ilha onde vivem programadores que só falam com códigos secretos. ";

        String p4 = "[Capítulo 2 - Página 37]\n" +
                "Uma variável guarda um valor na memória do computador, como um nome, um número ou uma palavra.\n" +
                "----O que é uma variável em Java?\n" +
                " 1) O nome do computador. \n" +
                " 2) Um botão secreto do computador.\n" +
                " 3) Um tipo de lanche que o computador come. \n" +
                " 4) Um lugar especial que guarda valores, como números ou textos. \n" +
                " 5) Um espaço mágico onde aparecem vídeos. \n" +
                " 6) Uma senha para abrir o sistema. \n";

        String p5 = "[Capítulo 2 - Página 37]\n" +
                "Em Java, existem vários tipos de variáveis, que servem para guardar diferentes tipos de informações:\n" +
                "int → guarda números inteiros (sem vírgula)\n" +
                "double → guarda números com vírgula (como 3.14)\n" +
                "char → guarda um caractere (uma letra, como 'A')\n" +
                "boolean → guarda verdadeiro ou falso (true ou false)\n" +
                "String → guarda palavras ou frases (como \"Olá!\")\n" +
                "float → parecido com double, mas menos preciso\n" +
                "----Qual é o jeito certo de criar uma variável que guarda o número inteiro 10?\n" +
                " 1) char idade = 10; \n" +
                " 2) double idade = \"10\"; \n" +
                " 3) String idade = 10; \n" +
                " 4) float idade = dez; \n" +
                " 5) int idade = 10; \n" +
                " 6) boolean idade = 10; ";

        String p6 = "[Capítulo. 2 - Página 45]\n" +
                "O comando System.out.print mostra algo na tela sem pular linha depois.\n" +
                "----O que acontece quando usamos o comando System.out.print(\"Olá\");?\n" +
                "1) Transforma \"Olá\" em código secreto.. \n" +
                "2) Mostra \"Olá\" e pula uma linha.\n" +
                "3) Salva \"Olá\" numa variável do tipo char.\n" +
                "4) Mostra \"Olá\" com uma música. \n" +
                "5) Cria uma variável do tipo float.\n" +
                "6)  Mostra \"Olá\" na tela, tudo na mesma linha.";

        String p7 = "[Capítulo 2 – Página 45]\n" +
                "O System.out.println mostra algo na tela e depois pula para a próxima linha." +
                "----O que acontece se usamos System.out.println(\"Oi\");?\n" +
                "1) Pinta a tela de verde. \n" +
                "2) Mostra \"Oi\" sem pular linha." +
                "3) Mostra \"Oi\" dentro de uma variável boolean.\n" +
                "4) Mostra \"Oi\" e pula para a linha de baixo.\n" +
                "5) Mostra o número 1.0 com double.\n" +
                "6) Cria uma variável String chamada \"Oi\"";

        String p8 = "[Capítulo 2 – Página 50]\n" +
                "O Scanner permite que o programa leia o que a pessoa digita no teclado, como números ou palavras." +
                "----O que faz o comando Scanner entrada = new Scanner(System.in);?" +
                "1) Permite que o programa leia números, palavras e letras que a pessoa digita.\n" +
                "2) Cria um número do tipo double automaticamente.\n" +
                "3) Transforma palavras em variáveis boolean.\n" +
                "4) Abre um vídeo escondido no Java." +
                "5) Cria uma variável char chamada \"Scanner\".\n" +
                "6) É usado apenas para contar quantos cliques o mouse deu.";

        String p9 = "[Capítulo 2 – Página 39]\n" +
                "Operador\t     O que faz\t           Exemplo (a = 6, b = 3)\n" +
                "   +\t           Soma\t                       a + b = 9\n" +
                "-\t              Subtração\t                  a - b = 3\n" +
                "*\t              Multiplicação\t              a * b = 18\n" +
                "/\t              Divisão\t                    a / b = 2\n" +
                "%\t              Resto da divisão\t           a % b = 0\n" +
                "----Como somar os valores das variáveis a e b e guardar o resultado?" +
                "1) int total = a - b; \n" +
                "2) String total = a / b; \n" +
                "3) total := a * b;\n" +
                "4) total = a + b; \n" +
                "5) float total = a ++ b; \n" +
                "6) char total = a % b; ";

        String p10 = "[Capitulo 2 - Página 42]" +
                "Os operadores lógicos são símbolos usados para fazer perguntas no código. Eles ajudam o computador a tomar decisões com respostas do tipo “sim” ou “não”\n" +
                "&& (E): tudo precisa ser verdade.\n" +
                "Exemplo: “Se eu tiver ingresso E for maior de 10 anos, eu entro.”\n" +
                "|| (OU): só precisa que uma coisa seja verdade.\n" +
                "Exemplo: “Se eu tiver bala ou chocolate, tá tudo bem!”\n" +
                "! (NÃO): muda o que é verdade para falso e o que é falso para verdade.\n" +
                "Exemplo: !temChave = \"não tem chave\"" +
                "----Qual destas frases combina com: \nSe NÃO estiver chovendo, eu vou ao parque" +
                "1) se || não chover \n" +
                "2) se chovendo && não for forte\n" +
                "3) se ! estiver chovendo, vou ao parque \n" +
                "4) se não for parque, eu vou\n" +
                "5) se estiver chovendo, ! parque\n" +
                "6) se o parque quiser, eu ! vou\n" +
                "\n";

        perguntasN3.add(p1);
        perguntasN3.add(p2);
        perguntasN3.add(p3);
        perguntasN3.add(p4);
        perguntasN3.add(p5);
        perguntasN3.add(p6);
        perguntasN3.add(p7);
        perguntasN3.add(p8);
        perguntasN3.add(p9);
        perguntasN3.add(p10);
        Collections.shuffle(perguntasN3);

        int cc = 24;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 01 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");


            for (int i = 0; i < perguntasN3.size(); i++) {
                if (i < 3) {
                    if (perguntasN3.get(i).equals(p1)) {
                        System.out.print(p1);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p2)) {
                        System.out.print(p2);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p3)) {
                        System.out.print(p3);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p4)) {
                        System.out.print(p4);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p5)) {
                        System.out.print(p5);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 5) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p6)) {
                        System.out.print(p6);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 6) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p7)) {
                        System.out.print(p7);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p8)) {
                        System.out.print(p8);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p9)) {
                        System.out.print(p9);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN3.get(i).equals(p9)) {
                        System.out.print(p9);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    }

                }
            }
        }
    }

