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
public class Mainpercobaan1_1841720116zakhy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Processor1841720116zakhy p = new Processor1841720116zakhy("Intel i5",3);
       Laptop1841720116zakhy L = new Laptop1841720116zakhy("Thinkpad", p);
       
       L.infozakhy();
       
       Processor1841720116zakhy p1 = new Processor1841720116zakhy();
       p1.setMerkzakhy("Intel i5");
       p1.setCachezakhy(4);
       Laptop1841720116zakhy L1 = new Laptop1841720116zakhy ();
       L1.setMerkzakhy("Thinkpad");
       L1.setProczakhy(p1);
       L.infozakhy();
    }
    
}
