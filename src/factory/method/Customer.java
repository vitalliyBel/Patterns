package factory.method;

public class Customer {
    public static void main(String[] args){
        CoffeeFactory factory = createCoffeeFactory("latte");
        Coffee coffee = factory.createCoffee();
        coffee.doCoffee();
    }
    static CoffeeFactory createCoffeeFactory(String specialty){
        if (specialty.equalsIgnoreCase("americano")){
            return new AmericanoFactory();
        }else if(specialty.equalsIgnoreCase("latte")){
            return new LatteFactory();
        }else {
            throw new RuntimeException(specialty + "  is unknown");
        }
    }
}
