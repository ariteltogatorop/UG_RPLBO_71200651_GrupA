package org.example;

public class UsernameException extends Exception {
    private String messageError ;
    private int codeError ;

    public String getMessageError() {return messageError ;}
    public int getCodeError() {return codeError ;}

    public UsernameException(int codeError) { super() ; this.codeError = codeError ;
        if(this.codeError==1) {messageError = "Username Harus Diisi Tidak Boleh Kosong";}
        else if(this.codeError==2) {messageError = "Username Harus Minimal 6 Karakter Angka/Huruf";}
    }


}
