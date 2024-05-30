import java.util.Scanner;

public class Tugas1_14 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'}, 
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'}, 
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'}, 
            {'B', 'O', 'G', 'O', 'R'}, 
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'}, 
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'}, 
            {'T', 'E', 'G', 'A', 'L'}};
        
        System.out.println("=============================");
        System.out.println("Pencarian Kode Plat Kendaraan");
        System.out.println("=============================");
        System.out.print("  Masukkan Kode Plat Nomor: ");
        char cari = input.next().charAt(0);
        System.out.print("Kota dengan Kode Plat Nomor Tersebut :");
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == cari) {
                for (int j = 0; j < KOTA[i].length; j++) {
                    
                    System.out.print(KOTA[i][j]);
                }
            }
        }
        

    }

}
