import java.util.Scanner;

    public class Explicacao {

    private void ExplicacaoN1 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 01 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                ">> O que é Programação?\n" +
                        "[Capítulo 1 – Página 25]\n\n" +
                        "Programação é quando damos instruções bem certinhas para o computador seguir.\n" +
                        "Essas instruções dizem exatamente o que ele deve fazer: mostrar uma mensagem,\n" +
                        "somar números, tocar um som ou até criar um jogo!\n" +
                        "Quem escreve essas instruções é chamado de programador.\n" +
                        "Com a programação, ensinamos o computador a pensar do nosso jeito!\n\n" +

                        "-------------------------------------------------------------\n\n" +

                        ">> O que é Java?\n" +
                        "[Capítulo 1 – Página 27]\n\n" +
                        "Java é uma linguagem de programação, ou seja, uma forma de conversar com o computador.\n" +
                        "Ela é usada no mundo todo porque funciona em vários tipos de computadores.\n" +
                        "Frase famosa: \"Escreva uma vez e execute em qualquer lugar\".\n" +
                        "Isso quer dizer que um programa em Java pode rodar em muitos lugares sem mudar nada.\n\n" +

                        "-------------------------------------------------------------\n\n" +

                        ">> O que são Variáveis?\n" +
                        "[Capítulo 2 – Página 37]\n\n" +
                        "Variáveis são como caixinhas que guardam informações.\n" +
                        "Por exemplo, podemos ter uma variável chamada idade que guarda o número 12,\n" +
                        "ou uma chamada nome que guarda o texto \"Maria\".\n\n" +

                        "Exemplo:\n" +
                        "int idade = 12;\n" +
                        "String nome = \"Maria\";\n\n" +

                        "-------------------------------------------------------------\n\n" +
                        ">> Tipos de variáveis\n" +
                        "[Capítulo 2 – Página 37-38]\n\n" +
                        "int     - guarda números inteiros (ex: 5, 10, 99)\n" +
                        "double  - guarda números com vírgula (ex: 3.14, 8.5)\n" +
                        "char    - guarda um caractere, como 'A' ou '7'\n" +
                        "boolean - guarda true ou false (verdadeiro ou falso)\n" +
                        "String  - guarda palavras ou frases como \"Olá\"\n" +
                        "float   - também guarda números com vírgula (menos preciso que double)\n\n" +

                        "-------------------------------------------------------------\n\n" +
                        ">> Regras de Nomes para Variáveis\n" +
                        "[Capítulo 2 – Página 36]\n\n" +
                        "1. Deve começar com letra (ex: idade, nomeAluno)\n" +
                        "2. Pode usar números, mas não no começo (ex: nota1, não 1nota)\n" +
                        "3. Pode usar _ (underline) ou $ (mas evite se puder)\n" +
                        "4. Não pode ter espaços (ex: nome do aluno <-ERRADO, nomeDoAluno <-CERTO)\n" +
                        "5. Não pode usar símbolos especiais como @, #, %, etc.\n" +
                        "6. Não pode usar palavras reservadas do Java (como int, for, class, etc.)\n\n" +

                        "-------------------------------------------------------------\n\n" +
                        ">> O que são Fórmulas?\n" +
                        "[Capítulo 2 – Página 41-42]\n\n" +
                        "Fórmulas são operações que usamos para calcular algum valor usando variáveis.\n" +
                        "É como fazer contas com números que estão guardados nas caixinhas (variáveis).\n\n" +
                        "\"Operador\\t     O que faz\\t           Exemplo (a = 6, b = 3)\n"+
                        "   +              Soma                       a + b = 9 +\n" +
                        "   -              Subtração                  a - b = 3 +\n" +
                        "   *              Multiplicação              a * b = 18+\n" +
                        "   /              Divisão                    a / b = 2\n" +
                        "   %              Resto da divisão           a % b = 0\n");
        System.out.print("clique ENTER se voce entendeu");
        sc.nextLine();
        System.out.println("");
    }
}
