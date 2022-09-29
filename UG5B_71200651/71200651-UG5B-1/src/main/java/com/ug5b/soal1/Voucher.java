package com.ug5b.soal1;



public class Voucher {
    private Long nominal;
    private String code;


    public void buatVoucher() {
        if (nominal <= 0) {
            code = "VC";
        } else {
            code = "VC" +nominal;

        }
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }

    public String getKode() {
        return code;

    }
}



