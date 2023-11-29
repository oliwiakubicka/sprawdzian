package workshop;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    public void work() {
        Tool pila = new Tool("piła");
        Tool mlotek = new Tool("młotek");
        Tool lopata = new Tool("łopata");

        pila.useTool();
        mlotek.useTool();
        lopata.useTool();

        List<Tool> narzedzia = new ArrayList<>();

        narzedzia.add(pila);
        narzedzia.add(mlotek);
        narzedzia.add(lopata);

        for (Tool t: narzedzia) {
            t.useTool();
        }
    }


}
