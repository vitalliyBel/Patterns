package singleton;

public class Main {
    public static void main(String[] args){
        CoffeeCreationLogger.getCoffeeCreationLogger().addLog("keep water");
        CoffeeCreationLogger.getCoffeeCreationLogger().addLog("pouring coffee into a cup");
        CoffeeCreationLogger.getCoffeeCreationLogger().addLog("add sugar");
        CoffeeCreationLogger.getCoffeeCreationLogger().addLog("your coffee is ready");

        CoffeeCreationLogger.getCoffeeCreationLogger().printLog();

    }
}
