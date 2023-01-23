package EX_2;

/**
 * Abstract class for items.
 * This class only includes name and weight of an item.
 */
public abstract class Item {

    private String name;

    private int weight;

    /**
     * Constructor for Item objects
     */
    public Item(String name, int weight)
    {
        setName(name);
        setWeight(weight);
    }

    /**
     * Get the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the weight of the item
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the weight of the item
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * toString method
     */
    @Override
    public String toString()
    {
        return "\nname : " +getName() + "\nweight: " +getWeight();
    }
}
