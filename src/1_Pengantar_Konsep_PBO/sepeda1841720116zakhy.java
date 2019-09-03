/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Muzakhy
 */
public class sepeda1841720116zakhy {
   private String merek;
    private int kecepatan;
    private int gear;
    
    public void setMerekzakhy(String newValue){
        merek = newValue;
    }
    public void gantiGearzakhy(int newValue){
        gear = newValue;
    }
    public void tambahKecepatanzakhy(int increment){
        kecepatan = kecepatan + increment;
    }
    public void remzakhy(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void cetakStatuszakhy(){
        System.out.println("Merek: "+ merek);
        System.out.println("Kecepatan: "+ kecepatan);
        System.out.println("Gear: " + gear);
    
    }
}
