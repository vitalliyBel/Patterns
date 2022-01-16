package builder;


public class Drink {
    private DrinkType drinkType;
    private int cupVolume;
    private boolean sugar;
    private boolean cream;
    private boolean tubule;
    private double prise;

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public void setCupVolume(int cupVolume) {
        this.cupVolume = cupVolume;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    public void setTubule(boolean tubule) {
        this.tubule = tubule;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkType=" + drinkType +
                ", cupVolume=" + cupVolume +
                ", sugar=" + sugar +
                ", cream=" + cream +
                ", tubule=" + tubule +
                ", prise=" + prise +
                '}';
    }
}
