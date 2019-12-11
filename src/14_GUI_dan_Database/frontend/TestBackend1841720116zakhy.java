/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author AHMADMUZAKHY
 */
import beckhend.*;

public class TestBackend1841720116zakhy {
    public static void main(String[] args){
        Kategori1841720116zakhy kat1 = new Kategori1841720116zakhy("Novel", "Koleksi buku novel");
        Kategori1841720116zakhy kat2 = new Kategori1841720116zakhy("Referensi", "Buku referensi ilmiah");
        Kategori1841720116zakhy kat3 = new Kategori1841720116zakhy("Komik", "Komik anak-anak");
        
        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for(Kategori1841720116zakhy k : new Kategori1841720116zakhy().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for(Kategori1841720116zakhy k : new Kategori1841720116zakhy().search("ilmiah")){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
