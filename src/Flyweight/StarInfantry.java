package Flyweight;

public class StarInfantry implements StarWarrior{

    @Override
    public void singBattleSong(){
        String starInfantrySing = "Пехота поет песню для поднятия боевого духа";
        System.out.println(starInfantrySing);
    }

    @Override
    public void landingTroops() {

    }


    @Override
    public void run() {
        String starInfantryRun = "Пехота бежит к месту сражения";
        System.out.println(starInfantryRun);
    }

    @Override
    public void shoot() {
        String starInfantryShoot = "Пехота стреляет из лазерной винтовки";
        System.out.println(starInfantryShoot);

    }
}
