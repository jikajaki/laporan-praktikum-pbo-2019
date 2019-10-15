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
public class Karyawan1841720116zakhy {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;
    
    public void setNamazakhy(String nama){
        this.nama=nama;
    }
    public void setNipzakhy(String nama){
        this.nip=nip;
    }
    public void setGolonganzakhy(String nama){
        this.golongan=golongan;
    
        switch(golongan.charAt(0)){
            case '1' :this.gaji=5000000;
            break;
            case '2' :this.gaji=300000;
            break;
            case '3' : this.gaji=200000;
            break;
            case '4' : this.gaji=1000000;
            break;
            case  '5'  : this.gaji=750000;
            break;
        }
    }
        public void setGajizakhy(double gaji){
            this.gaji=gaji;
        }
        public String getNamazakhy(){
             return nama;
        }
        public String getNip(){
            return nip;
        }
        public String getGolongan(){
            return golongan;
        }
        public double getGaji(){
            return gaji;
        }
    }
