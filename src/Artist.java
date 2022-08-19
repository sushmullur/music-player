import java.util.ArrayList;
import java.util.List;

public class Artist {

    private String realName;
    private String stageName;
    private List<Album> albums;
    private List<Song> discography;
    private int streams;

    public Artist(String realName, String stageName) {
        this.streams = 0;
        this.realName = realName;
        this.stageName = stageName;
        this.albums = new ArrayList<>();
        this.discography = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        if(!this.albums.contains(album)) {
            albums.add(album);
            discography.addAll(album.getTrackList());
        }
    }

    public void addSingle(Song song) {
        if(!this.discography.contains(song)) {
            discography.add(song);
        }
    }
}
