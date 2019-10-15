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
public class Manager1841720116zakhy extends Karyawan1841720116zakhy{
    private double tunjangan;
    private String bagian;
    private Staff1841720116zakhy st[];
    
    public void setTunjanganzakhy(double tunjangan){
        this.tunjangan=tunjangan;
    }
    public double getTunjanganzakhy(){
        return tunjangan;
    }
    public void setBagianzakhy(String bagian){
        this.bagian=bagian;
    }
    public String getBagianzakhy(){
        return bagian;
    }
        public void setStaff(Staff1841720116zakhy[] st) {
        this.st = st;
    }
    
    public void viewStaff(){
        int i;
        System.out.println("-------------------------");
        
        for(i=0;i<st.length;i++){
            st[i].lihatInfo();
        }
         System.out.println("-------------------------");
        }
        public void lihatInfo(){
        
            
            System.out.println("Manager     :"+this.getBagianzakhy());
            System.out.println("NIP         :"+this.getNip());
            System.out.println("Nama        :"+this.getNamazakhy());
            System.out.println("Golongan    :"+this.getGolongan());
            System.out.printf("Tunjangan    :%.0f\n",this.getTunjanganzakhy());
            System.out.printf("Gaji         :%.0f\n",this.getGaji());
            System.out.printf("Bagian        :%.0f\n",this.getBagianzakhy());
            this.viewStaff();
        }
        public double getGaji(){
            return super.getGaji()+tunjangan;
        }  


}
