import ecs100.*;
/**
 * Class for adding games
 *
 * @author Regan Meynell
 * @version 1/11/21
 */
public class Game
{
    // instance variables
    private int resultsid;
    private String team1name;
    private String team2name;
    private int team1score;
    private int team2score;
    private String date;
    private String location;
    
    /**
     * Constructor to make pokemon
     * @param id used to give pokemon a no to find them
     * @param nm name of pokemon
     * @param val value of the pokemon
     * @param imgno no. of image, used to stop overlapping
     * @param img image selected by user
     * @param nm
     * @param val
     */
    public Game(int resultsid, String team1name, String team2name, int team1score, int team2score) {
        this.resultsid = resultsid;
        this.team1name = team1name;
        this.team2name = team2name;
        this.team1score = team1score;
        this.team2score = team2score;
        this.date = date;
    }
    
    /**
     * Getter for resultsid
     * @return results
     */
    public int getresultsid() {
        return this.resultsid;
    }
    
    /**
     * Getter for team1name
     * @return team1name
     */
    public String getteam1name() {
        return this.team1name;
    }
    
    /**
     * Getter for team2name
     * @return team2name
     */
    public String getteam2name() {
        return this.team2name;
    }
    
    /**
     * Getter for team1score
     * @return team1score
     */
    public int getteam1score() {
        return this.team1score;
    }
    
    /**
     * Getter for team2score
     * @return team2score
     */
    public int getteam2score() {
        return this.team2score;
    }
    
    /**
     * Getter for date
     * @return date
     */
    public String date() {
        return this.date;
    }
    
    /**
     * Getter for location
     * @return location
     */
    public String location() {
        return this.location;
    }
}
