public class Buku14 {
    public String nama;
    public String penulis;
    public String penerbit;
    public int jml_hal;
    public String kategori;

public Buku14(){

}

public Buku14(String nama2, String penulis2, String penerbit2, int jml_hal2, String kategori2) {
    nama = nama2;
    penulis = penulis2;
    penerbit = penerbit2;
    jml_hal = jml_hal2;
    kategori = kategori2;

}

void cetakInfo(){
    System.out.println("<><><><><><><><><><><><><><><><><><><><><><><");
    System.out.println("Nama Buku                 : " +nama);
    System.out.println("Penulis Buku              : " +penulis);
    System.out.println("Penerbit Buku             : " +penerbit);
    System.out.println("Jumlah halaman Buku       : " +jml_hal);
    System.out.println("Kategori Buku             : " +kategori);
    System.out.println("<><><><><><><><><><><><><><><><><><><><><><><");
}

}
