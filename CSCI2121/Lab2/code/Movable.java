package Lab2.code;

/**
 * Interface has four abstract methods which are implicitly public by default
 * @author Ivan Zelenkov
 * @since Feb 11, 2021
 * @version 1.0
 */
public interface Movable {
    /**
     * This method will move up Oy coordinate of the figure's point
     */
    void moveUp();

    /**
     * This method will move down Oy coordinate of the figure's point
     */
    void moveDown();

    /**
     * This method will move to the left Ox coordinate of the figure's point
     */
    void moveLeft();

    /**
     * This method will move to the right Ox coordinate of the figure's point
     */
    void moveRight();
}
