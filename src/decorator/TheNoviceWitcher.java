package decorator;

public class TheNoviceWitcher implements TheWitcher {

    private String whatDoesTheNoviceWitcherLookLike = "White hair, cat eyes, ";
    private String signsOfTheNoviceWitcher = "Aard \n Igni \n Axii";

    private int strength = 30;
    private int dexterity = 25;

    @Override
    public String whatDoesTheWitcherLookLike() {
        return whatDoesTheNoviceWitcherLookLike;
    }

    @Override
    public String signsOfTheWitcher() {
        return signsOfTheNoviceWitcher;
    }

    @Override
    public int basicStrength() {
        return this.strength;
    }

    @Override
    public int basicDexterity() {
        return this.dexterity;
    }
}
