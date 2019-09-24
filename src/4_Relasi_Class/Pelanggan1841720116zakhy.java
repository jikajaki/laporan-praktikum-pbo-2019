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
public class Pelanggan1841720116zakhy {
    private String nama;
    private Mobil1841720116zakhy mobil;
    private Sopir1841720116zakhy Sopir;
    private int hari;

    public String getNamazakhy() {
        return nama;
    }

    public void setNamazakhy(String nama) {
        this.nama = nama;
    }

    public Mobil1841720116zakhy getMobilzakhy() {
        return mobil;
    }

    public void setMobilzakhy(Mobil1841720116zakhy mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720116zakhy getSopirzakhy() {
        return Sopir;
    }

    public void setSopirzakhy(Sopir1841720116zakhy Sopir) {
        this.Sopir = Sopir;
    }

    public int getHarizakhy() {
        return hari;
    }

    public void setHarizakhy(int hari) {
        this.hari = hari;
    }
    public int hitungBiayaTotalzakhy(){
        return mobil.hitungBiayaMobilzakhy(hari)+Sopir.hitungBiayaSopirzakhy(hari);
    }
}
