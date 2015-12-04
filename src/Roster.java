import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Roster {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Player> players = new ArrayList<>();

    public void addNewPlayer(String name) {
        players.add(new Player(name));
    }
}
