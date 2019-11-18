public class Song {
    private String name;
    private String artist;
    private double length;
    private String genre;

    public Song(String name, String artist, double length, String genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Prints the song contents
     */
    public void print() {
        System.out.println(getName()+" by "+getArtist()+", Category: "+getGenre()+", Length: "+getLength());

    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }
}
