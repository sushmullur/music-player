public class Song {

    private String title;
    int duration;
    Artist artist;
    // Collection of contributors
    Album album;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
