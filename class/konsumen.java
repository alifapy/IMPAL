/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class konsumen {
    int harga_pesanan;
    int total_pesanan;
    int id_pesanan;
    String nama_pesanan;
    int jumlah_pesanan;
    
   public void setHarga(int harga){
       this.harga_pesanan = harga;
   }
   
   public int getHarga(){
       return this.harga_pesanan;
   }
   
   public void setTotal(int total){
       this.total_pesanan = total;
   }
   
   public int getTotal(){
       return this.total_pesanan;
   }
   
   public void setID(int id){
       this.id_pesanan = id;
   }
   
   public int getID(){
       return this.id_pesanan;
   }
   
   public void setNama(String nama){
       this.nama_pesanan = nama;
   }
   
   public String getNama(){
       return this.nama_pesanan;
   }
   
   public void setJumlah(int jumlah){
       this.jumlah_pesanan = jumlah;
   }
   
   public int getJumlah(){
       return this.jumlah_pesanan;
   }
}
