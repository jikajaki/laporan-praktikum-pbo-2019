/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js6;

/**
 *
 * @author Ahmad Muzakhy
 */
public class InheritanceTugas1841720116zakhy {
    public static void main(String[] args) {
        Mac1841720116zakhy mac = new Mac1841720116zakhy("Macbook Pro", 2, 8, "Intel Core i5 quad-core", "lithium-polymer", "macOS Security");
        Windows1841720116zakhy win = new Windows1841720116zakhy("Acer", 2, 8, "Intel Core i5-8265U", "lithium-polymer", "Thin & Light");
        PC1841720116zakhy pc = new PC1841720116zakhy("Lenovo", 3, 4, "Intel Core i5 8400", 27);
     
        pc.tampilPCzakhy();
    }
}
