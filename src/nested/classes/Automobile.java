package nested.classes;

public class Automobile {
    private String yearOfIssue;
    private static String smell = "Apple scent";


    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public Automobile(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public static class airFresher{
       public static String getSmell(){
           return smell;
       }
    }
}
