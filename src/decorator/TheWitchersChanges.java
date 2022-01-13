package decorator;

    public class TheWitchersChanges {

    public static void main(String[] args) {

        TheWitcher noviceWitcher = new TheNoviceWitcher();
        String form = "-------";
        System.out.println("What does an inexperienced witcher look like - " + noviceWitcher.whatDoesTheWitcherLookLike());
        System.out.println("What signs does a novice witcher know how to use: \n " + noviceWitcher.signsOfTheWitcher());
        System.out.println("The physical strength of a novice witcher - " + noviceWitcher.basicStrength());
        System.out.println("The dexterity of a novice witcher - " + noviceWitcher.basicDexterity());
        System.out.println(form);
        System.out.println("Twenty years have passed, the Witcher has gone through many trials,\n" +
                "gained experience, strength and knowledge.");
        System.out.println(form);

        TheWitcher witcherExp = new TheWitcherExperienceDec(noviceWitcher);

        System.out.println("What does an experienced witcher look like - " + witcherExp.whatDoesTheWitcherLookLike());
        System.out.println("What signs does an experienced witcher know how to use: \n " + witcherExp.signsOfTheWitcher());
        System.out.println("The physical strength of a experience witcher -  - " + witcherExp.basicStrength());
        System.out.println("The dexterity of a experience witcher " + witcherExp.basicDexterity());






    }
}


