public class Album {
    public static final int MAX = 20;
    private int count = 0;
    public Song[] songs;
    private String name = "Album1";

    public Album(String name) {
        this.name = name;
        songs = new Song[MAX];
    }

    /**
     * Adds song requirements as long as the album isn't full
     * @param name
     * @param artist
     * @param length
     * @param genre
     */
    public void addSong(String name, String artist, double length, String genre) {
        Song song = new Song(name, artist, length, genre);
        if(count >= MAX) {
            System.err.println("Sorry, Album is full! Can't add song to album");
        }
        else {
            songs[count] = song;
            count++;
        }
    }

    /**
     * creates an album iterator
     * @return
     */
    public AlbumIterator createIterator() {
        return new AlbumIterator(songs);
    }

}
