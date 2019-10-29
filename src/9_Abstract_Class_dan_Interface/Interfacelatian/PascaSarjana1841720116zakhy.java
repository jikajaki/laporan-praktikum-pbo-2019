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
public class PascaSarjana1841720116zakhy extends Mahasiswa1841720116zakhy implements ICumlaude1841720116zakhy, IBerprestasi1841720116zakhy {
     public PascaSarjana1841720116zakhy(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKtingggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
        @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkat artikel di jurnal INTERNASIONAL");
    }
}
