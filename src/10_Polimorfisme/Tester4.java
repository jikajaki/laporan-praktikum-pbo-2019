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
public class Tester4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owner1841720116zakhy ow =new Owner1841720116zakhy();
        ElectricityBill1841720116zakhy eBill = new ElectricityBill1841720116zakhy(5, "R-1");
        ow.pay(eBill);
        System.out.println("-----------------------------");
        
        PermanentEmployee1841720116zakhy pEmp =new PermanentEmployee1841720116zakhy("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("-----------------------------");
        
        InternshipEmployee1841720116zakhy iEmp = new InternshipEmployee1841720116zakhy("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("---------------------------------------");
        ow.showMyEmployee(iEmp);
    }
    
}
