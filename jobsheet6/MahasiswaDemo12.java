
import java.util.Scanner;
public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = sc.next();
            System.out.print("Nama    : ");
            String nama = sc.next();
            System.out.print("Kelas   : ");
            String kelas = sc.next();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            
            Mahasiswa12 m = new Mahasiswa12(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data Mahasiswa (belum diurutkan): ");
        list.tampil();
        System.out.println();
        
        System.out.println("Data yang sudah terurut menggunakan BUBBLE SORT (ASC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}