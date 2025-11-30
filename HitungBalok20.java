import java.util.Scanner;
public class HitungBalok20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,L, vol;

        System.out.println("Masukan Panjang");
        p = sc.nextInt();

        System.out.println("Masukan Lebar");
        l = sc.nextInt();

        System.out.println("Masukan Tinggi");
        t = sc.nextInt();

        L = hitungLuas (p,l);
        System.out.println("Luas persegi panjang adalah " + L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " + vol);
    }
    static int hitungLuas(int pjg,int lb){
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a , int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    
}
