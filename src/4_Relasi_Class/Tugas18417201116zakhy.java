/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author Ahmad Muzakhy
 */
public class Tugas18417201116zakhy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelayan1841720116zakhy p = new Pelayan1841720116zakhy("Gisa", 11);
        Makanan1841720116zakhy m = new Makanan1841720116zakhy("Makanan Penutup", "Naga Sari");
        Pembeli1841720116zakhy v = new Pembeli1841720116zakhy("Aliya", "Tahu Krispi", 22);
        Kasir1841720116zakhy   k = new Kasir1841720116zakhy("Zakhy", p, m, 33);
        System.out.println(k.info());
    }
    
}
