/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js9.abstractclass;

/**
 *
 * @author Ahmad Muzakhy
 */
public class Program1841720116zakhy {
    public static void main(String[] args) {
        Kucing1841720116zakhy kucingKampung = new Kucing1841720116zakhy();
        Ikan1841720116zakhy lumbalumba = new Ikan1841720116zakhy();
        
        Manusia1841720116zakhy gisa = new Manusia1841720116zakhy("Gisa");
        Manusia1841720116zakhy zakhy = new Manusia1841720116zakhy("Zakhy");
        
        gisa.peliharaHewan(lumbalumba);
        zakhy.peliharaHewan(kucingKampung);
        
        gisa.ajakPeliharaanJalanJalan();
        zakhy.ajakPeliharaanJalanJalan();
    }
}
