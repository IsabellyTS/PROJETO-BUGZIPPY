import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivel08 {
public Nivel08(){

}
public void ChamaNivel8(String nome) {
    Scanner sc = new Scanner(System.in);
    
    int res = 0, cc = 3;
    
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
    System.out.println("Imagine uma caixa mágica chamada ArrayList! ");
    System.out.println("Essa caixa pode guardar vários brinquedos, livros, ou o que você quiser!");
    System.out.println("O mais legal é que ela cresce sozinha quando você coloca mais coisas nela!");
    System.out.println("E se você quiser tirar algo, ela encolhe também! ");
    System.out.println("Você pode dizer: 'coloque isso na caixa!', ou 'me mostra o brinquedo número 3!'");
    System.out.println("Tudo isso é feito com comandos especiais como add(), get(), remove() e size().");
    System.out.println("O ArrayList é como um super baú que ajuda os programadores a guardar coisas direitinho!");
   
    System.out.print("clique ENTER se voce entendeu");
        sc.nextLine();

        System.out.println("*Resolva as questões utilizando apenas as teclas [1], [2], [3]!\n" +
                "*Ao você acertar, a Bugzippy dará um passo ao seu formigueiro.");

        
        System.out.println("Passos para chegar ao meu destino: " + cc--);
        
    for (int i = 0; i < perguntasN8.size(); i++) {
            if (i < 3) {
                if (perguntasN8.get(i).equals(p1)) {
                    System.out.print(p1);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 2) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN8.get(i).equals(p2)) {
                    System.out.print(p2);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN8.get(i).equals(p3)) {
                    System.out.print(p3);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN8.get(i).equals(p4)) {
                    System.out.print(p4);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 1) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN8.get(i).equals(p5)) {
                    System.out.print(p5);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 2) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN8.get(i).equals(p6)) {
                    System.out.print(p6);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN8.get(i).equals(p7)) {
                    System.out.print(p7);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN8.get(i).equals(p8)) {
                    System.out.print(p8);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                        ;
                    } else {
                        System.out.println("ERROU!☹");
                    }
                } else if (perguntasN8.get(i).equals(p9)) {
                    System.out.print(p9);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 4) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                    } else {
                        System.out.println("ERROU!☹");
                    }
                }else if (perguntasN8.get(i).equals(p10)) {
                    System.out.print(p10);
                    System.out.print("\nescreva: ");
                    res = sc.nextInt();
                    sc.nextLine();
                    if (res == 3) {
                        System.out.print("ACERTOU! \n Parabéns, estou a um passo a menos no meu caminho! \n \\uD81A\\uDC7C\\uD81A\\uDD23\\uD81A\\uDD67\\uD81A\\uDC7C Passos para chegar ao destino: " + cc--);
                    } else {
                        System.out.println("ERROU!☹");
                    }
                }
            }
        }
    Fim fim = new Fim();
    fim.Parabenizar(nome);
    }
}
