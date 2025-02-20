public class Matakuliah12 {
   
    String kodeMK;
    String nama;
    int sks;
    int JumlahJam;

    
    public Matakuliah12() {
    }

    
    public Matakuliah12(String kodeMK, String nama, int sks, int JumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.JumlahJam = JumlahJam;
    }

       public void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + JumlahJam);
    }

        public void ubahSKS(int sks) {
        this.sks = sks;
    }

    
    void updateSks(double sks) {
        if (sks >= 0.0 && sks <= 4.0) {  
            this.sks = (int) sks;  
            System.out.println("SKS untuk mata kuliah " + nama + " telah diubah menjadi : " + this.sks);
        } else {
            System.out.println("SKS untuk mata kuliah " + nama + " tidak valid, harus antara 0.0 dan 4.0.");
        }
    }
    public void tambahJam(int jam) {
        this.JumlahJam += jam;
    }

   
    void updateTambahJam(double jam) {
        if (jam >= 0.0) {  
            this.JumlahJam += (int) jam;  
            System.out.println("Jumlah jam untuk mata kuliah " + nama + " berhasil ditambah, jumlah jam sekarang: " + this.JumlahJam);
        } else {
            System.out.println("Jumlah jam tidak valid, harus lebih besar dari atau sama dengan 0.");
        }
    }

    
    public void kurangJam(int jam) {
        this.JumlahJam -= jam;
    }

 
    void kurangJam(double jam) {
        if (jam >= 0.0 && jam <= this.JumlahJam) {  
            this.JumlahJam -= (int) jam;  
            System.out.println("Jumlah jam untuk mata kuliah " + nama + " berhasil dikurangi, jumlah jam sekarang: " + this.JumlahJam);
        } else {
            System.out.println("Pengurangan jumlah jam tidak valid, jumlah jam tidak mencukupi.");
        }
    }
}
