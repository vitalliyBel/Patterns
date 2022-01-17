package command;

public class FaceCommand implements Command{
   Dog dog;

    public FaceCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.face();
    }
}
