package Proxy;

public class ProxyPatternTest {
    public static void main(String[] args){

        MusicTrack musicTrackOne = new MusicTrackProxy(" Caravan -",
                " Duke Ellington (with Ella Fitzgerald).", " Jazz ",
                " https://www.youtube.com/watch?v=tmALIF7c3lY");

        musicTrackOne.screenInformation();
        System.out.println("-------");

        MusicTrack  musicTrackTwo = new MusicTrackProxy(" It’s Probably Me - ",
                " Sting feat. Eric Clapton.", " Jazz-Rock",
                 " https://www.youtube.com/watch?v=SUYI7kIR0S4");

        musicTrackTwo.screenInformation();
        System.out.println("------");


        musicTrackTwo.screenInformation();
        System.out.println("------");



}
}
