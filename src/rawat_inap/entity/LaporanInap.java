/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rawat_inap.entity;

import java.util.Date;

/**
 *
 * @author mahas
 */
public class LaporanInap {
    
    private int id_laporan;
    //-------------------------
    private int id_pasien;
    private int id_dokter;
    private int id_perawat;
    private int id_ruangan;
    //-------------------------
    private String tgl_inap;
    private String rincian_inap;

    
    public LaporanInap(int id_laporan) {
        this.id_laporan = id_laporan;
    }
    
    

    public LaporanInap() {
    }

    public LaporanInap(int id_laporan, int id_pasien, int id_dokter, int id_perawat, int id_ruangan, String tgl_inap, String rincian_inap) {
        this.id_laporan = id_laporan;
        this.id_pasien = id_pasien;
        this.id_dokter = id_dokter;
        this.id_perawat = id_perawat;
        this.id_ruangan = id_ruangan;
        this.tgl_inap = tgl_inap;
        this.rincian_inap = rincian_inap;
    }

    public LaporanInap(int id_pasien, int id_dokter, int id_perawat, int id_ruangan, String tgl_inap, String rincian_inap) {
        this.id_pasien = id_pasien;
        this.id_dokter = id_dokter;
        this.id_perawat = id_perawat;
        this.id_ruangan = id_ruangan;
        this.tgl_inap = tgl_inap;
        this.rincian_inap = rincian_inap;
    }

    
    public int getIdlaporan() {
        return id_laporan;
    }

    public void setIdlaporan(int id_laporan) {
        this.id_laporan = id_laporan;
    }

    public int getIdpasien() {
        return id_pasien;
    }

    public void setIdpasien(int id_pasien) {
        this.id_pasien = id_pasien;
    }

    public int getIddokter() {
        return id_dokter;
    }

    public void setIddokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }

    public int getIdperawat() {
        return id_perawat;
    }

    public void setIdperawat(int id_perawat) {
        this.id_perawat = id_perawat;
    }

    public int getIdruangan() {
        return id_ruangan;
    }

    public void setIdruangan(int id_ruangan) {
        this.id_ruangan = id_ruangan;
    }

    public String getTglinap() {
        return tgl_inap;
    }

    public void setTglinap(String tgl_inap) {
        this.tgl_inap = tgl_inap;
    }

    public String getRincianinap() {
        return rincian_inap;
    }

    public void setRincianinap(String rincian_inap) {
        this.rincian_inap = rincian_inap;
    }
    
    

    
}