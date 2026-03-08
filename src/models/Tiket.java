/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import exceptions.DataTiketInvalidException;

/**
 *
 * @author Admin
 */
public abstract class Tiket {
    protected String kodeTiket;
    protected Jadwal jadwal;
    protected double hargaDasar;
    
    public Tiket(String kodeTiket,Jadwal jadwal,double hargaDasar)throws DataTiketInvalidException{
        if(hargaDasar<=0){
            throw new DataTiketInvalidException("Harga dasar tidak boleh kurang dari atau sama dengan 0");
        }
        if(!kodeTiket.startsWith("TIX")){
            throw new DataTiketInvalidException("Kode tiket harus diawali dengan TIX");
        }
        
        this.kodeTiket=kodeTiket;
        this.jadwal=jadwal;
        this.hargaDasar=hargaDasar;
        System.out.println("[INFO] Tiket berhasil diterbitkan");
    }
    public abstract double hitungHarga();
    public String getKodeTiket(){
        return kodeTiket;
    }
    public String getDetailJadwal(){
        return jadwal.getDetailJadwal();
    }
}
