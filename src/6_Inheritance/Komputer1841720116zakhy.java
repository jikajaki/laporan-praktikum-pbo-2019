/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js6;

/**
 *
 * @author Ahmad Muzakhy
 */
public class Komputer1841720116zakhy {
     public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer1841720116zakhy() {
    }

    public Komputer1841720116zakhy(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }

    public void tampilDatazakhy() {
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Prosesor\t: " + jnsProsesor);
        System.out.println("Kec Prosesor\t: " + kecProsesor + " Ghz");
        System.out.println("Memory\t\t: " + sizeMemory + " GB");
    }
}
