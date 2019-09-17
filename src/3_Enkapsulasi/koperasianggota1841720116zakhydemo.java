/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Muzakhy
 */
public class koperasianggota1841720116zakhydemo {
    public static void main(String [] args){
        Koperasianggota1841720116zakhy anggota1 = new Koperasianggota1841720116zakhy("Iwan","Jalan Mawar");
        System.out.println("Simpanan " +anggota1.getNamazakhy()+ ": Rp"+ anggota1.getSimpananzakhy());
        
        anggota1.setNamazakhy("Iwan Setiawan");
        anggota1.setAlamatzakhy("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNamazakhy()+ ": Rp"+ anggota1.getSimpananzakhy());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNamazakhy()+ ": Rp"+ anggota1.getSimpananzakhy());
    }
}
