package bridge;

public abstract class  Furniture {

    protected Color color;

    protected  Furniture(Color color){
        this.color = color;
    }

    public abstract void paint();



}
