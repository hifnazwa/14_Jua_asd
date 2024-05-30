import java.util.Scanner;

public class MainMahasiswa14 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi14 list = new DaftarMahasiswaBerprestasi14();
        Mahasiswa14 m1 = new Mahasiswa14("Nusa", 2017, 25, 3.0);
        Mahasiswa14 m2 = new Mahasiswa14 ("Rara", 2012, 19, 4.0 );
        Mahasiswa14 m3 = new Mahasiswa14 ("Dompu", 2018, 19, 3.5);
        Mahasiswa14 m4 = new Mahasiswa14("Abdul", 2017, 23, 2.0);
        Mahasiswa14 m5 = new Mahasiswa14 ("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("======Data Mahasiswa sebelum sorting======");
        list.tampil();
        System.out.println();
        System.out.println("=====Data mahasiswa setelah sorting desc berdasarkan ipk=====");
        list.bubbleSort();
        list.tampil();
        System.out.println();
        System.out.println("=====Data mahasiswa setelah sorting asc berdasarkan ipk======");
        list.selectionSort();
        list.tampil();
        System.out.println();
        System.out.println("======Data Mahasiswa setelah sorting asc berdasarkan ipk=====");
        list.insertionSort();
        list.tampil();
    }
}
