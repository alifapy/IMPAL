/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_impal;

/**
 *
 * @author anis
 */
public class bahan_makanan {
    int id_bahan;
    String nama_bahan;
    int jumlah;
    int harga;
    
    public void setId (int id){
        this.id_bahan = id;    
    }
    
    public int getId (){
        return this.id_bahan;
    }
    
    public void setNama_bahan (String nama_bahan){
        this.nama_bahan = nama_bahan;
    }
    
    public String getNama_bahan (){
        return this.nama_bahan;
    }
    
    public void setJumlah (int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getJumlah (){
        return this.jumlah;
    }
    
    public void setHarga (int harga){
        this.harga = harga;
    }
    
    public int getHarga (){
        return this.harga;
    }
    
}
