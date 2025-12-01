import java.util.Scanner;

public class hitungTotalHarga20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        boolean isMember;

        System.out.print("Masukkan nama pelanggan: ");
        namaPelanggan = sc.nextLine();

        System.out.print("Apakah Anda member? (true/false): ");
        isMember = sc.nextBoolean();
        sc.nextLine();

        System.out.println("\nSelamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino  - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Tekan 0 untuk selesai memesan");

        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
            int menu = sc.nextInt();

            if (menu == 0) break;

            System.out.print("Masukan jumlah item: ");
            int jumlah = sc.nextInt();

            int harga = hargaItem[menu - 1] * jumlah;
            totalKeseluruhan += harga;
        }

        System.out.print("\nMasukkan kode promo: ");
        String kodePromo = sc.nextLine();

        double diskonPromo = 0;
        if (kodePromo.equals("DISKON50")) diskonPromo = 0.5;
        else if (kodePromo.equals("DISKON30")) diskonPromo = 0.3;
        else System.out.println("Kode promo invalid!");

        if (diskonPromo > 0) {
            int potongan = (int)(totalKeseluruhan * diskonPromo);
            System.out.println("Diskon promo diterapkan, potongan: Rp " + potongan);
            totalKeseluruhan -= potongan;
        }

        if (isMember) {
            int potonganMember = (int)(totalKeseluruhan * 0.1);
            System.out.println("Diskon member diterapkan, potongan: Rp " + potonganMember);
            totalKeseluruhan -= potonganMember;
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalKeseluruhan);
    }
}