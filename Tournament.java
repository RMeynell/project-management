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
    private int teamid = 0;
    private String teamname;

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
    public Tournament(int teamid, String teamname) {
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