import java.util.Scanner;
import java.util.Random;
public class Nivel01 {
    //DadosArmazenados dados = new DadosArmazenados();
    //inseto bugzippy: 𓆤


        public void ChamaNivel01 () {


            Scanner scanner = new Scanner(System.in);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                                      NÍVEL 01 \uD80C\uDDA4 ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Resolva as questões utilizando apenas as teclas [1], [2], [3]!");
            int res = 0, c = 1, cc = 80;
            System.out.println("Passos para chegar ao meu destino: " + cc--);

        //1
             System.out.println("");
            System.out.println("Programação é quando a gente dá instruções bem certinhas para o computador fazer alguma coisa, como mostrar mensagens," +
                    " somar números ou até criar jogos! \n Essas instruções são feitas por pessoas chamadas programadores.\n" +
                    "(Capitulo 1. Pagina 25)\n" +
                    "-----Pergunta:\n" +
                    "O que é programação e como ela funciona?\n" +
                    "\n" +
                    "Alternativas:\n" +
                    "\n" +
                    " 1) Programação é um conjunto de passos escritos por pessoas (os programadores) para ensinar o computador a fazer tarefas. \n" +
                    " 2) Programação é quando você digita qualquer coisa no teclado e o computador cria um jogo sozinho.\n" +
                    " 3) Programar é conversar tanto com o computador que ele começa a ter sentimentos por você.\n");
            res = scanner.nextInt();
            scanner.nextLine();

            while (res == 1) {
                break;
            }
            while (res == 2 || res == 3) {
                System.out.println("Resposta Errada, tente novamente!");
                res = scanner.nextInt();
            }
            System.out.println("Parabéns, estou a um passo a menos no meu caminho! \n \uD81A\uDC7C\uD81A\uDD23\uD81A\uDD67\uD81A\uDC7C Passos para chegar ao destino: " + cc--);
            System.out.println("");
            //2
            System.out.println("Quando usamos o teclado, o mouse ou falamos com o computador, estamos enviando informações — isso é chamado de entrada.\n" +
                    "Quando o computador mostra algo na tela ou imprime, ele está nos dando a resposta — isso é chamado de saída.\n" +
                    "(Capitulo 2. Pagina 39)\n" +
                    "----Pergunta:\n" +
                    "O que são Entrada e Saída em um computador?\n" +
                    "\n" +
                    "Alternativas:\n" +
                    "\n" +
                    " 1) Entrada e saída são lugares onde o computador guarda jogos secretos." +
                    "\n" +
                    " 2) Entrada é quando mandamos informações pro computador (como clicar ou digitar), e saída é quando ele mostra o que fez (na tela ou impressora).\n" +
                    "\n 3) Entrada é onde o computador liga o ventilador, e saída é onde ele solta fumaça. \n");
                res = scanner.nextInt();
                scanner.nextLine();

                 while (res == 2) {
                     break;
                 }
                 while (res == 1 || res == 3) {
                     System.out.println("Resposta Errada, tente novamente!");
                     res = scanner.nextInt();
                 }
                 System.out.println("Parabéns, estou a um passo a menos no meu caminho! \n \uD81A\uDC7C\uD81A\uDD23\uD81A\uDD67\uD81A\uDC7C Passos para chegar ao destino: " + cc--);
                    System.out.println("");

                    //3
                 System.out.println("Java é uma linguagem de programação usada por pessoas do mundo todo para criar programas.\n" +
                "Ela é conhecida pela frase: \"Escreva uma vez e execute em qualquer lugar\", porque os programas \n" +
                "feitos em Java podem funcionar em vários tipos de computadores sem precisar reescrever tudo!\n" +
                "(Capitulo 1. Pagina 27)\n" +
                "----Pergunta:\n" +
                "O que é Java?\n" +
                "\n" +
                "Alternativas:\n" +
                "\n" +
                " 1)  É uma linguagem de programação que funciona em muitos computadores diferentes. \n" +
                "\n" +
                " 2) É um tipo de café mágico que faz o computador trabalhar mais rápido. \n" +
                "\n" +
                " 3) É uma ilha onde vivem programadores que só falam com códigos secretos. ");
            res = scanner.nextInt();
            scanner.nextLine();

            while (res == 1) {
                break;
            }
            while (res == 2 || res == 3) {
                System.out.println("Resposta Errada, tente novamente!");
                res = scanner.nextInt();
            }
            System.out.println("Parabéns, estou a um passo a menos no meu caminho! \n \uD81A\uDC7C\uD81A\uDD23\uD81A\uDD67\uD81A\uDC7C Passos para chegar ao destino: " + cc--);
              System.out.println("");
            //4
            System.out.println("\n" +
                    "Uma variável guarda um valor na memória do computador, como um nome, um número ou uma palavra.\n" +
                    "(Capitulo 2. Pagina 37)\n" +
                    "----Pergunta:\n" +
                    "O que é uma variável em Java?\n" +
                    "\n" +
                    "Alternativas:\n" +
                    "\n" +
                    " 1) Um lugar especial que guarda valores, como números ou textos. \n" +
                    "\n" +
                    " 2) Um botão secreto do computador.\n" +
                    "\n" +
                    " 3) Um tipo de lanche que o computador come. \n" +
                    "\n" +
                    " 4) O nome do computador. \n" +
                    "\n" +
                    " 5) Um espaço mágico onde aparecem vídeos. \n" +
                    "\n" +
                    " 6) Uma senha para abrir o sistema. \n");
        res = scanner.nextInt();
        scanner.nextLine();

        while (res == 1) {
            break;
        }
        while ( res == 2 || res == 3 || res == 4 || res == 5 || res == 6) {
            System.out.println("Resposta Errada, tente novamente!");
            res = scanner.nextInt();
        }
        System.out.println("Parabéns, estou a um passo a menos no meu caminho! \n \uD81A\uDC7C\uD81A\uDD23\uD81A\uDD67\uD81A\uDC7C Passos para chegar ao destino: " + cc--);

        System.out.println("");
        System.out.println("Em Java, existem vários tipos de variáveis, que servem para guardar diferentes tipos de informações:\n" +
                "\n" +
                "int → guarda números inteiros (sem vírgula)\n" +
                "\n" +
                "double → guarda números com vírgula (como 3.14)\n" +
                "\n" +
                "char → guarda um caractere (uma letra, como 'A')\n" +
                "\n" +
                "boolean → guarda verdadeiro ou falso (true ou false)\n" +
                "\n" +
                "String → guarda palavras ou frases (como \"Olá!\")\n" +
                "\n" +
                "float → parecido com double, mas menos preciso\n" +
                "(Capitulo 2. Pagina 37)\n" +
                "----Pergunta:\n" +
                "Qual é o jeito certo de criar uma variável que guarda o número inteiro 10?\n" +
                "\n" +
                "Alternativas:\n" +
                "\n" +
                " 1) char idade = 10; \n" +
                "\n" +
                " 2) double idade = \"10\"; \n" +
                "\n" +
                " 3) String idade = 10; \n" +
                "\n" +
                " 4) float idade = dez; \n" +
                "\n" +
                " 5) int idade = 10; \n" +
                "\n" +
                " 6) boolean idade = 10; ");
        res = scanner.nextInt();
        scanner.nextLine();

        while (res == 5) {
            break;
        }
        while (res == 1 || res == 2 || res == 3 || res == 4 || res == 6) {
            System.out.println("Resposta Errada, tente novamente!");
            res = scanner.nextInt();
        }
        System.out.println("Parabéns, estou a um passo a menos no meu caminho! \n \uD81A\uDC7C\uD81A\uDD23\uD81A\uDD67\uD81A\uDC7C Passos para chegar ao destino: " + cc--);
        }
}
