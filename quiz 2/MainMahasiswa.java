import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa14.mahasiswaList.add(new Mahasiswa14("123", "Michael Ardhito", "11-06-2005"));
        Mahasiswa14.mahasiswaList.add(new Mahasiswa14("124", "Kenzie Bagaskara", "02-01-2005"));
        Mahasiswa14.mahasiswaList.add(new Mahasiswa14("125", "Reinata Apta", "03-02-2004"));
        Mahasiswa14.mahasiswaList.add(new Mahasiswa14("126", "Gean Genala", "21-04-2002"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        System.out.println("====Selamat Datang di Profil Mahasiswa====");
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Lihat Mahasiswa");
            System.out.println("4. Tampilkan Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.println("=========================================");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Mahasiswa14.tambahMahasiswa(scanner);
                    break;
                case 2:
                    Mahasiswa14.hapusMahasiswa(scanner);
                    break;
                case 3:
                    Mahasiswa14.lihatMahasiswa(scanner);
                    break;
                case 4:
                    Mahasiswa14.cetakSemuaMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}