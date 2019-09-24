/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author Ahmad Muzakhy
 */
public class Pegawai1841720116zakhy {

   private String nip;
   private String nama;

    public Pegawai1841720116zakhy(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
   public String info(){ 
       String info ="";
       info +="Nip :"+this.nip +"\n";
       info +="Nama:"+this.nama+"\n";
       return info;
       
   }     
}
