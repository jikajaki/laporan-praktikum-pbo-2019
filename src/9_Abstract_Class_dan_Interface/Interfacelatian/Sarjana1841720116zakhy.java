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
public class Sarjana1841720116zakhy extends Mahasiswa1841720116zakhy  implements ICumlaude1841720116zakhy, IBerprestasi1841720116zakhy  {
    public Sarjana1841720116zakhy(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    
    @Override
    public void meraihIPKtingggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkat artikel di jurnal NASIONAL");
    }
}
