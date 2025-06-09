package bgzp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorteador {
    private Perguntas perg = new Perguntas();
    private Scanner scanner = new Scanner(System.in);
    private int nivelAtual = 1;

    public void iniciarJogo() {
        while (nivelAtual <= 8) { // Define os 3 níveis
            perg.inicializarPerguntas(nivelAtual);
            if (sorteadorNivel(nivelAtual)) {
                System.out.println("\n🔥 Parabéns! Você avançou para o nível " + (nivelAtual + 1) + "! 🔥");
                nivelAtual++;
            } else {
                System.out.println("\n❌ Você não acertou o suficiente. Tente novamente!");
            }
        }
        System.out.println("\n🏆 Você completou todos os níveis! Fim do jogo. 🏆");
    }

    private boolean sorteadorNivel(int nivel) {
        ArrayList<String> perguntas = perg.getPerguntas();
        RespostasCorretas respostasCorretas = new RespostasCorretas();
        respostasCorretas.inicializarRespostas(nivel);
        ArrayList<Integer> respostas = respostasCorretas.getRespostas();
        Collections.shuffle(perguntas);

        int acertos = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + perguntas.get(i));
            System.out.print("Sua resposta: ");
            int respostaUsuario = scanner.nextInt();

            if (respostaUsuario == respostas.get(i)) {
                acertos++;
            }
        }

        return acertos >= 3;
    }
}