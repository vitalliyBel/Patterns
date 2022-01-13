package factory.method;

public class CoffeeLatte implements Coffee{
    @Override
    public void doCoffee() {
        System.out.println("Here is your latte coffee");
    }
}
