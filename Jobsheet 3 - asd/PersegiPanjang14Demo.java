import java.util.Scanner;

public class PersegiPanjang14Demo {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        System.out.println("Masukkan banyak persegi panjang yang anda inginkan: ");
        int length = sc14.nextInt();

        PersegiPanjang14[] arrayOfPersegiPanjang14 = new PersegiPanjang14[3];
        int panjang, lebar;

        for (int i = 0; i < length; i++) {
            System.out.println("-------------------------------------");
            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            panjang = sc14.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc14.nextInt();

            arrayOfPersegiPanjang14[i] = new PersegiPanjang14 (panjang, lebar);
        }
        System.out.println();

        for (int i = 0 ; i <length; i++) {
            System.out.println("Persegi Panjang ke-" + (i + 1));
            arrayOfPersegiPanjang14[i].cetakInfo();
            System.out.println();
    
        }

    for(int i = 0; i < length; i++){
        System.out.println();
        System.out.println("=================================================");
        System.out.println("Persegi panjang ke- " + (i+1) + ", panjang: "
        +arrayOfPersegiPanjang14[i].panjang + ", lebar: " + arrayOfPersegiPanjang14[i].lebar); ;
        System.out.println("Luas: " + arrayOfPersegiPanjang14[i].hitungLuas());
        System.out.println("Keliling: " + arrayOfPersegiPanjang14[i].hitungKeliling());
        System.out.println("===================================================");
    }

}
}
