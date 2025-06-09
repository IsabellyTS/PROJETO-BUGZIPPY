package bgzp;
import java.util.ArrayList;

public class Perguntas {
    private ArrayList<String> perguntas = new ArrayList<>();

    public void inicializarPerguntas(int nivel) {
        perguntas.clear();

        if (nivel == 1) {
            perguntas.add("\n[Capítulo 2] O que é uma variável?\n 1) Botão secreto\n 2) Guardar valores\n 3) Erro\n");
            perguntas.add("Qual linha cria uma variável inteira com valor 12?\n 1) int idade = 12;\n 2) idade = int 12;\n");
            perguntas.add("Como somar os valores das variáveis a e b?\n 1) total = a + b\n 2) int total = a + b\n");
        } else if (nivel == 2) {
            perguntas.add("[Capítulo 4] O que faz o 'if'?\n 1) Conta piadas\n 2) Decide se algo acontece\n 3) Pinta a tela\n");
            perguntas.add("Quando usamos o 'else'?\n 1) Quando o 'if' não acontece\n 2) Quando repetimos algo\n");
            perguntas.add("if (sol == true) { irPraPraia(); } - O que esse código quer dizer?\n 1) Se estiver chovendo, ir pra praia\n 2) Só ir pra praia se tiver sol\n");
        } else if (nivel == 3) {
            perguntas.add("[Capítulo 4] Qual operador lógico representa 'OU'?\n 1) &&\n 2) ||\n 3) !\n");
            perguntas.add("O que significa o operador '!'\n 1) Soma números\n 2) Nega uma condição\n");
            perguntas.add("Qual fórmula representa 'Está chovendo e tem vento'? \n 1) Chovendo && vento\n 2) Chovendo || vento\n");
        }
    }

    public ArrayList<String> getPerguntas() {
        return perguntas;
    }
    public void iniciarPerguntas() {
        Perguntas perguntas = new Perguntas();
        perguntas.inicializarPerguntas(1); // Inicializa antes de chamar getPerguntas()
        ArrayList<String> listaPerguntas = perguntas.getPerguntas();
}
    }
