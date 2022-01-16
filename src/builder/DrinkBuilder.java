package builder;

public abstract class DrinkBuilder {
    Drink drink;
    void createDrink(){
        drink = new Drink();
    }
    abstract void createDrinkType();
    abstract void createCupVolume();
    abstract void createSugar();
    abstract void createCream();
    abstract void createTubule();
    abstract void createPrise();

    Drink getDrink(){
        return drink;
    }
}
