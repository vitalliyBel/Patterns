package command;

public class VoiceCommand implements Command{
    Dog dog;

    public VoiceCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.voice();
    }
}
