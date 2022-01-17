package Flyweight;

public class StarshipTrooper implements StarWarrior{

    @Override
    public void run() {

        String starshipTrooperRun = "Бежит к месту сражения";
        System.out.println(starshipTrooperRun);

    }

    @Override
    public void shoot() {
        String starshipTrooperShoot = "Стреляет из плазменной винтовки";
        System.out.println(starshipTrooperShoot);

    }
}
