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
public class Penumpang1841720116zakhy {
    private String ktp ;
    private String nama;
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    } 

    public Penumpang1841720116zakhy(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    
   
    
    public String getKtpzakhy() {
        return ktp;
    }

    public void setKtpzakhy(String ktp) {
        this.ktp = ktp;
    }

    public String getNamazakhy() {
        return nama;
    }

    public void setNamazakhy(String nama) {
        this.nama = nama;
    }
}
