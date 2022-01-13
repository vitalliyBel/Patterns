package decorator;

public class TheWitcherExperienceDec extends TheWitcherDecor{


    public TheWitcherExperienceDec(TheWitcher witcher) {
        super(witcher);
    }

     String ExperiencedWitcherLook = "white beard, scarred face";
     String ExperiencedWitcherSigns = "\n Quen \n Yerden";
     int ExperiencedWitcherStrength = 75;
     int ExperiencedWitcherDexterity = 65;


    @Override
    public String whatDoesTheWitcherLookLike(){

        return  super.whatDoesTheWitcherLookLike() + ExperiencedWitcherLook;

    }
    @Override
    public String signsOfTheWitcher(){

        return super.signsOfTheWitcher() + ExperiencedWitcherSigns;

    }


    @Override
    public int basicStrength(){
        return super.basicStrength() + ExperiencedWitcherStrength;

    }

    @Override
    public int basicDexterity(){
        return super.basicDexterity() + ExperiencedWitcherDexterity;
    }

}