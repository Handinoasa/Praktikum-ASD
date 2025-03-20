public class Kuis12 {
    
    public String nim;
    public String nama;
    public double nilaiKuis;
    public double nilaiUTS;
    public double nilaiUAS;

    void hitungnilaiakhir(Kuis12[] arrayOfMahasiswa12 int n ) {
       
        System.out.println("========== nilai akhir =========");
        
        int nilaiakhir = arrayOfDosen[0].nilai;

        int b = 0;
        for (int i = 1; i < n; i++) {
            if (termuda > arrayOfMahasiswa12[i].nilai) {
                termuda = arrayOfMahasiswa12[i].nilai;
                b = i;
            }
        }
        System.out.println("hitung nilai akhir : " + arrayOfMahasiswa12[b].nama);
        System.out.println();

    }



