package factory.method;

public class CoffeeLatte implements Coffee{
    @Override
    public void doCoffee() {
        System.out.println("here is your latte coffee");
    }
}
