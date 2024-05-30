import java.util.Scanner;

public class MainHotel14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        
        HotelService14 list = new HotelService14();
        
        Hotel14 h1 = new Hotel14("Diveland", "California", 3500000, (byte) 5);
        Hotel14 h2 = new Hotel14("Heroine", "Los Angeles", 2000000, (byte) 3);
        Hotel14 h3 = new Hotel14("Love Dive", "New York", 2700000, (byte) 4);
      
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);   
       
        System.out.println("================Data hotel sebelum sorting==================");
        list.tampil();

        System.out.println("============================================================");

        System.out.println("====Data hotel setelah sorting desc berdasarkan bintang=====");
        list.bubbleSort();
        list.tampil();

        System.out.println("======Data hotel setelah sorting desc berdasarkan harga=======");
        list.bubbleSort2();
        list.tampil();

        System.out.println("============================================================");

        System.out.println("=====Data hotel setelah sorting desc berdasarkan bintang====");
        list.selectionSort();
        list.tampil();

        System.out.println("======Data hotel setelah sorting desc berdasarkan harga=====");
        list.selectionSort2();
        list.tampil();
   
        sc14.close();
    }
}
