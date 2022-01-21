package prototype;

public class Drink implements Copy{
   private String typeDrink;
   private int volumeDrink;
   private double prise;

    public Drink(String typeDrink, int volumeDrink, double prise) {
        this.typeDrink = typeDrink;
        this.volumeDrink = volumeDrink;
        this.prise = prise;
    }

    @Override
    public Object copy() {
        Drink drink = new Drink(typeDrink,volumeDrink,prise);
        return drink;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "typeDrink='" + typeDrink + '\'' +
                ", volumeDrink=" + volumeDrink +
                ", prise=" + prise +
                '}';
    }
}
