package prototype;

public class DrinkFactory {
    Drink drink;

    public DrinkFactory(Drink drink) {
        this.drink = drink;
    }

    public Drink cloneDrink(){
        return (Drink) drink.copy();
    }
}
