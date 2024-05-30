import java.util.Scanner;

public class InformasiMhs14Demo {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        InformasiMhs14[] arrayOfInformasiMhs14 = new InformasiMhs14[3];

        double total,rataRata;

        for (int i = 0; i < 3; i++) {
            arrayOfInformasiMhs14[i] = new InformasiMhs14();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            arrayOfInformasiMhs14[i].nama = sc14.nextLine();
            System.out.print("Masukkan nim mahasiswa: ");
            arrayOfInformasiMhs14[i].nim = sc14.nextInt();
            System.out.print("Masukkan jenis kelamin Mahasiswa: ");
            arrayOfInformasiMhs14[i].jenisKelamin = sc14.next();
            System.out.print("Masukkan Ipk Mahasiswa: ");
            arrayOfInformasiMhs14[i].Ipk = sc14.nextDouble();
            System.out.println();


            sc14.nextLine();

        }

            for (int i = 0; i < 3; i++) {
                System.out.println("======================================================");
                System.out.println("Mahasiswa ke-" + (i+1));
                System.out.println("Nama: " + arrayOfInformasiMhs14[i].nama);
                System.out.println("Nim: " + arrayOfInformasiMhs14[i].nim);
                System.out.println("Jenis kelamin: " + arrayOfInformasiMhs14[i].jenisKelamin);
                System.out.println("Ipk: " + arrayOfInformasiMhs14[i].Ipk);
                System.out.println("===================================================== ");
            }
            total = 0;
            for (int i = 0; i < arrayOfInformasiMhs14.length; i++) {
                total = total+ arrayOfInformasiMhs14[i].Ipk;
            }
            rataRata = total / arrayOfInformasiMhs14.length;
            
            System.out.println("Rata-rata IPK Mahasiswa: " + rataRata);
        }
    }
        

    
    

