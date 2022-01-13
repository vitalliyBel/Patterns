package com.company;


import decorator.TheNoviceWitcher;
import decorator.TheWitcher;
import decorator.TheWitcherExperienceDec;

public class Main {

    public static void main(String[] args) {

        TheWitcher noviceWitcher = new TheNoviceWitcher();
        String form = "-------";
        System.out.println("What does an inexperienced witcher look like - " + noviceWitcher.whatDoesTheWitcherLookLike());
        System.out.println("What signs does a novice witcher know how to use: \n " + noviceWitcher.signsOfTheWitcher());
        System.out.println("The physical strength of a novice witcher - " + noviceWitcher.basicStrength());
        System.out.println("The dexterity of a novice witcher - " + noviceWitcher.basicDexterity());
        System.out.println(form);


        TheWitcher witcherExp = new TheWitcherExperienceDec(noviceWitcher);


        System.out.println("What does an experienced witcher look like - " + witcherExp.whatDoesTheWitcherLookLike());
        System.out.println("What signs does an experienced witcher know how to use: \n " + witcherExp.signsOfTheWitcher());
        System.out.println("The physical strength of a experience witcher -  - " + witcherExp.basicStrength());
        System.out.println("The dexterity of a experience witcher " + witcherExp.basicDexterity());






    }
}
