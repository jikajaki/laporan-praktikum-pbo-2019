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
public class Manusia1841720116zakhy {
    private String nama;
    private Binatang1841720116zakhy hewanPeliharaan;
    
    public Manusia1841720116zakhy(String nama){
        this.nama= nama;
}
    public void peliharaHewan(Binatang1841720116zakhy hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+ this.nama);
        System.out.println("Hewan Peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------------------------------");
    }
}
