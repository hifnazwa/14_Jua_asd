import java.util.Scanner;

public class KendaraanMain14 {
    private static Kendaraan14 head;
    private static long totalPendapatanHariIni = 0;

    public static void main(String[] args) {
        Kendaraan14 mobil1 = new Kendaraan14("S 1234 YY", "Basko", "Mobil", 2000, 2012, 4);
        Kendaraan14 mobil2 = new Kendaraan14("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        Kendaraan14 motor1 = new Kendaraan14("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        Kendaraan14 motor2 = new Kendaraan14("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

        Kendaraan14 mobil = new Kendaraan14("R 31 XQF", "REIXQF", "Mobil", 2000, 2024, 2);
        Kendaraan14 motor = new Kendaraan14("N 4 JUA", "JUA", "Motor", 155, 2023, 4);

        Kendaraan14 kendaraanBaru = new Kendaraan14("S 4567 VY", "Basko", "Mobil", 0, 0, 0); // Isi data sesuai kebutuhan

        TransaksiPajak14 transaksi1 = new TransaksiPajak14(550000, 0, 4, mobil1);
        TransaksiPajak14 transaksi2 = new TransaksiPajak14(550000, 100000, 5, mobil1);

        TransaksiPajak14 transaksi3 = new TransaksiPajak14(25000, 0, 2, motor1);
        TransaksiPajak14 transaksi4 = new TransaksiPajak14(25000, 0, 6, motor1);

        mobil1.setTransaksiPajak(transaksi1);
        transaksi1.setNext(transaksi2);
        transaksi2.setPrev(transaksi1);

        motor1.setTransaksiPajak(transaksi3);
        transaksi3.setNext(transaksi4);
        transaksi4.setPrev(transaksi3);

        Scanner sc14 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("==========Pembayaran Pajak Kendaraan Jua===========");
            System.out.println("Menu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi berdasar nama Pemilik");
            System.out.println("5. Keluar");
            System.out.println("===================================================");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc14.nextInt();
            sc14.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Kendaraan:");
                    System.out.println("------------------------------------------------------------------------");
                    System.out.printf("%-15s %-15s %-10s %-10s %-10s %-15s\n",
                            "Nomor TNKB", "Nama Pemilik", "Jenis", "CC Kendaraan", "Tahun", "Bulan harus Bayar");
                    System.out.println("------------------------------------------------------------------------");
                    displayKendaraan(mobil1);
                    displayKendaraan(mobil2);
                    displayKendaraan(motor1);
                    displayKendaraan(motor2);
                    displayKendaraan(mobil);
                    displayKendaraan(motor);
                    displayKendaraan(kendaraanBaru); 
                    System.out.println("------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Menu Bayar Pajak");
                    bayarPajak(sc14);
                    break;
                case 3:
                    System.out.println("Tampilkan seluruh transaksi:");
                    System.out.println("------------------------------------------------------------------------");
                    displayTransaksi(transaksi1);
                    displayTransaksi(transaksi2);
                    displayTransaksi(transaksi3);
                    displayTransaksi(transaksi4);
                    System.out.println("------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Menu Urutkan Transaksi berdasar nama Pemilik belum diimplementasikan.");
                    break;
                case 5:
                    System.out.println("Total pendapatan hari ini: Rp " + totalPendapatanHariIni);
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih 1-5.");
                    break;
            }
        } while (pilihan != 5);
    }

    private static void displayKendaraan(Kendaraan14 kendaraan) {
        System.out.printf("%-15s %-15s %-10s %-10s %-10s %-15s\n",
                kendaraan.getNoTNKB(), kendaraan.getNama(), kendaraan.getJenis(),
                kendaraan.getCc(), kendaraan.getTahun(), kendaraan.getBulanHarusBayar());
    }

