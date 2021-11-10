import ecs100.*;
import java.awt.Color;
/**
 * Class for establishing GUI
 *
 * @author Regan Meynell
 * @version 1/11/21
 */
public class GUI
{
    // instance variables
    public int highId = 0;
    public Games gm;
    public Game game;

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // setting up GUI and adding buttons to allow user to access different functions
        gm = new Games();
        UI.initialise();
        UI.addButton("Add a game result", gm::addprevGame);
        UI.addButton("Add an upcoming game", gm::addnewGame);
        UI.addButton("Start a new tournament", gm::tournament);
        UI.addButton("Quit", UI::quit);
    }
}