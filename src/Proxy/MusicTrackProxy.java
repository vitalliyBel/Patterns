package Proxy;

public class MusicTrackProxy implements MusicTrack{

    private MusicTrackActual musicTrackActual;

    private String musicTrackName;

    private String artistName;

    private String musicGenre;

    private String linkToMusic;

    public MusicTrackProxy (String musicTrackName,String artistName,String musicGenre, String linkToMusic){
        this.musicTrackName = musicTrackName;
        this.artistName = artistName;
        this.musicGenre = musicGenre;
        this.linkToMusic = linkToMusic;


    }


    @Override
    public void screenInformation() {

        if (musicTrackActual == null){
            musicTrackActual = new MusicTrackActual(musicTrackName,artistName,musicGenre,linkToMusic);
        }

        musicTrackActual.screenInformation();


    }
}
