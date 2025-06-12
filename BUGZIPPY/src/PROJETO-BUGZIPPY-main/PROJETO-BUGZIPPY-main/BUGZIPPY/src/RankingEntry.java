// RankingEntry.java (no pacote padrão)

public class RankingEntry implements Comparable<RankingEntry> {
    private String nome;
    private int pontuacao;

    public RankingEntry(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    // Método para facilitar a escrita no arquivo
    @Override
    public String toString() {
        return nome + "," + pontuacao; // Formato "Nome,Pontuacao"
    }

    // Implementa Comparable para permitir a ordenação por pontuação (maior para menor)
    @Override
    public int compareTo(RankingEntry other) {
        // Ordenar por pontuação em ordem decrescente
        return Integer.compare(other.pontuacao, this.pontuacao);
    }
}