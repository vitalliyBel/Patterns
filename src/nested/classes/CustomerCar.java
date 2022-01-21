package nested.classes;

public class CustomerCar {
    private String manufacturer;
    private int volume;
    private int maxSped;

    public String getManufacturer() {
        return manufacturer;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxSped() {
        return maxSped;
    }

    public CustomerCar(String manufacturer, int volume, int maxSped) {
        this.manufacturer = manufacturer;
        this.volume = volume;
        this.maxSped = maxSped;
    }

    public void start(){
        System.out.println("let's go");
    }

    public class engine {
        private int volume;
        private String engineType;

        public void startEngine(){
            System.out.println("Engine working");
        }
    }

    public class wheel{
        private int radius;
        private double pressure;

        public void wheelSpinning(){
            System.out.println("spinning");
        }

        public boolean chekPressure(){
            if (pressure == 2.2)
                return true;
            return false;
        }
    }
}
