import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBuku14 {
    public static void main(String[] args) {
        StackBuku14 stackBuku14 = new StackBuku14(10);

        stackBuku14.push(new Buku14("Off The Record", "Rebecca Victoria", 2020));
        stackBuku14.push(new Buku14("Supernatural", "Melvan Andara", 2023));
        stackBuku14.push(new Buku14("Accendio", "Andrea Yunarta", 2021));
        stackBuku14.push(new Buku14("How Sweet", "Hanni Jasmine", 2022));

        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        System.out.println("======Selamat Datang Di Perpustakaan JTI======");
        do {
            System.out.println("Silahkan Pilih Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.println("=============================================");
            System.out.print("Pilih: ");
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next();
                continue;
            }

            switch (pilihan) {
                case 1:
                    tambahBuku(stackBuku14, scanner);
                    break;
                case 2:
                    hapusBuku(stackBuku14);
                    break;
                case 3:
                    lihatBuku(stackBuku14, scanner);
                    break;
                case 4:
                    stackBuku14.cetakSemuaBuku();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    private static void tambahBuku(StackBuku14 stackBuku, Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Masukkan Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Pengarang: ");
        String pengarang = scanner.nextLine();

        int tahunTerbit = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Masukkan Tahun Terbit: ");
            try {
                tahunTerbit = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next(); 
            }
        }

        stackBuku.push(new Buku14(judul, pengarang, tahunTerbit));
    }

    private static void hapusBuku(StackBuku14 stackBuku) {
        Buku14 buku = stackBuku.pop();
        if (buku != null) {
            System.out.println("Buku " + buku.getJudul() + " berhasil dihapus.");
        }
    }

    private static void lihatBuku(StackBuku14 stackBuku, Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Masukkan Judul buku yang akan dicari: ");
        String judul = scanner.nextLine();
        Buku14 bukuDitemukan = null;
    
        for (int i = 0; i <= stackBuku.getTop(); i++) {
            if (stackBuku.getStack()[i].getJudul().equalsIgnoreCase(judul)) {
                bukuDitemukan = stackBuku.getStack()[i];
                break;
            }
        }
    
        if (bukuDitemukan != null) {
            System.out.println(bukuDitemukan);
        } else {
            System.out.println("Buku dengan judul tersebut tidak ditemukan.");
        }
    }
}    
