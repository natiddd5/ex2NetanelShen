package EX_2;

public class Ball extends Item {

    public String color;

    // constructor
    public Ball(String name, int weight, String color) {
        super(name, weight);
        setColor(color);
    }

    // get color
    public String getColor() {
        return color;
    }

    // set color
    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString()
    {
        return (super.toString() + "\ncolor: "+getColor());
    }

}
