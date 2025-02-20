import java.util.Scanner;

public class MahasiswaMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Mahasiswa12 mhs1 = new Mahasiswa12();  

        
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");  
        mhs1.updateIpk(3.60);     
        mhs1.tampilkanInformasi();

       
        Mahasiswa12 mhs2 = new Mahasiswa12 ("Anissa Nabila", "2141720106", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);  
        mhs2.tampilkanInformasi();

        Mahasiswa12 mhsHandino = new Mahasiswa12 ("Handino Asa Galih R", "244107020237", 3.45, "TI 1E"); 
        mhsHandino.tampilkanInformasi();

        sc.close();
    }
}
