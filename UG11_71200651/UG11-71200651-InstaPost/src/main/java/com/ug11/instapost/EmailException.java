package com.ug11.instapost;

public class EmailException extends Exception{
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode) {
        this.errorCode = errorCode;
        if (errorCode==1){
            errorMessage="Email Anda tidak terdaftar di Google";
        }else if (errorCode==2){
            errorMessage="Email yang Anda masukkan tidak valid.";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
