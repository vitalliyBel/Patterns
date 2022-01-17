package command;

public class Cynologist {
    Command face;
    Command voice;
    Command lia;
    Command sit;

    public Cynologist(Command face, Command voice, Command lia, Command sit) {
        this.face = face;
        this.voice = voice;
        this.lia = lia;
        this.sit = sit;
    }
    public void doSit(){
        sit.execute();
    }
    public void doFace(){
        face.execute();
    }
    public void doLia(){
        lia.execute();
    }
    public void doVoice(){
        voice.execute();
    }
}
