import java.io.*;
import java.util.*;

/*****************************************************************
 * Game TUI:
 * 
 * Description:
 * 
 ***************************************************************/


public class GameTUI implements Serializable {

    private Config itsConfig;
    private Dungeon itsDungeon;

    public GameTUI (Config c, Dungeon d) {

        itsConfig = c;
        itsDungeon = d;
    }

    // this is the main loop - very little logic here in the TUI
    // but all the input and output should be controlled from here
    public void run() {
        while (itsDungeon.getHero().getHealth() > 0) {
            //clear previous screen
            StdDraw.clear();

            //draw the game world
            //drawScreen();
            itsDungeon.draw();

            String heroMenu = itsConfig.setupHeroText(itsDungeon.getHero());
            StdDraw.drawText(heroMenu);
            String monsterMenu = itsConfig.setupMonsterText(itsDungeon.getAdjacentMonsters());
            StdDraw.drawText(monsterMenu);

            //Get player's action from input
            System.out.print(">");
            String userInput = StdIn.readString();
            Action action = itsConfig.mapKeyToAction(userInput);

            //Execute player's action and Update game
            //itsDungeon.execute(action);

            if (action.equals(Action.SAVE)) {      // if (action.equals("save"))
                saveGame();
            }
            else if (action.equals(Action.LOAD)) { // if (action.equals("load"))
                loadGame();
            }
            else if (action.equals(Action.QUIT)) { // if (action.equals("quit"))
                break;
            }
            else {                                 // if (action.equals("w","a","s","d"))
                itsDungeon.execute(action);
            }
        }
        StdDraw.drawText("You died!");
    }//end run

    //save game method
    public void saveGame() {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SavedGame.dat"))) {
            outputStream.writeObject(itsDungeon);
            outputStream.flush(); // write any buffered bytes
        }
        catch (IOException e) {
            System.err.println("Input/Output exception! Can't save data." + e.getClass() + ": " + e.getMessage() + "\n");
            System.exit(1);
        }
    }

    // load game method
    public void loadGame() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("SavedGame.dat"))) {
            itsDungeon = (Dungeon) objectInputStream.readObject();
        }
        catch (IOException e) {
            if (e instanceof EOFException) {
                // When end of file is reached, print this message
                System.out.println("Reached end of file, " + e);
            } else {
                System.err.println("Input/Output exception! Can't load data." + e.getClass() + ": " + e.getMessage() + "\n");
                System.exit(1);
            }
        }
        catch (ClassNotFoundException e) {
            System.err.println("Class not found exception! Can't load data." + e.getClass() + ": " + e.getMessage() + "\n");
            System.exit(1);
        }
    }

    public void drawScreen() {
        // Draw game map!
        StdDraw.initGameMap(itsDungeon.getWidth(), itsDungeon.getHeight());
        drawDungeon();
        drawHero();
        drawMonsters();
        //Render display
        StdDraw.draw(); //change to call called render
    }

    public void drawDungeon() {
        Cell[][] map = itsDungeon.getMap();
        for (int i=0;i<itsDungeon.getWidth();i++) 
        {
             for (int j=0;j<itsDungeon.getHeight();j++)
             {
                   map[i][j].draw(itsConfig, i,j);
             }
        }
    }

    //Draw hero
    public void drawHero() {
        Cell[][] map = itsDungeon.getMap();
        Hero stanley = itsDungeon.getHero();
        Tile heroTile = map[stanley.getX()][stanley.getY()].getTile();  //Get background tile
        stanley.draw(heroTile);                                      //Draw hero ontop that background
    }

    //Draw monsters
    public void drawMonsters() {
        Cell[][] map = itsDungeon.getMap();
        ArrayList<Monster> monsters = itsDungeon.getMonsters();
        for (Monster creature: monsters)
        {
            Tile monsterTile = map[creature.getX()][creature.getY()].getTile();  //Get background tile  
            creature.draw(monsterTile);
        }
    }

    
}//end GameTUI
