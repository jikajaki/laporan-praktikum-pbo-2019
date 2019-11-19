package Percobaan.percobaan4;

import java.util.ArrayList;
public class InputData1841720116zakhy {
    ArrayList<Mahasiswa1841720116zakhy> ListMahasiswa;

    public InputData1841720116zakhy() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiData(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720116zakhy mhs = new Mahasiswa1841720116zakhy(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720116zakhy> getData() {
        return ListMahasiswa;
    }
}
