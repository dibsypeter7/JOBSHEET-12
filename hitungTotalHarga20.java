import java.util.Scanner;

public class hitungTotalHarga20 {
    public static void menu(String namaPelanggan, Boolean isMember) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino  - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");

        System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int hargaAwal = hitungTotalHarga(pilihanMenu, banyakItem);
        int totalAkhir = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("\nTotal harga awal: Rp " + hargaAwal);
        System.out.println("Total harga setelah promo (jika valid): Rp " + totalAkhir);
    }

    public static void main(String[] args) {
        menu("Andi", true);
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItem[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        double diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5;
            System.out.println("Kode promo berhasil! Diskon 50% diterapkan.");
            System.out.println("Potongan harga: Rp " + (int)(totalHarga * diskon));
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3;
            System.out.println("Kode promo berhasil! Diskon 30% diterapkan.");
            System.out.println("Potongan harga: Rp " + (int)(totalHarga * diskon));
        } else {
            System.out.println("Kode promo invalid!");
            return totalHarga; 
        }

        return (int)(totalHarga - (totalHarga * diskon));
    }
}
