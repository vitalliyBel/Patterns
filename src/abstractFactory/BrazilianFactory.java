package abstractFactory;

public class BrazilianFactory implements DrinkFactory{
    @Override
    public Coffee createCoffee() {
        return new  BrazilianCoffee();
    }

    @Override
    public Tea createTea() {
        return new BrazilianTea();
    }
}
