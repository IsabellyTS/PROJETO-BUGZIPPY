// Jogador.java (no pacote padrão)

public class Jogador {
    private String nome;
    private String email; // Mantido, mesmo que não usado diretamente
    private int pontuacao;
    private int nivelAtual;

    public Jogador(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pontuacao = 0;
        this.nivelAtual = 1;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getPontuacao() { return pontuacao; }
    public void adicionarPontos(int pontos) { this.pontuacao += pontos; }
    public int getNivelAtual() { return nivelAtual; }
    public void avancarNivel() { this.nivelAtual++; }
    public void resetarNivel() { this.nivelAtual = 1; }
}