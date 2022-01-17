package memento;

import java.util.Date;

public class Save {
    private final boolean trousers;
    private final boolean shirt;
    private final boolean shoes;
    private  final boolean jacket;
    private final Date date;

    public Save(boolean trousers, boolean shirt, boolean shoes, boolean jacket) {
        this.trousers = trousers;
        this.shirt = shirt;
        this.shoes = shoes;
        this.jacket = jacket;
        this.date = new Date();
    }


    public boolean isTrousers() {
        return trousers;
    }

    public boolean isShirt() {
        return shirt;
    }

    public boolean isShoes() {
        return shoes;
    }

    public boolean isJacket() {
        return jacket;
    }

    public Date getDate() {
        return date;
    }
}
