package EX_2;

public class Store {

    public static void main (String [] args)
    {
        //create item list
        var items = createItems();
        //print item list
        printItems(items);
        //if an item implements the Breakable interface, use method "Break".
        for (Item item : items) {
            if (item instanceof Breakable breakable) {
                breakable.Break();
            }
        }
        printItems(items);

    }

    public static Item[] createItems()
    {
        //initialize item list
        return new Item[]{
                new PaintBoard("PaintyBoardy", 1000, 545,600),
                new Lamp("Lampy", 2000,300),
                new Glass("Sharpy", 200, 1000),
                new Ball("Roundy", 150, "Black"),
                new PaintBoard("secondPainty", 1001, 545,600),
                new Lamp("Lumpy", 2000,300),
                new Glass("Sharper", 200, 1000),
                new Ball("Circular", 150, "Black"),
                new PaintBoard("Boardy", 1000, 545,600),
                new Lamp("Limpy", 2000,300)
        };
    }

    public static void printItems(Item[] items)
    {
        for (Item item : items)
        {
            System.out.println(item.toString());
        }
    }


}
