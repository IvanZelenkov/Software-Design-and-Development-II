package Lab2.code;

/**
 * This class will create movable point
 * @author Ivan Zelenkov
 * @since Feb 11, 2021
 * @version 1.0
 */
public class MovablePoint implements Movable {
    /**
     * These are fields where I will store values of x and y
     */
    int x;
    int y;


    /***
     * Construct a point with x and y coordinates
     *
     * @param x     x means Ox axis
     * @param y     y means Oy axis
     *
     * @since 1.0
     */
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveUp() {
        y += 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveDown() {
        y -= 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveLeft() {
        x -= 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveRight() {
        x += 1;
    }

    /**
     * Return the string description for the movable point
     *
     * @return String with its properties
     */
    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + "]";
    }
}
