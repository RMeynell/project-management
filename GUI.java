import ecs100.*;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI
{
    // instance variables
    private int currId = 0;
    private int highId = 0;
    private int imgno = 0;
    private Games gm;
    private Game game;
    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // setting up GUI and adding buttons to allow user to access different functions
        Games gm = new Games();
        UI.initialise();
        UI.addButton("Add a Game Result", gm::addGame);
        UI.addButton("Add an upcoming game", gm::addnewGame);
        UI.addButton("Quit", UI::quit);
}
}
