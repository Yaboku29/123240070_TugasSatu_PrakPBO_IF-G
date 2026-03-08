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
public class TiketEkonomi extends Tiket{
    public TiketEkonomi(String kode,Jadwal jadwal,double hargaDasar) throws DataTiketInvalidException{
        super(kode, jadwal, hargaDasar);
    }
    
    @Override
    public double hitungHarga(){
        return hargaDasar;
    }
}
