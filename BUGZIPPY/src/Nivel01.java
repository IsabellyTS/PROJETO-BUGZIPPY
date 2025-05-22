import java.util.Scanner;

public class Nivel01 {
    public static void main(String[] args) {
        //DadosArmazenados dados = new DadosArmazenados();
        //inseto bugzippy: 𓆤

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 01 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Resolva as questões utilizando apenas as teclas [1], [2], [3]!");
        System.out.println("\n (A) ''Os computadores processam dados sob o controle de conjuntos de instruções chamados programas de computador. \nEsses " +
                "programas de software orientam o computador por meio de ações ordenadas especificadas por pessoas chamadas programadores  \n                                                                                                                             (\uD835\uDCD2á\uD835\uDCF9\uD835\uDCF2\uD835\uDCFD\uD835\uDCFE\uD835\uDCF5\uD835\uDCF8 2, \uD835\uDCDFá\uD835\uDCF0\uD835\uDCF2\uD835\uDCF7\uD835\uDCEA 39.)  ");


        int r1, c = 1,  cc = 80;

        System.out.println("O que é Programação e como ela funciona? \n 1- Programação é um conjunto definido de passos que após serem " +
                "processados, orientam o computador por meio de ações ordenadas especificadas \npor pessoas chamadas de programadores. \n 2- " +
                "Programação é quando você digita coisas aleatórias no computador até ele criar um jogo sozinho. \n 3- Programar é basicamente " +
                "conversar com o computador até ele desenvolver sentimentos por você.");
        r1 = scanner.nextInt();

                while (r1 == 1) {
                    break;
                }
            while (r1 == 2 || r1 == 3){
                System.out.println("Resposta Errada, tente novamente!");
                r1 = scanner.nextInt();
                } System.out.println("Parabéns, estou a um passo a menos no meu caminho! \n \uD81A\uDC7C\uD81A\uDD23\uD81A\uDD67\uD81A\uDC7C\uD80C\uDEFC\uD81A\uDD23\uD81A\uDD67\uD80C\uDEFC\uD80C\uDF4A Passos para chegar ao destino: " + cc--);
        }
    }
