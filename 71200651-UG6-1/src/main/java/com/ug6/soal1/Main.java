package com.ug6.soal1;


import java.util.Scanner;


public class Main {
    private static int order=1;
    private static Scanner scanInt;
    private static String nama;

    public static void nambahHarga(VendingMachines v, int type){
        System.out.print("Harga barang: ");
        Scanner scanD=new Scanner(System.in);
        double harga= scanD.nextDouble();
        System.out.print("Kapasitas barang yang ada/dimiliki: ");
        int jumlah= scanInt.nextInt();
        Codes c=new Codes();
        String tipe="";
        if (type==1){
            tipe="DR";
        }else if (type==2){
            tipe="FD";
        }else{
            tipe="DR";
        }
        if(jumlah<=v.getCapacity()){
            Goods g=new Goods(c.generateGoodsCode(tipe,nama),nama,jumlah,harga);
            v.inputGoods(g);
        }else{
            System.out.println("Kapasitas barang telah melampaui kapasitas maximal\nUlangi proses penambahan harga");
            nambahHarga(v,type);
        }
    }
    public static void inputBarang(VendingMachines v, int kap){
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        System.out.println("Nama barang: ");
        String nama=scanStr.nextLine();
        System.out.println("Type barang:\n1. Minuman\n2. Makanan\n3. Produk Digital\nPilihan (1/2/3): ");
        int type=scanInt.nextInt();
        System.out.println("Apakah anda ingin memasukkan nominal harga dan jumlah barang?\nya(y) atau tidak(n): ");
        String chs=scanStr.nextLine();
        if(chs.equals("y")){
            nambahHarga(v,type);
        }else{
            System.out.println("Error");
        }

    }
    public static void vending(){
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Buat Vending Machine terlebih dahulu");
        System.out.println("========================================");
        System.out.print("Kapasitas maximal: ");
        int kap=scanInt.nextInt();
        Codes code = new Codes();
        VendingMachines v = new VendingMachines(code.generateVendingMachineCode(order),kap);
        order+=1;
        System.out.print("Apakah anda akan menambahkan barang sekarang?\nya(y) atau tidak(n): ");
        String chs=scanStr.nextLine();
        if (chs.equals("y")){
            inputBarang(v,kap);
        }else{
            System.out.println("Error");
        }
    }
    public static void main( String[] args )
    {
        vending();
    }
}
