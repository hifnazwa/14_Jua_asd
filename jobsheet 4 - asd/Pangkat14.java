public class Pangkat14 {
    public int nilai, pangkat;

    public int pangkatBF14 (int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkatDC14 (int a, int n) {
        if (n==0) {
            return 1;
        }
        else {
            if (n%2==1) {
                return (pangkatDC14(a, n/2)*pangkatDC14(a,n/2)*a);
            } else {
                return (pangkatDC14(a, n/2)*pangkatDC14(a, n/2));
            }
        }
    }

    public Pangkat14() {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public Pangkat14(int nilai2, int pangkat2) {
        
    }


}
