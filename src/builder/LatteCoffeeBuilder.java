package builder;

public class LatteCoffeeBuilder extends DrinkBuilder{


    @Override
    void createDrinkType() {
        drink.setDrinkType(DrinkType.COFFEE_LATE);
    }

    @Override
    void createCupVolume() {
     drink.setCupVolume(500);
    }

    @Override
    void createSugar() {
      drink.setSugar(true);
    }

    @Override
    void createCream() {
     drink.setCream(false);
    }

    @Override
    void createTubule() {
     drink.setTubule(true);
    }

    @Override
    void createPrise() {
     drink.setPrise(24.31);
    }
}
