import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*****************************************************************
 * Game TUI:
 * 
 * Description:
 * 
 ***************************************************************/


public class GameTUI implements Serializable {

    private Config itsConfig;
    private Dungeon itsDungeon;
    private Pattern fileExtensionPattern = Pattern.compile("([^\\s]+(\\.(?i)(dat))$)");

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
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name where you want to place the game save:");
            String destinationFileName = reader.readLine();

            if (validateFileExtension(destinationFileName)) {
                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(destinationFileName))) {
                    outputStream.writeObject(itsDungeon);
                    outputStream.flush(); // write any buffered bytes
                } catch (IOException e) {
                    System.err.println("Input/Output exception! Can't save data. " + e.getClass() + ": " + e.getMessage() + "\n");
                    System.exit(1);
                }
            } else {
                // throw custom type of exception from FileNameFormatException.java
                throw new FileNameFormatException("Invalid extension for filename: " + destinationFileName);
            }
        } catch (IOException e) {
            System.err.println("Wrong input data type! Can't save data. " + e.getClass() + ": " + e.getMessage() + "\n");
            System.exit(1);
        } catch (NoSuchElementException e) {
            System.out.println("No such element exception! Can't save data. " + e.getClass() + ": " + e.getMessage() + "\n");
            System.exit(1);
        } catch (FileNameFormatException e) {
            System.err.println("The game cannot be saved to a file with this extension.");
            System.exit(1);
        }
    }

    // validate name of the file
    public boolean validateFileExtension(String fileName) {
        Matcher matcher = fileExtensionPattern.matcher(fileName);
        return matcher.matches();
    }

    // load game method
    public void loadGame() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name of the file from which you want to load the save:");
            String destinationFileName = reader.readLine().trim();
            if (validateFileExtension(destinationFileName)) {
                try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(destinationFileName))) {
                    itsDungeon = (Dungeon) objectInputStream.readObject();
                } catch (IOException e) {
                    if (e instanceof EOFException) {
                        // When end of file is reached, print this message
                        System.out.println("Reached end of file, " + e);
                    } else {
                        System.err.println("Input/Output exception! Can't load data. " + e.getClass() + ": " + e.getMessage() + "\n");
                        System.exit(1);
                    }
                } catch (ClassNotFoundException e) {
                    System.err.println("Class not found exception! Can't load data. " + e.getClass() + ": " + e.getMessage() + "\n");
                    System.exit(1);
                }
            } else {
                // throw custom type of exception from FileNameFormatException.java
                throw new FileNameFormatException("Invalid extension for filename: " + destinationFileName);
            }
        } catch (IOException e) {
            System.err.println("Wrong input data type! Can't save data. " + e.getClass() + ": " + e.getMessage() + "\n");
            System.exit(1);
        } catch (FileNameFormatException e) {
            System.err.println("The game cannot be loaded from a file with this extension. ");
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
