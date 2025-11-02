public class Main {
    public static void main(String[] args) {
        DoublyLinkedPlaylist playList = new DoublyLinkedPlaylist();
        playList.addSong("Tanrıdan Diledim");
        playList.addSong("Shape of My Heart");
        playList.addSong("She's Gone");
        playList.addSong("Bu Son Olsun");

        playList.printPlaylist();

        playList.nextSong();
        playList.nextSong();
        playList.prevSong();
        playList.prevSong();
        playList.removeCurrent();
        playList.printPlaylist();
    }
}