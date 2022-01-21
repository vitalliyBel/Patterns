package singleton;

public class CoffeeCreationLogger {
    private static CoffeeCreationLogger coffeeCreationLogger;
    private static String log = "start making coffee \n\n";

    public static synchronized CoffeeCreationLogger getCoffeeCreationLogger(){
        if(coffeeCreationLogger == null){
            coffeeCreationLogger = new CoffeeCreationLogger();
        }
        return coffeeCreationLogger;
    }
    private CoffeeCreationLogger(){

    }
    public void addLog(String log){
        this.log += log + "\n";
    }
    public void printLog(){
        System.out.println(log);
    }
}
