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
public class PermanentEmployee1841720116zakhy extends Employee1841720116zakhy implements Payable1841720116zakhy {
   private int salary;

    public PermanentEmployee1841720116zakhy (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmount() {
        return (int) (salary+0.05*salary); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return info;
    } 
}
