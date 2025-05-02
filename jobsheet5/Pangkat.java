public class Pangkat {
    int nilai, pangkat;

    
    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

   
    int pangkatBF() {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }

  
    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = pangkatDC(a, n / 2); 
        if (n % 2 == 1) {
            return temp * temp * a; 
        } else {
            return temp * temp; 
        }
    }
}