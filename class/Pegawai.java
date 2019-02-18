/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package impal;

/**
 *
 * @author Adrian
 */
public class Pegawai {
    int id;
    String nama;
    String alamat;
    String notelp;
    
    public void setID(int id) {
        this.id = id;
    }
    
    public int getID() {
        return this.id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setNotelp(String notelp) {
        this.notelp= notelp;
    }
    
    public String getNotelp() {
        return this.notelp;
    }
}
