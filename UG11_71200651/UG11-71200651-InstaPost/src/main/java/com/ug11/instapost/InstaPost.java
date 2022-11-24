package com.ug11.instapost;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost() {}
    public void login(String s){
        try {
            if (!s.contains("@")){
                throw new EmailException(2);
            }
            if (!s.contains("@gmail")){
                throw new EmailException(1);
            }
            String[] split = s.split("@");
            email=s;

            username= split[0].toUpperCase();
            System.out.println("Login berhasil");
        }catch (EmailException e){
            System.out.println("Error: Login gagal! "+e.getErrorMessage());
        }
    }
    public void post(String p){
        StringBuilder mention= new StringBuilder();
        int count=0;
        if (p.contains("@")){
            String[] split=p.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains("@")){
                    if (mention.length()==0){
                        mention.append(split[i]);
                    }else{
                        mention.append(", "+split[i]);
                    }
                    count+=1;
                }
            }
        }
        totalMention+=count;
        System.out.println("Caption: "+p);
        if (totalMention>0){
            System.out.println("Pengguna yang Anda mention: "+mention);
        }else{
            System.out.println("Pengguna yang Anda mention: -");
        }
        System.out.println("Total usename yang Anda mention: "+count);
    }
    public void printInfo(){
        System.out.println("Username: "+username);

        System.out.println("Email: "+email);

        System.out.println("Total Mention: "+totalMention);
    }

}