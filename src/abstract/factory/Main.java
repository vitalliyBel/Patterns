package abstractFactory;

public class Main {
    public static void main(String[] args){
        ClientCode code = configureCode();
        code.getDrink();
    }
    public static ClientCode configureCode() {
        ClientCode code;
        DrinkFactory drinkFactory;
        String manufacturerName = "italian";
        if (manufacturerName.equalsIgnoreCase("italian")) {
            drinkFactory = new ItalianFactory();
            code = new ClientCode(drinkFactory);
        } else if(manufacturerName.equalsIgnoreCase("brazilian")) {
            drinkFactory = new BrazilianFactory();
            code = new ClientCode(drinkFactory);
        }else {
            throw new RuntimeException(manufacturerName + "  is unknown");
        }
        return code;
    }
}
