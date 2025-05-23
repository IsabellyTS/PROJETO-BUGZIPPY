import java.util.Scanner;

public class Nivel08 {
public Nivel08(){

}
public void ChamaNivel8(String nome, int acertos) {
    Scanner sc = new Scanner(System.in);
    int res = 0, cont=0;
    do {
        try {
            System.out.println("Imagine que você tem uma caixa mágica chamada ArrayList.");
            System.out.println("Essa caixa pode guardar vários itens (como nomes, números ou objetos).");
            System.out.println("Diferente de um array normal, o ArrayList pode crescer e encolher automaticamente!");
            System.out.println("Ou seja, você pode adicionar e remover itens sem se preocupar com o tamanho.");
            System.out.println("Exemplo: ArrayList<String> nomes = new ArrayList<>();");
            System.out.println("Agora você pode fazer nomes.add(\"Ana\");, nomes.add(\"Carlos\"); e por aí vai!\nnomes.remove(Ana)\nnomes.get(posicao)");
            // Questão 1
            System.out.println("1. [Capítulo 7, pág. 262]");
            System.out.println("Para que serve a classe ArrayList em Java?");
            System.out.println("1) Criar gráficos");
            System.out.println("2) Armazenar muitos elementos que podem crescer automaticamente");
            System.out.println("3) Criar botões na tela");
            System.out.println("4) Repetir ações com for");
            System.out.println("5) Fazer contas matemáticas");
            System.out.println("6) Criar um banco de dados");
            res = sc.nextInt();
            if (res == 2) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }
            // Questão 2
            System.out.println("\n2. [Capítulo 7, pág. 263]");
            System.out.println("Como se cria um ArrayList de Strings?");
            System.out.println("1) ArrayList<String> nomes = new ArrayList<>();");
            System.out.println("2) ArrayList nomes = \"String\";");
            System.out.println("3) String[] nomes = ArrayList();");
            System.out.println("4) ArrayList<nome> = new String();");
            System.out.println("5) ArrayList = {\"nome\"};");
            System.out.println("6) ArrayList new = String[];");
            res = sc.nextInt();
            if (res == 1) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 3
            System.out.println("\n3. [Capítulo 7, pág. 264]");
            System.out.println("Qual método adiciona um item a um ArrayList?");
            System.out.println("1) addItem()");
            System.out.println("2) append()");
            System.out.println("3) push()");
            System.out.println("4) add()");
            System.out.println("5) insert()");
            System.out.println("6) put()");
            res = sc.nextInt();
            if (res == 4) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 4
            System.out.println("\n4. [Capítulo 7, pág. 265]");
            System.out.println("Qual comando remove um elemento do ArrayList?");
            System.out.println("1) remove(index)");
            System.out.println("2) delete()");
            System.out.println("3) pop()");
            System.out.println("4) erase()");
            System.out.println("5) clear(index)");
            System.out.println("6) cut()");
            res = sc.nextInt();
            if (res == 1) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 5
            System.out.println("\n5. [Capítulo 7, pág. 266]");
            System.out.println("O que faz o método size()?");
            System.out.println("1) Mostra o conteúdo do ArrayList");
            System.out.println("2) Conta quantos itens há no ArrayList");
            System.out.println("3) Apaga o ArrayList");
            System.out.println("4) Adiciona um novo item");
            System.out.println("5) Ordena os itens");
            System.out.println("6) Mostra o último item");
            res = sc.nextInt();
            if (res == 2) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 6
            System.out.println("\n6. [Capítulo 7, pág. 267]");
            System.out.println("Como acessar o primeiro item de um ArrayList chamado nomes?");
            System.out.println("1) nomes[1]");
            System.out.println("2) nomes(0)");
            System.out.println("3) nomes.first()");
            System.out.println("4) nomes.get(0)");
            System.out.println("5) nomes.top()");
            System.out.println("6) nomes.index(1)");
            res = sc.nextInt();
            if (res == 4) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 7
            System.out.println("\n7. [Capítulo 7, pág. 268]");
            System.out.println("O que acontece se tentar acessar um índice que não existe?");
            System.out.println("1) O Java cria esse índice");
            System.out.println("2) Ele ignora e continua");
            System.out.println("3) Ele imprime 'null'");
            System.out.println("4) Dá erro em tempo de execução");
            System.out.println("5) O Java coloca um valor vazio lá");
            System.out.println("6) Ele reinicia o programa");
            res = sc.nextInt();
            if (res == 4) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 8
            System.out.println("\n8. [Capítulo 7, pág. 269]");
            System.out.println("Como limpar todos os itens de um ArrayList?");
            System.out.println("1) nomes.empty()");
            System.out.println("2) nomes.removeAll()");
            System.out.println("3) nomes.clear()");
            System.out.println("4) nomes.deleteAll()");
            System.out.println("5) nomes.erase()");
            System.out.println("6) nomes.cut()");
            res = sc.nextInt();
            if (res == 3) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 9
            System.out.println("\n9. [Capítulo 7, pág. 270]");
            System.out.println("Qual método substitui um valor em um ArrayList?");
            System.out.println("1) update()");
            System.out.println("2) change()");
            System.out.println("3) modify()");
            System.out.println("4) set(index, valor)");
            System.out.println("5) replace()");
            System.out.println("6) switch()");
            res = sc.nextInt();
            if (res == 4) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

            // Questão 10
            System.out.println("\n10. [Capítulo 7, pág. 271]");
            System.out.println("Como verificamos se um item está no ArrayList?");
            System.out.println("1) nomes.has(\"João\")");
            System.out.println("2) nomes.exists(\"João\")");
            System.out.println("3) nomes.contains(\"João\")");
            System.out.println("4) nomes.find(\"João\")");
            System.out.println("5) nomes.locate(\"João\")");
            System.out.println("6) nomes.check(\"João\")");
            res = sc.nextInt();
            if (res == 3) {
                cont++;
                acertos++;
                System.out.println("✅ Acertou!");
            } else {
                System.out.println("❌ Errou!");
            }

        } catch (Exception e) {
            System.out.println("❌ Entrada inválida! Digite apenas números de 1 a 6.");
        }
        if (cont >= 7) {
            System.out.println("PARABENS!!!! PASSOU PARA O PROXIMO NIVEL");
            Fim fim = new Fim();
            fim.ExibeRanking(nome, acertos);
        }else{
            System.out.println("tente dnv amigunho");
        }
    }while(cont < 7);
}
}
