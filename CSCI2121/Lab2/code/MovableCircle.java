package Lab2.code;

/**
 * MovableCircle represents a radius and center of the circle in a Coordinate System
 * Variables are immutable. They cannot be changed once they have been created
 *
 * @author Ivan Zelenkov
 * @since Feb 11, 2021
 * @version 1.0
 */
public class MovableCircle implements Movable {

    private final int radius;
    private final MovablePoint center;

    /**
     * Construct a circle with x, y, radius
     *
     * @param x      coordinate x of the center of circle
     * @param y      coordinate y of the center of circle
     * @param radius radius of the circle
     *
     * @since 1.0
     */
    public MovableCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveUp() {
        center.moveUp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveDown() {
        center.moveDown();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveRight() {
        center.moveRight();
    }

    /**
     * Return the string description for the circle
     *
     * @return String with its properties
     */
    @Override
    public String toString() {
        return "MovableCircle [radius=" + radius + ", center=" + center + "]";
    }

}
