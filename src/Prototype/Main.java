package Prototype;

public class Main {
    public static void main(String[] args){
        Drink drink = new Drink("Coffee",250,15.45);
        DrinkFactory drinkFactory = new DrinkFactory(drink);
        System.out.println(drink);
        Drink cloneDrink = drinkFactory.cloneDrink();
        System.out.println(cloneDrink);
    }
}
