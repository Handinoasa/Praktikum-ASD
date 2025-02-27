
import java.util.Scanner;
public class MatakuliahDemo12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        Matakuliah12[] arrayOfMatakuliah = new Matakuliah12[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("SKS           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah12(kode, nama, sks, jumlahJam);
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS         : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("-----------------------------------");
        }
    }
}