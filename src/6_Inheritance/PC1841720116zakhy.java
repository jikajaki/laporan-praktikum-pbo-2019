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
public class PC1841720116zakhy extends Komputer1841720116zakhy {
    int ukuranMonitor;

    public PC1841720116zakhy() {
    }

    public PC1841720116zakhy(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }


    public void tampilPCzakhy() {
        super.tampilDatazakhy();
        System.out.println("Ukuran Monitor\t: " + ukuranMonitor + " inci");
    }
}
