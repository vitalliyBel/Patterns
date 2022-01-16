package builder;

public class DrinkTeaBuilder extends DrinkBuilder{

    @Override
    void createDrinkType() {
        drink.setDrinkType(DrinkType.BLACK_TEA);
    }

    @Override
    void createCupVolume() {
      drink.setCupVolume(250);
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
     drink.setTubule(false);
    }

    @Override
    void createPrise() {
      drink.setPrise(12.56);
    }
}
