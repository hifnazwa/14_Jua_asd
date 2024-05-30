import java.util.Scanner;
public class BukuMain14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);

        System.out.print("Masukkan jumlah data buku : ");
        int input = sc14.nextInt();

        Buku14 [] arrayOfBuku14 = new Buku14[input];
        String nama,penulis,penerbit,kategori;
        int jml_hal;

        for (int i = 0; i < input; i++){
            System.out.println("********************************");
            System.out.println("Buku ke - " + (i+1));
            System.out.print("Masukkan nama buku            : ");
            nama = sc14.next();
            System.out.print("Masukkan penulis buku         : ");
            penulis = sc14.next();
            System.out.print("Masukkan penerbit buku        : ");
            penerbit = sc14.next();
            System.out.print("Masukkan jumlah halaman buku  : ");
            jml_hal = sc14.nextInt();
            System.out.print("Masukkan kategori buku        : ");
            kategori = sc14.next();
            System.out.println();
            System.out.println("********************************");

            arrayOfBuku14[i] = new Buku14(nama,penulis,penerbit,jml_hal,kategori);

        }

        for (int j = 0; j < input; j++){
            arrayOfBuku14[j].cetakInfo();
        }
    }
}