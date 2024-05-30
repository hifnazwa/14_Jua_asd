import java.util.Scanner;

public class MainFaktorial14 {

    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.print("Masukkan jumlah elemen yang ingin di hitung: ");
        int elemen = sc14.nextInt();
    
        Faktorial14 [] fk14 = new Faktorial14[elemen];
        for (int i = 0; i < elemen; i++){
            fk14 [i] = new Faktorial14();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : " );
            fk14 [i].nilai = sc14.nextInt();
        }
        
        System.out.println("=================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long startTime = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai" + fk14[i].nilai + " adalah : " + fk14[i].faktorialBF14(fk14[i].nilai));
        }
        long endTime = System.nanoTime();
        double timeTakenBF = (endTime - startTime)/ 1_000_000_000.0;
        System.out.println("Waktu eksekusi Brute Force: " + (timeTakenBF) + " seconds");
        
        startTime = System.nanoTime();
        System.out.println("=================================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk14[i].nilai + " adalah : " + fk14[i].faktorialDC14(fk14[i].nilai));
        }
        endTime = System.nanoTime();
        double timeTakenDC = (endTime - startTime)/ 1_000_000_000.0;
        System.out.println("Waktu eksekusi Brute Force: " + (timeTakenDC) + " seconds");
        System.out.println("=================================================");

    }
}
