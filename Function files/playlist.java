public class playlist {
    String name;
    int SongCount=0, totalminutes=0;

    playlist(String name){
        this.name = name;
    }
    public void addSong(int minutes, String Songname){
        this.totalminutes += minutes;
        this.SongCount ++;

        System.out.println("Added song: " + Songname + " (" + minutes + " minutes)");
    }
    
    void printSummary() {
        System.out.println("\nPlaylist name: " + name);
        System.out.println("Number of songs: " + SongCount);
        System.out.println("Total minutes: " + totalminutes);
    }

    public static void main(String[] args) {
        playlist roadTrip = new playlist("Road Trip");

        roadTrip.addSong(3, "Ni el dinero ni nada");
        roadTrip.addSong(4, "Heart to heart");
        roadTrip.addSong(4, "Mientras duermes");
        roadTrip.printSummary();
    }
}
