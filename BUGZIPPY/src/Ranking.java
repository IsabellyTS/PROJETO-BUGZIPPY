// Ranking.java (no pacote padrão)

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ranking {
    private static final String NOME_ARQUIVO_RANKING = "ranking.txt";

    public void limparRanking() {
        File arquivo = new File(NOME_ARQUIVO_RANKING);
        if (arquivo.exists()) {
            if (arquivo.delete()) {
                System.out.println("\nRanking limpo com sucesso! O arquivo '" + NOME_ARQUIVO_RANKING + "' foi removido.");
            } else {
                System.err.println("\nErro: Não foi possível limpar o ranking. Verifique as permissões do arquivo.");
            }
        } else {
            System.out.println("\nNão há ranking para limpar. O arquivo '" + NOME_ARQUIVO_RANKING + "' não existe.");
        }
    }

    // Classe interna para representar uma entrada no ranking (nome e pontuação)
    private static class EntradaRanking implements Comparable<EntradaRanking> {
        String nome;
        int pontuacao;

        public EntradaRanking(String nome, int pontuacao) {
            this.nome = nome;
            this.pontuacao = pontuacao;
        }

        @Override
        public String toString() {
            return nome + " - " + pontuacao + " pontos";
        }

        // Para ordenar do maior para o menor (descrescente)
        @Override
        public int compareTo(EntradaRanking outra) {
            return Integer.compare(outra.pontuacao, this.pontuacao); // Ordem decrescente de pontuação
        }
    }

    /**
     * Adiciona uma nova entrada ao ranking.
     * @param nome O nome do jogador.
     * @param pontuacao A pontuação do jogador.
     */
    public void adicionarPontuacao(String nome, int pontuacao) {
        // Primeiro, lê o ranking existente
        List<EntradaRanking> rankingAtual = carregarRanking();

        // Adiciona a nova pontuação
        rankingAtual.add(new EntradaRanking(nome, pontuacao));

        // Salva o ranking atualizado
        salvarRanking(rankingAtual);
    }

    /**
     * Carrega o ranking do arquivo.
     * @return Uma lista de EntradaRanking.
     */
    private List<EntradaRanking> carregarRanking() {
        List<EntradaRanking> ranking = new ArrayList<>();
        File arquivo = new File(NOME_ARQUIVO_RANKING);

        // Cria o arquivo se ele não existir
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                System.err.println("Erro ao criar o arquivo de ranking: " + e.getMessage());
            }
            return ranking; // Retorna lista vazia se o arquivo acabou de ser criado
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO_RANKING))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(" - "); // Divide a linha pelo " - "
                if (partes.length == 2) {
                    try {
                        String nome = partes[0].trim();
                        int pontuacao = Integer.parseInt(partes[1].trim().replace(" pontos", ""));
                        ranking.add(new EntradaRanking(nome, pontuacao));
                    } catch (NumberFormatException e) {
                        System.err.println("Erro de formato na linha do ranking (pontuação inválida): " + linha);
                    }
                } else {
                    System.err.println("Erro de formato na linha do ranking (linha inesperada): " + linha);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de ranking: " + e.getMessage());
        }
        return ranking;
    }

    /**
     * Salva a lista de ranking no arquivo, sobrescrevendo o conteúdo anterior.
     * @param ranking A lista de EntradaRanking a ser salva.
     */
    private void salvarRanking(List<EntradaRanking> ranking) {
        // Ordena o ranking antes de salvar para garantir que os top scores estejam no topo
        Collections.sort(ranking);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO_RANKING))) {
            for (EntradaRanking entrada : ranking) {
                writer.write(entrada.nome + " - " + entrada.pontuacao + " pontos");
                writer.newLine(); // Adiciona uma nova linha
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo de ranking: " + e.getMessage());
        }
    }

    /**
     * Exibe o ranking na tela.
     */
    public void exibirRanking() {
        List<EntradaRanking> ranking = carregarRanking();
        Collections.sort(ranking); // Garante que esteja ordenado (já deve estar, mas para segurança)

        System.out.println("\n--- RANKING DOS MAIORES PROGRAMADORES ---");
        if (ranking.isEmpty()) {
            System.out.println("Nenhum registro no ranking ainda. Jogue para aparecer aqui!");
        } else {
            // Exibir apenas os top 10 (ou menos, se não houver 10)
            int limite = Math.min(ranking.size(), 10);
            for (int i = 0; i < limite; i++) {
                System.out.println((i + 1) + "º " + ranking.get(i).nome + " - " + ranking.get(i).pontuacao + " pontos");
            }
        }
        System.out.println("------------------------------------------");
    }
}