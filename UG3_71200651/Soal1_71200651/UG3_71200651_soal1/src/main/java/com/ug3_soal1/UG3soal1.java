package com.ug3.soal1;
import java.util.Scanner ;


public class UG3soal1
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in) ;
        System.out.print("=====Data Product==== \n Masukkan Data Product Makanan Anda ");
        System.out.println("Nama Makanan :  ");
        String pilihan1 = input.nextLine();
        System.out.println("Tanggal Kadaluarasa : ");
        String pilihan2 = input.nextLine() ;
        System.out.println("Jumlah (Quantity) : ");
        int pilihan3 = input.nextInt() ;
        System.out.println("Berat (Gram) : ");
        int pilihan4 = input.nextInt() ;

        System.out.print("===== Data Product ===== \n Masukkan Data Product Makanan Anda ");
        System.out.println("Nama Makanan : " + pilihan1);
        System.out.println("Tanggal Kadaluarasa " + pilihan2);
        System.out.println("Jumlah (Quantity)" + pilihan3);
        System.out.println("Berat (Gram)" + pilihan4) ;


    }
}
