// GerenciadorDeJogo.java (no pacote padrão)

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeJogo {
    private Jogador jogador;
    private List<Nivel> niveis;
    private Scanner scanner;
    private Ranking ranking; // Adicionando a instância do Ranking

    public GerenciadorDeJogo() {
        this.scanner = new Scanner(System.in);
        this.niveis = new ArrayList<>();
        this.ranking = new Ranking(); // Inicializando o Ranking

        // Adicione todos os níveis aqui na ordem correta
        niveis.add(new Nivel01());
        niveis.add(new Nivel02());
        niveis.add(new Nivel03());
        niveis.add(new Nivel04());
        niveis.add(new Nivel05());
        niveis.add(new Nivel06());
        niveis.add(new Nivel07());
        niveis.add(new Nivel08());
    }

    public void iniciarJogo() {
        exibirIntroducao();
        cadastrarJogador();

        System.out.println("\nVamos nessa, Bugmigo(a)! " + jogador.getNome() + "! " +
                "Juntos, enfrentaremos desafios de programação e encontraremos o caminho certo. " +
                "Eu te dou uma mão, e você me guia pelo labirinto. \n Vamos lá! \n");

        for (int i = 0; i < niveis.size(); i++) {
            Nivel nivelAtual = niveis.get(i);
            boolean nivelConcluido = nivelAtual.jogarNivel(jogador);

            if (!nivelConcluido) {
                System.out.println("\nFim de jogo para " + jogador.getNome() + ".");
                System.out.println("Sua pontuação final: " + jogador.getPontuacao() + " pontos.");
                ranking.adicionarPontuacao(jogador.getNome(), jogador.getPontuacao()); // Adiciona ao ranking
                ranking.exibirRanking(); // Exibe o ranking
                System.out.println("Obrigado por jogar!");
                return;
            }
            jogador.avancarNivel();
        }
        exibirFimDeJogo();
    }

    private void exibirIntroducao() {
        System.out.println("");
        System.out.println("𝘽𝙪𝙜𝙩𝙧𝙖𝙥𝙥𝙨: 𝙘𝙤𝙢𝙤 𝙥𝙧𝙤𝙜𝙧𝙖𝙢𝙖𝙧");
        System.out.println("      ☆.🐛✨ ⋆.˚ 🐛⋆.˚ 🐛.☆ ");
        System.out.println("      Sua Aventura na Programação Java Começa Aqui!");
        System.out.println("      ☆.🐛✨ ⋆.˚ 🐛⋆.˚ 🐛.☆ ");
    }

    private void cadastrarJogador() {
        System.out.println("\nQual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("\nQual seu email? ");
        String email = scanner.nextLine();

        this.jogador = new Jogador(nome, email);

        System.out.println("Seja bem vindo, " + this.jogador.getNome() + "!! \nEu sou a Buggy 🦋 \nSou uma formiga voadora e preciso da sua ajuda! \n" +
                "Estou perdido neste labirinto e só conseguirei voltar ao meu formigueiro se superar desafios de programação em Java. Você pode me guiar nessa jornada? \n 1- [SIM]   2-[NÃO]");

        int ssnn = 0;
        try {
            ssnn = scanner.nextInt();
            scanner.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Assumindo que você quer jogar.");
            scanner.nextLine();
            ssnn = 1;
        }

        if (ssnn != 1) {
            System.out.println("Que pena! Talvez na próxima. O jogo será encerrado.");
            System.exit(0);
        }
    }

    public void exibirFimDeJogo() {
        System.out.println("\n\n🎉 PARABÉNS, VOCÊ AJUDOU A BUGGY A VOLTAR PARA O FORMIGUEIRO! 🎉");
        System.out.println("Sua pontuação final: " + jogador.getPontuacao() + " pontos.");
        ranking.adicionarPontuacao(jogador.getNome(), jogador.getPontuacao()); // Adiciona ao ranking
        ranking.exibirRanking(); // Exibe o ranking
        System.out.println("Obrigado por jogar, " + jogador.getNome() + "!");
        System.out.println("\n⭐ Você concluiu todos os níveis e se tornou um verdadeiro mestre Java! ⭐");
    }
}