import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel08 {
public Nivel08(){

}
public void ChamaNivel8(String nome) {
    Scanner sc = new Scanner(System.in);
    int res = 0;
    String p1 = "\n1. [Capítulo 7, pág. 262]\nPara que serve a classe ArrayList em Java?\n"
            + "1) Criar gráficos\n2) Armazenar muitos elementos que podem crescer automaticamente\n"
            + "3) Criar botões na tela\n4) Repetir ações com for\n5) Fazer contas matemáticas\n"
            + "6) Criar um banco de dados";
    String p2 = "\n2. [Capítulo 7, pág. 263]\nComo se cria um ArrayList de Strings?\n"
            + "1) ArrayList<String> nomes = new ArrayList<>();\n2) ArrayList nomes = \"String\";\n"
            + "3) String[] nomes = ArrayList();\n4) ArrayList<nome> = new String();\n"
            + "5) ArrayList = {\"nome\"};\n6) ArrayList new = String[];";
    String p3 = "\n3. [Capítulo 7, pág. 264]\nQual método adiciona um item a um ArrayList?\n"
            + "1) addItem()\n2) append()\n3) push()\n4) add()\n5) insert()\n6) put()";
    String p4 = "\n4. [Capítulo 7, pág. 265]\nQual comando remove um elemento do ArrayList?\n"
            + "1) remove(index)\n2) delete()\n3) pop()\n4) erase()\n5) clear(index)\n6) cut()";
    String p5 = "\n5. [Capítulo 7, pág. 266]\nO que faz o método size()?\n"
            + "1) Mostra o conteúdo do ArrayList\n2) Conta quantos itens há no ArrayList\n"
            + "3) Apaga o ArrayList\n4) Adiciona um novo item\n5) Ordena os itens\n6) Mostra o último item";
    String p6 = "\n6. [Capítulo 7, pág. 267]\nComo acessar o primeiro item de um ArrayList chamado nomes?\n"
            + "1) nomes[1]\n2) nomes(0)\n3) nomes.first()\n4) nomes.get(0)\n5) nomes.top()\n6) nomes.index(1)";
    String p7 = "\n7. [Capítulo 7, pág. 268]\nO que acontece se tentar acessar um índice que não existe?\n"
            + "1) O Java cria esse índice\n2) Ele ignora e continua\n3) Ele imprime 'null'\n"
            + "4) Dá erro em tempo de execução\n5) O Java coloca um valor vazio lá\n6) Ele reinicia o programa";
    String p8 = "\n8. [Capítulo 7, pág. 269]\nComo limpar todos os itens de um ArrayList?\n"
            + "1) nomes.empty()\n2) nomes.removeAll()\n3) nomes.clear()\n"
            + "4) nomes.deleteAll()\n5) nomes.erase()\n6) nomes.cut()";
    String p9 = "\n9. [Capítulo 7, pág. 270]\nQual método substitui um valor em um ArrayList?\n"
            + "1) update()\n2) change()\n3) modify()\n4) set(index, valor)\n5) replace()\n6) switch()";
    String p10 = "\n10. [Capítulo 7, pág. 271]\nComo verificamos se um item está no ArrayList?\n"
            + "1) nomes.has(\"João\")\n2) nomes.exists(\"João\")\n3) nomes.contains(\"João\")\n"
            + "4) nomes.find(\"João\")\n5) nomes.locate(\"João\")\n6) nomes.check(\"João\")";

    ArrayList<String> perguntasN8 = new ArrayList<>();
    perguntasN8.add(p1);
    perguntasN8.add(p2);
    perguntasN8.add(p3);
    perguntasN8.add(p4);
    perguntasN8.add(p5);
    perguntasN8.add(p6);
    perguntasN8.add(p7);
    perguntasN8.add(p8);
    perguntasN8.add(p9);
    perguntasN8.add(p10);
    Collections.shuffle(perguntasN8);
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("                                                                      NÍVEL 08 \uD80C\uDDA4 ");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Imagine uma caixa mágica chamada ArrayList! 🧙‍♂️📦");
    System.out.println("Essa caixa pode guardar vários brinquedos, livros, ou o que você quiser!");
    System.out.println("O mais legal é que ela cresce sozinha quando você coloca mais coisas nela!");
    System.out.println("E se você quiser tirar algo, ela encolhe também! 😄");
    System.out.println("Você pode dizer: 'coloque isso na caixa!', ou 'me mostra o brinquedo número 3!'");
    System.out.println("Tudo isso é feito com comandos especiais como add(), get(), remove() e size().");
    System.out.println("O ArrayList é como um super baú que ajuda os programadores a guardar coisas direitinho!");
    System.out.print("\nclique ENTER se voce entendeu\n");
    sc.nextLine();
        for (int i = 0; i < perguntasN8.size(); i++) {
            if (i < 3) {
                if (perguntasN8.get(i).equals(p1)) {
                    System.out.print(p1);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 2) {
                        System.out.print("✅ ACERTOU!");
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                } else if (perguntasN8.get(i).equals(p2)) {
                    System.out.print(p2);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("✅ ACERTOU!");
                        ;
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                } else if (perguntasN8.get(i).equals(p3)) {
                    System.out.print(p3);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("✅ ACERTOU!");
                        ;
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                } else if (perguntasN8.get(i).equals(p4)) {
                    System.out.print(p4);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("✅ ACERTOU!");
                        ;
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                } else if (perguntasN8.get(i).equals(p5)) {
                    System.out.print(p5);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 2) {
                        System.out.print("✅ ACERTOU!");
                        ;
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                } else if (perguntasN8.get(i).equals(p6)) {
                    System.out.print(p6);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("✅ ACERTOU!");
                        ;
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                } else if (perguntasN8.get(i).equals(p7)) {
                    System.out.print(p7);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("✅ ACERTOU!");
                        ;
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                } else if (perguntasN8.get(i).equals(p8)) {
                    System.out.print(p8);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("✅ ACERTOU!");
                        ;
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                } else if (perguntasN8.get(i).equals(p9)) {
                    System.out.print(p9);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("✅ ACERTOU!");
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                }else if (perguntasN8.get(i).equals(p10)) {
                    System.out.print(p10);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("✅ ACERTOU!");
                    } else {
                        System.out.println("❌ ERROU!");
                    }
                }
            }
        }
    Fim fim = new Fim();
        nome = "be"; //só pra teste
    fim.Parabenizar(nome);
    }
}
