import java.util.ArrayList;

public class Explicacao {
    private ArrayList<String> explicacoes = new ArrayList<>();

    public void inicializarExplicacoes(int nivel) {
        explicacoes.clear();

        if (nivel == 1) {
            explicacoes.add("\">> O que é Programação?\\n\" +\n" +
                    "                        \"[Capítulo 1 – Página 25]\\n\\n\" +\n" +
                    "                        \"Programação é quando damos instruções bem certinhas para o computador seguir.\\n\" +\n" +
                    "                        \"Essas instruções dizem exatamente o que ele deve fazer: mostrar uma mensagem,\\n\" +\n" +
                    "                        \"somar números, tocar um som ou até criar um jogo!\\n\" +\n" +
                    "                        \"Quem escreve essas instruções é chamado de programador.\\n\" +\n" +
                    "                        \"Com a programação, ensinamos o computador a pensar do nosso jeito!\\n\\n\" +\n" +
                    "\n" +
                    "                        \"-------------------------------------------------------------\\n\\n\" +\n" +
                    "\n" +
                    "                        \">> O que é Java?\\n\" +\n" +
                    "                        \"[Capítulo 1 – Página 27]\\n\\n\" +\n" +
                    "                        \"Java é uma linguagem de programação, ou seja, uma forma de conversar com o computador.\\n\" +\n" +
                    "                        \"Ela é usada no mundo todo porque funciona em vários tipos de computadores.\\n\" +\n" +
                    "                        \"Frase famosa: \\\"Escreva uma vez e execute em qualquer lugar\\\".\\n\" +\n" +
                    "                        \"Isso quer dizer que um programa em Java pode rodar em muitos lugares sem mudar nada.\\n\\n\" +\n" +
                    "\n" +
                    "                        \"-------------------------------------------------------------\\n\\n\" +\n" +
                    "\n" +
                    "                        \">> O que são Variáveis?\\n\" +\n" +
                    "                        \"[Capítulo 2 – Página 37]\\n\\n\" +\n" +
                    "                        \"Variáveis são como caixinhas que guardam informações.\\n\" +\n" +
                    "                        \"Por exemplo, podemos ter uma variável chamada idade que guarda o número 12,\\n\" +\n" +
                    "                        \"ou uma chamada nome que guarda o texto \\\"Maria\\\".\\n\\n\" +\n" +
                    "\n" +
                    "                        \"Exemplo:\\n\" +\n" +
                    "                        \"int idade = 12;\\n\" +\n" +
                    "                        \"String nome = \\\"Maria\\\";\\n\\n\" +\n" +
                    "\n" +
                    "                        \"-------------------------------------------------------------\\n\\n\" +\n" +
                    "                        \">> Tipos de variáveis\\n\" +\n" +
                    "                        \"[Capítulo 2 – Página 37-38]\\n\\n\" +\n" +
                    "                        \"int     - guarda números inteiros (ex: 5, 10, 99)\\n\" +\n" +
                    "                        \"double  - guarda números com vírgula (ex: 3.14, 8.5)\\n\" +\n" +
                    "                        \"char    - guarda um caractere, como 'A' ou '7'\\n\" +\n" +
                    "                        \"boolean - guarda true ou false (verdadeiro ou falso)\\n\" +\n" +
                    "                        \"String  - guarda palavras ou frases como \\\"Olá\\\"\\n\" +\n" +
                    "                        \"float   - também guarda números com vírgula (menos preciso que double)\\n\\n\" +\n" +
                    "\n" +
                    "                        \"-------------------------------------------------------------\\n\\n\" +\n" +
                    "                        \">> Regras de Nomes para Variáveis\\n\" +\n" +
                    "                        \"[Capítulo 2 – Página 36]\\n\\n\" +\n" +
                    "                        \"1. Deve começar com letra (ex: idade, nomeAluno)\\n\" +\n" +
                    "                        \"2. Pode usar números, mas não no começo (ex: nota1, não 1nota)\\n\" +\n" +
                    "                        \"3. Pode usar _ (underline) ou $ (mas evite se puder)\\n\" +\n" +
                    "                        \"4. Não pode ter espaços (ex: nome do aluno <-ERRADO, nomeDoAluno <-CERTO)\\n\" +\n" +
                    "                        \"5. Não pode usar símbolos especiais como @, #, %, etc.\\n\" +\n" +
                    "                        \"6. Não pode usar palavras reservadas do Java (como int, for, class, etc.)\\n\\n\" +\n" +
                    "\n" +
                    "                        \"-------------------------------------------------------------\\n\\n\" +\n" +
                    "                        \">> O que são Fórmulas?\\n\" +\n" +
                    "                        \"[Capítulo 2 – Página 41-42]\\n\\n\" +\n" +
                    "                        \"Fórmulas são operações que usamos para calcular algum valor usando variáveis.\\n\" +\n" +
                    "                        \"É como fazer contas com números que estão guardados nas caixinhas (variáveis).\\n\\n\" +\n" +
                    "                        \"\\\"Operador\\\\t     O que faz\\\\t           Exemplo (a = 6, b = 3)\\n\"+\n" +
                    "                        \"   +              Soma                       a + b = 9 +\\n\" +\n" +
                    "                        \"   -              Subtração                  a - b = 3 +\\n\" +\n" +
                    "                        \"   *              Multiplicação              a * b = 18+\\n\" +\n" +
                    "                        \"   /              Divisão                    a / b = 2\\n\" +\n" +
                    "                        \"   %              Resto da divisão           a % b = 0\\n\");");

        } else if (nivel == 2) {
            explicacoes.add(">> O que é o if e o else?\\n\" +\n" +
                    "                \"[Capítulo 4 – Página 131]\\n\\n\" +\n" +
                    "                \"O if é uma palavra usada para verificar se algo é verdadeiro.\\n\" +\n" +
                    "                \"Se for, o computador executa um bloco de código.\\n\" +\n" +
                    "                \"Se não for, podemos usar o else para fazer outra coisa.\\n\" +\n" +
                    "                \"É como perguntar:\\n\" +\n" +
                    "                \"\\\"Se estiver chovendo, levo guarda-chuva. Senão, vou sem ele.\\\"\\n\\n\" +\n" +
                    "                \"Em Java, isso fica assim:\\n\" +\n" +
                    "                \"if (chovendo) {\\n\" +\n" +
                    "                \"    System.out.println(\\\"Leve o guarda-chuva.\\\");\\n\" +\n" +
                    "                \"} else {\\n\" +\n" +
                    "                \"    System.out.println(\\\"Pode sair sem guarda-chuva.\\\");\\n\" +\n" +
                    "                \"}\\n\" +\n" +
                    "\n" +
                    "                \"-------------------------------------------------------------\\n\\n\" +\n" +
                    "\n" +
                    "                \">> O que são Operadores Lógicos?\\n\" +\n" +
                    "                \"[Capítulo 4 – Página 132]\\n\\n\" +\n" +
                    "                \"Operadores lógicos ajudam a fazer perguntas mais completas no if.\\n\" +\n" +
                    "                \"ºVeja os principais:\\n\" +\n" +
                    "                \"&& quer dizer E\\n\" +\n" +
                    "                \"A condição só é verdadeira se as duas partes forem verdadeiras.\\n\" +\n" +
                    "                \"-Exemplo: \\\"Se estiver chovendo e for segunda-feira...\\\"\\n\\n\" +\n" +
                    "                \"|| quer dizer OU\\n\" +\n" +
                    "                \"A condição é verdadeira se pelo menos uma das partes for verdadeira.\\n\" +\n" +
                    "                \"-Exemplo: \\\"Se estiver chovendo ou nevando...\\\"\\n\\n\" +\n" +
                    "                \"! quer dizer NÃO\\n\" +\n" +
                    "                \"Ele inverte a condição. Se era verdadeiro, vira falso.\\n\" +\n" +
                    "                \"-Exemplo: \\\"!chovendo\\\" significa \\\"não está chovendo\\\".");

        } else if (nivel == 3) {
            explicacoes.add("Imagine que você tem um controle remoto com vários botões.\\n Cada botão faz uma coisa diferente: um liga a TV, outro muda o canal, outro aumenta o volume...\" +\n" +
                    "                \"O switch case no Java funciona como esse controle remoto!\\nVocê diz: 'Se eu apertar o botão 1, faça isso. Se for o botão 2, faça aquilo.'\"+\n" +
                    "                \"É como dar comandos diferentes para cada número!\"+\n" +
                    "                \"\\nVeja um exemplo:\"+ \n" +
                    "                \"\\nint botão = 2;\"+\n" +
                    "                        \"\\nswitch (botão) {\" +\n" +
                    "                        \"\\n    case 1:\" +\n" +
                    "                        \"\\n        System.out.println(\\\"Ligando a TV!\\\");\"+\n" +
                    "                        \"\\n        break;\"+\n" +
                    "                        \"\\n    case 2:\"+\n" +
                    "                        \"\\n       Mudando de canal!\\\");\"+\n" +
                    "                        \"\\n       break;\"+\n" +
                    "                        \"\\n    case 3:\"+\n" +
                    "                        \"\\n        System.out.println(\\\"Aumentando o volume!\\\");\"+\n" +
                    "                        \"\\n        break;\"+\n" +
                    "                        \"\\n    default:\"+\n" +
                    "                        \"\\n        System.out.println(\\\"Botão desconhecido!\\\");\"+\n" +
                    "                        \"\\n}\"+\n" +
                    "                        \"\\nO 'case' é cada botão diferente que você pode apertar.\"+\n" +
                    "                        \"\\nO 'break' é como dizer: 'pronto, parei por aqui'. Ele evita que o código continue executando os próximos botões.\"+\n" +
                    "                        \"\\nE o 'default' é o que acontece se apertarmos um botão que não existe! \"+\n" +
                    "                        \"\\nCom o switch case, seu programa pode escolher o que fazer com base em um número, uma letra ou até uma palavra!");
        }
    }

    public ArrayList<String> getExplicacoes() {
        return explicacoes;
    }
}
