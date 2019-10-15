/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Js7;

/**
 *
 * @author Ahmad Muzakhy
 */
public class Staff1841720116zakhy extends Karyawan1841720116zakhy {
    private int lembur;
    private double gajilembur;
    
    public void setLemburzakhy(int lembur){
        this.lembur=lembur;
    }
    public int getLemburzakhy(){
        return lembur;
    }
    public void setGajiLemburzakhy(double gajilembur){
        this.gajilembur=gajilembur;
    }
    public double getGajiLemburzakhy(){
        return gajilembur;
    }
    public double getGaji(int lembur,double gajilembur){
        return super.getGaji()+lembur*gajilembur;
    }
    public double getGaji(){
        return super.getGaji()+lembur*gajilembur;
    }
    public void lihatInfo(){
        System.out.println("NIP         :"+this.getNip());
        System.out.println("Nama        :"+this.getNamazakhy());
        System.out.println("Golongan    :"+this.getGolongan());
        System.out.println("Jmlh Lembur :"+this.getLemburzakhy());
        System.out.printf("Gaji Lembur  :%.0f\n",this.getGajiLemburzakhy());
        System.out.printf("Gaji         :%.0f\n",this.getGaji());
    
    
    }
}
