/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123240070_tugassatu_prakpbo_if.g;

import java.util.Scanner;
import models.Tiket;
import models.Jadwal;
import models.TiketEkonomi;
import models.TiketEksekutif;
import models.TiketLuxury;
import services.LayananEksklusif;

/**
 *
 * @author Admin
 */
public class G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Tiket[] daftarTiket=new Tiket[100];
        
        int jumlah=0;
        while (true) {            
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Selesai");
            System.out.print("Pilih: ");
            int pilih=input.nextInt();
            input.nextLine();
            
            if(pilih==2){
                break;
            }
            try {
                System.out.print("Kode Tiket: ");
                String kode=input.nextLine();
                
                System.out.print("Tanggal (DD/MM/YYYY): ");
                String tanggal=input.nextLine();
                
                System.out.print("Waktu Keberangkatan: ");
                String waktu=input.nextLine();
                
                System.out.print("Tujuan: ");
                String tujuan=input.nextLine();
                
                System.out.print("Harga Dasar: ");
                String hargaInput=input.nextLine();
                double harga;
                try {
                    harga=Double.parseDouble(hargaInput);
                    System.out.print("Kelas (1=eko,2=eks,3=lux): ");
                    String kelasInput=input.nextLine();
                    int kelas;
                    try {
                        kelas=Integer.parseInt(kelasInput);
                        Jadwal jadwal= new Jadwal(tanggal,waktu,tujuan);
                        Tiket tiket;
                        switch (kelas) {
                            case 1:
                                tiket=new TiketEkonomi(kode, jadwal, harga);
                                break;
                            case 2:
                                tiket=new TiketEksekutif(kode, jadwal, harga);
                                break;
                            case 3:
                                tiket=new TiketLuxury(kode, jadwal, harga);
                                break;
                            default:
                                throw new AssertionError();
                        }
                        if(jumlah>=100){
                            System.out.println("[MAX] Penyimpanan tiket sudah penuh");
                        }
                        else{
                            daftarTiket[jumlah++]=tiket;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("[ERROR SYSTEM] Input kelas berupa Angka!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("[ERROR SYSTEM] Input harga berupa Angka!");
                }
            } catch (Exception e) {
                System.out.println("[DITOLAK]"+e.getMessage());
            }
        }
        System.out.println("====================================");
        System.out.println("        REKAPITULASI TIKET");
        System.out.println("====================================");
        for(int i=0;i<jumlah;i++){
            System.out.println("Kode Booking : "+daftarTiket[i].getKodeTiket());
            System.out.println("Jadwal       :"+daftarTiket[i].getDetailJadwal());
            System.out.println("Total Harga  :"+daftarTiket[i].hitungHarga());
            
            if(daftarTiket[i] instanceof LayananEksklusif){
                LayananEksklusif layanan=(LayananEksklusif) daftarTiket[i];
                System.out.println("Fasilitas    : "+layanan.getFasilitasTambahan());
            }
            System.out.println("-----------------------------------");
        }
        System.out.println("Sesi loket diakhiri");
    }
    
}
