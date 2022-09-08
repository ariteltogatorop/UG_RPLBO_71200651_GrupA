import java.util.Scanner;


public class Main {
    static TabunganKonvensional K_71200651 = new TabunganKonvensional();
    static TabunganBerjangka I_71200651 = new TabunganBerjangka();

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan : \n1. Penyetoran \n2. Penarikan \n3. Lihat Saldo");
        int pilihan = input.nextInt();
        {

            if (pilihan == 1) {
                K_71200651.penyetoran(200000.0);
                I_71200651.penyetoran(100000.0);
                System.out.println("-----Tabungan Konvensional ------\n Penyetoran Rp. 2000000");
                System.out.println("-----Tabungan Berjangka------\n Penyetoran Rp. 1000000");
            }
            if (pilihan == 2) {
                K_71200651.penarikan(50000.0);
                I_71200651.penarikan(0.0);
                System.out.println("-----Tabungan Konvensional ------\n Penarikan Rp. 50000");
                System.out.println("-----Tabungan Konvensional ------\n Belum Jatuh Tempo");
            }

            if (pilihan == 3) {
                K_71200651.getSaldo();
                I_71200651.getSaldo();
            }

        }


    }
}


