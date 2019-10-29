/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacelatian;

/**
 *
 * @author Ahmad Muzakhy
 */
public abstract class Mahasiswa1841720116zakhy implements ICumlaude1841720116zakhy {
    protected String nama;
    
    public Mahasiswa1841720116zakhy(String nama){
        this.nama = nama;
    }


    @Override
    public void kuliahDiKampus() {
        System.out.println("Nama ku :" + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    public abstract void lulus();
    public abstract void meraihIPKtingggi();
    
}
