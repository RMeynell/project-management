import ecs100.*;
/**
 * Class for establishing GUI
 *
 * @author Regan Meynell
 * @version 1/11/21
 */
public class GUI
{
    // instance variables
    private int highId = 0;
    private Games gm;
    private Game game;

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
        // UI.setMouseListener(gm::doMouse);
        UI.addButton("Quit", UI::quit);
    }

}
