public class SongQueue {

    private SongNode first;
    private SongNode last;
    private int size;

    public SongQueue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void add(Song song) {
        SongNode node = new SongNode(song);

        // Handle case of empty queue
        if(this.last == null) {
            this.first = this.last = node;
        }

        this.last.next = node;
        this.last = node;
        size++;
    }

    public void dequeue() {
        if(this.first == null) return;

        SongNode node = this.first;
        this.first = this.first.next;

        if(this.first == null) this.last = null;
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
