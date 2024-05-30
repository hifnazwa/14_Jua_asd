/**
 * PersegiPanjang14
 */
public class PersegiPanjang14 {
    public int panjang;
    public int lebar;

    public PersegiPanjang14(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void cetakInfo() {
      
        System.out.println("Panjang: "+ panjang);
        System.out.println("Lebar: + " + lebar);
    }

    
    public int hitungLuas() {
        return panjang*lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
}