package abstractFactory;

public class ItalianFactory implements DrinkFactory{

    @Override
    public Coffee createCoffee() {
        return new ItalianCoffee();
    }

    @Override
    public Tea createTea() {
        return new ItalianTea();
    }
}
