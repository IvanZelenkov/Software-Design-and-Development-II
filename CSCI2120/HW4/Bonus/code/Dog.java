/**
 * Dog class which creates the dog.
 * @author Ivan Zelenkov
 * @version 1.0
 * @since April 29, 2021
 */
public class Dog{

    private int weight;
    private int heightAtShoulder;
    private String name;

    /**
     * Constructor build Dog object.
     * @param name Name of the dog.
     * @param w Weight of the dog.
     * @param h Height of the dog.
     */
    public Dog (String name, int w, int h) {
        System.out.println("Just Entered Dog constructor");
        this.name = name;
        this.weight = w;
        this.heightAtShoulder = h;
        System.out.println("Leaving Dog constructor");
    }

    /**
     * Getter method to get the name of the Dog.
     * @return Return name of the dog.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method to get the height of the Dog.
     * @return Return the height of the Dog.
     */
    public int getHeight() {
        return this.heightAtShoulder;
    }

    /**
     * Getter method to get the weight of the Dog.
     * @return Return the weight of the Dog.
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Method for the dog to bark.
     */
    public void bark() {
        System.out.println("woof");
    }

    /**
     * Method return a string representing characteristics of a dog.
     * @return Return a string representing a dog characteristics.
     */
    public String toString() {
        return "Dog: " + name + " , height: " + heightAtShoulder +
                " weight: " + weight;
    }

    /**
     * Method check if object is a type of Dog and it matches with the characteristics.
     * @param o Object will be passed to this method.
     * @return Return true if object is a Dog and it matches with the characteristics.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Dog) {
            //now we can do checks
            Dog tempDogRef = (Dog)(o);
            if (tempDogRef.getName().equals(this.name) &&
                tempDogRef.getHeight() == this.heightAtShoulder &&
                tempDogRef.getWeight() == this.weight)
                return true;
        }
        return false;
    }

} // end class Dog