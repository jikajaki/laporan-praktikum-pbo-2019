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
public class Owner1841720116zakhy {
    public void pay(Payable1841720116zakhy p) {
        System.out.println("Total payment = "+p.getPaymentAmount());
        if(p instanceof ElectricityBill1841720116zakhy){
            ElectricityBill1841720116zakhy eb = (ElectricityBill1841720116zakhy)p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanentEmployee1841720116zakhy){
            PermanentEmployee1841720116zakhy pe = (PermanentEmployee1841720116zakhy) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    
    public void showMyEmployee(Employee1841720116zakhy e){
        System.out.println(""+e.getEmployeeInfo());
        if (e instanceof PermanentEmployee1841720116zakhy) 
            System.out.println("You Have to pay her/him monthly!!!");
        else 
            System.out.println("No need to pay him/her :)");
    }
}
