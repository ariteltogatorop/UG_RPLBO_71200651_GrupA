package org.example;

public class LoginException extends Exception {
    private String messageError ;
    private int codeError ;

    public String getMessageError() {return messageError ;}
    public int getCodeError() {return codeError ;}

    public LoginException(int codeError) { super() ; this.codeError = codeError ;
        if(this.codeError==1) {messageError = "Username Harus Diisi Tidak Boleh Kosong";}
        else if(this.codeError==2) {messageError = "Password Harus Diisi Tidak Boleh Kosong";}
        else if(this.codeError==3) {messageError = "Username dan Password Harus Sesuai Dengan Object User Yang Dibuat Pada Saat Melakukan Register";}
    }
}
