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
public class Pelayan1841720116zakhy {
    private String nama;
    private int id;

    public Pelayan1841720116zakhy() {
    }
    
    

    public Pelayan1841720116zakhy(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String info()
    {
    String info = "";
    info += "Nama Pelayan: " + nama + "\n";
    info += "ID Pelayan: " + id + "\n";
    return info;
    }
}
