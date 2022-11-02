public class Song {
    private String name;
    private int seconds;

    // Constructor. Initializes the objects.
    public Song(String name, int length) {
        this.name = name;
        this.seconds = length;
    }

    // Methods.
    public String name() {
        return this.name;
    }

    public int length() {
        return this.seconds;
    }
}
