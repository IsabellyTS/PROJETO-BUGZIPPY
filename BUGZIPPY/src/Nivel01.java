
import java.util.Arrays;

public class Nivel01 extends Nivel {

    public Nivel01() {
        // Nível 01: 10 perguntas e 10 acertos para completar (passosParaDestinoInicial)
        super("Nível 01: Variáveis e Tipos de Dados", 3,
                "\nEu sou uma formiga operária. Fui capturada por aranhas e me perdi do meu formigueiro! \n" +
                        "Elas me desafiam com enigmas de programação para me libertar. \n" +
                        "Você me ajuda a resgatar meus conhecimentos em variáveis e tipos de dados? \n" +
                        "Preciso de 10 acertos para encontrar o caminho de volta!");
    }

    @Override
    protected void carregarPerguntas() {
        perguntasDoNivel.clear(); // Limpa a lista antes de adicionar novas perguntas

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 37]",
                "O que é uma variável?",
                Arrays.asList(
                        "Um lugar para guardar valores, como números e textos",
                        "Um tipo de erro",
                        "Uma função mágica",
                        "Um comando que fecha o programa"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 37-38]",
                "Qual linha cria uma variável inteira com valor 12?",
                Arrays.asList(
                        "int idade = 12;",
                        "idade = int 12;",
                        "String idade = 12;",
                        "double idade = idade;"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 37-38-41-42]",
                "Como somar os valores das variáveis a e b e guardar o resultado?",
                Arrays.asList(
                        "total = a mais b",
                        "String total = a + b",
                        "int total = a + b",
                        "char total = a + b"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 38]",
                "Qual tipo de variável guarda números com casas decimais (tipo 3.14)?",
                Arrays.asList(
                        "int",
                        "String",
                        "boolean",
                        "double"
                ),
                4
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 39]",
                "Para que serve o tipo de variável String?",
                Arrays.asList(
                        "Guardar números",
                        "Guardar textos, palavras e frases",
                        "Fazer contas",
                        "Criar botões"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 40]",
                "Como você guarda o nome \"Bugzippy\" em uma variável String chamada 'nome'?",
                Arrays.asList(
                        "String nome = \"Bugippy\";",
                        "nome = 'Bugippy';",
                        "text nome = Bugippy;",
                        "String = Bugippy nome;"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 40]",
                "Qual dessas variáveis guarda 'verdadeiro' ou 'falso'?",
                Arrays.asList(
                        "String",
                        "char",
                        "double",
                        "boolean"
                ),
                4
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 40]",
                "Como você cria uma variável booleana chamada 'estaChovendo' e diz que é 'verdadeiro'?",
                Arrays.asList(
                        "estaChovendo = true;",
                        "boolean estaChovendo = true;",
                        "bool estaChovendo = verdadeiro;",
                        "boolean estaChovendo = \"true\";"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 41]",
                "O que o comando System.out.println(\"Olá\"); faz?",
                Arrays.asList(
                        "Ele apaga a mensagem",
                        "Ele cria uma nova tela",
                        "Ele mostra a mensagem \"Olá\" na tela",
                        "Ele salva a mensagem em um arquivo"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 2 – Página 43]",
                "Como você mostra o valor de uma variável 'pontos' na tela?",
                Arrays.asList(
                        "Mostrar(pontos);",
                        "print pontos;",
                        "System.out.println(pontos);",
                        "exibir pontos;"
                ),
                3
        ));
    }
}