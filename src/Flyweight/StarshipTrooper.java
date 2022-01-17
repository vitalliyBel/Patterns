package Flyweight;


    public class StarshipTrooper implements StarWarrior {


        @Override
        public void landingTroops(){

            String starshipLandingTroops = "Десантники высаживаются в заданную точку";
            System.out.println(starshipLandingTroops);
        }


        @Override
        public void run() {

            String starshipTrooperRun = "Десант бежит к месту сражения";
            System.out.println(starshipTrooperRun);

        }

        @Override
        public void shoot () {
            String starshipTrooperShoot = "Десантники стреляют из плазменной винтовки";
            System.out.println(starshipTrooperShoot);

        }

        @Override
        public void singBattleSong() {


        }
    }


