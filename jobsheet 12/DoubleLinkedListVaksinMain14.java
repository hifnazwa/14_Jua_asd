import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class DoubleLinkedListVaksinMain14 {
      public static void menu(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN JUA COMPANY");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(" 1. Tambah Data Penerima Vaksin\n 2. Hapus Data Pengantri Vaksin\n 3. Daftar Penerima Vaksin\n 4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }
    public static void main(String[] args)throws Exception  {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
    
        DoubleLinkedListVaksin14 dll = new DoubleLinkedListVaksin14();
    
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    System.out.println("=============================");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("=============================");
                    System.out.println("Nomor Antrian\t: ");
                    int nim = sd.nextInt();
                    System.out.println("Nama Penerima\t: ");
                    String nama = sc.next();
                    dll.addLast(nim, nama);
                    sc.nextLine();
                break;
            
                case 2:
                    dll.removeFirst();
                    dll.print();
                break;
            
                case 3:
                    dll.print();
                break;
            
                case 4:
                    System.exit(0);
                break;
            
            } 
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 );
    }
}