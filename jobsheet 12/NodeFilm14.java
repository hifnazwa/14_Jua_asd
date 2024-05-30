public class NodeFilm14 {

    int id;
    String judulFilm;
    double rating;

    NodeFilm14 prev, next;

    NodeFilm14(NodeFilm14 prev, int id, String judulFilm, double rating, NodeFilm14 next){
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}