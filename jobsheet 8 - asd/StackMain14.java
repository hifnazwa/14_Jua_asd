import java.util.Scanner;
import java.util.Stack;

public class StackMain14 {
    public static void main(String[] args) {
    
    StackPakaian14 stk14 = new StackPakaian14(5);
    Scanner sc14 = new Scanner(System.in);

     char pilih;
    
    do{
        System.out.print("Jenis: ");
        String jenis = sc14.nextLine();
        System.out.print("Warna: ");
        String warna = sc14.nextLine();
        System.out.print("Merk: ");
        String merk = sc14.nextLine();
        System.out.print("Ukuran: ");
        String ukuran = sc14.nextLine();
        System.out.print("Harga: ");
        double harga = sc14.nextDouble();

        Pakaian14 p14 = new Pakaian14(jenis, warna, merk, ukuran, harga);
        System.out.print("Apakah anda akan menambahakan data baru ke stack (y/n)? ");
        pilih = sc14.next().charAt(0);
        sc14.nextLine();
        stk14.push(p14);
    } while (pilih == 'y');

    int input;
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nPilih operasi stack yang di inginkan: ");
            System.out.println("1. Fungsi Pop");
            System.out.println("2. Fungsi Peek");
            System.out.println("3. Print");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            input = sc14.nextInt();

            switch (input) {
                case 1:
                    stk14.pop();
                    break;
                case 2:
                    stk14.peek();
                    break;
                case 3:
                    stk14.print();
                    break;
                case 4:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan anda salah harap ulangi lagi");
            }
        }

        System.out.println("Program selesai.");
        sc14.close();

    }

}