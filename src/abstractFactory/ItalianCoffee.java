package abstractFactory;

public class ItalianCoffee implements Coffee{
    @Override
    public void getDrink() {
        System.out.println("here is your italian coffee");
    }
}
