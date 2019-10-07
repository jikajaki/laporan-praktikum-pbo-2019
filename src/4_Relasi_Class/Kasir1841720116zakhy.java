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
public class Kasir1841720116zakhy {
    private String nama;
    private String harga;
    private Pelayan1841720116zakhy waiters;
    private Pembeli1841720116zakhy pelanggan;
    private Makanan1841720116zakhy menu;
    private int meja;

    public Kasir1841720116zakhy(String nama, Pembeli1841720116zakhy pembeli, Makanan1841720116zakhy makanan, int meja) {
        this.nama = nama;
        this.pelanggan = pembeli;
        this.menu = makanan;
        this.meja = meja;
    }

    public Kasir1841720116zakhy(String nama, Pelayan1841720116zakhy pelayan, Makanan1841720116zakhy makanan, int meja) {
        this.nama = nama;
        this.waiters = pelayan;
        this.menu = makanan;
        this.meja = meja;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Pelayan1841720116zakhy getWaiters() {
        return waiters;
    }

    public void setWaiters(Pelayan1841720116zakhy waiters) {
        this.waiters = waiters;
    }

    public Pembeli1841720116zakhy getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pembeli1841720116zakhy pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Makanan1841720116zakhy getMenu() {
        return menu;
    }

    public void setMenu(Makanan1841720116zakhy makanan) {
        this.menu = makanan;
    }

    public int getMeja() {
        return meja;
    }

    public void setMeja(int meja) {
        this.meja = meja;
    }
    
    public String info() 
    { 
        String info = ""; 
        info += "Nama: " + this.nama + "\n"; 
        info += "Kelas: " + this.meja + "\n"; 
        info += "" + this.waiters.info() + "\n";
        info += "" + this.menu.info() + "\n";
    return info; 
    }
}

