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
public class Kursi1841720116zakhy {
    private String info;
    private String nomor ;
    private Penumpang1841720116zakhy penumpang;

    public Kursi1841720116zakhy(String nomor) {
        this.nomor = nomor;
    }
 
    
    
    
    public  String infozakhy(){
        String info ="";
        info+="Nomor :"+ nomor + "\n";
        if (this.penumpang != null){
            info +="penumpang :" + penumpang.info() +"\n";
        }
        return info;
    }

    public Kursi1841720116zakhy(String info, String nomor, Penumpang1841720116zakhy penumpang) {
        this.info = info;
        this.nomor = nomor;
        this.penumpang = penumpang;
    }

    public String getInfozakhy() {
        return info;
    }

    public void setInfozakhy(String info) {
        this.info = info;
    }

    public String getNomorzakhy() {
        return nomor;
    }

    public void setNomorzakhy(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang1841720116zakhy getPenumpangzakhy() {
        return penumpang;
    }

    public void setPenumpangzakhy(Penumpang1841720116zakhy penumpang) {
        this.penumpang = penumpang;
    }
}
