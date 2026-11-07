Nama: Naila Rona Nur Aini
NIM: H1D025088
Tema: Otomotif

1. Deskripsi Sistem
   Simulasi rental kendaraan berbasis teks. Rental menyewakan mobil dan motor. Kendaraan bisa disewa, dikembalikan, dan dihitung biayanya.

Mobil mendapat diskon 10% untuk sewa 7 hari atau lebih, dan bisa dipasangi asuransi (+Rp25.000/hari).
Motor memakai harga flat tanpa diskon.
Kendaraan yang sedang disewa tidak dapat disewa lagi sampai dikembalikan.

2. Struktur Folder & Class
   src/RESPONSI/
   ├── BisaDiasuransi.java
   ├── BisaDikembalikan.java
   ├── Kendaraan.java
   ├── Main.java
   ├── Mobil.java
   └── Motor.java

3. Compile dan run

# Clone repositori
git clone <URL-REPOSITORI-ANDA>
cd <NAMA-FOLDER-REPOSITORI>

# Compile (hasil .class ke folder out)
javac -d out src/RESPONSI/*.java

# Run
java -cp out RESPONSI.Main

4. Screenshot
![output](Screenshot/output1.png)

![output](Screenshot/output2.png)

