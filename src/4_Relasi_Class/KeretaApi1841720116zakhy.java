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
public class KeretaApi1841720116zakhy {
     private String nama;
     private String kelas;
     private Pegawai1841720116zakhy masinis;
     private Pegawai1841720116zakhy asisten;



    public KeretaApi1841720116zakhy(String nama, String kelas, Pegawai1841720116zakhy masinis, Pegawai1841720116zakhy asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamazakhy() {
        return nama;
    }

    public void setNamazakhy(String nama) {
        this.nama = nama;
    }

    public String getKelaszakhy() {
        return kelas;
    }

    public void setKelaszakhy(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai1841720116zakhy getMasiniszakhy() {
        return masinis;
    }

    public void setMasiniszakhy(Pegawai1841720116zakhy masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720116zakhy getAsistenzakhy() {
        return asisten;
    }

    public void setAsistenzakhy(Pegawai1841720116zakhy asisten) {
        this.asisten = asisten;
    }
    
    public String infozakhy(){
        String info ="";
        info +="nama:"+this.nama+"\n";
        info +="Kelas:"+this.kelas+"\n";
        info +="Masinis"+this.masinis.info()+"\n";
        info +="Asisten"+this.asisten.info()+"\n";
        return info;
        }
}
