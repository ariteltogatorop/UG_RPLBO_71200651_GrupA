package org.example;

public class EmailException extends Exception {
    private String messageError ;
    private int codeError ;

    public String getMessageError() {return messageError ;}
    public int getCodeError() {return codeError ;}

    public EmailException(int codeError) { super() ; this.codeError = codeError ;
        if(this.codeError==1) {messageError = "Email Harus Diisi Tidak Boleh Kosong";}
        else if(this.codeError==2) {messageError = "Format Email Tidak Valid";}
    }

}
