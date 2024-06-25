import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa14 {
    private String nim;
    private String nama;
    private String tglLahir;

    static ArrayList<Mahasiswa14> mahasiswaList = new ArrayList<>();

    public Mahasiswa14() {
    }

    public Mahasiswa14(String nim, String nama, String tglLahir) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public static void tambahMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan Tanggal Lahir: ");
        String tglLahir = scanner.next();
        mahasiswaList.add(new Mahasiswa14(nim, nama, tglLahir));
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public static void hapusMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
        String nim = scanner.next();
        Mahasiswa14 mhsHapus = null;
        for (Mahasiswa14 mhs : mahasiswaList) {
            if (mhs.getNim().equals(nim)) {
                mhsHapus = mhs;
                break;
            }
        }
        if (mhsHapus != null) {
            mahasiswaList.remove(mhsHapus);
            System.out.println("Mahasiswa berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }

    public static void lihatMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa yang akan dilihat: ");
        String nim = scanner.next();
        for (Mahasiswa14 mhs : mahasiswaList) {
            if (mhs.getNim().equals(nim)) {
                System.out.println(mhs);
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
    }

    public static void cetakSemuaMahasiswa() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada mahasiswa yang terdaftar.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            System.out.printf("%-15s | %-26s | %s\n", "NIM", "Nama", "Tanggal Lahir");
            System.out.println("-------------------------------------------------------------");
            for (Mahasiswa14 mhs : mahasiswaList) {
                System.out.println(mhs);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("NIM: %-10s | Nama: %-20s | Tgl Lahir: %s", nim, nama, tglLahir);
    }
}