package com.ug14.rumahsakit;

import java.sql.SQLException;

public class Dokter {
    private static int id = 0;
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(int idDokter, String nama, String spesialis, String ruangan) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
        this.idDokter = id;
        this.id = id+1;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal) throws SQLException, ClassNotFoundException {
        if (!jadwal.isStatusScreening()){
            System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
        }else{
            if (pasien.getLevelPenyakit()!=0){
                pasien.setLevelPenyakit(pasien.getLevelPenyakit()-1);
            }else{
                pasien.setStatus(true);
            }
        }

    }
    public void cekStatus(Pasien pasien, Jadwal jadwal) throws SQLException, ClassNotFoundException {
        if (pasien.isStatus()){
            System.out.println("SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT");
            DAO.updateStatusPasien(jadwal.getIdPemeriksaan());
        }else{
            System.out.println("PASIEN ANDA MASIH SAKIT");
        }
    }

    public int getIdDokter() {
        return idDokter;
    }
}