package builder;

public class Main {
    public static void main(String[] args){
        Director director = new Director();
        director.setBuilder(new AmericanoCoffeeBuilder());
        Drink drink = director.buildDrink();
        System.out.println(drink);
    }
}
