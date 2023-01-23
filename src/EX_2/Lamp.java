package EX_2;

/**
 * Lamp class, extends Item and implements Breakable
 */
public class Lamp extends Item implements Breakable{
    private int watt;
    private boolean isBroken;

    /**
     * constructor for Lamp
     */
    public Lamp(String name, int weight, int watt) {
        super(name, weight);
        setWatt(watt);
    }

    /**
     * get watt
     */
    public int getWatt() {
        return watt;
    }

    /**
     * set watt
     */
    public void setWatt(int watt) {
        this.watt = watt;
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
            return super.toString() + "Wattage: " +getWatt();

        return "\n"+getName() + " is broken.";
    }

    /**
     * Break method
     */
    @Override
    public void Break() {
        isBroken = true;
        setWeight(-99);
        setWatt(-99);
    }
}
