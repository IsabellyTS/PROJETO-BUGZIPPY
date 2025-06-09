package bgzp;
import java.util.ArrayList;

public class RespostasCorretas {
    private ArrayList<Integer> respostas = new ArrayList<>();

    public void inicializarRespostas(int nivel) {
        respostas.clear();

        if (nivel == 1) {
            respostas.add(2);
            respostas.add(1);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);

        } else if (nivel == 2) {
            respostas.add(2);
            respostas.add(1);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
        } else if (nivel == 3) {
            respostas.add(2);
            respostas.add(1);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
        }else if (nivel == 4) {
            respostas.add(2);
            respostas.add(1);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
        }else if (nivel == 5) {
            respostas.add(2);
            respostas.add(1);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
        }else if (nivel == 6) {
            respostas.add(2);
            respostas.add(1);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
        }else if (nivel == 7) {
            respostas.add(2);
            respostas.add(1);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
        }else if (nivel == 8) {
            respostas.add(2);
            respostas.add(1);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
            respostas.add(2);
        }
    }

    public ArrayList<Integer> getRespostas() {
        return respostas;
    }
}