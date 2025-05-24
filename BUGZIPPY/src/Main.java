import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Nivel03 nvl3 = new Nivel03();
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("\uD835\uDE71\uD835\uDE84\uD835\uDE76\uD835\uDE89\uD835\uDE78\uD835\uDE7F\uD835\uDE7F\uD835\uDE88: \uD835\uDE72\uD835\uDE98\uD835\uDE96\uD835\uDE98 \uD835\uDE7F\uD835\uDE9B\uD835\uDE98\uD835\uDE90\uD835\uDE9B\uD835\uDE8A\uD835\uDE96\uD835\uDE8A\uD835\uDE9B");
        System.out.println("      ☆.\uD80C\uDEFC\uD80C\uDF4A \uD80C\uDDA4 \uD80C\uDF4A\uD80C\uDEFC\uD80C\uDF4A.☆");
        System.out.println("");
        System.out.println("-\uD835\uDE0B\uD835\uDE2A\uD835\uDE28\uD835\uDE2A\uD835\uDE35\uD835\uDE26 [\uD835\uDE1F] \uD835\uDE31\uD835\uDE22\uD835\uDE33\uD835\uDE22 \uD835\uDE2A\uD835\uDE2F\uD835\uDE2A\uD835\uDE24\uD835\uDE2A\uD835\uDE22\uD835\uDE33 \uD835\uDE30 \uD835\uDE2B\uD835\uDE30\uD835\uDE28\uD835\uDE30-");
        String x;
        x = scanner.nextLine();
        String nome;
        System.out.println("");
        System.out.println("Qual seu nome? ");
        nome = scanner.nextLine();
        System.out.println("");
        System.out.println("Qual seu email? ");
        String email = scanner.nextLine();
        System.out.println("");
        CadastraUser user = new CadastraUser();
        user.setNome(nome);
        user.setEmail(email);
        System.out.println("Seja bem vindo, " + nome + "!! \nEu sou a \uD835\uDC01\uD835\uDC2E\uD835\uDC20\uD835\uDC33\uD835\uDC22\uD835\uDC29\uD835\uDC29\uD835\uDC32 \uD80C\uDDA4 \nSou uma formiga voadora e preciso da sua ajuda! \n" +
                "Estou perdido neste labirinto e só conseguirei voltar ao meu formigueiro se superar desafios de programação em Java. Você pode me guiar nessa jornada? \n 1- [SIM]   2-[NÃO]");
        int ssnn=0;
        try {
            ssnn = scanner.nextInt();
            switch (ssnn) {
                case 1:
                    System.out.println("\nVamos nessa, Bugmigo(a)! " + nome + "! " +
                            "Juntos, enfrentaremos desafios de programação e encontraremos o caminho certo. Eu te dou uma mão, e você me guia pelo labirinto. \n Vamos lá!");
                Nivel01 nvl01 = new Nivel01();
                nvl01.Nivel01();
                    break;
                case 2:
                    System.out.println("Que pena Bugmigo, " + nome + ", irei continuar perdido aqui...");
                    break;
                default: {
                    System.out.println("erro");
                }
                break;
            }
        }catch (Exception e){
            System.out.println("erro de conversão: " + e);
        }
    }
}
