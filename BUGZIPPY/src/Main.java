
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeJogo game = new GerenciadorDeJogo();
        Ranking ranking = new Ranking(); // Crie uma instância de Ranking aqui para poder chamá-lo

        System.out.println("Bem-vindo ao BugTrapps!");
        System.out.println("1 - Iniciar Novo Jogo");
        System.out.println("2 - Ver Ranking");
        System.out.println("3 - Limpar Ranking"); // Nova opção
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");

        int escolha = -1;
        try {
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Saindo.");
            scanner.nextLine();
            System.exit(0);
        }

        switch (escolha) {
            case 1:
                game.iniciarJogo();
                break;
            case 2:
                ranking.exibirRanking();
                break;
            case 3:
                ranking.limparRanking(); // Chama o método para limpar o ranking
                break;
            case 4:
                System.out.println("Saindo do jogo. Até mais!");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Saindo.");
                break;
        }
        scanner.close(); // É uma boa prática fechar o scanner
    }
}