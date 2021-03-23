package Lab2.code;

/**
 * This class represents a topLeft point and bottomRoght of the rectangle in a Coordinate System.
 * Variables are immutable. They cannot be changed once they have been created.
 *
 * @author Ivan Zelenkov
 * @since Feb 11, 2021
 * @version 1.0
 */
public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    /**
     * Construct a rectangle with its coordinates
     *
     * @param x1    coordinate Ox of rectangle's topLeft is x1
     * @param y1    coordinate Oy of rectangle's topLeft is y1
     * @param x2    coordinate Ox of rectangle's bottomRight is x2
     * @param y2    coordinate Oy of rectangle's bottomRight is y2
     *
     * @since 1.0
     */
    public MovableRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MovablePoint(x1, y1);
        this.bottomRight = new MovablePoint(x2, y2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    /**
     * Return the string description for the rectangle
     *
     * @return String with its properties
     */
    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
