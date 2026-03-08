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
public class TiketLuxury extends Tiket implements LayananEksklusif{
    public TiketLuxury(String kode,Jadwal jadwal,double hargaDasar)throws DataTiketInvalidException{
        super(kode, jadwal, hargaDasar);
    }
    @Override
    public double hitungHarga(){
        return hargaDasar+150000;
    }
    @Override
    public String getFasilitasTambahan(){
        return "Makan Siang dan Kursi Sleeper";
    }
}
