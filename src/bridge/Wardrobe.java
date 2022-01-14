package bridge;

public class Wardrobe extends Furniture{

    protected Wardrobe(Color color) {
        super(color);
    }

    @Override
    public void paint() {

        color.paint();

    }
}
