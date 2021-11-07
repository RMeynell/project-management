import ecs100.*;
import java.util.HashMap;
/**
 * Class storing games
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Games
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Game> gamesMap;   // declaring the hashmap
    private String team1name;
    private String team2name;
    private int team1score;
    private int team2score;
    private String location;
    private String date;

    public void addGame() {
        team1name = UI.askString("What is team 1s name?: ");
        team2name = UI.askString("What is team 2s name?: ");
        team1score = UI.askInt("What is team 1s score?: ");
        team2score = UI.askInt("What is team 2s score?: ");
        
        UI.println(team1name + ": " + team1score + " vs " + team2name + ": " + team2score); 
    }
    
    public void addnewGame() {
        team1name = UI.askString("What is team 1s name?: ");
        team2name = UI.askString("What is team 2s name?: ");
        location = UI.askString("Where is the game being played?: ");
        date = UI.askString("When is the game being played?: ");
        
        UI.println(team1name + " vs " + team2name);
        UI.println("Location: " + location);
        UI.println("Date: " + date);
    }
}
