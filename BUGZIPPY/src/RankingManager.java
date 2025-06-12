// RankingManager.java (no pacote padrão)

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankingManager {
    private static final String RANKING_FILE = "ranking.txt"; // Nome do arquivo de ranking
    private static final int MAX_RANKING_ENTRIES = 10; // Limite de entradas no ranking

    public void adicionarPontuacao(String nome, int pontuacao) {
        List<RankingEntry> ranking = carregarRanking();
        ranking.add(new RankingEntry(nome, pontuacao));
        Collections.sort(ranking); // Ordena o ranking

        // Mantém apenas as N melhores pontuações
        if (ranking.size() > MAX_RANKING_ENTRIES) {
            ranking = ranking.subList(0, MAX_RANKING_ENTRIES);
        }

        salvarRanking(ranking);
    }

    public List<RankingEntry> carregarRanking() {
        List<RankingEntry> ranking = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RANKING_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    try {
                        String nome = parts[0];
                        int pontuacao = Integer.parseInt(parts[1]);
                        ranking.add(new RankingEntry(nome, pontuacao));
                    } catch (NumberFormatException e) {
                        System.err.println("Erro ao parsear pontuação no ranking: " + parts[1]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            // O arquivo ainda não existe, o que é normal na primeira execução.
            // Não fazemos nada, o ranking começa vazio.
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de ranking: " + e.getMessage());
        }
        return ranking;
    }

    private void salvarRanking(List<RankingEntry> ranking) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RANKING_FILE))) {
            for (RankingEntry entry : ranking) {
                writer.write(entry.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo de ranking: " + e.getMessage());
        }
    }

    public void exibirRanking() {
        List<RankingEntry> ranking = carregarRanking();
        if (ranking.isEmpty()) {
            System.out.println("\n--- Ranking (Top " + MAX_RANKING_ENTRIES + ") ---");
            System.out.println("Nenhum registro no ranking ainda. Jogue para registrar sua pontuação!");
        } else {
            System.out.println("\n--- Ranking (Top " + MAX_RANKING_ENTRIES + ") ---");
            System.out.println("Pos. | Nome           | Pontuação");
            System.out.println("---------------------------------");
            for (int i = 0; i < ranking.size(); i++) {
                RankingEntry entry = ranking.get(i);
                System.out.printf("%-4d | %-14s | %d%n", (i + 1), entry.getNome(), entry.getPontuacao());
            }
        }
        System.out.println("---------------------------------\n");
    }
}