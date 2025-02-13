import java.util.Scanner;

public class Pemilihan {

    // Fungsi untuk memvalidasi nilai yang dimasukkan (0-100)
    public static boolean validasiNilai(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    // Fungsi untuk mengonversi nilai akhir ke dalam huruf
    public static String konversiNilai(double nilaiAkhir) {
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            return "A";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            return "B+";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            return "B";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            return "C+";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            return "C";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            return "D";
        } else {
            return "E";
        }
    }

    // Fungsi untuk menghitung nilai akhir mahasiswa
    public static String hitungNilaiAkhir() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Penghitung Nilai Akhir Mahasiswa");
        System.out.println("========================================");
        
        // Input nilai
        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = scanner.nextDouble();
        if (!validasiNilai(nilaiTugas)) {
            return "Nilai tugas tidak valid. Nilai harus di antara 0 dan 100.";
        }
        
        System.out.print("Masukkan nilai kuis (0-100): ");
        double nilaiKuis = scanner.nextDouble();
        if (!validasiNilai(nilaiKuis)) {
            return "Nilai kuis tidak valid. Nilai harus di antara 0 dan 100.";
        }
        
        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUts = scanner.nextDouble();
        if (!validasiNilai(nilaiUts)) {
            return "Nilai UTS tidak valid. Nilai harus di antara 0 dan 100.";
        }
        
        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUas = scanner.nextDouble();
        if (!validasiNilai(nilaiUas)) {
            return "Nilai UAS tidak valid. Nilai harus di antara 0 dan 100.";
        }
        
        // Hitung nilai akhir
        double nilaiAkhir = (nilaiTugas * 0.2) +  // 20% dari nilai tugas
                            (nilaiKuis * 0.2) +   // 20% dari nilai kuis
                            (nilaiUts * 0.3) +    // 30% dari nilai UTS
                            (nilaiUas * 0.3);     // 30% dari nilai UAS
        
        // Konversi nilai akhir ke dalam huruf
        String grade = konversiNilai(nilaiAkhir);
        
        return String.format("Nilai akhir mahasiswa: %.2f\nGrade: %s", nilaiAkhir, grade);
    }

    public static void main(String[] args) {
        try {
            String hasil = hitungNilaiAkhir();
            System.out.println(hasil);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan angka.");
        }
    }
}
