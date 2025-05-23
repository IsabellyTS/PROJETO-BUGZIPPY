import java.util.Scanner;

public class Nivel04 {
public Nivel04(){

}
public void ChamaNivel4(String nome, int acertos) {
    int res, cont = 0;
    Scanner sc = new Scanner(System.in);
    do {
        try {
            System.out.println("\uD83D\uDCD8 Questionário: Laço for em Java\n" +
                    "\uD83D\uDC66 Público-alvo: alunos iniciantes (~12 anos)\n" +
                    "\uD83D\uDCDA Baseado no livro Java: Como Programar – Deitel, 10ª Edição\n" +
                    "\uD83D\uDCD6 Capítulo 5 – Controle de Repetição: Parte 2 (páginas 167–180)");
            // Questão 1
            System.out.println("1. [Capítulo 5, pág. 167]\nPara que serve o laço for em Java?");
            System.out.println("1) Criar uma nova janela");
            System.out.println("2) Repetir um bloco de código um número definido de vezes");
            System.out.println("3) Fazer cálculos com variáveis");
            System.out.println("4) Ler dados do usuário");
            System.out.println("5) Mostrar mensagens de erro");
            System.out.println("6) Organizar as pastas do projeto");
            res = sc.nextInt();
            if (res == 2) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 2
            System.out.println("\n2. [Capítulo 5, pág. 168]\nQual é a estrutura básica de um laço for em Java?");
            System.out.println("1) for (início; condição; atualização)");
            System.out.println("2) for {início, condição, atualização}");
            System.out.println("3) loop (início:condição:atualização)");
            System.out.println("4) for-in (variável)");
            System.out.println("5) enquanto (condição)");
            System.out.println("6) se (condição) então faça");
            res = sc.nextInt();
            if (res == 1) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 3
            System.out.println("\n3. [Capítulo 5, pág. 169]\nO que será impresso por: for (int i = 1; i <= 3; i++) { System.out.print(i + \" \"); }");
            System.out.println("1) 0 1 2");
            System.out.println("2) 1 2 3");
            System.out.println("3) 1 2 3 4");
            System.out.println("4) 0 1 2 3");
            System.out.println("5) 2 3 4");
            System.out.println("6) Nada, dá erro");
            res = sc.nextInt();
            if (res == 2) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 4
            System.out.println("\n4. [Capítulo 5, pág. 169]\nEm um for, qual parte verifica se o laço continua?");
            System.out.println("1) A parte do início");
            System.out.println("2) A parte da atualização");
            System.out.println("3) A parte da condição");
            System.out.println("4) O nome do laço");
            System.out.println("5) A variável i");
            System.out.println("6) A palavra for");
            res = sc.nextInt();
            if (res == 3) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 5
            System.out.println("\n5. [Capítulo 5, pág. 170]\nQual alternativa cria um laço que conta de 10 até 1?");
            System.out.println("1) for (int i = 1; i <= 10; i++)");
            System.out.println("2) for (int i = 10; i >= 1; i--)");
            System.out.println("3) for (int i = 0; i < 10; i++)");
            System.out.println("4) for (int i = 10; i == 1; i--)");
            System.out.println("5) for (int i = 1; i >= 10; i++)");
            System.out.println("6) for (int i = 10; i >= 1; i++)");
            res = sc.nextInt();
            if (res == 2) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 6
            System.out.println("\n6. [Capítulo 5, pág. 171]\nO que esse código faz? for (int i = 0; i < 5; i++) { System.out.println(\"Olá\"); }");
            System.out.println("1) Mostra “Olá” uma vez");
            System.out.println("2) Mostra “Olá” cinco vezes");
            System.out.println("3) Não mostra nada");
            System.out.println("4) Dá erro porque falta i++");
            System.out.println("5) Mostra “Olá” infinitamente");
            System.out.println("6) Mostra “Olá” 4 vezes");
            res = sc.nextInt();
            if (res == 2) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 7
            System.out.println("\n7. [Capítulo 5, pág. 170]\nO que acontece com for (int i = 1; i > 5; i++)?");
            System.out.println("1) Mostra os números de 1 a 5");
            System.out.println("2) Imprime só 1");
            System.out.println("3) Dá erro de compilação");
            System.out.println("4) Não imprime nada");
            System.out.println("5) Mostra infinitamente");
            System.out.println("6) Mostra apenas 5");
            res = sc.nextInt();
            if (res == 4) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 8
            System.out.println("\n8. [Capítulo 5, pág. 172]\nQual laço soma os números de 1 a 5?");
            System.out.println("1) for (int i = 5; i >= 1; i++)");
            System.out.println("2) for (int i = 1; i <= 5; i++) soma += i;");
            System.out.println("3) for (i = 1; i < 5; i--) soma += i;");
            System.out.println("4) while (i < 5) soma += i;");
            System.out.println("5) for (int i = 1; i <= 5; i--) soma -= i;");
            System.out.println("6) for (int i = 0; i <= 5; i++) print soma;");
            res = sc.nextInt();
            if (res == 2) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 9
            System.out.println("\n9. [Capítulo 5, pág. 173]\nPara que serve o i++ no for?");
            System.out.println("1) Iniciar a variável i");
            System.out.println("2) Verificar a condição do laço");
            System.out.println("3) Incrementar a variável a cada repetição");
            System.out.println("4) Encerrar o laço");
            System.out.println("5) Deixar o código mais bonito");
            System.out.println("6) Declarar uma nova função");
            res = sc.nextInt();
            if (res == 3) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 10
            System.out.println("\n10. [Capítulo 5, pág. 174]\nQual situação é ideal para usar o laço for?");
            System.out.println("1) Quando não sabemos quantas vezes vamos repetir");
            System.out.println("2) Quando temos que repetir algo para sempre");
            System.out.println("3) Quando queremos repetir algo um número exato de vezes");
            System.out.println("4) Quando queremos testar uma condição lógica");
            System.out.println("5) Quando queremos repetir só se o usuário quiser");
            System.out.println("6) Quando usamos apenas switch");
            res = sc.nextInt();
            if (res == 3) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

        } catch (Exception e) {
            System.out.println("❌ Entrada inválida! Por favor, digite apenas números.");
        }
        if (cont >= 7) {
            System.out.println("PARABENS!!!! PASSOU PARA O PROXIMO NIVEL");
            //instanciar a classe nivel 5 e chamar o metodo da classe
        }else{
            System.out.println("tente dnv amigunho");
        }
    }while(cont < 7);
}
}
