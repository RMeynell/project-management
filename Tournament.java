import ecs100.*;
/**
 * Write a description of class Tournament here.
 *
 * @author Regan Meynell
 * @version (a version number or a date)
 */
public class Tournament
{
    // instance variables - replace the example below with your own
    private String teamname;
    private int teamid = 0;

    /**
     * Constructor for tournament
     */
    public void Tournament(int teamid, String teamname) {
        this.teamid = teamid;
        this.teamname = teamname;
    }
    
    /**
     * Getter for teamid
     * @return teamid
     */
    public int getteamid() {
        return this.teamid;
    }
    
    /**
     * Getter for teamname
     * @return teamname
     */
    public String getteamname() {
        return this.teamname;
    }
}
