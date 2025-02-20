public class DosenMain12 {
    public static void main(String[] args) {
        
        
        Dosen12 dosen1 = new Dosen12("D001", "Dr. Ahmad Taufik", true, 2015, "Ilmu Komputer");
        
       
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Ahmad Taufik";
        dosen1.bidangKeahlian = "Machine Learning";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.tampilInformasi(); 

       
        dosen1.ubahKeahlian("Artificial Intelligence");
        dosen1.tampilInformasi();  

        
        Dosen12 dosen2 = new Dosen12("D002", "Prof. Akram Ramdani", true, 2015, "Cyber Security");
        dosen2.tampilInformasi();  

        Dosen12 dosen3 = new Dosen12("D003", "Dr. Isma Aghniya", false, 2019, "Data Science");
        dosen3.tampilInformasi();  

    
        dosen3.setStatusAktif(true);
        dosen3.tampilInformasi();  

        int tahunSekarang = 2025;
        System.out.println(dosen1.nama + " memiliki masa kerja " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun.");
        System.out.println(dosen2.nama + " memiliki masa kerja " + dosen2.hitungMasaKerja(tahunSekarang) + " tahun.");
        System.out.println(dosen3.nama + " memiliki masa kerja " + dosen3.hitungMasaKerja(tahunSekarang) + " tahun.");
    }
}
