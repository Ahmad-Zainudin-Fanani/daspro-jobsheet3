import java.util.Scanner;
/**
 * Siakad02
 */
public class Siakad02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi variabel dengan tipe data String
        String nama, nim;
        // Deklarasi variabel dengan tipe data char
        String kelas;
        // Deklarasi variabel dengan tipe data byte
        byte absen;
        // Deklarasi variabel dengan tipe data double
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS) / 3;

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        
        // Menghitung nilai akhir berdasarkan bobot
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        sc.close();
    }
}