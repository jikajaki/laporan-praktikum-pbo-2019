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
public class laptop1841720116zakhy extends Komputer1841720116zakhy{
    
    public String jnsBaterai;

    public laptop1841720116zakhy() {
    }

    public laptop1841720116zakhy(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampillaptopzakhy() {
        super.tampilDatazakhy();
        System.out.println("Baterai\t\t: " + jnsBaterai);
    }
}
