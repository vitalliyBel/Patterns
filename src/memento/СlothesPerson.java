package memento;

import java.util.Date;

public class СlothesPerson {
    private boolean trousers;
    private boolean shirt;
    private boolean shoes;
    private boolean jacket;
    private Date date;

    public СlothesPerson() {
        this.date = new Date();
    }


    public void setTrousers(boolean trousers) {
        this.trousers = trousers;
    }

    public void setShirt(boolean shirt) {
        this.shirt = shirt;
    }

    public void setShoes(boolean shoes) {
        this.shoes = shoes;
    }

    public void setJacket(boolean jacket) {
        this.jacket = jacket;
    }

    public Save save(){
        return new Save(trousers,shirt,shoes,jacket);
    }

    public void loud(Save save){
        trousers = save.isTrousers();
        shirt = save.isShirt();
        shoes = save.isShoes();
        jacket = save.isJacket();
        date = save.getDate();
    }


    @Override
    public String toString() {
        return "СlothesPerson{" +
                "trousers=" + trousers +
                ", shirt=" + shirt +
                ", shoes=" + shoes +
                ", jacket=" + jacket +
                ", data=" + date +
                '}';
    }
}
