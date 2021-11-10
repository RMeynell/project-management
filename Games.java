import ecs100.*;
import java.util.HashMap;
import java.util.ArrayList;
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
    private int team1name;     
    private int team2name;      
    private int team1score;
    private int team2score;
    private int resultsid = 0;
    private int newid = 0;
    private String teamname;    // name of team, used in tournament method
    private int arraysize;
    ArrayList<String> teams = new ArrayList<String>();
    ArrayList<String> removeteams = new ArrayList<String>();
    
    public static void Games(String[] args) {
        HashMap<Integer, String> round1Map = new HashMap<Integer, String>();
    }
    
    /**
    * Constructor for objects of class Games
    * @param name
    */
    public void Games()
    {
        resultsMap = new HashMap<Integer, Game>();   // initialise hashmap
        newMap = new HashMap<Integer, Game>();   // initialise hashmap
    }

    /**
     * Method for adding a new game result
     * @param id
     */
    public void addprevGame() {
        // asking user
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
    
    public void tournamentGame() {
        
        int team1score = UI.askInt("What is the score of team 1?: ");
        int team2score = UI.askInt("What is the score of team 2?: ");
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
        UI.println("Please enter teams in order of seeding");
        for (int i = 0; i < 8; i++) {
           teamname = UI.askString("What is the team name?: "); 
           teams.add(teamname);
        }

        // adding variables for team scores
        int score1a = 0; 
        int score1b = 0;
        int score1c = 0;
        int score1d = 0;
        int score1e = 0;
        int score1f = 0;
        int score1g = 0;
        int score1h = 0;
        int score2a = 0;
        int score2b = 0;
        int score2c = 0;
        int score2d = 0;
        int score3a = 0;
        int score3b = 0;
        
        // first round of knockout
        score1a = UI.askInt("What is the score for " + teams.get(0) + ": ");
        score1b = UI.askInt("What is the score for " + teams.get(1) + ": ");
        if (score1a > score1b) {
            UI.println(teams.get(0) + " defeated " + teams.get(1));
            UI.println("The score was: " + score1a + " - " + score1b);
            removeteams.add(teams.get(1));
            UI.println(teams.get(0) + " has advanced to the next round");
            UI.println(teams.get(1) + " was knocked out of the tournament");
        }
        else if (score1b > score1a) {
            UI.println(teams.get(1) + " defeated " + teams.get(0));
            UI.println("The score was: " + score1b + " - " + score1a);
            removeteams.add(teams.get(0));
            UI.println(teams.get(1) + " has advanced to the next round");
            UI.println(teams.get(0) + " was knocked out of the tournament");
        }
        else if (score1a == score1b) {
            UI.println("The match was tied");
            UI.println("The match will be decided in a shootout");
            score1c = UI.askInt("What is the score for " + teams.get(0) + ": ");
            score1b = UI.askInt("What is the score for " + teams.get(1) + ": ");
            if (score1a > score1b) {
            UI.println(teams.get(0) + " defeated " + teams.get(1));
            UI.println("The score was: " + score1a + " - " + score1b);
            removeteams.add(teams.get(1));
            UI.println(teams.get(0) + " has advanced to the next round");
            UI.println(teams.get(1) + " was knocked out of the tournament");
        }
            else if (score1b > score1a) {
            UI.println(teams.get(1) + " defeated " + teams.get(0));
            UI.println("The score was: " + score1b + " - " + score1a);
            removeteams.add(teams.get(0));
            UI.println(teams.get(1) + " has advanced to the next round");
            UI.println(teams.get(0) + " was knocked out of the tournament");
        }
        }
        
        score1c = UI.askInt("What is the score for " + teams.get(2) + ": ");
        score1d = UI.askInt("What is the score for " + teams.get(3) + ": ");
        if (score1c > score1b) {
            UI.println(teams.get(2) + " defeated " + teams.get(3));
            UI.println("The score was: " + score1c + " - " + score1b);
            removeteams.add(teams.get(3));
            UI.println(teams.get(2) + " has advanced to the next round");
            UI.println(teams.get(3) + " was knocked out of the tournament");
        }
        else if (score1b > score1c) {
            UI.println(teams.get(3) + " defeated " + teams.get(2));
            UI.println("The score was: " + score1d + " - " + score1c);
            removeteams.add(teams.get(2));
            UI.println(teams.get(3) + " has advanced to the next round");
            UI.println(teams.get(2) + " was knocked out of the tournament");
        }
        else if (score1b == score1c) {
            UI.println("The match was tied");
            UI.println("The match will be decided in a shootout");
            score1c = UI.askInt("What is the score for " + teams.get(0) + ": ");
            score1b = UI.askInt("What is the score for " + teams.get(1) + ": ");
            if (score1c > score1b) {
            UI.println(teams.get(2) + " defeated " + teams.get(3));
            UI.println("The score was: " + score1c + " - " + score1b);
            removeteams.add(teams.get(2));
            UI.println(teams.get(2) + " has advanced to the next round");
            UI.println(teams.get(3) + " was knocked out of the tournament");
        }
            else if (score1b > score1c) {
            UI.println(teams.get(3) + " defeated " + teams.get(2));
            UI.println("The score was: " + score1b + " - " + score1c);
            removeteams.add(teams.get(2));
            UI.println(teams.get(3) + " has advanced to the next round");
            UI.println(teams.get(2) + " was knocked out of the tournament");
        }
        }
        
        score1e = UI.askInt("What is the score for " + teams.get(4) + ": ");
        score1f = UI.askInt("What is the score for " + teams.get(5) + ": ");
        if (score1e > score1f) {
            UI.println(teams.get(4) + " defeated " + teams.get(5));
            UI.println("The score was: " + score1e + " - " + score1f);
            removeteams.add(teams.get(5));
            UI.println(teams.get(4) + " has advanced to the next round");
            UI.println(teams.get(5) + " was knocked out of the tournament");
        }
        else if (score1f > score1e) {
            UI.println(teams.get(5) + " defeated " + teams.get(4));
            UI.println("The score was: " + score1f + " - " + score1e);
            removeteams.add(teams.get(4));
            UI.println(teams.get(5) + " has advanced to the next round");
            UI.println(teams.get(4) + " was knocked out of the tournament");
        }
        else if (score1e == score1f) {
            UI.println("The match was tied");
            UI.println("The match will be decided in a shootout");
            score1c = UI.askInt("What is the score for " + teams.get(4) + ": ");
            score1b = UI.askInt("What is the score for " + teams.get(5) + ": ");
            if (score1e > score1f) {
            UI.println(teams.get(4) + " defeated " + teams.get(5));
            UI.println("The score was: " + score1e + " - " + score1f);
            removeteams.add(teams.get(5));
            UI.println(teams.get(4) + " has advanced to the next round");
            UI.println(teams.get(5) + " was knocked out of the tournament");
        }
            else if (score1f > score1e) {
            UI.println(teams.get(5) + " defeated " + teams.get(4));
            UI.println("The score was: " + score1f + " - " + score1f);
            removeteams.add(teams.get(4));
            UI.println(teams.get(5) + " has advanced to the next round");
            UI.println(teams.get(4) + " was knocked out of the tournament");
        }
        }
        
        score1g = UI.askInt("What is the score for " + teams.get(6) + ": ");
        score1h = UI.askInt("What is the score for " + teams.get(7) + ": ");
        if (score1g > score1h) {
            UI.println(teams.get(6) + " defeated " + teams.get(7));
            UI.println("The score was: " + score1g + " - " + score1h);
            removeteams.add(teams.get(7));
            UI.println(teams.get(6) + " has advanced to the next round");
            UI.println(teams.get(7) + " was knocked out of the tournament");
        }
        else if (score1h > score1g) {
            UI.println(teams.get(7) + " defeated " + teams.get(6));
            UI.println("The score was: " + score1h + " - " + score1g);
            removeteams.add(teams.get(6));
            UI.println(teams.get(7) + " has advanced to the next round");
            UI.println(teams.get(6) + " was knocked out of the tournament");
        }
        else if (score1g == score1h) {
            UI.println("The match was tied");
            UI.println("The match will be decided in a shootout");
            score1c = UI.askInt("What is the score for " + teams.get(6) + ": ");
            score1b = UI.askInt("What is the score for " + teams.get(7) + ": ");
            if (score1g > score1h) {
            UI.println(teams.get(6) + " defeated " + teams.get(7));
            UI.println("The score was: " + score1g + " - " + score1h);
            removeteams.add(teams.get(7));
            UI.println(teams.get(6) + " has advanced to the next round");
            UI.println(teams.get(7) + " was knocked out of the tournament");
        }
        else if (score1h > score1g) {
            UI.println(teams.get(7) + " defeated " + teams.get(6));
            UI.println("The score was: " + score1h + " - " + score1g);
            removeteams.add(teams.get(6));
            UI.println(teams.get(7) + " has advanced to the next round");
            UI.println(teams.get(6) + " was knocked out of the tournament");
        }
        }
        
        // removing eliminated teams
        for (String i : removeteams) {
            teams.remove(i);
        }
        removeteams.clear();
        
        // second round of knockout
        score1a = UI.askInt("What is the score for " + teams.get(0) + ": ");
        score1b = UI.askInt("What is the score for " + teams.get(1) + ": ");
        if (score1a > score1b) {
            UI.println(teams.get(0) + " defeated " + teams.get(1));
            UI.println("The score was: " + score1a + " - " + score1b);
            removeteams.add(teams.get(1));
            UI.println(teams.get(0) + " has advanced to the final");
            UI.println(teams.get(1) + " was knocked out of the tournament");
        }
        else if (score1b > score1a) {
            UI.println(teams.get(1) + " defeated " + teams.get(0));
            UI.println("The score was: " + score1b + " - " + score1a);
            removeteams.add(teams.get(0));
            UI.println(teams.get(1) + " has advanced to the final");
            UI.println(teams.get(0) + " was knocked out of the tournament");
        }
        else if (score1a == score1b) {
            UI.println("The match was tied");
            UI.println("The match will be decided in a shootout");
            score1c = UI.askInt("What is the score for " + teams.get(0) + ": ");
            score1b = UI.askInt("What is the score for " + teams.get(1) + ": ");
            if (score1a > score1b) {
            UI.println(teams.get(0) + " defeated " + teams.get(1));
            UI.println("The score was: " + score1a + " - " + score1b);
            removeteams.add(teams.get(1));
            UI.println(teams.get(0) + " has advanced to the final");
            UI.println(teams.get(1) + " was knocked out of the tournament");
        }
            else if (score1b > score1a) {
            UI.println(teams.get(1) + " defeated " + teams.get(0));
            UI.println("The score was: " + score1b + " - " + score1a);
            removeteams.add(teams.get(0));
            UI.println(teams.get(1) + " has advanced to the final");
            UI.println(teams.get(0) + " was knocked out of the tournament");
        }
        }
        
        score1c = UI.askInt("What is the score for " + teams.get(2) + ": ");
        score1d = UI.askInt("What is the score for " + teams.get(3) + ": ");
        if (score1c > score1b) {
            UI.println(teams.get(2) + " defeated " + teams.get(3));
            UI.println("The score was: " + score1c + " - " + score1b);
            removeteams.add(teams.get(3));
            UI.println(teams.get(2) + " has advanced to the final");
            UI.println(teams.get(3) + " was knocked out of the tournament");
        }
        else if (score1b > score1c) {
            UI.println(teams.get(3) + " defeated " + teams.get(2));
            UI.println("The score was: " + score1b + " - " + score1c);
            removeteams.add(teams.get(2));
            UI.println(teams.get(3) + " has advanced to the final");
            UI.println(teams.get(2) + " was knocked out of the tournament");
        }
        else if (score1b == score1c) {
            UI.println("The match was tied");
            UI.println("The match will be decided in a shootout");
            score1c = UI.askInt("What is the score for " + teams.get(0) + ": ");
            score1b = UI.askInt("What is the score for " + teams.get(1) + ": ");
            if (score1c > score1b) {
            UI.println(teams.get(2) + " defeated " + teams.get(3));
            UI.println("The score was: " + score1c + " - " + score1b);
            removeteams.add(teams.get(2));
            UI.println(teams.get(2) + " has advanced to the final");
            UI.println(teams.get(3) + " was knocked out of the tournament");
        }
            else if (score1b > score1c) {
            UI.println(teams.get(3) + " defeated " + teams.get(2));
            UI.println("The score was: " + score1b + " - " + score1c);
            removeteams.add(teams.get(2));
            UI.println(teams.get(3) + " has advanced to the final");
            UI.println(teams.get(2) + " was knocked out of the tournament");
        }
        }
        
        // removing eliminated teams
        for (String i : removeteams) {
            teams.remove(i);
        }
        removeteams.clear();
        
        // final round
        score1a = UI.askInt("What is the score for " + teams.get(0) + ": ");
        score1b = UI.askInt("What is the score for " + teams.get(1) + ": ");
        if (score1a > score1b) {
            UI.println(teams.get(0) + " defeated " + teams.get(1));
            UI.println("The score was: " + score1a + " - " + score1b);
            removeteams.add(teams.get(1));
            UI.println(teams.get(0) + " has won the tournament");
            UI.println(teams.get(1) + " lost in the final");
        }
        else if (score1b > score1a) {
            UI.println(teams.get(1) + " defeated " + teams.get(0));
            UI.println("The score was: " + score1b + " - " + score1a);
            removeteams.add(teams.get(0));
            UI.println(teams.get(1) + " has won the tournament");
            UI.println(teams.get(0) + " lost in the final");
        }
        else if (score1a == score1b) {
            UI.println("The match was tied");
            UI.println("The match will be decided in a shootout");
            score1c = UI.askInt("What is the score for " + teams.get(0) + ": ");
            score1b = UI.askInt("What is the score for " + teams.get(1) + ": ");
            if (score1a > score1b) {
            UI.println(teams.get(0) + " defeated " + teams.get(1));
            UI.println("The score was: " + score1a + " - " + score1b);
            removeteams.add(teams.get(1));
            UI.println(teams.get(0) + " has won the tournament");
            UI.println(teams.get(1) + " lost in the final");
        }
            else if (score1b > score1a) {
            UI.println(teams.get(1) + " defeated " + teams.get(0));
            UI.println("The score was: " + score1b + " - " + score1a);
            removeteams.add(teams.get(0));
            UI.println(teams.get(1) + " has won the tournament");
            UI.println(teams.get(0) + " lost in the final");
        }
        }
    }  
} 

