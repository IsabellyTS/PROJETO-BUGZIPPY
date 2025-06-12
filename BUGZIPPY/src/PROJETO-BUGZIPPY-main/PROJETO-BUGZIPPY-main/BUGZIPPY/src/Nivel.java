// Nivel.java (no pacote padrão)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class Nivel {
    protected List<Pergunta> perguntasDoNivel;
    protected String nomeNivel;
    protected String explicacaoNivel;
    protected Scanner scanner;
    protected int passosParaDestinoInicial; // Número de perguntas a serem acertadas para passar o nível.
    private static final int NUM_PERGUNTAS_POR_NIVEL = 3; // Constante para o número de perguntas a exibir

    public Nivel(String nomeNivel, int passosParaDestinoInicial, String explicacaoNivel) {
        this.nomeNivel = nomeNivel;
        this.passosParaDestinoInicial = passosParaDestinoInicial;
        this.explicacaoNivel = explicacaoNivel;
        this.perguntasDoNivel = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    protected abstract void carregarPerguntas();

    public boolean jogarNivel(Jogador jogador) {
        System.out.println("\n--- Iniciando " + nomeNivel + " ---");
        System.out.println(explicacaoNivel);
        carregarPerguntas(); // Carrega TODAS as 10 perguntas

        // 1. Embaralha todas as perguntas carregadas
        Collections.shuffle(perguntasDoNivel);

        // 2. Seleciona apenas as primeiras NUM_PERGUNTAS_POR_NIVEL perguntas
        List<Pergunta> perguntasParaJogar = new ArrayList<>();
        for (int i = 0; i < NUM_PERGUNTAS_POR_NIVEL && i < perguntasDoNivel.size(); i++) {
            perguntasParaJogar.add(perguntasDoNivel.get(i));
        }

        int passosRestantes = passosParaDestinoInicial; // O número de acertos necessários para passar o nível

        System.out.println("\nPara avançar, você precisa acertar " + passosParaDestinoInicial + " das " + NUM_PERGUNTAS_POR_NIVEL + " perguntas selecionadas aleatoriamente.");
        System.out.println("🐾 Passos para chegar ao destino: " + passosRestantes);

        // Iterar sobre as perguntas selecionadas
        for (Pergunta pergunta : perguntasParaJogar) {
            boolean acertou = false;
            int tentativasNaPerguntaAtual = 0; // Contador de tentativas para a pergunta atual
            int pontuacaoBasePorAcerto = 10;   // Pontuação base por acerto
            int penalidadePorErro = 5;         // Pontos a serem subtraídos por cada erro

            while (!acertou) { // Loop para repetir a pergunta até acertar
                pergunta.exibir();
                int respostaUsuario;
                try {
                    respostaUsuario = scanner.nextInt();
                    scanner.nextLine(); // Consome a nova linha

                    if (pergunta.verificarResposta(respostaUsuario)) {
                        passosRestantes--;
                        System.out.println("ACERTOU! 🎉\n");

                        // Calcular a pontuação final para esta pergunta
                        int pontosConquistadosNestaPergunta = pontuacaoBasePorAcerto - (tentativasNaPerguntaAtual * penalidadePorErro);
                        if (pontosConquistadosNestaPergunta < 0) {
                            pontosConquistadosNestaPergunta = 0; // Garante que a pontuação não seja negativa para uma única pergunta
                        }

                        System.out.println("Você conquistou " + pontosConquistadosNestaPergunta + " pontos para esta pergunta!");
                        System.out.println("Estou a um passo a menos no meu caminho! \n🐾 Passos para chegar ao destino: " + passosRestantes + "\n");
                        jogador.adicionarPontos(pontosConquistadosNestaPergunta); // Adiciona os pontos calculados
                        acertou = true; // Sai do loop interno
                    } else {
                        tentativasNaPerguntaAtual++; // Incrementa as tentativas apenas se a resposta estiver errada
                        System.out.println("ERROU! ☹\nPor favor, tente novamente a mesma pergunta.");
                        // O loop 'while' continuará, exibindo a pergunta novamente
                    }
                } catch (java.util.InputMismatchException e) {
                    tentativasNaPerguntaAtual++; // Contar entrada inválida como uma tentativa (e erro)
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    scanner.nextLine(); // Consome a entrada inválida para evitar loop infinito
                    // O loop 'while' continuará, exibindo a pergunta novamente
                }
            }

            // Verifica se o nível foi concluído após cada acerto
            if (passosRestantes == 0) {
                System.out.println("Excelente, " + jogador.getNome() + "! Você completou o " + nomeNivel + "!");
                return true; // Nível concluído com sucesso
            }
        }

        // Se o loop de perguntas terminar e ainda houver passos restantes
        // (Isso só aconteceria se 'passosParaDestinoInicial' fosse maior que NUM_PERGUNTAS_POR_NIVEL,
        // ou se NUM_PERGUNTAS_POR_NIVEL fosse 0 por algum erro, o que não é o caso aqui)
        if (passosRestantes > 0) {
            System.out.println("Você não conseguiu ajudar a formiga a chegar ao destino neste nível, faltaram acertos.");
            return false; // Nível não concluído
        }
        return true; // Se chegou aqui, significa que todos os passos foram concluídos.
    }
}