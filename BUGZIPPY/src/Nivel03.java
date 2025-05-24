import java.util.Scanner;

public class Nivel03 {
    public Nivel03() {

    }

    public void ChamaNivel3(String nome) {
        int res = 0, nota = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 03 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("caso vc acerte uma questão, ganhará um ponto.\nEstes pontos irão servir para ver se vc está pronto para passar para o próximo nivel\naprovação minima: 5");
        do{
        try {
            System.out.println("1. [Capítulo 5, pág. 172]\n" +
                    "O que o comando switch faz no Java? Escolha a melhor explicação:\n" +
                    "Imagine que você tem várias opções e precisa escolher apenas uma, como em um cardápio. O switch ajuda o computador a escolher o que fazer com base em um valor.\n" +
                    "1) Repete um bloco de código várias vezes\n" +
                    "2) Compara uma variável com vários valores possíveis\n" +
                    "3) Cria um novo método no programa\n" +
                    "4) Serve para fazer contas de matemática\n" +
                    "5) Mostra mensagens na tela\n" +
                    "6) Deixa o programa mais lento" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 2) {
                System.out.println("✅ ACERTOU! Ele compara uma variável com vários valores possíveis.");
                nota++;
            } else {
                System.out.println("❌ ERROU!");
            }

            // Pergunta 2
            System.out.println("\n2. [Capítulo 5, pág. 173]\n" +
                    "Para que serve o comando break dentro de um switch?\n" +
                    "1) Para fazer uma pausa no teclado\n" +
                    "2) Para encerrar o programa inteiro\n" +
                    "3) Para sair do switch depois que a opção correta foi encontrada\n" +
                    "4) Para repetir o mesmo código várias vezes\n" +
                    "5) Para pular para o próximo case\n" +
                    "6) Para escrever uma nova variável" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 3) {
                nota++;
                System.out.println("✅ ACERTOU! O break faz o switch parar na opção correta.");
            } else {
                System.out.println("❌ ERROU!");
            }

            // Pergunta 3
            System.out.println("\n3. [Capítulo 5, pág. 173]\n" +
                    "O que acontece se esquecermos o break dentro do switch?\n" +
                    "1) Ele para automaticamente\n" +
                    "2) Mostra um erro na tela\n" +
                    "3) Executa os cases abaixo\n" +
                    "4) Ignora o switch completamente\n" +
                    "5) Ele volta para o início do programa\n" +
                    "6) Nada acontece" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 3) {
                nota++;
                System.out.println("✅ ACERTOU! O código continua executando os próximos cases.");
            } else {
                System.out.println("❌ ERROU!");
            }

            // Pergunta 4
            System.out.println("\n4. [Capítulo 5, pág. 172]\n" +
                    "Qual destas opções mostra a forma correta de escrever um switch básico?\n" +
                    "1) switch x { \ncase 1: \nbreak; }\n" +
                    "2) switch(x) { \ncase 1: \nSystem.out.println(\"Um\"); \nbreak; }\n" +
                    "3) switch(x) [ \ncase 1; \nbreak; ]\n" +
                    "4) switch = x { 1 -> System.out.println(\"Um\"); }\n" +
                    "5) switch(x) case 1: System.out.println(\"Um\")\n" +
                    "6) switched(x) { case 1: break; }" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 2) {
                nota++;
                System.out.println("✅ ACERTOU! Esta é a sintaxe correta.");
            } else {
                System.out.println("❌ ERROU!" + "\nescreva: ");
            }

            // Pergunta 5
            System.out.println("\n5. [Capítulo 5, pág. 174]\n" +
                    "O que será impresso na tela?\nint dia = 2;\nswitch (dia) {\n    case 1: System.out.println(\"Domingo\"); break;\n    case 2: System.out.println(\"Segunda\"); break;\n}\n" +
                    "1) Domingo\n2) Segunda\n3) Nada\n4) Erro de compilação\n5) Terça\n6) Segunda e Terça" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 2) {
                nota++;
                System.out.println("✅ ACERTOU! O case 2 será executado.");
            } else {
                System.out.println("❌ ERROU!");
            }

            // Pergunta 6
            System.out.println("\n6. [Capítulo 5, pág. 175]\n" +
                    "Qual destas opções é um bom uso do switch para mostrar o nome de um mês?\n" +
                    "1) switch(mes) { case 1: System.out.println(\"Janeiro\"); break; }\n" +
                    "2) if(mes == 1) System.out.println(\"Janeiro\");\n" +
                    "3) switch(mes = 1) { case: System.out.println(\"Janeiro\"); }\n" +
                    "4) switch(mes) { mes == 1: System.out.println(\"Janeiro\"); }\n" +
                    "5) System.out.println(\"Janeiro\");\n" +
                    "6) switch(mes) { case 1: System.out.println(\"Janeiro\"); }" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 1) {
                nota++;
                System.out.println("✅ ACERTOU! Essa é uma boa prática com switch.");
            } else {
                System.out.println("❌ ERROU!");
            }

            // Pergunta 7
            System.out.println("\n7. [Capítulo 5, pág. 174]\n" +
                    "O que acontece com este código?\nint x = 3;\nswitch(x) {\n case 1: System.out.println(\"Um\");\n case 2: System.out.println(\"Dois\");\n case 3: System.out.println(\"Três\");\n}\n" +
                    "1) Imprime “Três”\n2) Não imprime nada\n3) Imprime “Três” apenas\n4) Imprime “Três” e dá erro\n5) Imprime “Três”, “Dois” e “Um”\n6) Imprime “Três” e continua com os outros case" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 6) {
                nota++;
                System.out.println("✅ ACERTOU! O switch continua executando os próximos cases.");
            } else {
                System.out.println("❌ ERROU!");
            }

            // Pergunta 8
            System.out.println("\n8. [Capítulo 5, pág. 172]\n" +
                    "Qual tipo de variável é mais usada no switch?\n" +
                    "1) boolean\n2) double\n3) float\n4) int\n5) String apenas\n6) long apenas" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 4) {
                nota++;
                System.out.println("✅ ACERTOU! Os tipos mais comuns são int.");
            } else {
                System.out.println("❌ ERROU!");
            }

            // Pergunta 9
            System.out.println("\n9. [Capítulo 5, pág. 174]\n" +
                    "Complete a frase: o switch é melhor usado quando...\n" +
                    "1) Temos poucas opções de escolha\n2) Queremos repetir várias vezes\n3) Precisamos verificar muitos valores de uma variável\n" +
                    "4) Queremos comparar dois valores apenas\n5) Queremos que o código seja mais difícil de ler\n6) Queremos usar apenas if e else" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 3) {
                nota++;
                System.out.println("✅ ACERTOU! Ideal para muitos valores de uma mesma variável.");
            } else {
                System.out.println("❌ ERROU!");
            }

            // Pergunta 10
            System.out.println("\n10. [Capítulo 5, pág. 175]\n" +
                    "Qual dessas situações é uma boa ideia para usar switch em vez de if?\n" +
                    "1) Quando queremos somar dois números\n2) Quando temos várias opções fixas, como dias da semana\n" +
                    "3) Quando temos que verificar se um número é par\n4) Quando lemos um número aleatório\n" +
                    "5) Quando lidamos com textos longos\n6) Quando precisamos de loops (for ou while)" + "\nescreva: ");
            res = sc.nextInt();
            if (res == 2) {
                nota++;
                System.out.println("✅ ACERTOU! Dias da semana são ideais para switch.");
            } else {
                System.out.println("❌ ERROU!");
            }

        } catch (Exception e) {
            System.out.println("❌ Ocorreu um erro. Por favor, digite apenas números válidos.");
        }
        if (nota >= 7) {
            System.out.println("PARABENS!!!! PASSOU PARA O PROXIMO NIVEL");
            Nivel04 nvl4 = new Nivel04();
            nvl4.ChamaNivel4(nome);
        }else{
            System.out.println("tente dnv amigunho");
        }
    }while(nota <= 7);
    }
}
