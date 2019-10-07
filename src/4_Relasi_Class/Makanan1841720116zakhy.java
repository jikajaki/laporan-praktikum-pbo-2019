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
public class Makanan1841720116zakhy {
     private String jenis;
    private String nama;

    public Makanan1841720116zakhy() {
    }

    public Makanan1841720116zakhy(String jenis, String nama) {
        this.jenis = jenis;
        this.nama = nama;
    }
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String info()
    {
    String info = "";
    info += "Jenis Makanan: " + jenis + "\n";
    info += "Nama Makanan: " + nama + "\n";
    return info;
    }
    
}
