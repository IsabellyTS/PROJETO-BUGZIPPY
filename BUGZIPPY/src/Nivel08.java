
import java.util.Arrays;

public class Nivel08 extends Nivel {

    public Nivel08() {
        super("Nível 08: ArrayList", 3,
                "Imagine uma caixa mágica chamada ArrayList!\nEssa caixa pode guardar vários brinquedos, livros, ou o que você quiser!\n" +
                        "O mais legal é que ela cresce sozinha quando você coloca mais coisas nela!\nE se você quiser tirar algo, ela encolhe também!\n" +
                        "Você pode dizer: \"coloque isso na caixa!\", ou \"me mostra o brinquedo número 3!\"\nTudo isso é feito com comandos especiais como add(), get(), remove() e size().\n" +
                        "O ArrayList é como um super baú que ajuda os programadores a guardar coisas direitinho!");
    }

    @Override
    protected void carregarPerguntas() {
        perguntasDoNivel.clear();

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 262]",
                "Para que serve a classe ArrayList em Java?",
                Arrays.asList(
                        "Criar gráficos",
                        "Armazenar muitos elementos que podem crescer automaticamente",
                        "Criar botões na tela",
                        "Repetir ações com for"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 263]",
                "Como se cria um ArrayList de Strings?",
                Arrays.asList(
                        "ArrayList<String> nomes = new ArrayList<>();",
                        "ArrayList nomes = \"String\";",
                        "String[] nomes = ArrayList();",
                        "ArrayList<nome> = new String();"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 263]",
                "Qual método é usado para adicionar um elemento a um ArrayList?",
                Arrays.asList(
                        "put()",
                        "insert()",
                        "add()",
                        "append()"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 264]",
                "Para obter um elemento na posição 0 de um ArrayList 'minhaLista', qual método você usa?",
                Arrays.asList(
                        "minhaLista.get(0)",
                        "minhaLista[0]",
                        "minhaLista.read(0)",
                        "minhaLista.element(0)"
                ),
                1
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 265]",
                "Qual método é usado para remover um elemento de um ArrayList?",
                Arrays.asList(
                        "delete()",
                        "remove()",
                        "erase()",
                        "drop()"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 265]",
                "Para saber quantos elementos tem um ArrayList 'listaDeCompras', qual método você usa?",
                Arrays.asList(
                        "listaDeCompras.length",
                        "listaDeCompras.size()",
                        "listaDeCompras.count()",
                        "listaDeCompras.total()"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 266]",
                "ArrayLists em Java podem armazenar tipos de dados primitivos (como int, double) diretamente?",
                Arrays.asList(
                        "Sim, diretamente",
                        "Não, precisam ser envolvidos em classes 'wrapper' (Integer, Double)",
                        "Apenas se forem booleanos",
                        "Sim, mas apenas números pares"
                ),
                2
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 267]",
                "Qual a vantagem principal do ArrayList sobre um array comum?",
                Arrays.asList(
                        "É mais rápido para acessar elementos",
                        "Seu tamanho é fixo e não muda",
                        "Pode crescer ou diminuir de tamanho dinamicamente",
                        "Não pode armazenar números"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 268]",
                "Se você quiser esvaziar um ArrayList chamado 'carrinho', qual método você usaria?",
                Arrays.asList(
                        "carrinho.delete()",
                        "carrinho.empty()",
                        "carrinho.clear()",
                        "carrinho.reset()"
                ),
                3
        ));

        perguntasDoNivel.add(new Pergunta(
                "[Capítulo 7, pág. 269]",
                "Qual é o método para verificar se um ArrayList está vazio?",
                Arrays.asList(
                        "isEmpty()",
                        "hasElements()",
                        "isZero()",
                        "isBlank()"
                ),
                1
        ));
    }
}