/*public class Perguntas {

    private String p1, p2, p3,p4, p5, p6, p7, p8, p9, p10;

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public String getP3() {
        return p3;
    }

    public String getP4() {
        return p4;
    }

    public String getP5() {
        return p5;
    }

    public String getP6() {
        return p6;
    }

    public String getP7() {
        return p7;
    }

    public String getP8() {
        return p8;
    }

    public String getP9() {
        return p9;
    }

    public String getP10() {
        return p10;
    }

    protected void perguntasN1(){

         p1 = "\n[Capítulo 2 – Página 37]\nO que é uma variável?\n" +
                " 1) Um botão secreto no teclado\n" +
                " 2) Um lugar para guardar valores, como números e textos\n" +
                " 3) Um tipo de erro\n" +
                " 4) Uma função mágica\n" ;

        p2 = "\n[Capítulo 2 – Página 37-38]\nQual linha cria uma variável inteira com valor 12?\n" +
                " 1) int idade = 12;\n" +
                " 2) idade = int 12;\n" +
                " 3) idade := 12;\n" +
                " 4) String idade = 12;\n" ;

        String p3 =  "\n[Capítulo 2 – Página 37-38-41-42]\nComo somar os valores das variáveis a e b e guardar o resultado?\n" +
                " 1) total = a mais b\n" +
                " 2) String total = a + b\n" +
                " 3) int total = a + b\n" +
                " 4) char total = a + b\n";

        String p4 = "\n[Capítulo 2 – Página 37]\nO tipo boolean guarda que tipo de informação?\n" +
                " 1) Números inteiros\n" +
                " 2) Letras\n" +
                " 3) Palavras longas\n" +
                " 4) Verdadeiro ou falso\n" ;

        String p5 = "\n[Capítulo 2 – Página 41-42]\nSe eu tenho 10 balas e como 3, qual é a fórmula para saber quantas sobraram?\n" +
                " 1) int sobrou = 10 + 3\n" +
                " 2) int sobrou = 10 * 3\n" +
                " 3) int sobrou = 10 - 3\n" +
                " 4) int sobrou = 10 / 3\n";

        String p6 = "\n[Capítulo 2 – Página 37-38]\nQual dessas é uma forma correta de criar uma variável?\n" +
                " 1) 12 idade = int;\n" +
                " 2) idade: int = 12;\n" +
                " 3) var idade = 12;\n" +
                " 4) int idade = 12;\n" ;

        String p7 = "\n[Capítulo 2 – Página 41-42]\nComo juntar os valores 5 e 3 para fazer uma subtração?\n" +
                " 1) int resultado = 5 - 3\n" +
                " 2) int resultado = 5 + 3\n" +
                " 3) int resultado = 5 * 3\n" +
                " 4) int resultado = 5 / 3\n";

        String p8 =  "\n[Capítulo 2 – Página 37]\nPara que serve uma variável além de guardar valores?\n" +
                " 1) Só para escrever o nome do jogador\n" +
                " 2) Para decorar o código\n" +
                " 3) Para guardar imagens\n" +
                " 4) Para usar em contas e decisões\n";

        String p9 =  "\n[Capítulo 2 – Página 37]\nO que significa a palavra int em Java?\n" +
                " 1) Iniciar um programa\n" +
                " 2) Mostrar uma mensagem\n" +
                " 3) Guardar um número inteiro\n" +
                " 4) Criar uma nova janela\n" ;

        String p10 =  "\n[Capítulo 2 – Página 36]\nQual nome é válido para uma variável?\n" +
                " 1) 1nome\n" +
                " 2) meu nome\n" +
                " 3) nome_do_usuario\n" +
                " 4) nome-do-usuário\n" ;
         Sorteador sorteador = new Sorteador();
         sorteador.sorteadorN1();
    }

     public void perguntasN2(){
     String p1 = "\n[Capítulo 4 – Página 131]\n" +
                "O que faz o if?\n" +
                " 1) Ele conta piadas\n" +
                " 2) Ele decide se algo deve acontecer \n" +
                " 3) Ele pinta a tela\n" +
                " 4) Ele cria um jogo\n";

        String p2 = "\n[Capítulo 4 – Página 131]\n" +
                "Quando usamos o else?\n" +
                " 1) Quando o if não acontece \n" +
                " 2) Quando queremos repetir algo\n" +
                " 3) Quando criamos uma variável\n" +
                " 4) Quando desenhamos na tela\n";

        String p3 = "\n[Capítulo 4 – Página 131]\n" +
                "if (sol == true) { irPraPraia(); } - O que esse código quer dizer?\n" +
                " 1) Se estiver chovendo, ir pra praia\n" +
                " 2) Sempre ir pra praia\n" +
                " 3) Dormir na praia\n" +
                " 4) Só ir pra praia se tiver sol \n";

        String p4 = "\n[Capítulo 4 – Página 132]\n" +
                "O que significa o símbolo || ?\n" +
                " 1) E\n" +
                " 2) Ou \n" +
                " 3) Não\n" +
                " 4) Igual\n";

        String p5 = "\n[Capítulo 4 – Página 132]\n" +
                "O que significa o símbolo && ?\n" +
                " 1) Ou\n" +
                " 2) Se não\n" +
                " 3) E \n" +
                " 4) Multiplica\n";

        String p6 = "\n[Capítulo 4 – Página 131]\n" +
                "O que essa parte faz: if (idade >= 12)?\n" +
                " 1) Vê se a idade é menor que 12\n" +
                " 2) Vê se a idade é 12 ou mais \n" +
                " 3) Multiplica a idade\n" +
                " 4) Cria a idade\n";

        String p7 = "\n[Capítulo 4 – Página 132]\n" +
                "O que faz o operador '!' ?\n" +
                " 1) Soma números\n" +
                " 2) Compara dois textos\n" +
                " 3) Nega uma condição \n" +
                " 4) Transforma número em texto\n";

        String p8 =  "\n[Capítulo 4 – Página 132]\n" +
                "Para que servem os operadores lógicos?\n" +
                " 1) Ajudar o programa a tomar decisões\n" +
                " 2) Repetir códigos em laços\n" +
                " 3) Criar textos coloridos\n" +
                " 4) Mudar a cor da tela\n";

        String p9 =  "\n[Capítulo 4 – Página 132]\n" +
                "Qual destas opções de operadores lógicos serve para 'Está chovendo e tem vento!'\n" +
                " 1) Chovendo && vento\n" +
                " 2) Chovendo || vento\n" +
                " 3) Chovendo + vento \n" +
                " 4) Chovendo E vento\n";
        
        String p10 =  "\n[Capítulo 4 – Página 132]\n" +
                "Qual destas frases corresponde a frase: Hoje eu NÃO vou para a aula.\n" +
                " 1) Hoje eu ! vou para a aula.\n" +
                " 2) Hoje eu && vou para a aula.\n" +
                " 3) Hoje eu || vou para a aula.\n" +
                " 4) Hoje eu + vou para a aula.\n" ;
     }

    public void perguntasN3(){
       String p1 = "\n[Capítulo 5, pág. 172]\n" +
               "O que o comando switch faz no Java? Escolha a melhor explicação:\n" +
               "Imagine que você tem várias opções e precisa escolher apenas uma, como em um cardápio. O switch ajuda o computador a escolher o que fazer com base em um valor.\n" +
               "1) Repete um bloco de código várias vezes\n" +
               "2) Compara uma variável com vários valores possíveis\n" +
               "3) Cria um novo método no programa\n" +
               "4) Serve para fazer contas de matemática\n" +
               "5) Mostra mensagens na tela\n" +
               "6) Deixa o programa mais lento\n" +
               "escreva: ";
       String p2 = "\n[Capítulo 5, pág. 173]\n" +
               "Para que serve o comando break dentro de um switch?\n" +
               "1) Para fazer uma pausa no teclado\n" +
               "2) Para encerrar o programa inteiro\n" +
               "3) Para sair do switch depois que a opção correta foi encontrada\n" +
               "4) Para repetir o mesmo código várias vezes\n" +
               "5) Para pular para o próximo case\n" +
               "6) Para escrever uma nova variável\n" +
               "escreva: ";
       String p3 = "\n[Capítulo 5, pág. 173]\n" +
               "O que acontece se esquecermos o break dentro do switch?\n" +
               "1) Ele para automaticamente\n" +
               "2) Mostra um erro na tela\n" +
               "3) Executa os cases abaixo\n" +
               "4) Ignora o switch completamente\n" +
               "5) Ele volta para o início do programa\n" +
               "6) Nada acontece\n" +
               "escreva: ";
       String p4 = "\n[Capítulo 5, pág. 172]\n" +
               "Qual destas opções mostra a forma correta de escrever um switch básico?\n" +
               "1) switch x { \ncase 1: \nbreak; }\n" +
               "2) switch(x) { \ncase 1: \nSystem.out.println(\"Um\"); \nbreak; }\n" +
               "3) switch(x) [ \ncase 1; \nbreak; ]\n" +
               "4) switch = x { 1 -> System.out.println(\"Um\"); }\n" +
               "5) switch(x) case 1: System.out.println(\"Um\")\n" +
               "6) switched(x) { case 1: break; }\n" +
               "escreva: ";
       String p5 = "\n[Capítulo 5, pág. 174]\n" +
               "O que será impresso na tela?\nint dia = 2;\nswitch (dia) {\n    case 1: System.out.println(\"Domingo\"); break;\n    case 2: System.out.println(\"Segunda\"); break;\n}\n" +
               "1) Domingo\n2) Segunda\n3) Nada\n4) Erro de compilação\n5) Terça\n6) Segunda e Terça\n" +
               "escreva: ";
       String p6 = "\n[Capítulo 5, pág. 174]\n" +
               "O que acontece com este código?\nint x = 3;\nswitch(x) {\n case 1: System.out.println(\"Um\");\n case 2: System.out.println(\"Dois\");\n case 3: System.out.println(\"Três\");\n}\n" +
               "1) Imprime “Três”\n2) Não imprime nada\n3) Imprime “Três” apenas\n4) Imprime “Três” e dá erro\n5) Imprime “Três”, “Dois” e “Um”\n6) Imprime “Três” e continua com os outros case\n" +
               "escreva: ";
       String p7 = "\n[Capítulo 5, pág. 172]\n" +
               "Qual tipo de variável é mais usada no switch?\n" +
               "1) boolean\n2) double\n3) float\n4) int\n5) String apenas\n6) long apenas\n" +
               "escreva: ";
       String p8 = "\n[Capítulo 5, pág. 174]\n" +
               "Complete a frase: o switch é melhor usado quando...\n" +
               "1) Temos poucas opções de escolha\n2) Queremos repetir várias vezes\n3) Precisamos verificar muitos valores de uma variável\n" +
               "4) Queremos comparar dois valores apenas\n5) Queremos que o código seja mais difícil de ler\n6) Queremos usar apenas if e else\n" +
               "escreva: ";
       String p9 = "\n[Capítulo 5, pág. 175]\n" +
               "Qual dessas situações é uma boa ideia para usar switch em vez de if?\n" +
               "1) Quando queremos somar dois números\n2) Quando temos várias opções fixas, como dias da semana\n" +
               "3) Quando temos que verificar se um número é par\n4) Quando lemos um número aleatório\n" +
               "5) Quando lidamos com textos longos\n6) Quando precisamos de loops (for ou while)\n" +
               "escreva: ";
       String p10 = "\n[Capítulo 5, pág. 176]\n" +
               "Em qual dessas situações o uso do switch é mais indicado?\n" +
               "1) Para calcular a média de notas de um aluno\n2) Para verificar se um número é maior que 100\n" +
               "3) Para escolher uma ação com base no botão pressionado (A, B, C...)\n4) Para contar até 10 com um loop\n" +
               "5) Para comparar nomes completos\n6) Para validar se uma senha tem mais de 8 caracteres\n" +
               "escreva: ";
    }
     
   public void perguntasN4(){
      String p1 = "\n[Capítulo 5, pág. 172] Para que serve o laço for em Java?\n" +
              "1) Criar uma nova janela\n" +
              "2) Repetir um bloco de código um número definido de vezes\n" +
              "3) Fazer cálculos com variáveis\n" +
              "4) Ler dados do usuário\n" +
              "5) Mostrar mensagens de erro\n" +
              "6) Organizar as pastas do projeto\n";

      String p2 = "\n[Capítulo 5, pág. 173] Qual é a estrutura básica de um laço for em Java?\n" +
              "1) for (início; condição; atualização)\n" +
              "2) for {início, condição, atualização}\n" +
              "3) loop (início:condição:atualização)\n" +
              "4) for-in (variável)\n" +
              "5) enquanto (condição)\n" +
              "6) se (condição) então faça\n";

      String p3 = "\n[Capítulo 5, pág. 175] O que será impresso por: for (int i = 1; i <= 3; i++) { System.out.print(i + \" \"); }\n" +
              "1) 0 1 2\n" +
              "2) 1 2 3\n" +
              "3) 1 2 3 4\n" +
              "4) 0 1 2 3\n" +
              "5) 2 3 4\n" +
              "6) Nada, dá erro\n";

      String p4 = "\n[Capítulo 5, pág. 174] Em um for, qual parte verifica se o laço continua?\n" +
              "1) A parte do início\n" +
              "2) A parte da atualização\n" +
              "3) A parte da condição\n" +
              "4) O nome do laço\n" +
              "5) A variável i\n" +
              "6) A palavra for\n";

      String p5 = "\n[Capítulo 5, pág. 176] Qual alternativa cria um laço que conta de 10 até 1?\n" +
              "1) for (int i = 1; i <= 10; i++)\n" +
              "2) for (int i = 10; i >= 1; i--)\n" +
              "3) for (int i = 0; i < 10; i++)\n" +
              "4) for (int i = 10; i == 1; i--)\n" +
              "5) for (int i = 1; i >= 10; i++)\n" +
              "6) for (int i = 10; i >= 1; i++)\n";

      String p6 = "\n[Capítulo 5, pág. 177] O que esse código faz? for (int i = 0; i < 5; i++) { System.out.println(\"Olá\"); }\n" +
              "1) Mostra “Olá” uma vez\n" +
              "2) Mostra “Olá” cinco vezes\n" +
              "3) Não mostra nada\n" +
              "4) Dá erro porque falta i++\n" +
              "5) Mostra “Olá” infinitamente\n" +
              "6) Mostra “Olá” 4 vezes\n";

      String p7 = "\n[Capítulo 5, pág. 177] O que acontece com for (int i = 1; i > 5; i++)?\n" +
              "1) Mostra os números de 1 a 5\n" +
              "2) Imprime só 1\n" +
              "3) Dá erro de compilação\n" +
              "4) Não imprime nada\n" +
              "5) Mostra infinitamente\n" +
              "6) Mostra apenas 5\n";

      String p8 = "\n[Capítulo 5, pág. 179] Qual laço soma os números de 1 a 5?\n" +
              "1) for (int i = 5; i >= 1; i++)\n" +
              "2) for (int i = 1; i <= 5; i++) soma += i;\n" +
              "3) for (i = 1; i < 5; i--) soma += i;\n" +
              "4) while (i < 5) soma += i;\n" +
              "5) for (int i = 1; i <= 5; i--) soma -= i;\n" +
              "6) for (int i = 0; i <= 5; i++) print soma;\n";

      String p9 = "\n[Capítulo 5, pág. 174] Para que serve o i++ no for?\n" +
              "1) Iniciar a variável i\n" +
              "2) Verificar a condição do laço\n" +
              "3) Incrementar a variável a cada repetição\n" +
              "4) Encerrar o laço\n" +
              "5) Deixar o código mais bonito\n" +
              "6) Declarar uma nova função\n";

      String p10 = "\n[Capítulo 5, pág. 172] Qual situação é ideal para usar o laço for?\n" +
              "1) Quando não sabemos quantas vezes vamos repetir\n" +
              "2) Quando temos que repetir algo para sempre\n" +
              "3) Quando queremos repetir algo um número exato de vezes\n" +
              "4) Quando queremos testar uma condição lógica\n" +
              "5) Quando queremos repetir só se o usuário quiser\n" +
              "6) Quando usamos apenas switch\n";
   }
     
     public void perguntasN5(){
        String p1 = "\n[]\n" +
                "Para que serve o laço while em Java?\n" +
                " 1) Para repetir algo várias vezes\n" +
                " 2) Para pintar a tela de azul\n" +
                " 3) Para guardar números\n" +
                " 4) Para desligar o computador\n";

        String p2 = "\n[]\n" +
                "O que o while faz primeiro?\n" +
                " 1) Mostra uma mensagem\n" +
                " 2) Verifica se a condição é verdadeira\n" +
                " 3) Pede um número\n" +
                " 4) Cria um jogo\n";

        String p3 = "\n[]\n" +
                "Quando o while para de repetir?\n" +
                " 1) Quando o computador cansa\n" +
                " 2) Quando o usuário aperta Enter\n" +
                " 3) Quando a condição fica falsa\n" +
                " 4) Nunca para\n";

        String p4 = "\n[]\n" +
                "Qual a diferença do do while?\n" +
                " 1) Ele serve para decorar\n" +
                " 2) Ele nunca repete\n" +
                " 3) Ele só funciona com letras\n" +
                " 4) Ele faz primeiro e pergunta depois\n";

        String p5 = "\n[]\n" +
                "Quando é bom usar do while?\n" +
                " 1) Quando queremos que o código rode pelo menos uma vez\n" +
                " 2) Quando queremos repetir só uma vez\n" +
                " 3) Quando usamos a palavra mágica 'faça'\n" +
                " 4) Quando o código está com sono\n";

        String p6 = "\n[]\n" +
                "O que esse código faz?\nwhile (i < 3) { System.out.println(\"Oi\"); i++; }\n" +
                " 1) Escreve \"Oi\" mil vezes\n" +
                " 2) Escreve \"Oi\" três vezes\n" +
                " 3) Não escreve nada\n" +
                " 4) Mostra um erro\n";

        String p7 = "\n[]\n" +
                "Qual dessas é uma forma certa de usar do while?\n" +
                " 1) while { jogar(); }\n" +
                " 2) faça { jogar(); } até parar;\n" +
                " 3) do { System.out.println(\"Vamos jogar!\"); } while (jogar == true);\n" +
                " 4) repetir { jogar(); } se quiser\n";

        String p8 = "\n[]\n" +
                "O que acontece se a condição do while for falsa logo no começo?\n" +
                " 1) Fica preso em um loop\n" +
                " 2) Roda uma vez só\n" +
                " 3) Mostra \"erro!\"\n" +
                " 4) O código não roda\n";

        String p9 = "\n[]\n" +
                "O que o do while faz se a condição for falsa no final?\n" +
                " 1) Roda uma vez e para\n" +
                " 2) Não roda nada\n" +
                " 3) Roda mil vezes\n" +
                " 4) Muda o valor sozinho\n";

        String p10 = "\n[]\n" +
                "O que é importante lembrar sobre while e do while?\n" +
                " 1) do while é mais rápido\n" +
                " 2) while pergunta antes, do while roda antes\n" +
                " 3) while é só para números\n" +
                " 4) Eles funcionam com mágica\n";
     }
          
     public void perguntasN6(){
        String p1 = "\n[Cap. 7, pág. 194]\n" +
                "Qual opção cria um ônibus com 4 assentos (um array de 4 inteiros)?\n" +
                " 1) int idades = new int[4];\n" +
                " 2) int[4] idades = new int;\n" +
                " 3) int[] idades = new int[4];\n" +
                " 4) array int idades = 4;\n" +
                " 5) new int idades[4];\n" +
                " 6) int idades(4);\n";
        String p2 = "\n[Cap. 7, pág. 193]\n" +
                "Verdadeiro ou Falso: o primeiro assento (índice) de um array em Java é 1.\n" +
                " 1) Verdadeiro\n" +
                " 2) Falso \n" +
                " 3) Somente em arrays de texto\n" +
                " 4) Somente em arrays de números\n" +
                " 5) Depende do computador\n" +
                " 6) Depende do compilador\n";
        String p3 = "\n[Cap. 7, pág. 193]\n" +
                "Complete o código para colocar a idade 30 no segundo assento do array idades.\n" +
                "int[] idades = new int[3];\n" +
                "___________________________\n" +
                "\n" +
                " 1) idades(1) = 30;\n" +
                " 2) idades[2] = 30;\n" +
                " 3) idades[1] = 30;\n" +
                " 4) idades = 30[1];\n" +
                " 5) idades = {30};\n" +
                " 6) idades:1 = 30;\n";
        String p4 = "\n[Cap. 7, pág. 195]\n" +
                "O que será exibido?\n" +
                "int[] numeros = { 5, 8, 3 };\n" +
                "System.out.println( numeros[0] );\n" +
                "\n" +
                " 1) 0\n" +
                " 2) 3\n" +
                " 3) 8\n" +
                " 4) 5\n" +
                " 5) Erro de compilação\n" +
                " 6) “numeros[0]”\n";
        String p5 = "\n[Cap. 7, pág. 195]\n" +
                "Qual linha imprime quantos assentos existem no array nomes?\n" +
                "String[] nomes = new String[10];\n" +
                "\n" +
                " 1) System.out.println( nomes.size );\n" +
                " 2) System.out.println( nomes.length );\n" +
                " 3) System.out.println( length(nomes) );\n" +
                " 4) System.out.println( nomes.length() );\n" +
                " 5) System.out.println( nomes.count );\n" +
                " 6) System.out.println( nomes.tamanho );\n";
        String p6 = "\n[Cap. 7, pág. 196]\n" +
                "Qual alternativa cria e preenche um array com os números 2, 4 e 6?\n" +
                " 1) int[] pares = new int{2,4,6};\n" +
                " 2) int[] pares = (2,4,6);\n" +
                " 3) array pares = {2,4,6};\n" +
                " 4) int pares = {2;4;6};\n" +
                " 5) int pares[] = { 2, 4, 6 };\n" +
                " 6) {2,4,6} -> int[] pares;\n";
        String p7 = "\n[Cap. 7, pág. 195]\n" +
                "Verdadeiro ou Falso: em um array de int, se você não preencher um assento, ele vale 0.\n" +
                " 1) Verdadeiro\n" +
                " 2) Falso\n" +
                " 3) Vale -1\n" +
                " 4) Vale null\n" +
                " 5) Vale “vazio”\n" +
                " 6) Depende do sistema operacional\n";
        String p8 = "\n[Cap. 7, pág. 195]\n" +
                "Qual das alternativas abaixo representa corretamente um Array que pode guardar 10 nomes de pessoas?\n" +
                " 1) String nomes[10];\n" +
                " 2) String[] nomes = new String[10];\n" +
                " 3) int[] nomes = new String[10];\n" +
                " 4) String nomes = new String[10];\n" +
                " 5) nomes = String[10];\n" +
                " 6) String nomes = 10;";
        String p9 = "\n[Cap. 7, pág. 194]\n" +
                "Qual palavra em Java usamos para criar um novo Array?\n" +
                " 1) create\n" +
                " 2) make\n" +
                " 3) new\n" +
                " 4) build\n" +
                " 5) array\n" +
                " 6) start";
        String p10 = "\n[Cap. 7, pág. 196]\n" +
                "Complete o código para colocar o número 30 no assento 2 do Array numeros:\n" +
                "int[] numeros = new int[5];\n" +
                "___________ = 30;\n" +
                "\n" +
                " 1) numeros[3]\n" +
                " 2) numeros[2]\n" +
                " 3) numeros(2)\n" +
                " 4) numeros.set(2)\n" +
                " 5) numeros[0]\n" +
                " 6) numeros = 2";        
          }
     
     public void perguntasN7(){
       String p1 = "\n[Cap. 7, pág. 214]\n" +
                "Qual dessas opções cria um ônibus com 3 fileiras e 2 assentos por fileira?\n" +
                " 1) int[][] lugares = new int[3][2];\n" +
                " 2) int lugares[3][2];\n" +
                " 3) int lugares = new int(3,2);\n" +
                " 4) int lugares[] = new int[3][2];\n" +
                " 5) int lugares[2][3];\n" +
                " 6) int lugares = new int[2][3];\n";
        String p2 = "\n[Cap. 7, pág. 214]\n" +
                "Em lugares[1][0], o que significa o número 1?\n" +
                " 1) Número do assento\n" +
                " 2) Número da janela\n" +
                " 3) Número da fileira\n" +
                " 4) Número do passageiro\n" +
                " 5) Número do ônibus\n" +
                " 6) Número de assentos\n";
        String p3 = "\n[Cap. 7, pág. 214]\n" +
                "Qual linha coloca o número 5 na segunda fileira, terceiro assento de uma matriz numeros?\n" +
                " 1) numeros[1][2] = 5;\n" +
                " 2) numeros[2][3] = 5;\n" +
                " 3) numeros[2][1] = 5;\n" +
                " 4) numeros[3][2] = 5;\n" +
                " 5) numeros[2,3] = 5;\n" +
                " 6) numeros[1:2] = 5;\n";
        String p4 = "\n[Cap. 7, pág. 214]\n" +
                "O que essa linha imprime?\n" +
                "int[][] tabela = {\n" +
                "  {1, 2},\n" +
                "  {3, 4}\n" +
                "};\n" +
                "System.out.println(tabela[0][1]);\n" +
                "\n" +
                " 1) 0\n" +
                " 2) 1\n" +
                " 3) 2\n" +
                " 4) 3\n" +
                " 5) 4\n" +
                " 6) Erro de compilação\n";
        String p5 = "\n[Cap. 7, pág. 214]\n" +
                "O que for (int i = 0; i < matriz.length; i++) percorre?\n" +
                " 1) Os assentos de cada fileira\n" +
                " 2) Todas as colunas\n" +
                " 3) As fileiras da matriz\n" +
                " 4) Os valores da matriz\n" +
                " 5) As linhas e colunas ao mesmo tempo\n" +
                " 6) Os nomes dos assentos\n";
        String p6 = "\n[Cap. 7, pág. 213]\n" +
                "Qual opção cria e preenche uma matriz com os valores abaixo?\n" +
                "1 2  \n" +
                "3 4  \n" +
                "\n" +
                " 1) int[][] m = { 1, 2, 3, 4 };\n" +
                " 2) int[][] m = new int[2][2]{1,2,3,4};\n" +
                " 3) int[][] m = {{1, 2}, {3, 4}};\n" +
                " 4) int[][] m = { {1 2}, {3 4} };\n" +
                " 5) int[2][2] m = {{1,2},{3,4}};\n" +
                " 6) int m[][] = new int[2][2]{1,2,3,4};\n";
        String p7 = "\n[Cap. 7, pág. 214]\n" +
                "Em lugares[0][1], o que o número 0 representa?\n" +
                " 1) A coluna\n" +
                " 2) A letra do alfabeto\n" +
                " 3) A quantidade total de assentos\n" +
                " 4) O número do ônibus\n" +
                " 5) Um número aleatório\n" +
                " 6) A fileira";
        String p8 = "\n[Cap. 7, pág. 214]\n" +
                "Qual dessas opções guarda o número 7 na primeira fileira e segundo assento?\n" +
                " 1) matriz[0][1] = 7;\n" +
                " 2) matriz[1][0] = 7;\n" +
                " 3) matriz[7] = 0.1;\n" +
                " 4) matriz[1][7] = 0;\n" +
                " 5) matriz[0][0] = 7;\n" +
                " 6) matriz[2] = 7;";
        String p9 = "\n[Cap. 7, pág. 214]\n" +
                "Quantos elementos cabem em uma matriz int[][] m = new int[2][2];?\n" +
                " 1) 2\n" +
                " 2) 4\n" +
                " 3) 6\n" +
                " 4) 8\n" +
                " 5) 1\n" +
                " 6) 3";
        String p10 = "\n[Cap. 7, pág. 214]\n" +
                "O que essa linha faz?\n" +
                "System.out.println(matriz[1][0]);\n" +
                " 1) Coloca um valor na matriz\n" +
                " 2) Soma os valores da matriz\n" +
                " 3) Cria uma nova matriz\n" +
                " 4) Imprime o valor da segunda fileira, primeiro assento\n" +
                " 5) Apaga um valor da matriz\n" +
                " 6) Mostra o tamanho da matriz";
               }
     
   public void perguntasN8(){
      String p1 = "\n[Capítulo 7, pág. 262]\n" +
              "Para que serve a classe ArrayList em Java?\n" +
              " 1) Criar gráficos\n" +
              " 2) Armazenar muitos elementos que podem crescer automaticamente\n" +
              " 3) Criar botões na tela\n" +
              " 4) Repetir ações com for\n" +
              " 5) Fazer contas matemáticas\n" +
              " 6) Criar um banco de dados";
      String p2 = "\n[Capítulo 7, pág. 263]\n" +
              "Como se cria um ArrayList de Strings?\n" +
              " 1) ArrayList<String> nomes = new ArrayList<>();\n" +
              " 2) ArrayList nomes = \"String\";\n" +
              " 3) String[] nomes = ArrayList();\n" +
              " 4) ArrayList<nome> = new String();\n" +
              " 5) ArrayList = {\"nome\"};\n" +
              " 6) ArrayList new = String[];";
      String p3 = "\n[Capítulo 7, pág. 264]\n" +
              "Qual método adiciona um item a um ArrayList?\n" +
              " 1) addItem()\n" +
              " 2) append()\n" +
              " 3) push()\n" +
              " 4) add()\n" +
              " 5) insert()\n" +
              " 6) put()";
      String p4 = "\n[Capítulo 7, pág. 265]\n" +
              "Qual comando remove um elemento do ArrayList?\n" +
              " 1) remove(index)\n" +
              " 2) delete()\n" +
              " 3) pop()\n" +
              " 4) erase()\n" +
              " 5) clear(index)\n" +
              " 6) cut()";
      String p5 = "\n[Capítulo 7, pág. 266]\n" +
              "O que faz o método size()?\n" +
              " 1) Mostra o conteúdo do ArrayList\n" +
              " 2) Conta quantos itens há no ArrayList\n" +
              " 3) Apaga o ArrayList\n" +
              " 4) Adiciona um novo item\n" +
              " 5) Ordena os itens\n" +
              " 6) Mostra o último item";
      String p6 = "\n[Capítulo 7, pág. 267]\n" +
              "Como acessar o primeiro item de um ArrayList chamado nomes?\n" +
              " 1) nomes[1]\n" +
              " 2) nomes(0)\n" +
              " 3) nomes.first()\n" +
              " 4) nomes.get(0)\n" +
              " 5) nomes.top()\n" +
              " 6) nomes.index(1)";
      String p7 = "\n[Capítulo 7, pág. 268]\n" +
              "O que acontece se tentar acessar um índice que não existe?\n" +
              " 1) O Java cria esse índice\n" +
              " 2) Ele ignora e continua\n" +
              " 3) Ele imprime 'null'\n" +
              " 4) Dá erro em tempo de execução\n" +
              " 5) O Java coloca um valor vazio lá\n" +
              " 6) Ele reinicia o programa";
      String p8 = "\n[Capítulo 7, pág. 269]\n" +
              "Como limpar todos os itens de um ArrayList?\n" +
              " 1) nomes.empty()\n" +
              " 2) nomes.removeAll()\n" +
              " 3) nomes.clear()\n" +
              " 4) nomes.deleteAll()\n" +
              " 5) nomes.erase()\n" +
              " 6) nomes.cut()";
      String p9 = "\n[Capítulo 7, pág. 270]\n" +
              "Qual método substitui um valor em um ArrayList?\n" +
              " 1) update()\n" +
              " 2) change()\n" +
              " 3) modify()\n" +
              " 4) set(index, valor)\n" +
              " 5) replace()\n" +
              " 6) switch()";
      String p10 = "\n[Capítulo 7, pág. 271]\n" +
              "Como verificamos se um item está no ArrayList?\n" +
              " 1) nomes.has(\"João\")\n" +
              " 2) nomes.exists(\"João\")\n" +
              " 3) nomes.contains(\"João\")\n" +
              " 4) nomes.find(\"João\")\n" +
              " 5) nomes.locate(\"João\")\n" +
              " 6) nomes.check(\"João\")";

   }

}
*/