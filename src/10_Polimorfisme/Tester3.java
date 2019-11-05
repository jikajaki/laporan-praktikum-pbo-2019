/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JS10;

/**
 *
 * @author Ahmad Muzakhy
 */
public class Tester3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee1841720116zakhy pEmp =new PermanentEmployee1841720116zakhy("Dedik", 500);
        InternshipEmployee1841720116zakhy iEmp = new InternshipEmployee1841720116zakhy("Sunarto", 5);
        ElectricityBill1841720116zakhy eBill = new ElectricityBill1841720116zakhy(5, "A-1");
        Employee1841720116zakhy e[] = {pEmp,iEmp};
        Payable1841720116zakhy p[] = {pEmp,eBill};
        Employee1841720116zakhy e2[] = {pEmp, iEmp};
    } 
    }
