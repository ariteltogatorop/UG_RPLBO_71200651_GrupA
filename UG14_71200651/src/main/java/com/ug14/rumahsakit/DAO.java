package com.ug14.rumahsakit;

import java.sql.*;

public class DAO {

    public static Dokter getDokterByID(int idDokter) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rumahsakit", "root", "");
        Statement st = con.createStatement();
//        Kirim sql
        String namaTabel = "dokter";
        ResultSet rs = st.executeQuery("select * from " + namaTabel + " where idDokter=" + idDokter + ";");
        Dokter dokter=null;
        while (rs.next()) {
            dokter = new Dokter(
                    Integer.parseInt(rs.getString("idDokter")),
                    rs.getString("nama"),
                    rs.getString("spesialis"),
                    rs.getString("ruangan")
            );
        }
        con.close();
        if (dokter!=null){
            return dokter;
        }else{
            return null;
        }
    }
    public static Suster getSusterByID(int idSuster) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rumahsakit", "root", "");
        Statement st = con.createStatement();
//        Kirim sql
        String namaTabel = "suster";
        ResultSet rs = st.executeQuery("select * from " + namaTabel + " where idSuster=" + idSuster + ";");
        Suster dokter=null;
        while (rs.next()) {
            dokter = new Suster(
                    Integer.parseInt(rs.getString("idSuster")),
                    rs.getString("nama")
            );
        }
        con.close();
        if (dokter!=null){
            return dokter;
        }else{
            return null;
        }
    }
    public static Pelayanan getPelayananByID(int idPelayanan) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rumahsakit", "root", "");
        Statement st = con.createStatement();
//        Kirim sql
        String namaTabel = "pelayan";
        ResultSet rs = st.executeQuery("select * from " + namaTabel + " where idPelayan=" + idPelayanan + ";");
        Pelayanan dokter=null;
        while (rs.next()) {
            dokter = new Pelayanan(
                    Integer.parseInt(rs.getString("idPelayan")),
                    rs.getString("nama")
            );
        }
        con.close();
        if (dokter!=null){
            return dokter;
        }else{
            return null;
        }
    }
    public static void inputPasien(Pasien pasien) throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rumahsakit", "root", "");
        Statement st = con.createStatement();
//        Kirim sql
        String sql = "insert into pasien values ("+pasien.getRm()+",'"+pasien.getNama()+"',"+pasien.getUsia()+",'"+pasien.getAlamat()+"');";
        ResultSet rs = st.executeQuery(sql);
        con.close();
        System.out.println("Data Pasien Berhasil Disimpan !");

    }
    public static void inputJadwal(Jadwal jadwal) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rumahsakit", "root", "");
        Statement st = con.createStatement();
//        Kirim sql
        Pasien pasien = jadwal.getPasien();
        Dokter dokter = jadwal.getDokter();
        Pelayanan pelayanan = jadwal.getPelayanan();
        Suster suster = jadwal.getSuster();
        int status = 0;
        if (pasien.isStatus()){
            status = 1;
        }
        String sql = "insert into jadwal values ("+jadwal.getIdPemeriksaan()+","+pasien.getRm()+","+dokter.getIdDokter()+","+suster.getIdSuster()+","+pelayanan.getIdPelayan()+","+status+");";
        ResultSet rs = st.executeQuery(sql);
        con.close();
        System.out.println("Data Jadwal Berhasil Disimpan !");
    }
    public static void getPasienSembuh() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rumahsakit", "root", "");
        Statement st = con.createStatement();
//        Kirim sql
        String namaTabel = "jadwal";
        ResultSet rs = st.executeQuery("select * from " + namaTabel + " where status=1;");
        while (rs.next()) {
            System.out.println(rs.getString("rm"));
        }
        con.close();

    }

    public static void updateStatusPasien(int idJadwal) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rumahsakit", "root", "");
        Statement st = con.createStatement();
//        Kirim sql
        String sql = "update jadwal set status=1 where idPemeriksaan="+idJadwal+";";
        ResultSet rs = st.executeQuery(sql);
        con.close();
        System.out.println("Status Pasien Berhasil Diubah !");
    }

}