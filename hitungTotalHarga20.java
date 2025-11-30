import java.util.Scanner;
public class hitungTotalHarga20 {
    public static void menu (String namaPelanggan, Boolean isMember) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if(isMember){
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
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan.");

        System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukan jumlahitem yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
        }
        public static void main (String[] args) {
            menu("Andi", true);
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem){
        int[] hargaItem = {15000,20000,22000,12000,10000,18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    

        
    }

}
