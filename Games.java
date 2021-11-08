import ecs100.*;
import java.util.HashMap;
/**
 * Class for storing results of games
 *
 * @author Regan Meynell
 * @version 1/11/21
 */
public class Games
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Game> resultsMap;   // declaring the hashmap
    private HashMap<Integer, Game> newMap;   // declaring the hashmap
    private HashMap<Integer, Tournament> round1Map;   // declaring the hashmap
    private int team1name;     
    private int team2name;      
    private int team1score;
    private int team2score;
    private int resultsid = 0;
    private int newid = 0;
    private String teamname;    // name of team, used in tournament method
    private int teamid = 0;     // id of team, used for creating matches
    
    /**
    * Constructor for objects of class Games
    * @param name
    */
    public Games()
    {
        resultsMap = new HashMap<Integer, Game>();   // initialise hashmap
        newMap = new HashMap<Integer, Game>();   // initialise hashmap
        round1Map = new HashMap<Integer, Tournament>();   // initialise hashmap
    }

    /**
     * Method for adding a new game result
     * @param id
     */
    public void addprevGame() {
        String team1name = UI.askString("What is the name of team 1?: ");
        String team2name = UI.askString("What is the name of team 2?: ");
        int team1score = UI.askInt("What is the score of team 1?: ");
        int team2score = UI.askInt("What is the score of team 2?: ");
        UI.println(resultsid);
        resultsid++;
        resultsMap.put(resultsid, new Game(
            resultsid, team1name, team2name, team1score, team2score));
            
        UI.println(resultsid);
        
        UI.println(team1name + " vs " + team2name + ": " + team1score + " - " + team2score);
    }
    
    /**
     * Method for adding an upcoming game
     * @param id
     */
    public void addnewGame() {
        String team1name = UI.askString("What is the name of team 1?: ");
        String team2name = UI.askString("What is the name of team 2?: ");
        String date = UI.askString("What date is the game being played?: ");
        String location = UI.askString("Where is this game being played?: ");
        
        
        newid++;
        newMap.put(newid, new Game
        (newid, team1name, team2name, team1score, team2score));
        
        UI.println(team1name + " vs " + team2name);
        UI.println("Date: " + date);
        UI.println("Location: " + location);
    }
    
    /**
     * Method for creating a tournament
     */
    public void tournament() {
        do {
            teamname = UI.askString("What is the teamname?: ");
            teamid++;
            // putting teamname and teamid into hashmap
            round1Map.put(teamid, new Tournament(
            teamid, teamname));;
        } while (round1Map.size() < 8);
    }
}