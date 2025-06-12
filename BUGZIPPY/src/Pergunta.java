
import java.util.List;

public class Pergunta {
    private String texto;
    private List<String> opcoes;
    private int respostaCorreta; // Índice da opção correta (1-baseado, como nas suas perguntas)
    private String capituloPagina; // Para armazenar "[Capítulo 2 – Página 37]"

    public Pergunta(String capituloPagina, String texto, List<String> opcoes, int respostaCorreta) {
        this.capituloPagina = capituloPagina;
        this.texto = texto;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }

    public void exibir() {
        System.out.println("\n" + capituloPagina);
        System.out.println(texto);
        for (int i = 0; i < opcoes.size(); i++) {
            System.out.println((i + 1) + ") " + opcoes.get(i));
        }
        System.out.print("Sua resposta: ");
    }

    public boolean verificarResposta(int respostaUsuario) {
        return respostaUsuario == respostaCorreta;
    }

    // Getters se necessário
    public String getCapituloPagina() {
        return capituloPagina;
    }

    public String getTexto() {
        return texto;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }
}