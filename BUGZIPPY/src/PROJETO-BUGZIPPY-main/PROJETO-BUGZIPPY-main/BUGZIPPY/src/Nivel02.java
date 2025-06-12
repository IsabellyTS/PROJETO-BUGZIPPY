
import java.util.Arrays;

public class Nivel02 extends Nivel {

    public Nivel02() {
        super("Nível 02: Condicionais (if/else)", 3,
                "\nExcelente! Agora que estou mais perto de casa, preciso que você me ajude a escolher o caminho certo. \n" +
                        "Em programação, usamos IF e ELSE para tomar decisões. \n" +
                        "Se você acertar 10 perguntas, estarei a um passo de casa!");
    }

    @Override
    protected void carregarPerguntas() {
        perguntasDoNivel.clear();

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 131]",
                "O que faz o if?",
                Arrays.asList(
                        "Ele conta piadas",
                        "Ele decide se algo deve acontecer",
                        "Ele pinta a tela",
                        "Ele cria um jogo"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 131]",
                "Quando usamos o else?",
                Arrays.asList(
                        "Quando o if não acontece",
                        "Quando queremos repetir algo",
                        "Quando criamos uma variável",
                        "Quando desenhamos na tela"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 131]",
                "if (sol == true) { irPraPraia(); } - O que esse código quer dizer?",
                Arrays.asList(
                        "Se estiver chovendo, ir pra praia",
                        "Se houver sol, ir pra praia",
                        "Sempre ir pra praia",
                        "Nunca ir pra praia"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 132]",
                "Qual é o operador para 'igual a' em Java?",
                Arrays.asList(
                        "=",
                        "==",
                        "!=",
                        "<>"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 133]",
                "O que significa 'a != b'?",
                Arrays.asList(
                        "a é igual a b",
                        "a é diferente de b",
                        "a é maior que b",
                        "a é menor que b"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 133]",
                "Qual operador significa 'e' (ambas as condições devem ser verdadeiras)?",
                Arrays.asList(
                        "||",
                        "!",
                        "&&",
                        "+"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 134]",
                "Se você tem 'if (idade > 18 && temCarteira == true)', o que isso significa?",
                Arrays.asList(
                        "Se a idade for maior que 18 ou tiver carteira",
                        "Se a idade for maior que 18 e tiver carteira",
                        "Se a idade for igual a 18 e tiver carteira",
                        "Se a idade for menor que 18 e tiver carteira"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 134]",
                "Qual operador significa 'ou' (uma das condições deve ser verdadeira)?",
                Arrays.asList(
                        "&&",
                        "!",
                        "||",
                        "-"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 135]",
                "if (chovendo || temGuardaChuva) - O que significa essa condição?",
                Arrays.asList(
                        "Se chover E tiver guarda-chuva",
                        "Se chover OU tiver guarda-chuva",
                        "Se não chover",
                        "Se tiver guarda-chuva, mas não chover"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 4 – Página 135]",
                "O que acontece se um if não tiver chaves '{}'?",
                Arrays.asList(
                        "Apenas a primeira linha depois do if é executada condicionalmente",
                        "O programa trava",
                        "Todas as linhas seguintes são executadas condicionalmente",
                        "Dá erro de compilação"
                ),
                1
        ));
    }
}