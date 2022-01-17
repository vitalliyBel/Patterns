package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        List<StarWarrior> starWarriors = new ArrayList<>();

        starWarriors.add(flyweightFactory.createSoldierInTheGame("Trooper"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Trooper"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Trooper"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Trooper"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Trooper"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Trooper"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Infantry"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Infantry"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Infantry"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Infantry"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Infantry"));
        starWarriors.add(flyweightFactory.createSoldierInTheGame("Infantry"));

        for (StarWarrior starWarrior:starWarriors){
            starWarrior.landingTroops();
            starWarrior.singBattleSong();
            starWarrior.run();
            starWarrior.shoot();

            
        }




    }
}
