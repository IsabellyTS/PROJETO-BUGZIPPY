
import java.util.Arrays;

public class Nivel01 extends Nivel {

    public Nivel01() {
        // Nível 01: 10 perguntas e 10 acertos para completar (passosParaDestinoInicial)
        super("Nível 01: Variáveis e Tipos de Dados", 3,
                ">> O que é Programação?\n[Capítulo 1 – Página 25]" +
                        "\nnProgramação é quando damos instruções bem certinhas para o computador seguir.\nEssas instruções dizem exatamente o que ele deve fazer: mostrar uma mensagem,\n" +
                        "somar números, tocar um som ou até criar um jogo!\nQuem escreve essas instruções é chamado de programador.\nCom a programação, ensinamos o computador a pensar do nosso jeito!" +
                        "\n\n-------------------------------------------------------------\n\n>> O que é Java?\n[Capítulo 1 – Página 27]\n" +
                        "Java é uma linguagem de programação, ou seja, uma forma de conversar com o computador.\nEla é usada no mundo todo porque funciona em vários tipos de computadores." +
                        "\nFrase famosa: \"Escreva uma vez e execute em qualquer lugar\".\nIsso quer dizer que um programa em Java pode rodar em muitos lugares sem mudar nada." +
                        "\n\n-------------------------------------------------------------\n\n>> O que são Variáveis?\n[Capítulo 2 – Página 37]" +
                        "\nVariáveis são como caixinhas que guardam informações.\nPor exemplo, podemos ter uma variável chamada idade que guarda o número 12," +
                        "\nou uma chamada nome que guarda o texto \"Maria\".\n\nExemplo:\nint idade = 12;\nString nome = ''Maria'';" +
                        "\n\n-------------------------------------------------------------\n\n>> Tipos de variáveis\n[Capítulo 2 – Página 37-38]\n\n" +
                        "int     - guarda números inteiros (ex: 5, 10, 99)\ndouble  - guarda números com vírgula (ex: 3.14, 8.5)\nchar    - guarda um caractere, como 'A' ou '7'\n" +
                        "boolean - guarda true ou false (verdadeiro ou falso)\nString  - guarda palavras ou frases como \"Olá\"\nfloat   - também guarda números com vírgula (menos preciso que double)" +
                        "\n\n-------------------------------------------------------------\n\n>> Regras de Nomes para Variáveis\\n[Capítulo 2 – Página 36]\n\n" +
                        "1. Deve começar com letra (ex: idade, nomeAluno)\n2. Pode usar números, mas não no começo (ex: nota1, não 1nota)\n3. Pode usar _ (underline) ou $ (mas evite se puder)\n" +
                        "4. Não pode ter espaços (ex: nome do aluno <-ERRADO, nomeDoAluno <-CERTO)\n5. Não pode usar símbolos especiais como @, #, %, etc.\n6. Não pode usar palavras reservadas do Java (como int, for, class, etc.)" +
                        "\n\n-------------------------------------------------------------\n\n>> O que são Fórmulas?\n[Capítulo 2 – Página 41-42]\n\n" +
                        "Fórmulas são operações que usamos para calcular algum valor usando variáveis.\nÉ como fazer contas com números que estão guardados nas caixinhas (variáveis).\n\n" +
                        "Operador\t     O que faz\t           Exemplo (a = 6, b = 3)\n   +              Soma                       a + b = 9 +\n   -              Subtração                  a - b = 3 +" +
                        "\n   *              Multiplicação              a * b = 18+\n   /              Divisão                    a / b = 2\n   %              Resto da divisão           a % b = 0\n");
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