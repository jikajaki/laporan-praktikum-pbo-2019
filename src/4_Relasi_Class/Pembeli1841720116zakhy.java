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
public class Pembeli1841720116zakhy {
    private String nama;
    private String pesanan;
    private int nomor;

    public Pembeli1841720116zakhy() {
    }

    public Pembeli1841720116zakhy(String nama, String pesanan, int nomor) {
        this.nama = nama;
        this.pesanan = pesanan;
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }
    
    public String info()
    {
    String info = "";
    info += "Nama Pelanggan: " + nama + "\n";
    info += "Nama Pesanan: " + pesanan + "\n";
    info += "Nomor Antrian: " + nomor + "\n";
    return info;
    }
}
