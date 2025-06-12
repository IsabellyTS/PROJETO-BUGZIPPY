import java.util.Scanner;
//MODIFICANDO
public class Nivel01 {
    public void Nivel01() {
    }

    public void ChamaNivel1() {
        int res = 0;
        int cc = 24;
        Scanner sc = new Scanner(System.in);

        Explicacao explicacao = new Explicacao();
        explicacao.explicacaoN1();

        System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");

        System.out.println("\n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao meu destino: " + cc-- +
                "\n");



        /*for (int i = 0; i < perguntasN1.size(); i++) {
            if (i < 3) {
                if (perguntasN1.get(i).equals(p1)) {
                    System.out.print(p1);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 2) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");
                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p2)) {
                    System.out.print(p2);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p3)) {
                    System.out.print(p3);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p4)) {
                    System.out.print(p4);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p5)) {
                    System.out.print(p5);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p6)) {
                    System.out.print(p6);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p7)) {
                    System.out.print(p7);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p8)) {
                    System.out.print(p8);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p9)) {
                    System.out.print(p9);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN1.get(i).equals(p10)) {
                    System.out.print(p10);
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \nParabéns, estou a um passo a menos no meu caminho! \n \uD80C\uDDFC ⋆.˚ \uD80C\uDDA4⋆.˚ \uD80C\uDDFC Passos para chegar ao destino: " + cc-- +
                                "\n");                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                }
            }
        }
        System.out.print("\n\n");
        Nivel02 nvl02 = new Nivel02();
        nvl02.ChamaNivel2(nome);*/
    }
}
