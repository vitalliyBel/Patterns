package factory.method;

public class CoffeeAmericano implements Coffee{

    @Override
    public void doCoffee() {
        System.out.println("here is your americano coffee");
    }
}
