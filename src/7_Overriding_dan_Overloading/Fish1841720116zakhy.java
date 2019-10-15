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
    class Ikan1841720116zakhy {
    public void swimzakhy(){
        System.out.println("Ikan bisa berenang");
    }
}
        
class Piranha184172016zakhy extends Ikan1841720116zakhy{
    public void swimzakhy(){
        System.out.println("Piranha bisa makan daging");
    }
}
        
public class Fish1841720116zakhy{
    public static void main(String[] args){
        Ikan1841720116zakhy a = new Ikan1841720116zakhy();
        Ikan1841720116zakhy b = new Piranha184172016zakhy();
        a.swimzakhy();
        b.swimzakhy();
    }
}
