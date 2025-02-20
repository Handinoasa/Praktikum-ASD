public class Matakuliahmain12 {
    public static void main(String[] args) {
        
        
        Matakuliah12 matkul1 = new Matakuliah12("TI2441070", "Algoritma dan Struktur Data", 2, 3);
        
      
        matkul1.tampilkanInformasi();
    
        matkul1.ubahSKS(3);
        matkul1.tambahJam(2);
        matkul1.tampilkanInformasi();
        
        
        matkul1.updateTambahJam(5);
        matkul1.tampilkanInformasi();
        
       
        matkul1.kurangJam(1);
        matkul1.tampilkanInformasi();
        

        matkul1.updateSks(3.5);
        matkul1.tampilkanInformasi();
       

        matkul1.kurangJam(2.5);
        matkul1.tampilkanInformasi();
    }
}
