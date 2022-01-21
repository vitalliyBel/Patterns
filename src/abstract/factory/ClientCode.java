package abstractFactory;

public class ClientCode {
    private Coffee coffee;
    private Tea tea;
    public ClientCode(DrinkFactory drink){
        coffee = drink.createCoffee();
        tea = drink.createTea();
    }
    public void getDrink(){
        coffee.getDrink();
        tea.getDrink();
    }
}
