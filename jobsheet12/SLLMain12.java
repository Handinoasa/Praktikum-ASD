
import java.util.Scanner;


public class SLLMain12 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  
        SingleLinkedList12 sll = new SingleLinkedList12();

        int jml = 50;
        for (int i = 0; i < jml ; i++) {
            System.out.println("Tambahkan data mahasiswa ke- " + (i + 1) + " : ");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa12 mhs = new Mahasiswa12(nim, nama, kelas, ipk);
            sll.addFirst(mhs);
            System.out.println();
            System.out.print("Apakah ada yang ingin ditambahkan lagi? (y/n) : ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih. Have a Nice Day");
                break;
                }
        }

        Mahasiswa12 mhs1 = new Mahasiswa12("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa12 mhs2 = new Mahasiswa12("23212201", "Bimon", "2B", 3.8);
        Mahasiswa12 mhs3 = new Mahasiswa12("22212206", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs4 = new Mahasiswa12("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
       
    }
}