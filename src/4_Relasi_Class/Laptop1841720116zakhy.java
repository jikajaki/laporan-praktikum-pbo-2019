/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author Ahmad Muzakhy
 */
public class Laptop1841720116zakhy {
    private String merk;
    private Processor1841720116zakhy proc;

    public Laptop1841720116zakhy (){
    
    }

    public Laptop1841720116zakhy(String merk, Processor1841720116zakhy proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
     
  public void setMerkzakhy(String merk){
      this.merk = merk;
  }
  public void setProczakhy(Processor1841720116zakhy proc){
      this.proc = proc;
  
  }
  public String getMerkzakhy(){
      return merk;
  }
  public Processor1841720116zakhy getProczakhy(){
      return proc;
  }
  
  public void infozakhy(){
      System.out.printf("Merk Laptop = " + merk);
      proc.infozakhy();
  }
    
}

