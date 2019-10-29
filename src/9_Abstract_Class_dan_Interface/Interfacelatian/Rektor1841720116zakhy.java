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
public class Rektor1841720116zakhy {
     public void beriSertifikatCumlaude(ICumlaude1841720116zakhy mahasiswa){
        System.out.println("Saya REKTOR, memberi sertifikat cumlaude");
        System.out.println("Selamat ! silakan perkenalkan diri anda..");
        
        mahasiswa.lulus();
        mahasiswa.kuliahDiKampus();
        mahasiswa.meraihIPKtingggi();
        
        System.out.println("-------------------------------------------");
    
     
     }
        public void beriSertifikatMawapres(IBerprestasi1841720116zakhy mahasiswa){
        System.out.println("Saya REKTOR, memberi sertifikat MAWAPRES.");
        System.out.println("Selamat ! Bagaimana anda bisa berprestasi?");
        
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("--------------------------------------------");
    }
 
}
