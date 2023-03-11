package units;

import java.util.ArrayList;

public interface GameInterface {
    boolean step(ArrayList<Human> team1, ArrayList<Human> team2);

    StringBuilder getInfo();
}
