/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Js7;

/**
 *
 * @author Ahmad Muzakhy
 */
public class MainSegitiga1841720116zakhy {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
       public static void main(String[] args) {
        Segitiga1841720116zakhy segitiga = new Segitiga1841720116zakhy();
        System.out.println("Sudut (1 parameter)\t: " + segitiga.totalSudutzakhy(45));
        System.out.println("Sudut (2 parameter)\t: " + segitiga.totalSudutzakhy(30, 60));
        System.out.printf("Keliling (2 parameter)\t: %.2f\n", segitiga.kelilingzakhy(15, 8));
        System.out.println("Keliling (3 parameter)\t: " + segitiga.kelilingzakhy(10, 9, 15));
    }
}
    

