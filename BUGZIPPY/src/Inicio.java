import java.util.Scanner;

public class Inicio {
    private String x;
    private String nome;
    private int ssnn = 0;
    private CadastraUser user = new CadastraUser();

    public Inicio(){}
    public void chamaInicio(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("\uD835\uDE71\uD835\uDE84\uD835\uDE76\uD835\uDE89\uD835\uDE78\uD835\uDE7F\uD835\uDE7F\uD835\uDE88: \uD835\uDE72\uD835\uDE98\uD835\uDE96\uD835\uDE98 \uD835\uDE7F\uD835\uDE9B\uD835\uDE98\uD835\uDE90\uD835\uDE9B\uD835\uDE8A\uD835\uDE96\uD835\uDE8A\uD835\uDE9B");
        System.out.println("      ☆.\uD80C\uDEFC\uD80C\uDF4A \uD80C\uDDA4 \uD80C\uDF4A\uD80C\uDEFC\uD80C\uDF4A.☆");
        System.out.println("");
        System.out.println("-\uD835\uDE0B\uD835\uDE2A\uD835\uDE28\uD835\uDE2A\uD835\uDE35\uD835\uDE26 [\uD835\uDE1F] \uD835\uDE31\uD835\uDE22\uD835\uDE33\uD835\uDE22 \uD835\uDE2A\uD835\uDE2F\uD835\uDE2A\uD835\uDE24\uD835\uDE2A\uD835\uDE22\uD835\uDE33 \uD835\uDE30 \uD835\uDE2B\uD835\uDE30\uD835\uDE28\uD835\uDE30-");

        this.x = scanner.nextLine();

        System.out.println("");
        System.out.println("Qual seu nome? ");
        this.nome = scanner.nextLine();
        System.out.println("");

        this.user.setNome(this.nome);
        System.out.println("Seja bem vindo, " + this.nome + "!! \nEu sou a \uD835\uDC01\uD835\uDC2E\uD835\uDC20\uD835\uDC33\uD835\uDC22\uD835\uDC29\uD835\uDC29\uD835\uDC32 \uD80C\uDDA4 \nSou uma formiga voadora e preciso da sua ajuda! \n" +
                "Estou perdido neste labirinto e só conseguirei voltar ao meu formigueiro se superar desafios de programação em Java. Você pode me guiar nessa jornada? \n 1- [SIM]   2-[NÃO]");

        try {
            this.ssnn = scanner.nextInt();
            switch (this.ssnn) {
                case 1:
                    System.out.println("\nVamos nessa, Bugmigo(a)! " + this.nome + "! " +
                            "Juntos, enfrentaremos desafios de programação e encontraremos o caminho certo. \nEu te dou uma mão, e você me guia pelo labirinto. \n Vamos lá!");
                    Nivel01 nvl01 = new Nivel01();
                    nvl01.ChamaNivel1(this.nome);
                    break;
                case 2:
                    System.out.println("Que pena Bugmigo, " + this.nome + ", irei continuar perdido aqui...");
                    break;
                default: {
                    System.out.println("erro");
                }
                break;
            }
        } catch (Exception e) {
            System.out.println("erro de conversão: " + e);
        }
    }
}
