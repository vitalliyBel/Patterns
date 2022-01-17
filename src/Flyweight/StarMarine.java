package Flyweight;

public class StarMarine implements StarWarrior{


    @Override
    public void run() {
        String starMarineRun = "Бежит к месту сражения";
        System.out.println(starMarineRun);
    }

    @Override
    public void shoot() {
        String starMarineShoot = "Стреляет из плазменной винтовки";
        System.out.println(starMarineShoot);

    }
}
