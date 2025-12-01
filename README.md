# PERCOBAAN 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menutampil di layar).

JAWABAN :
1. Fungsi tanpa parameter tidak harus void.bisa pakai tipe lain seperti int, double, String, bahkan boolean, tergantung nilai apa yang mau dikembalikan.
2. Bisa, daftar menu tetap bisa muncul tanpa fungsi.cukup ditulis langsung di main.
3. Keuntungan pakai fungsi menu() itu kode jadi lebih rapi, mudah dibaca, dan gampang dipakai ulang. Kalau mau dipanggil lagi untuk pelanggan lain, tinggal panggil fungsinya tanpa nulis ulang.
4. Alurnya yaitu program mulai jalan dari main kemudian data nama dan status member diproses di baris panggilan fungsi (di kode awal Andi, true) lalu eksekusi lompat ke dalam fungsi, semua teks ucapan dan menu dicetak ke layar , hasil daftar menu akhirnya muncul.

# PERCOBAAN 2
1. Apakah kegunaan parameter di dalam fungsi?
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
3. Apakah parameter sama dengan variabel? Jelaskan.
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.

JAWABAN :
1. Parameter buat nerima data dari luar fungsi, jadi fungsinya bisa dipakai lebih simpel sesuai input yang dikirim saat dipanggil.
2. Karena fungsi butuh tau siapa pelanggannya dan apakah dia member, biar bisa munculin ucapan personal dan kondisi diskon yang pas.
3. Hampir sama, tapi beda konteks. Parameter itu “jembatan” input ke fungsi saat dipanggil, sedangkan variabel itu tempat nyimpen data di dalam program. Nilainya parameter ngikut ke data yang dikirim pas fungsi dipanggil.
4. isMember dicek di if.
true = keluar teks diskon 10%.
false = teks diskon tidak muncul, jadi cuma tampil ucapan dan menu aja.
5. Error, karena fungsinya wajib diisi parameter. Kalau dipanggil tanpa ngirim data, Java tidak menjalankan programnya.
6. done
7. menu("Budi", true);
8. iya, jauh lebih enak dibaca dan dikembangkan. Logika fungsi tetap fokus ke tugasnya (nampilin menu), sementara datanya dikirim dari luar. Kalau mau ganti nama atau status member, ubah di pemanggilan, tidak menganggu isi fungsinya.

# PERCOBAAN 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?

JAWABAN :
1. Fungsi butuh return kalau hasil prosesnya dipake lagi di bagian lain, disimpen, atau dihitung lanjutan. Nggak perlu return kalau tugasnya cuma nampilin sesuatu atau ngejalanin aksi tanpa butuh hasilnya.
    - Perlu return: hitungTotalHarga() di program kamu, karena hasil total harga dipakai buat ditampilkan dan bisa diproses lagi.
    - Tidak perlu return: fungsi menu(String namaPelanggan, Boolean isMember) saat cuma mencetak ucapan dan daftar menu di Java Console, dia nggak butuh ngasih nilai balik.

2. Tipe data return value fungsi hitungTotalHarga() adalah int (angka total harga).
   - Dua parameter:
    1.pilihanMenu = nomor menu yang dipilih pelanggan (misal 1 = Kopi Hitam). Ini dipakai buat ngambil harga dasar dari list.
    2.banyakItem = jumlah item yang dipesan. Parameter ini nentuinnya mau beli berapa banyak, lalu dikali sama harga menu biar jadi total.
3. done
4. done

# PERCOBAAN 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?

JAWABAN :
1. dipakai karena fungsi mau nerima banyak nama sekaligus tanpa dibatasi jumlahnya. Jadi sekali panggil bisa 1, 3, 10 nama, tetap kebaca.
2. done
3. tidak bisa dua varargs tipe berbeda di satu fungsi, karena Java cuma memperbolehkan satu varargs di akhir parameter. Kalau dipaksa, kompilasi error.
void contoh(String... a, int... b) =  SALAH
void contoh(String kodePromo, int diskon, String... namaPengunjung){ } = BENAR , maka akan muncul seperti ini ("DISKON30", 30, "Ayu", "Bagas", "Dina")
4. Tetap berjalan, tidak error baik saat kompilasi maupun runtime. Varargs otomatis kebaca sebagai array kosong. maka akan muncul seperti ini (Daftar Nama Pengunjung:)

# PERCOBAAN 5
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.

JAWABAN :
1. Alurnya:
Program mulai dari main lalu input panjang, lebar, tinggi pake Scanner kemudian main manggil hitungLuas(p,l) terus luas dihitung & di-return terus ditampilin,main lanjut manggil hitungVolume(t,p,l) , di dalamnya manggil hitungLuas() lagi , volume di-return , ditampilin
2. maka outputnya jadi (Luas persegi panjang adalah 12 Volume balok adalah 60), Alurnya: main nerima 4 & 3 lalu hitungLuas ngali jadi 12, balik ke main , main nerima 5 lalu kirim ke hitungVolume , luas 12 dipake lagi dikali 5 jadi 60, balik ke main , akhirnya muncul.
3. maka outputnya adalah = (2 7 8 9 10), Alurnya Mulai dari main ,Jumlah(1,1) dihitung dulu, hasilnya 2 dan disimpen di temp , TampilJumlah(temp,5) dipanggil jadi nilainya (2,5) , di dalam TampilJumlah, dia manggil TampilHinggaKei(Jumlah(2,5)) , Jumlah(2,5) dihitung lagi, hasilnya 7 , TampilHinggaKei(7) jalan , loop for ngeprint angka dari 1 sampai 7, hasil akhirnya tampil 1234567 tanpa spasi, tapi karena di gambar ada print tanpa spasi ke samping, jadinya muncul 2 7 8 9 10.
4. Fungsi pakai parameter kalau butuh data dari luar saat dipanggil.tidak pakai parameter kalau datanya sudah ditentukan di dalam atau cuma cetak/aksi sederhana.
Pakai return kalau fungsi menghasilkan nilai yang dipakai lagi.engga pakai return kalau fungsinya cuma menjalankan perintah, tanpa butuh hasil.
5. hitungLuas(int pjg, int lb) dan hitungVolume(int tinggi, int a, int b) sebaiknya pakai parameter karena perhitungan tergantung input yang dikirim dari main, jadi fleksibel buat angka beda-beda.
6. hitungLuas() dan hitungVolume() punya return int karena hasil hitungannya dipakai di main (buat ditampilkan atau diolah).
main() tidak butuh return, karena tugasnya mengatur alur dan cetak output, bukan ngasih nilai ke fungsi lain.