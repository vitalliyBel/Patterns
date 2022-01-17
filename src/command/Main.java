package command;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cynologist cynologist = new Cynologist(
                new FaceCommand(dog),
                new VoiceCommand(dog),
                new LiaCommand(dog),
                new SitCommand(dog)
        );
        cynologist.doFace();
        cynologist.doLia();
        cynologist.doSit();
        cynologist.doVoice();
    }
}
