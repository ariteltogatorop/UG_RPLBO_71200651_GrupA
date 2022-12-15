
package com.ug14.rumahsakit;

public class Suster {
    private static int id = 0;
    private int idSuster;
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
        this.idSuster = id;
        this.id+=1;
    }

    public Suster(int idSuster, String nama) {
        this.idSuster = idSuster;
        this.nama = nama;
    }

    public int getIdSuster() {
        return idSuster;
    }

    public void screening(Pasien pasien
            , Jadwal jadwal){
        if (pasien.getPenyakit()==null){
            System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
        }else {
            jadwal.setStatusScreening(true);
        }

    }
}