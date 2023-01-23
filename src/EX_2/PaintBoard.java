package EX_2;

/**
 * PaintBoard class, extends Item
 */
public class PaintBoard extends Item {

    private int height;

    private int width;
    /**
     * constructor for PaintBoard
     */
    public PaintBoard(String name, int weight, int height, int width) {
        super(name, weight);
        setHeight(height);
        setWidth(width);
    }

    /**
     * get height
     */
    public int getHeight() {
        return height;
    }

    /**
     * set height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * get width
     */
    public int getWidth() {
        return width;
    }

    /**
     * set width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * toString method
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nPainting Board\nsize: "+getHeight()+"x"+getWidth();
    }

}
