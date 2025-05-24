import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel02 {
    public void ChamaNivel2() {
        Scanner scanner = new Scanner(System.in);
        //Array
        ArrayList<String> perguntasN2 = new ArrayList<>();
        perguntasN2.add("Programação é quando a gente dá instruções bem certinhas para o computador fazer alguma coisa, como mostrar mensagens," +
                " somar números ou até criar jogos! \nEssas instruções são feitas por pessoas chamadas programadores. \n" +
                "(Capitulo 1. Pagina 25)\n" +
                "-----Pergunta:\n" +
                "O que é programação e como ela funciona?\n" +
                "\n" +
                "Alternativas:\n" +
                "\n" +
                "1) Programação é um conjunto de passos escritos por pessoas (os programadores) para ensinar o computador a fazer tarefas. \n" +
                "2) Programação é quando você digita qualquer coisa no teclado e o computador cria um jogo sozinho.\n" +
                "3) Programar é conversar tanto com o computador que ele começa a ter sentimentos por você.\n");
        perguntasN2.add("2");
        perguntasN2.add("3");
        perguntasN2.add("4");
        perguntasN2.add("5");
        perguntasN2.add("6");
        perguntasN2.add("7");
        perguntasN2.add("8");
        perguntasN2.add("9");
        perguntasN2.add("10");

        Collections.shuffle(perguntasN2);

        //Inicío jogo
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 02 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Resolva as questões utilizando apenas as teclas [1], [2], [3]!");

        //Contagem de passos
        int res = 0, c = 1, cc = 80;
        System.out.println("Passos para chegar ao meu destino: " + cc--);

        //Peguntas
        for (int i = 0; i < perguntasN2.size(); i++) {
            if (i >= 3) {
                switch (i) {
                    case 1:
                        System.out.println(perguntasN2.get(i));
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
                        break;
                    case 2:
                        System.out.println(perguntasN2.get(i));
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
                        break;
                    case 3:
                        System.out.println(perguntasN2.get(i));
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
                        break;
                    case 4:
                        System.out.println(perguntasN2.get(i));
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
                        break;
                    case 5:
                        System.out.println(perguntasN2.get(i));
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
                        break;
                }
            }

        }
    }

}

