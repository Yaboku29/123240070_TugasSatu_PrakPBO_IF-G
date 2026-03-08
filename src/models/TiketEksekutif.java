/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import exceptions.DataTiketInvalidException;
import services.LayananEksklusif;

/**
 *
 * @author Admin
 */
public class TiketEksekutif extends Tiket implements LayananEksklusif{
    public TiketEksekutif(String kode,Jadwal jadwal,double hargaDasar)throws DataTiketInvalidException{
        super(kode, jadwal, hargaDasar);
    }
    
    @Override
    public double hitungHarga(){
        return hargaDasar+50000;
    }
    @Override
    public String getFasilitasTambahan(){
        return "Makan Siang";
    }
}
