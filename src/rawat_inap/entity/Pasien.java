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
public class Pasien {
    
    private int id_pasien;
    private String nama_pasien;
    private String alamat_pasien;
    private Date tgllahir_pasien;
    private String notelp_pasien;
    private Object goldarah_pasien;
    private String ket_pasien;

    public Pasien() {
    }

    public Pasien(int id_pasien, String nama_pasien, String alamat_pasien, Date tgllahir_pasien, String notelp_pasien, Object goldarah_pasien, String ket_pasien) {
        this.id_pasien = id_pasien;
        this.nama_pasien = nama_pasien;
        this.alamat_pasien = alamat_pasien;
        this.tgllahir_pasien = tgllahir_pasien;
        this.notelp_pasien = notelp_pasien;
        this.goldarah_pasien = goldarah_pasien;
        this.ket_pasien = ket_pasien;
    }

    public int getIdpasien() {
        return id_pasien;
    }

    public void setIdpasien(int id_pasien) {
        this.id_pasien = id_pasien;
    }

    public String getNamapasien() {
        return nama_pasien;
    }

    public void setNamapasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public String getAlamatpasien() {
        return alamat_pasien;
    }

    public void setAlamatpasien(String alamat_pasien) {
        this.alamat_pasien = alamat_pasien;
    }

    public Date getTgllahirpasien() {
        return tgllahir_pasien;
    }

    public void setTgllahirpasien(Date tgllahir_pasien) {
        this.tgllahir_pasien = tgllahir_pasien;
    }

    public String getNotelppasien() {
        return notelp_pasien;
    }

    public void setNotelppasien(String notelp_pasien) {
        this.notelp_pasien = notelp_pasien;
    }

    public Object getGoldarahpasien() {
        return goldarah_pasien;
    }

    public void setGoldarahpasien(Object goldarah_pasien) {
        this.goldarah_pasien = goldarah_pasien;
    }

    public String getKetpasien() {
        return ket_pasien;
    }

    public void setKetpasien(String ket_pasien) {
        this.ket_pasien = ket_pasien;
    }

    @Override
    public String toString() {
        return "Pasien{" + "id_pasien=" + id_pasien + ", nama_pasien=" + nama_pasien + ", alamat_pasien=" + alamat_pasien + ", tgllahir_pasien=" + tgllahir_pasien + ", notelp_pasien=" + notelp_pasien + ", goldarah_pasien=" + goldarah_pasien + ", ket_pasien=" + ket_pasien + '}';
    }
    
    
}