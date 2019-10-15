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
public class Segitiga1841720116zakhy {
    int sudut;
    
    public int totalSudutzakhy(int sudutA){
        return sudut = 180 - sudutA;
    }
    
    public int totalSudutzakhy(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    
    public int kelilingzakhy(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA  + sisiB + sisiC;
        return keliling;
    }
    
    public double kelilingzakhy(int sisiA, int sisiB){
        double c = Math.sqrt(Math.pow(sisiA, 2))+ (Math.pow(sisiB, 2));
        return c;
    }
    
    public static void main(String[] args) {
        Segitiga1841720116zakhy segitiga = new Segitiga1841720116zakhy();
        
        System.out.println(segitiga.totalSudutzakhy(45));
        System.out.println(segitiga.totalSudutzakhy(45, 15));
        System.out.println(segitiga.kelilingzakhy(10, 20, 30));
        System.out.println(segitiga.kelilingzakhy(2, 3));
    }
}

