package Flyweight;

public class StarInfantry implements StarWarrior{


    public void singBattleSong(){
        String starInfantrySing = "Поют песню для поднятия боевого духа";
        System.out.println(starInfantrySing);
    }


    @Override
    public void run() {
        String starInfantryRun = "Бежит к месту сражения";
        System.out.println(starInfantryRun);
    }

    @Override
    public void shoot() {
        String starInfantryShoot = "Стреляет из лазерной винтовки";
        System.out.println(starInfantryShoot);

    }
}
