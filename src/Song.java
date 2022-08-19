import java.util.ArrayList;
import java.util.List;

public class Song {

    private String title;
    private int duration;
    private Artist artist;
    private List<Artist> features;
    private Album album;
    private String path;
    private int releaseYear;

    //Used for testing
    public Song(String title) {
        this.title = title;
    }

    public Song(String title, int duration, int releaseYear, Artist artist, List<Artist> features, Album album, String path) {
        this.title = title;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.artist = artist;
        this.features = features;
        this.album = album;
        this.path = path;

        if(features == null) {
            this.features = new ArrayList<>();
        }

        if(album == null) {
            this.album = new Album("Single");
        }
    }

    public Song(String title, int duration, Album album, List<Artist> features, String path) {
        this(title, duration, album.getReleaseYear(), album.getArtist(), features, album, path);
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }
}
