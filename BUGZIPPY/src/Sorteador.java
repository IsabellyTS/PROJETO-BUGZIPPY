import java.util.ArrayList;
import java.util.Collections;
//NÃO ESTÁ LENDO AS STRINGS DAS PERGUNTAS
public class Sorteador {
    Perguntas perg = new Perguntas();

    protected void sorteadorN1 (String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10){
        ArrayList<String> perguntasN1 = new ArrayList<>();
        perg.perguntasN1();

            perguntasN1.add(p1);
            perguntasN1.add(p2);
            perguntasN1.add(p3);
            perguntasN1.add(p4);
            perguntasN1.add(p5);
            perguntasN1.add(p6);
            perguntasN1.add(p7);
            perguntasN1.add(p8);
            perguntasN1.add(p9);
            perguntasN1.add(p10);
            Collections.shuffle(perguntasN1);

    }
}
