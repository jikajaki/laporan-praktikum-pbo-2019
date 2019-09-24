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
public class Mainpercobaan2_1841720116zakhy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mobil1841720116zakhy m = new Mobil1841720116zakhy();
    m.setMerkzakhy("Avanza");
    m.setBiayazakhy(350000);
    Sopir1841720116zakhy s = new Sopir1841720116zakhy();
    s.setNamazakhy("john Doe");
    s.setBiayazakhy(200000);
    Pelanggan1841720116zakhy p = new Pelanggan1841720116zakhy();
    p.setMobilzakhy(m);
    p.setSopirzakhy(s);
    p.setHarizakhy(2);
         System.out.println("Biaya Total ="+p.hitungBiayaTotalzakhy()); 
    }
    
}
