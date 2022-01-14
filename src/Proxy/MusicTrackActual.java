package Proxy;

public class MusicTrackActual implements MusicTrack {

    private String musicTrackName;

    private String artistName;

    private String musicGenre;

    private String linkToMusic;

    public MusicTrackActual (String musicTrackName,String artistName,String musicGenre, String linkToMusic){
        this.musicTrackName = musicTrackName;
        this.artistName = artistName;
        this.musicGenre = musicGenre;
        this.linkToMusic = linkToMusic;
        musicTrackNameLoadFromArchive(musicTrackName, artistName, musicGenre,linkToMusic);

    }


    @Override
    public void screenInformation() {
        System.out.println("information about a music track : " + musicTrackName + artistName + musicGenre
                + linkToMusic);

    }

    private void musicTrackNameLoadFromArchive(String musicTrackName, String artistName, String musicGenre,
                                               String linkToMusic) {
        System.out.println("Downloading information about a music track: " + musicTrackName + artistName
                + musicGenre + linkToMusic);
    }





}


