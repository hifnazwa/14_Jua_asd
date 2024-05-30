public class NodeVaksin14 {
    int nomor;
    String nama;

    NodeVaksin14 prev, next;

    NodeVaksin14(NodeVaksin14 prev, int nomor, String nama, NodeVaksin14 next){
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }

}
