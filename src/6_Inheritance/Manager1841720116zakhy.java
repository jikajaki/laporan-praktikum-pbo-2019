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
public class Manager1841720116zakhy extends Karyawan1841720116zakhy {
    public int tunjangan;
    
    public Manager1841720116zakhy(){
    
    }
    public void tampilDataManager1841720116zakhy(){
        super.tampilDataKaryawan1841720116zakhy();
        System.out.println("Tunjangan       ="+tunjangan);
        System.out.println("Total Gaji      ="+(super.gaji+tunjangan));
    }
}

