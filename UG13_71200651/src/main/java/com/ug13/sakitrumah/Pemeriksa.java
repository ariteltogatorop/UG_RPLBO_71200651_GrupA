package com.ug13.sakitrumah;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal){
        if (jadwal.getStatusScreening()){
            if (!pengunjung.getStatus() && pengunjung.getLevelPenyakit()!=0){
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
            }else{
                pengunjung.setStatus(true);
            }
        }else{
            System.out.println("ANDA HARUS MELAKUKAN PENDAFTARAN TERLEBIH DAHULU");
        }
    }
    public void cekStatus(Pengunjung p){
        if (p.getStatus()){
            System.out.println("PASIEN ANDA SUDAH SEMBUH");
        }else{
            System.out.println("PASIEN ANDA MASIH SAKIT");
        }
    }
}