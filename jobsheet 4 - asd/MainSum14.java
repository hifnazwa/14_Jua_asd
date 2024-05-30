import java.util.Scanner;

public class MainSum14 {
    
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.println("========================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.println("========================================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int perusahaan = sc14.nextInt();
        Sum14[] sm = new Sum14[perusahaan];

        for (int i = 0; i < perusahaan; i++) {
            System.out.println("========================================================================");
            System.out.println("Perusahaan ke-" + (i+1));
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc14.nextInt();
            sm[i] = new Sum14(elm);
            System.out.println("========================================================================");

            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke- " + (j+1) + " = ");
                sm[i].keuntungan[j] = sc14.nextDouble();
            }

            System.out.println("========================================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
           System.out.println("========================================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
            System.out.println("===========================================================================");
        }
   } 
}