
public class TabunganBerjangka {
    private String pemilik ;
    private Double  saldo = 200000.0 ;


    public  void getSaldo (){
        System.out.println(saldo) ;

    }

    public  void penarikan (Double int1) {
        if (int1 >= saldo) {
            saldo = saldo - int1 ;
            System.out.println("-----Tabungan Berjangka------\n Belum Jatuh Tempo");
        }
    }

    public  void penyetoran (Double int2){
        saldo = saldo + int2 ;
        System.out.println("-----Tabungan Berjangka------\n Penyetoran Rp. 1000000") ;

    }



}
