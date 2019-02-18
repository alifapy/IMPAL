/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impal;

/**
 *
 * @author user
 */
public class order {
    int id_pesanan;
    String nama_pesanan;
    int jumlah_pesanan;
    
    public void setID(int id_pesanan){
        this.id_pesanan = id_pesanan;
    }
    public int getID(){
        return this.id_pesanan;
    }
    
    public void setNama(String nama_pesanan){
        this.nama_pesanan = nama_pesanan;
    }
    public String getNama(){
        return this.nama_pesanan;
    }
    
    public void setJumlah(int jumlah_pesanan){
        this.jumlah_pesanan = jumlah_pesanan;
    }
    public int getJumlah(){
        return this.jumlah_pesanan;
    }
}

