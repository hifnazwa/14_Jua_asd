/**
 * Faktorial14
 */
public class Faktorial14 {

    public int nilai;

    public int faktorialBF14 (int n) {
        int fakto14 = 1;
        for(int i = 1; i<= n; i++) {
            fakto14 = fakto14 * i;
        }
        return fakto14;
    }

    public int faktorialDC14 (int n) {
        if (n==1) {
            return 1;
        }
        else {
            int fakto14 = n * faktorialDC14(n-1);
            return fakto14;
        }
    }
    
}