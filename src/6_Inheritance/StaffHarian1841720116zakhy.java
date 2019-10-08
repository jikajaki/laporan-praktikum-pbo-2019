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
public class StaffHarian1841720116zakhy extends Staff1841720116zakhy {
    public int jmlhJamKerja;
    
    public StaffHarian1841720116zakhy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlhJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlhJamKerja = jmlhJamKerja;
    }
    public void tampilDataStaffHarian1841720116zakhy(){
        System.out.println("=============== Data Staff Harian ===============");
            super.tampilDataStaff1841720116zakhy();
            System.out.println("Jumlah Jam Kerja        ="+jmlhJamKerja);
            System.out.println("Gaji Bersih             ="+(gaji+jmlhJamKerja+lembur-potongan));
    
    }
}
