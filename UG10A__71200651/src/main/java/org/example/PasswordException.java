package org.example;

public class PasswordException extends Exception {
    private String messageError ;
    private int codeError ;

    public String getMessageError() {return messageError ;}
    public int getCodeError() {return codeError ;}

    public PasswordException(int codeError) { super() ; this.codeError = codeError ;
        if(this.codeError==1) {messageError = "Password Harus Diisi Tidak Boleh Kosong";}
        else if(this.codeError==2) {messageError = "Password Harus Minimal 7 Karakter Angka/Huruf";}
        else if(this.codeError==3) {messageError = "Password Harus Minimal Mengandung 1 Karakter huruf kecil, huruf besar, simbol, dan angka";}
        else if(this.codeError==4) {messageError = "Password Tidak Boleh Sama dengan Username";}
        else if(this.codeError==5) {messageError = "Password Harus Sama dengan Konfirmasi Password";}
    }

}
