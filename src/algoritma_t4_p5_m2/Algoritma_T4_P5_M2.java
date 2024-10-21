/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritma_t4_p5_m2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Algoritma_T4_P5_M2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nomorAntrian = 1; 
        
        while (true) {
            // Pilihan Poli
            System.out.println("Pilih Poli:");
            System.out.println("1. Poli Mata");
            System.out.println("2. Poli Gigi");
            System.out.println("3. Poli Kulit");
            System.out.println("0. Keluar");
            
            int pilihanPoli = scanner.nextInt();
            
            if (pilihanPoli == 0) {
                // Pengguna memilih untuk keluar dari program
                System.out.println("Terima kasih. Program berhenti.");
                break;
            }    
            // Inisialisasi Variabel
            String nomorRekamMedis, namaPasien, alamatPasien; 
            
            switch (pilihanPoli) {
                case 1:
                    System.out.println("Anda memilih Poli Mata.");
                    break;
                case 2:
                    System.out.println("Anda memilih Poli Gigi.");
                    break;
                case 3:
                    System.out.println("Anda memilih Poli Kulit.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    continue;
            }
            // Pengisian Informasi Pasien
            System.out.println("Masukkan Nomor Rekam Medis:");
            nomorRekamMedis = scanner.next();
            System.out.println("Masukkan Nama Pasien:");
            namaPasien = scanner.next();
            System.out.println("Masukkan Alamat Pasien:");
            alamatPasien = scanner.next();
            
            // Menampilkan Informasi Pendaftaran
            System.out.println("\nInformasi Pendaftaran:");
            System.out.println("Nomor Antrian: " + nomorAntrian);
            System.out.println("Poli: " + pilihanPoli);
            System.out.println("Nomor Rekam Medis: " + nomorRekamMedis);
            System.out.println("Nama Pasien: " + namaPasien);
            System.out.println("Alamat Pasien: " + alamatPasien);
            
            // Increment nomor antrian untuk pasien berikutnya
            nomorAntrian++;
        }scanner.close();
    }
  }    

