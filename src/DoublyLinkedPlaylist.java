public class DoublyLinkedPlaylist {
    Song head = null;
    Song tail = null;
    Song current = null;

    void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
            tail = newSong;
            current = newSong;

        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }
        System.out.println("new song added");

    }
    void nextSong(){

            if(current != null && current.next != null){
                current = current.next;
            }else{
                System.out.println("end of the playlist");
        }
        System.out.println("PS:" + current.prev +"NS:" + current);
    }
    void prevSong(){
        if(current != null && current.prev!= null){
            current = current.prev;
        }else{
            System.out.println("start of the playlist");
        }
        System.out.println("PS:" + current.next +" NS:" + current);
    }
    void removeCurrent(){
        if(current == null){
            return;
        }
        System.out.println("removing:" + current.title);
        if(current.prev != null){
            current.prev.next = current.next;
        }else{
            head = current.next;//removing head
        }
        if(current.next != null){
            current.next.prev = current.prev;
        }else{
            tail=current.prev; // removing tail

        }
    }
    void printPlaylist(){
        Song temp = head;
        while(temp!= null){
            System.out.print(temp.title + " <->");
            temp = temp.next;

        }
    }
}
