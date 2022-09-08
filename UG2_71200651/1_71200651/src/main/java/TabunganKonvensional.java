public class TabunganKonvensional {
    private String pemilik ;
    private Double  saldo = 100000.0 ;



    public void getSaldo() {
        System.out.println(saldo) ;
    }

    public  void penarikan (Double int1 ){
        if (int1>=saldo) {
            saldo = saldo - int1 ;
            System.out.println("-----Tabungan Konvensional------\n Penarikan Rp. 50000") ;
        }
    }

    public  void penyetoran (Double int2){
        saldo = saldo + int2 ;
        System.out.println("-----Tabungan Konvensional ------\n Penyetoran Rp. 1000000") ;

    }



}
