package Proxy;

public class MusicTrackProxy implements MusicTrack{

    private MusicTrackActual musicTrackActual;

    private String musicTrackName;

    private String artistName;

    private String musicGenre;

    private int musicTrackRating;

    public MusicTrackProxy (String musicTrackName,String artistName,String musicGenre, int musicTrackRating){
        this.musicTrackName = musicTrackName;
        this.artistName = artistName;
        this.musicGenre = musicGenre;
        this.musicTrackRating = musicTrackRating;


    }


    @Override
    public void screenInformation() {

        if (musicTrackActual == null){
            musicTrackActual = new MusicTrackActual(musicTrackName,artistName,musicGenre,musicTrackRating);
        }

        musicTrackActual.screenInformation();


    }
}
