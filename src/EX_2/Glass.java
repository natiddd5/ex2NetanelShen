package EX_2;

/**
 * Glass class, extends Item
 */
public class Glass extends Item implements Breakable{

    private int capacity;
    private boolean isBroken;

    /**
     * constructor for Glass
     */
    public Glass(String name, int weight, int capacity) {
        super(name, weight);
        setCapacity(capacity);
    }

    /**
     * get capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * set capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * toString method
     */
    @Override
    public String toString()
    {
        //if the item is not broken, return general information.
        //if the item is broken, return 'name' is broken.
        if (!isBroken)
            return super.toString() + "\nCapacity: "+getCapacity();

        return "\n"+getName() + " is broken.";
    }
    /**
     * Break method
     */
    @Override
    public void Break() {
        isBroken = true;
        setWeight(-99);
        setCapacity(-99);

    }
}
