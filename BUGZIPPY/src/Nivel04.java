import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel04 {
    public Nivel04() {

    }

    public void ChamaNivel4(String nome) {
        int res, cont = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> perguntasN4 = new ArrayList<>();
        String p1 = "\n1. [Capítulo 5, pág. 172] Para que serve o laço for em Java?\n" +
                "1) Criar uma nova janela\n" +
                "2) Repetir um bloco de código um número definido de vezes\n" +
                "3) Fazer cálculos com variáveis\n" +
                "4) Ler dados do usuário\n" +
                "5) Mostrar mensagens de erro\n" +
                "6) Organizar as pastas do projeto\n";

        String p2 = "\n2. [Capítulo 5, pág. 173] Qual é a estrutura básica de um laço for em Java?\n" +
                "1) for (início; condição; atualização)\n" +
                "2) for {início, condição, atualização}\n" +
                "3) loop (início:condição:atualização)\n" +
                "4) for-in (variável)\n" +
                "5) enquanto (condição)\n" +
                "6) se (condição) então faça\n";

        String p3 = "\n3. [Capítulo 5, pág. 175] O que será impresso por: for (int i = 1; i <= 3; i++) { System.out.print(i + \" \"); }\n" +
                "1) 0 1 2\n" +
                "2) 1 2 3\n" +
                "3) 1 2 3 4\n" +
                "4) 0 1 2 3\n" +
                "5) 2 3 4\n" +
                "6) Nada, dá erro\n";

        String p4 = "\n4. [Capítulo 5, pág. 174] Em um for, qual parte verifica se o laço continua?\n" +
                "1) A parte do início\n" +
                "2) A parte da atualização\n" +
                "3) A parte da condição\n" +
                "4) O nome do laço\n" +
                "5) A variável i\n" +
                "6) A palavra for\n";

        String p5 = "\n5. [Capítulo 5, pág. 176] Qual alternativa cria um laço que conta de 10 até 1?\n" +
                "1) for (int i = 1; i <= 10; i++)\n" +
                "2) for (int i = 10; i >= 1; i--)\n" +
                "3) for (int i = 0; i < 10; i++)\n" +
                "4) for (int i = 10; i == 1; i--)\n" +
                "5) for (int i = 1; i >= 10; i++)\n" +
                "6) for (int i = 10; i >= 1; i++)\n";

        String p6 = "\n6. [Capítulo 5, pág. 177] O que esse código faz? for (int i = 0; i < 5; i++) { System.out.println(\"Olá\"); }\n" +
                "1) Mostra “Olá” uma vez\n" +
                "2) Mostra “Olá” cinco vezes\n" +
                "3) Não mostra nada\n" +
                "4) Dá erro porque falta i++\n" +
                "5) Mostra “Olá” infinitamente\n" +
                "6) Mostra “Olá” 4 vezes\n";

        String p7 = "\n7. [Capítulo 5, pág. 177] O que acontece com for (int i = 1; i > 5; i++)?\n" +
                "1) Mostra os números de 1 a 5\n" +
                "2) Imprime só 1\n" +
                "3) Dá erro de compilação\n" +
                "4) Não imprime nada\n" +
                "5) Mostra infinitamente\n" +
                "6) Mostra apenas 5\n";

        String p8 = "\n8. [Capítulo 5, pág. 179] Qual laço soma os números de 1 a 5?\n" +
                "1) for (int i = 5; i >= 1; i++)\n" +
                "2) for (int i = 1; i <= 5; i++) soma += i;\n" +
                "3) for (i = 1; i < 5; i--) soma += i;\n" +
                "4) while (i < 5) soma += i;\n" +
                "5) for (int i = 1; i <= 5; i--) soma -= i;\n" +
                "6) for (int i = 0; i <= 5; i++) print soma;\n";

        String p9 = "\n9. [Capítulo 5, pág. 174] Para que serve o i++ no for?\n" +
                "1) Iniciar a variável i\n" +
                "2) Verificar a condição do laço\n" +
                "3) Incrementar a variável a cada repetição\n" +
                "4) Encerrar o laço\n" +
                "5) Deixar o código mais bonito\n" +
                "6) Declarar uma nova função\n";

        String p10 = "\n10. [Capítulo 5, pág. 172] Qual situação é ideal para usar o laço for?\n" +
                "1) Quando não sabemos quantas vezes vamos repetir\n" +
                "2) Quando temos que repetir algo para sempre\n" +
                "3) Quando queremos repetir algo um número exato de vezes\n" +
                "4) Quando queremos testar uma condição lógica\n" +
                "5) Quando queremos repetir só se o usuário quiser\n" +
                "6) Quando usamos apenas switch\n";

        perguntasN4.add(p1);
        perguntasN4.add(p2);
        perguntasN4.add(p3);
        perguntasN4.add(p4);
        perguntasN4.add(p5);
        perguntasN4.add(p6);
        perguntasN4.add(p7);
        perguntasN4.add(p8);
        perguntasN4.add(p9);
        perguntasN4.add(p10);
        Collections.shuffle(perguntasN4);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                      NÍVEL 04 \uD80C\uDDA4 ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        try {
            System.out.print("Imagina que você vai contar de 1 até 5.\n"
                    + "Em vez de dizer 1, 2, 3, 4, 5 sozinho,\n"
                    + "você pode mandar o computador fazer isso com o comando 'for'.\n\n"

                    + "Veja como é:\n"
                    + "for (int i = 1; i <= 5; i++) {\n"
                    + "    System.out.println(i);\n"
                    + "}\n\n"

                    + "Vamos entender cada parte:\n"
                    + "int i = 1;     -> Comece no número 1\n"
                    + "i <= 5;        -> Continue enquanto o número for até 5\n"
                    + "i++            -> Aumente de 1 em 1\n"
                    + "{ ... }        -> Aqui dentro você coloca o que quer fazer\n\n"

                    + "Então, é como brincar com 5 brinquedos:\n"
                    + "Brinque com o número 1, depois o 2, até chegar no 5.\n"
                    + "E a cada vez, o computador faz o que você mandar.\n\n"

                    + "O 'for' é uma forma do computador repetir alguma coisa várias vezes!");
            System.out.print("\nclique ENTER se voce entendeu\n");
            sc.nextLine();
            for (int i = 0; i < perguntasN4.size(); i++) {
                if (i < 3) {
                    if (perguntasN4.get(i).equals(p1)) {
                        System.out.print(p1);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("✅ ACERTOU!");
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN4.get(i).equals(p2)) {
                        System.out.print(p2);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 1) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN4.get(i).equals(p3)) {
                        System.out.print(p3);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN4.get(i).equals(p4)) {
                        System.out.print(p4);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN4.get(i).equals(p5)) {
                        System.out.print(p5);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN4.get(i).equals(p6)) {
                        System.out.print(p6);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN4.get(i).equals(p7)) {
                        System.out.print(p7);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 4) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN4.get(i).equals(p8)) {
                        System.out.print(p8);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 2) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    } else if (perguntasN4.get(i).equals(p9)) {
                        System.out.print(p9);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    }else if (perguntasN4.get(i).equals(p10)) {
                        System.out.print(p10);
                        res = sc.nextInt();
                        sc.nextLine();
                        if (res == 3) {
                            System.out.print("✅ ACERTOU!");
                            ;
                        } else {
                            System.out.println("❌ ERROU!");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("❌ Entrada inválida! Por favor, digite apenas números.");
        }
        //tem q fazer o metodo de chamar o nivel 5
    }
}
