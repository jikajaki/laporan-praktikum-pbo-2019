/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Muzakhy
 */
public class T1Pesawat1841720116zakhy {
    private String nama;
    private int kecepatan;
    
    public void namazakhy(String newValue){
        nama = newValue;
    }
    public void tambahKecepatanzakhy(int increment){
        kecepatan = kecepatan + increment;
    }
    public void pengurangankecepatanzakhy(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void cetakStatuszakhy(){
        System.out.println("Nama: "+ nama);
        System.out.println("Kecepatan: "+ kecepatan);
    
    }
}