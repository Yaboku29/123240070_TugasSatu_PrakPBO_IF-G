/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class Jadwal {
    private String tanggal;
    private String waktu;
    private String tujuan;
    
    public Jadwal(String tanggal, String waktu, String tujuan){
        this.tanggal=tanggal;
        this.waktu=waktu;
        this.tujuan=tujuan;
    }
    
    public String getDetailJadwal(){
        return tanggal+" "+waktu+" - "+tujuan;
    }
}
