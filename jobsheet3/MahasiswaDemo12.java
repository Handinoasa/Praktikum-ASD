public class MahasiswaDemo12 {

    public static void main(String[] args) {
       
        Mahasiswa12[] arrayOfMahasiswa = new Mahasiswa12[3];

        arrayOfMahasiswa[0] = new Mahasiswa12();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = 3.75f;

        arrayOfMahasiswa[1] = new Mahasiswa12();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = 3.36f;

        arrayOfMahasiswa[2] = new Mahasiswa12();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DHARMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = 3.80f;

       
        System.out.println("NIM    : " + arrayOfMahasiswa[0].nim);
        System.out.println("NAMA   : " + arrayOfMahasiswa[0].nama);
        System.out.println("KELAS  : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[0].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM    : " + arrayOfMahasiswa[1].nim);
        System.out.println("NAMA   : " + arrayOfMahasiswa[1].nama);
        System.out.println("KELAS  : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[1].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM    : " + arrayOfMahasiswa[2].nim);
        System.out.println("NAMA   : " + arrayOfMahasiswa[2].nama);
        System.out.println("KELAS  : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[2].ipk);
        System.out.println("-----------------------------------");
    }
}
