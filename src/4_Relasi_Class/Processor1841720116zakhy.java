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
public class Processor1841720116zakhy {
  private String merk;
  private double cache;

  public Processor1841720116zakhy(){
  }
  Processor1841720116zakhy(String merk, double cache){
      this.merk = merk;
      this.cache = cache;
  }
  public void setMerkzakhy(String merk){
      this.merk = merk;
  }
  public void setCachezakhy(double cache){
      this.cache = cache;
  
  }
  public String getMerkzakhy(){
      return merk;
  }
  public double getCachezakhy(){
      return cache;
  }
  
  public void infozakhy(){
      System.out.printf("Merk Processor = %s/n", merk);
      System.out.printf("Cache Memory = = %.2f/n", cache);
  }
}
