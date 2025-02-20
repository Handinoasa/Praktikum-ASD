public class Mahasiswa12 {
       
    String nama;
    String nim;
    String kelas;
    double ipk;  
    
    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("Ipk : " + ipk);
    }

        public Mahasiswa12(){

        }
        public Mahasiswa12(String nm, String nim, double ipk, String kls){
            nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            kelas = kls;
        }
        
     
    
    void ubahKelas(String kelasBaru) {  
        kelas = kelasBaru;
    }
    
    void updateIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {  // Perbaikan pengecekan rentang IPK
            this.ipk = ipk;  // Mengubah nilai atribut ipk
            System.out.println("IPK diperbarui menjadi: " + this.ipk);
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    
  

    
    String nilaiKinerja() {
        if (ipk >= 4.0) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik"; 
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";  
        } else {
            return "Kinerja kurang";  
        }
    }
}