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
public class Mainpercobaan3_1841720116zakhy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Pegawai1841720116zakhy masinis = new Pegawai1841720116zakhy ("1234", "SpongebobSqurepants");
        Pegawai1841720116zakhy  asisten = new Pegawai1841720116zakhy ("4567","Patrick Star");
        KeretaApi1841720116zakhy keretaApi = new KeretaApi1841720116zakhy("Gaya Baru","Bisnis",masinis, asisten);
      
        System.out.println(keretaApi.infozakhy());
        
    }
    
}
