package Proxy;

public class MusicTrackActual implements MusicTrack {

    private String musicTrackName;

    private String artistName;

    private String musicGenre;

    private int musicTrackRating;

    public MusicTrackActual (String musicTrackName,String artistName,String musicGenre, int musicTrackRating){
        this.musicTrackName = musicTrackName;
        this.artistName = artistName;
        this.musicGenre = musicGenre;
        this.musicTrackRating = musicTrackRating;
        musicTrackNameLoad(musicTrackName, artistName, musicGenre,musicTrackRating);

    }


    @Override
    public void screenInformation() {
        System.out.println("information about a music track" + musicTrackName + artistName + musicGenre
                + musicTrackRating);

    }

    private void musicTrackNameLoad(String musicTrackName, String artistName, String musicGenre, int musicTrackRating) {
        System.out.println("Downloading information about a music track" + musicTrackName + artistName
                + musicGenre + musicTrackRating);
    }





}


