/**
 * buku14
 */
public class buku14 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilINformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml){
        if (stok > 0) {
        stok -= jml;
        System.out.println(jml + "Buku telah terjual");
        } else {
            System.out.println(" Stok tidak mencukupi!");
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHArga(int hrg){
        harga = hrg;
    }
}