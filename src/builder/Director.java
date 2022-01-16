package builder;

public class Director {
    DrinkBuilder builder;

    public void setBuilder(DrinkBuilder builder) {
        this.builder = builder;
    }
    Drink buildDrink(){
        builder.createDrink();
        builder.createCream();
        builder.createCupVolume();
        builder.createDrinkType();
        builder.createSugar();
        builder.createTubule();
        builder.createPrise();
    Drink drink = builder.getDrink();
    return drink;
    }
}
