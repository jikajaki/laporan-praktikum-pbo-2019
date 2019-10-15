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
public class Utama1841720116zakhy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Testing Class Manger & Staff");
        Manager1841720116zakhy man[]    = new Manager1841720116zakhy[2];
        Staff1841720116zakhy staff1[]   = new Staff1841720116zakhy[2];
        Staff1841720116zakhy staff2[]   = new Staff1841720116zakhy[3];
        
        man[0]=new Manager1841720116zakhy();
        man[0].setNamazakhy("Tedjo");
        man[0].setNipzakhy("1");
        man[0].setGolonganzakhy("1");
        man[0].setTunjanganzakhy(5000000);
        man[0].setBagianzakhy("Administrasi");
        
        man[1]=new Manager1841720116zakhy();
        man[1].setNamazakhy("Atika");
        man[1].setNipzakhy("102");
        man[1].setGolonganzakhy("1");
        man[1].setTunjanganzakhy(2500000);
        man[1].setBagianzakhy("Pemasaran");
        
        staff1[0] = new Staff1841720116zakhy();
        staff1[0].setNamazakhy("Usman");
        staff1[0].setNipzakhy("0003");
        staff1[0].setGolonganzakhy("2");
        staff1[0].setLemburzakhy(10);
        staff1[0].setGajiLemburzakhy(10000);
        
        
        staff1[1]=new Staff1841720116zakhy();
        staff1[1].setNamazakhy("Anugrah");
        staff1[1].setNipzakhy("0005");
        staff1[1].setGolonganzakhy("2");
        staff1[1].setGajiLemburzakhy(55000);
        man[0].setStaff(staff1);
        
        staff2[0]=new Staff1841720116zakhy();
        staff2[0].setNamazakhy("Hendra");
        staff2[0].setNipzakhy("0004");
        staff2[0].setGolonganzakhy("3");
        staff2[0].setLemburzakhy(15);
        staff2[0].setGajiLemburzakhy(55000);
        
        staff2[1]=new Staff1841720116zakhy();
        staff2[1].setNamazakhy("Arie");
        staff2[1].setNipzakhy("0006");
        staff2[1].setGolonganzakhy("4");
        staff2[1].setLemburzakhy(5);
        staff2[1].setGajiLemburzakhy(100000);
        
        staff2[2]=new Staff1841720116zakhy();
        staff2[2].setNamazakhy("Mentari");
        staff2[2].setNipzakhy("0007");
        staff2[2].setGolonganzakhy("2");
        staff2[2].setLemburzakhy(5);
        staff2[2].setGajiLemburzakhy(100000);
        
        man[0].lihatInfo();
        man[1].lihatInfo();
        
    }
    
}
