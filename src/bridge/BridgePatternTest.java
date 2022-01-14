package bridge;

public class BridgePatternTest {
    public static void main(String[] args) {
        Furniture redTable = new Table(new RedTable());
        Furniture blackWardrobe = new Wardrobe(new BlackWardrobe());

        redTable.paint();
        blackWardrobe.paint();
    }
}
