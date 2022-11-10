package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment {
    private boolean checkFee ;
    private long feeAntarBank ;
    private String noRekening ;

    public MobileBanking(String nama, long saldo, String noRekening ) {
        super(nama,saldo);
        this.noRekening = noRekening ;
        feeAntarBank = 60000;
    }

    public void setFeeAntarBank(long feeAntarBank) { this.feeAntarBank = feeAntarBank ;}
    public long getFeeAntarBank() {return feeAntarBank ;}
    public boolean isCheckFee() {return checkFee ;}
    public void setCheckFee(boolean checkFee) {this.checkFee = checkFee ;}
    public String getNoRekening() {return noRekening ; }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {if (nominal<0){System.out.println("Nominal Yang Anda Input Tidak VALID!") ; } else { if (super.getSaldo()>0){if (super.getSaldo()>=nominal){if(this.isCheckFee()){super.setSaldo(super.getSaldo()-(feeAntarBank));
        dp.setSaldo(dp.getSaldo()+nominal);
            } else{
                 super.setSaldo(super.getSaldo()-nominal);
                    dp.setSaldo(dp.getSaldo()+nominal);
             }
                 super.printBuktiTransfer(dp,nominal);
                    this.checkFee=false;

            } else{
                System.out.println("Transfer gagal! saldo anda tidak mencukupi.");
        }
            } else{
                System.out.println("Transfer gagal saldo 0");
        }

        }
    }
}





