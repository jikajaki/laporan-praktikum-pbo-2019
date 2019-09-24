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
public class Gerbong1841720116zakhy {
    private String kode;
    private Kursi1841720116zakhy[] arrayKursi;

    public Gerbong1841720116zakhy(String kode, Kursi1841720116zakhy[] arrayKursi) {
        this.kode = kode;
        this.arrayKursi = arrayKursi;
    }
    private void initKursi(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi1841720116zakhy(String.valueOf(i + 1));
        }
    }
    
    public Gerbong1841720116zakhy(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi1841720116zakhy[jumlah];
        this.initKursi();
    }
    
    public String infozakhy(){
        String info = "";    
        info += "Kode: " + kode + "\n";
        for(Kursi1841720116zakhy kursi : arrayKursi){
            info += kursi.infozakhy();
        }    
        return info;
    }
    
    public void setPenumpangzakhy(Penumpang1841720116zakhy penumpang, int nomor){
        this.arrayKursi[nomor - 1].setPenumpangzakhy(penumpang);
    }
}
