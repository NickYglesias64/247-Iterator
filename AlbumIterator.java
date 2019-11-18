public class AlbumIterator implements Iterator{
    private Song[] songs;
    private int position = 0;

    /**
     * Takes in the Song array
     * @param songs
     */
    public AlbumIterator(Song[] songs) {
        this.songs = songs;
    }

    /**
     * Plays the next song in the album
     * @return
     */
    public Song next() {
        Song song = songs[position];
        position++;
        return song;
    }


    /**
     * Checks to see if there are more songs in the album
     * @return
     */
    @Override
    public boolean hasNext() {
        if(position >= songs.length || songs[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }
}
