public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Mahasiswa12[] arrayOfMahasiswa12 = new Mahasiswa12[3];
        arrayOfMahasiswa12[0] = new Mahasiswa12();
        arrayOfMahasiswa12[0].nim = "244107060033";
        arrayOfMahasiswa12[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa12[0].kelas = "SIB-1E";
        arrayOfMahasiswa12[0].ipk = (float) 3.75;

        arrayOfMahasiswa12[1] = new Mahasiswa12();
        arrayOfMahasiswa12[1].nim = "2341720172";
        arrayOfMahasiswa12[1].nama = "AHMAD MAULANA HAMZAH";
        arrayOfMahasiswa12[1].kelas = "TI-2A";
        arrayOfMahasiswa12[1].ipk = (float) 3.36;

        arrayOfMahasiswa12[2] = new Mahasiswa12();
        arrayOfMahasiswa12[2].nim = "244107023006";
        arrayOfMahasiswa12[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa12[2].kelas = "TI-2E";
        arrayOfMahasiswa12[2].ipk = (float) 3.80;


        System.out.println("NIM     : " + arrayOfMahasiswa12[0].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa12[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa12[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa12[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa12[1].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa12[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa12[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa12[1].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa12[2].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa12[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa12[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa12[2].ipk);
        System.out.println("--------------------------------------");
    }
    
}