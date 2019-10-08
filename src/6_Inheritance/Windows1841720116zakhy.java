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
public class Windows1841720116zakhy extends laptop1841720116zakhy{
    
    public String fitur;

    public Windows1841720116zakhy() {
    }

    public Windows1841720116zakhy(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindowszakhy() {
        super.tampillaptopzakhy();
        System.out.println("Fitur\t\t: " + fitur);
    }
}
