public class SongStack {

    private SongNode top;

    public SongStack() {
        this.top = null;
    }

    public void push(Song song) {
        SongNode node = new SongNode(song);
        node.next = top;
        top = node;
    }

    public Song peek() {
        if(!isEmpty()) {
            return top.song;
        }
        return null;
    }

    public Song pop() {
        if(top == null) {
            return null;
        }
        Song temp = top.song;
        top = top.next;
        return temp;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
