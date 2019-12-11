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

public class TestBackendBuku1841720116zakhy {
    public static void main(String[] args){
        Kategori1841720116zakhy novel = new Kategori1841720116zakhy().getById(27);
        Kategori1841720116zakhy referensi = new Kategori1841720116zakhy().getById(28);
        
        Buku1841720116zakhy buku1 = new Buku1841720116zakhy(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720116zakhy buku2 = new Buku1841720116zakhy(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720116zakhy buku3 = new Buku1841720116zakhy(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.save();
        buku2.save();
       
        buku2.setJudul("Aljabar Linier");
        buku2.save();
      
        buku3.delete();
        
        for(Buku1841720116zakhy b : new Buku1841720116zakhy().getAll()){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        // test search
        for(Buku1841720116zakhy b : new Buku1841720116zakhy().search("timun")){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