    private static void displayTransaksi(TransaksiPajak14 transaksi) {
        Kendaraan14 kendaraan = transaksi.getKendaraan();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Kendaraan: " + kendaraan.getNama());
        System.out.println("No. TNKB: " + kendaraan.getNoTNKB());
        System.out.println("Nominal Bayar: " + transaksi.getNominalBayar());
        System.out.println("Denda: " + transaksi.getDenda());
        System.out.println("Bulan Bayar: " + transaksi.getBulanBayar());
        System.out.println("------------------------------------------------------------------------");


        totalPendapatanHariIni += transaksi.getNominalBayar();
    }

    private static void bayarPajak(Scanner sc14) {
        System.out.print("Masukkan Nomor TNKB: ");
        String noTNKB = sc14.nextLine();

        Kendaraan14 kendaraan = findKendaraanByNoTNKB(noTNKB);
        if (kendaraan != null) {
            System.out.print("Masukkan Bulan Bayar: ");
            int bulanBayar = sc14.nextInt();
            sc14.nextLine();

            long nominalBayar = hitungNominalBayar(kendaraan);
            long denda = hitungDenda(kendaraan, bulanBayar);
            TransaksiPajak14 transaksi = new TransaksiPajak14(nominalBayar, denda, bulanBayar, kendaraan);


            if (kendaraan.getTransaksiPajak() == null) {
                kendaraan.setTransaksiPajak(transaksi);
            } else {
                TransaksiPajak14 lastTransaksi = kendaraan.getTransaksiPajak();
                while (lastTransaksi.getNext() != null) {
                    lastTransaksi = lastTransaksi.getNext();
                }
                lastTransaksi.setNext(transaksi);
                transaksi.setPrev(lastTransaksi);
            }

            System.out.println("Pembayaran pajak berhasil dilakukan.");
            displayTransaksi(transaksi);
        } else {
            System.out.println("Kendaraan dengan nomor TNKB tersebut tidak ditemukan.");
        }
    }

    private static long hitungNominalBayar(Kendaraan14 kendaraan) {
        int tahunSekarang = 2024; 
        int biayaDasar = 0;
        
        if (kendaraan.getJenis().equals("Mobil")) {
            biayaDasar = 1000000; 
        } else if (kendaraan.getJenis().equals("Motor")) {
            biayaDasar = 500000; 
        }
        
        int tahunKendaraan = kendaraan.getTahun();
        int selisihTahun = tahunSekarang - tahunKendaraan;
        
       
        double tambahanBiaya = biayaDasar * selisihTahun * 0.1;
        
        long nominalBayar = biayaDasar + (long) tambahanBiaya;
        
        return nominalBayar;
    }
    
    private static long hitungDenda(Kendaraan14 kendaraan, int bulanBayar) {
       
        int bulanHarusBayar = kendaraan.getBulanHarusBayar();
        int dendaPerBulan = 50000; 
        int selisihBulan = bulanBayar - bulanHarusBayar;
        
        if (selisihBulan > 0) {
            long denda = selisihBulan * dendaPerBulan;
            return denda;
        } else {
            return 0;
        }
    }
    

    private static Kendaraan14 findKendaraanByNoTNKB(String noTNKB) {
        Kendaraan14[] kendaraanArray = {
            new Kendaraan14("S 1234 YY", "Basko", "Mobil", 2000, 2012, 4),
            new Kendaraan14("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3),
            new Kendaraan14("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2),
            new Kendaraan14("B 1234 AG", "Sisa", "Motor", 150, 2020, 1),
            new Kendaraan14("R 31 XQF", "Mitsubishi Lancer Evolution", "Mobil", 2000, 2024, 2),
            new Kendaraan14("N 4 JUA", "Yamaha XSR", "Motor", 155, 2023, 4),
            new Kendaraan14("S 4567 VY", "Basko", "Mobil", 0, 0, 0) 
        };
    
        for (Kendaraan14 kendaraan : kendaraanArray) {
            if (kendaraan.getNoTNKB().equals(noTNKB)) {
                return kendaraan;
            }
        }
        return null;
    }
}    
