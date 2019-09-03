# Laporan Praktikum #1 - Pengantar Konsep PBO

## Kompetensi

Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal:
1.Perbedaan paradigma berorientasi objek dengan paradigma struktural
2.Konsep dasar PBO


## Ringkasan Materi

Perbedaan mendasar antara pemrograman terstruktur dengan pemrograman berorientasi objek (PBO) atau Object Oriented Programming (OOP) adalah: Pada pemrograman terstruktur, program dipecah kedalam sub-program atau fungsi. Sedangkan pada PBO, program dipecah kedalam objek, dimana objek tersebut membungkus state dan method.

Kelebihan PBO adalah program dapat lebih fleksibel dan modular, jika ada perubahan fitur, maka dapat dipastikan keseluruhan program tidak akan terganggu. Berbeda dengan struktural, perubahan sedikit fitur saja kemungkinan dapat mengganggu keseluruhan program.
## Percobaan

### Percobaan 1

Didalam percobaan ini, kita akan mendemonstrasikan bagaimana membuat class, membuat object, kemudian mengakses method didalam class tersebut.


![contoh screenshot](img/Sepeda1841720116zakhy.jpg)

Contoh link kode program : [sepeda1841720116zakhy.java](../../src/1_Pengantar_Konsep_PBO/sepeda1841720116zakhy.java)

### Percobaan 2
Setelah membuat class, membuat object, kemudian mengakses method didalam class, pada percobaan ke dua menamambahkan extend yaitu menjadi dua class menjadi satu (pemanggilan ke induknya)

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![contoh screenshot](img/sepedademo1841720116zakhy.jpg)

Contoh link kode program : [sepedademo1841720116zakhy.java](../../src/1_Pengantar_Konsep_PBO/sepedademo1841720116zakhy.java)

## Pertanyaan
1.Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek!

Jawab: Object adalah suatu rangkaian dalam program yang terdiri dari state dan behaviour. Object pada software dimodelkan sedemikian rupa sehingga mirip dengan objek yang ada di dunia nyata.

Class  adalah blueprint atau prototype dari objek. Ambil contoh objek sepeda. Terdapat berbagai macam sepeda di dunia, dari berbagai merk dan model. 

Enkapsulasi Disebut juga dengan information-hiding. Dalam berinteraksi dengan objek, seringkali kita tidak perlu mengetahui kompleksitas yang ada didalamnya

Inheritance Disebut juga pewarisan. Inheritance memungkinkan kita untuk mengorganisir struktur program dengan natural. Inheritance juga memungkinkan kita untuk memperluas fungsionalitas program tanpa harus mengubah banyak bagian program. Contoh di dunia nyata, objek sepeda dapat diturunkan lagi ke model yang lebih luas, misal sepeda gunung (mountain bike) dan road bike.

Polimorfisme Polimorfisme juga meniru sifat objek di dunia nyata, dimana sebuah objek dapat memiliki bentuk, atau menjelma menjadi bentuk-bentuk lain. Misalkan saja objek pesawat terbang. Objek ini dapat diwariskan menjadi pesawat jet dan pesawat baling-baling. Keduanya memiliki kemampuan untuk menambah kecepatan. Namun secara teknis, metode penambahan kecepatan antara pesawat jet dengan baling-baling tentu berbeda, karena masing-masing memiliki jenis mesin yang berbeda. 

 2.Apa yang dimaksud dengan object dan apa bedanya dengan class?
 
 Jawab:Kelas ialah kumpulan atas definisi data dan fungsi fungsi dalam suatu unit yang ada.

 Object ialah membungkus data dan fungsi bersama menjadi suatu unit dalam sebuah program komputer, objek merupakan dasar dari modularitas dan struktur dalam sebuah program komputer  berorientasi objek tersebut 

3.Sebutkan salah satu kelebihan utama dari pemrograman
berorientasi objek dibandingkan dengan pemrograman struktural!
     
Jawab: Adanya  konsistensi karena sifat inhantance dan penggunaan fase yang sama pada saat menganalisis,merancang maupun coding

4.Pada class Sepeda, terdapat state/atribut apa saja?

Jawab: Decrement,increment,newValue

5.Tambahkan atribut warna pada class Sepeda.

Jawab:
  
6.Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari nol?

Jawab: Karena kita sudah mendapatkan atau memanggil nama fungsi dari extands yang terdapat pada SepedaGunung


## Tugas


![contoh screenshot](img/pesawat1841720116zakhy.jpg)

Contoh link kode program : [T1Pesawat1841720116zakhy.java](../../src/1_Pengantar_Konsep_PBO/T1Pesawat1841720116zakhy.java)

## Kesimpulan

belajar kesabaran dan semangat tanpa henti, dan untuk materinya lebih bisa memahami tentang dua class yang dijadikan satu mengunakan extend

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Ahmad Muzakhy)***