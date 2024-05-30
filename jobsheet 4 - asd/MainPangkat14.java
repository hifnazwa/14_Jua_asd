import java.util.Scanner;

public class MainPangkat14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);
        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc14.nextInt();

        Pangkat14 [] png14 = new Pangkat14 [elemen];

        for (int i = 0; i < elemen; i++) {
            png14 [i] = new Pangkat14();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            png14[i].nilai = sc14.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            png14[i].pangkat = sc14.nextInt();
        }

        System.out.println("==============================================");
        System.out.println("Pilih metode yang ingin dijalankan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = sc14.nextInt();

        while (true) {
            switch (pilih) {
                case 1:
                System.out.println("==============================================");
                System.out.println("   Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png14[i].nilai + " pangkat " + png14[i].pangkat + " adalah : " + png14[i].pangkatBF14(png14[i].nilai, png14[i].pangkat));
                } break;
                case 2:
                System.out.println("==============================================");
                System.out.println("  Hasil pangkat dengan Devide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png14[i].nilai + " pangkat " + png14[i].pangkat + " adalah : " + png14[i].pangkatDC14(png14[i].nilai, png14[i].pangkat));
                } break;
                
                default: 
                System.out.println("==============================================");
                System.out.println("==============================================");
                    System.out.println("Pilih metode yang ingin dijalankan:");
                    System.out.println("1. Brute Force");
                    System.out.println("2. Divide and Conquer");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = sc14.nextInt();
            }
            if (pilih == 1 || pilih == 2) {
                break;
                
                    
            }
            
        }
}
}