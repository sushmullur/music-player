import java.util.List;

public class Album {

    private String name;
    private Artist artist;
    private int length;
    private int duration;
    private int yearOfRelease;
    private List<Song> trackList;


    // For testing and edge cases
    public Album(String name) {
        this.name = name;
    }

    public List<Song> getTrackList() {
        return this.trackList;
    }
    
    public Album(String name, Artist artist, int yearOfRelease, List<Song> trackList) {
        this.name = name;
        this.artist = artist;
        this.yearOfRelease = yearOfRelease;
        this.trackList = trackList;
        this.length = trackList.size();

        //Calculate duration
        this.duration = 0;
        for(Song song: trackList) {
            this.duration += song.getDuration();
        }
    }

    public void addSong(Song song) {
        if(trackList.contains(song)) return;
        trackList.add(song);
        this.length++;
        this.duration += song.getDuration();
    }

    public int getReleaseYear() {
        return this.yearOfRelease;
    }

    public Artist getArtist() {
        return this.artist;
    }
}
