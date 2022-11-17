package org.example;

import java.io.Console;
import java.util.Scanner;

public class Main
{

    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        System.out.println( "Selamat Datang di Toko Ariel");
        System.out.println( "Silakan daftarkan diri kamu untuk dapat mengakses menu di Toko Ariel");
        String username ;
        String email ;
        String password ;
        String messagePassword ;
        while(true) {
            try {
                System.out.print("Username : "); username = inp.nextLine();
                if(username.equals(" ") || username.equals("")) {
                    throw new UsernameException(1);}
                if (username.length()<7){
                    throw new UsernameException(2);
                }
                break;
            }catch (UsernameException u1) {
                System.out.println(u1.getMessageError());
                continue;
            }
        }


        while (true){
            try{
                System.out.print("Email: ");
                email=inp.nextLine();
                if (email.equals(" ") || email.equals("")){
                    throw new EmailException(1);
                }
                if (!validEmail(email)){
                    throw new EmailException(2);
                }
                break;
            }catch (EmailException e1) {
                System.out.println(e1.getMessageError());
                continue;
            }
        }


        while (true){
            try{
                System.out.print("Password: ");
                password=inp.nextLine();
                if (password.equals(" ") || password.equals("")){
                    throw new PasswordException(1);
                }
                if (password.length()<7){
                    throw new PasswordException(2);
                }
                if (!passCheck(password)){
                    throw new PasswordException(3);
                }
                if (password.equals(username)){
                    throw new PasswordException(4);
                }
                break;
            }catch (PasswordException p1) {
                System.out.println(p1.getMessageError());
                continue;
            }
        }
        while(true){
            try{
                System.out.print("Konfirmasi Password: ");
                messagePassword=inp.nextLine();
                if (!password.equals(messagePassword)){
                    throw new PasswordException(5);
                }
                break;
            }catch (PasswordException p1) {
                System.out.println(p1.getMessageError());
                continue;
            }
        }
        User inp1 =new User(username, email, password);
        System.out.println("\nKamu berhasil mendaftar!\nSilahkan untuk Login Untuk Melanjutkan!\n");

        while (true){
            try{
                System.out.print("Username: ");
                String user=inp.nextLine();
                System.out.print("Password: ");
                String pass=inp.nextLine();
                if (user.equals("") || user.equals(" ")){
                    throw new LoginException(1);
                }else
                if (pass.equals("") || pass.equals(" ")){
                    throw new LoginException(2);
                }else
                if (!user.equals(inp1.getUsername()) || !pass.equals(inp1.getPassword())){
                    throw new LoginException(3);
                }
                break;
            }catch (LoginException l1) {
                System.out.println(l1.getMessageError());
                continue;
            }
        }

        System.out.println("\nSelamat Datang!, "+inp1.getUsername());

    }
    public static Boolean validEmail(String email){
        if (!email.contains("@")){
            return false;
        }
        int At=email.lastIndexOf("@");
        String emailNew="";
        for (int i = At; i < email.length(); i++) {
            emailNew+=email.charAt(i);
        }
        if (emailNew.equals("@gmail.com")){
            return true;
        }
        return false;
    }

    public static boolean passCheck(String pass){
        boolean small=false;
        boolean big=false;
        boolean num=false;
        boolean sym=false;
        for (int i = 0; i < pass.length(); i++) {
            char a=pass.charAt(i);
            if (Character.isUpperCase(a)){
                big=true;
            }
            if (Character.isLowerCase(a)){
                small=true;
            }
            if (Character.isDigit(a)){
                num=true;
            }
            if (!Character.isDigit(a) && !Character.isAlphabetic(a)){
                sym=true;
            }
        }
        if (small && big && num && sym){
            return true;
        }
        return false;
    }
}