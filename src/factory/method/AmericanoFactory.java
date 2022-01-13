package factory.method;

public class AmericanoFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new CoffeeAmericano();
    }
}
