package command;

public class LiaCommand implements Command{
    Dog dog;

    public LiaCommand(Dog dog) {
        this.dog = dog;
    }


    @Override
    public void execute() {
        dog.lie();
    }
}
