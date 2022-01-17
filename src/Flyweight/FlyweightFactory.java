package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static final Map<String,StarWarrior> starWarriors = new HashMap<>();

    public StarWarrior createSoldierInTheGame (String skills) {
        StarWarrior starWarrior = starWarriors.get(skills);

        if (starWarrior == null) {
            switch (skills){
                case"Infantry":
                    System.out.println("Creating an StarInfantry");
                    starWarrior = new StarInfantry();
                    break;
                case"Trooper":
                    System.out.println("Creating an StarshipTrooper");
                    starWarrior = new StarshipTrooper();
            }
            starWarriors.put(skills,starWarrior);
        }
        return starWarrior;


    }
}
