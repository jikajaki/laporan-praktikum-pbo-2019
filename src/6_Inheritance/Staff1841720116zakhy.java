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
public class Staff1841720116zakhy extends Karyawan1841720116zakhy{
    public int lembur, potongan;
    
    public Staff1841720116zakhy(){
    
    }
    public Staff1841720116zakhy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur     = lembur;
        this.potongan   = potongan;
    }
    public void tampilDataStaff1841720116zakhy(){
        super.tampilDataKaryawan1841720116zakhy();
        System.out.println("Lembur              ="+lembur);
        System.out.println("Potongan            ="+potongan);
        System.out.println("Total Gaji          ="+(gaji+lembur-potongan));
    }
}
