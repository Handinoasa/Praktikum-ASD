import java.util.Scanner;
    public class MatakuliahDemo12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan Jumlah Mata Kuliah: ");
            int jumlahMatakuliah = Integer.parseInt(sc.nextLine());

            Matakuliah12[] arrayOfMatakuliah = new Matakuliah12[3];
            String kode, nama;
            int sks, jumlahJam;
    
            for (int i = 0; i < jumlahMatakuliah; i++) {
                System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
                System.out.print("Kode        : ");
                kode = sc.nextLine();
                System.out.print("Nama        : ");
                nama = sc.nextLine();
                System.out.print("SKS         : ");
                sks = Integer.parseInt(sc.nextLine());
                System.out.print("Jumlah Jam  : ");
                jumlahJam = Integer.parseInt(sc.nextLine());
                System.out.println("------------------------------");
                
                arrayOfMatakuliah[i] = new Matakuliah12(kode, nama, sks, jumlahJam);
            }
    
            for(int i = 0; i < jumlahMatakuliah; i++) {
                System.out.println("Data Matakuliah ke-" + (i + 1));
                arrayOfMatakuliah[i].cetakInfo();
            }

            Matakuliah12 matkulTmbhn = new Matakuliah12("244", "Matematika", 3, 5);
            matkulTmbhn.tambahData();
        }  
    }