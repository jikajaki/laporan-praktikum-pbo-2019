# Laporan Praktikum #14 - GUI dan Database  

## Uji Kompetensi

Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal:
1. Menggunakan paradigma berorientasi objek untuk interaksi dengan database
2. Membuat backend dan frontend
3. Membuat form sebagai frontend
 

## Ringkasan Materi
Kali ini kita akan menggunakan paradigma berorientasi objek yang telah kita pelajari untuk membuat
aplikasi berbasis database dan dilengkapi dengan form sebagai Graphical User Interface (GUI).
Secara umum, tahapan yang akan kita lakukan adalah sebagai berikut :
1. Membuat database dan tabel-tabelnya.
2. Membuat backend yang berisi class-class yang mewakili data yang ada pada database, dan
class helper untuk melakukan eksekusi query database.
3. Membuat frontend yang merupakan antarmuka kepada pengguna. Frontend ini bisa
berbasis teks (console), GUI, web, mobile, dan sebagainya.

Library yang digunakan untuk project ini antara lain :
1. JDBC, untuk melakukan interaksi ke database.
2. ArrayList, untuk menampung data hasil query ke database.
3. Swing, untuk membuat tampilan GUI.


## Percobaan

### Percobaan 1
![Screenshot](img/dbperpus.jpg) 

### Percobaan 2
Mempersiapkan project.

![Screenshot](img/project.jpg) 

### Percobaan 3
Membuat class helper untuk mengeksekusi query SQL.

![Screenshot](img/dbh.jpg)

link kode program: 

[DBHelper1841720116zakhy.java](../../src/14_GUI_dan_Database/beckhend/DBHelper1841720116zakhy.java)

### Percobaan 4
Membuat class Kategori untuk menghandle CRUD pada tabel kategori.

![Screenshot](img/kategori.jpg)

link kode program: 

[Kategori1841720116zakhy.java](../../src/14_GUI_dan_Database/beckhend/Kategori1841720116zakhy.java)

### Percobaan 5
Mencoba backed yang sudah dibuat dengan mengoperasikannya lewat frontend berbasis teks (console). Percobaan ini dapat anda skip jika anda telah yakin bahwa backend yang anda buat sudah berfungsi dengan baik. 

![Screenshot](img/Tb.jpg)

link kode program: 

[TestBackend1841720116zakhy.java](../../src/14_GUI_dan_Database/frontend/TestBackend1841720116zakhy.java)

### Percobaan 6
### Percobaan 6.1
Pada percobaan ini kita akan membuat interface GUI untuk class Kategori. 

![Screenshot](img/Tb.jpg)

link kode program: 

[FrmKategori1841720116zakhy.java](../../src/14_GUI_dan_Database/frontend/FrmKategori1841720116zakhy.java)

### Percobaan 6.2

Lakukan hal yang sama untuk data Anggota!
1. Buat class Anggota pada package backend, lengkapi atribut dan method-nya.
2. Lakukan test pada class TestBackend pada package frontend

![Screenshot](img/anngota.jpg)

link kode program: 

[Anggota1841720116zakhy.java](../../src/14_GUI_dan_Database/beckhend/Anggota1841720116zakhy.java)

[TestBackendAnggota1841720116zakhy.java](../../src/14_GUI_dan_Database/frontend/TestBackendAnggota1841720116zakhy.java)

### Percobaan 7
### Percobaan 7.1
Buat form untuk data Anggota.
1. Buat FrmAnggota pada package frontend dan lengkapi komponen, method serta event-nya.

![Screenshot](img/frmanggota.jpg)

link kode program :

[FrmAnggota1841720116zakhy.java](../../src/14_GUI_dan_Database/frotend/FrmAnggota1841720116zakhy.java)

### Percobaan 7.2
Untuk data Buku, caranya kurang lebih sama seperti data Kategori dan Anggota. Hanya saja yang
berbeda adalah:
1.  Pemanggilan getKategori().getIdKategori() pada query insert dan update untuk mengeset idkategori pada tabel buku.

2. Query select yang melibatkan join table pada method getById(), getAll() dan search().

![Screenshot](img/buku.jpg)

link kode program: 

[Buku1841720116zakhy.java](../../src/14_GUI_dan_Database/bechend/Buku1841720116zakhy.java)

[TestBackendBuku1841720116zakhy.java](../../src/14_GUI_dan_Database/frotend/TestBackendBuku1841720116zakhy.java)

### Percobaan 8
Membuat GUI untuk data Buku, yang dilengkapi dengan combo box untuk memilih kategori yang terhubung dengan tabel kategori.

![Screenshot](img/frmbuku.jpg)

link kode program: 

[FrmBuku1841720116zakhy.java](../../src/14_GUI_dan_Database/frotend/FrmBuku1841720116zakhy.java)

## Tugas
1. Buatlah class Peminjaman.

![Screenshot](img/peminjaman.jpg)

[Peminjaman1841720116zakhy.java](../../src/14_GUI_dan_Database/beckhend/Peminjaman1841720116zakhy.java)

[TestBackendPeminjaman1841720116zakhy.java](../../src/14_GUI_dan_Database/frotend/TestBackendPeminjaman1841720116zakhy.java)

2. Buatlah form FrmPeminjaman.

![Screenshot](img/frmpeminjaman.jpg)

[FrmPeminjaman1841720116zakhy.java](../../src/14_GUI_dan_Database/frotend/FrmPeminjaman1841720116zakhy.java)

## Kesimpulan

Kita membutuhkan JDBC (Java Data Base Connectivity) untuk menghubungkan Java dan MySQL.

JDBC bertugas menyediakan koneksi ke database, sehingga kita bisa mengakses dan mengelola datanya dari program Java.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(AHMAD MUZAKHY)***