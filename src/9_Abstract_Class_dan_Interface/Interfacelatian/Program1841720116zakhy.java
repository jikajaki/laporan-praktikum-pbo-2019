/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacelatian;

/**
 *
 * @author Ahmad Muzakhy
 */
public class Program1841720116zakhy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rektor1841720116zakhy pr = new Rektor1841720116zakhy();

//        Mahasiswa mb = new Mahasiswa("Charlie");
        Sarjana1841720116zakhy sc = new Sarjana1841720116zakhy("Zakhy");
        PascaSarjana1841720116zakhy mc = new PascaSarjana1841720116zakhy("Gisanda");


        
  //      pr.beriSertifikatCumlaude(mb);
        pr.beriSertifikatCumlaude(sc);
        pr.beriSertifikatCumlaude(mc);

        pr.beriSertifikatMawapres(sc);
        pr.beriSertifikatMawapres(mc);
    }
}
    

