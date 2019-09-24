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
public class Mobil1841720116zakhy {
     private String merk;
    private int biaya;

    public String getMerk() {
        return merk;
    }

    public void setMerkzakhy(String merk) {
        this.merk = merk;
    }

    public int getBiayazakhy() {
        return biaya;
    }

    public void setBiayazakhy(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobilzakhy(int hari){
        return biaya*hari;
    }
}
