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
public class Dokter {
    
    private int id_dokter;
    private String nama_dokter;
    private String alamat_dokter;
    private Date tgllahir_dokter;
    private String notelp_dokter;
    private Object ket_dokter;

    public Dokter() {
    }

    public Dokter(int id_dokter, String nama_dokter, String alamat_dokter, Date tgllahir_dokter, String notelp_dokter, Object ket_dokter) {
        this.id_dokter = id_dokter;
        this.nama_dokter = nama_dokter;
        this.alamat_dokter = alamat_dokter;
        this.tgllahir_dokter = tgllahir_dokter;
        this.notelp_dokter = notelp_dokter;
        this.ket_dokter = ket_dokter;
    }

    public int getIddokter() {
        return id_dokter;
    }

    public void setIddokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }

    public String getNamadokter() {
        return nama_dokter;
    }

    public void setNamadokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getAlamatdokter() {
        return alamat_dokter;
    }

    public void setAlamatdokter(String alamat_dokter) {
        this.alamat_dokter = alamat_dokter;
    }

    public Date getTgllahirdokter() {
        return tgllahir_dokter;
    }

    public void setTgllahirdokter(Date tgllahir_dokter) {
        this.tgllahir_dokter = tgllahir_dokter;
    }

    public String getNotelpdokter() {
        return notelp_dokter;
    }

    public void setNotelpdokter(String notelp_dokter) {
        this.notelp_dokter = notelp_dokter;
    }

    public Object getKetdokter() {
        return ket_dokter;
    }

    public void setKetdokter(Object ket_dokter) {
        this.ket_dokter = ket_dokter;
    }

    @Override
    public String toString() {
        return "Dokter{" + "id_dokter=" + id_dokter + ", nama_dokter=" + nama_dokter + ", alamat_dokter=" + alamat_dokter + ", tgllahir_dokter=" + tgllahir_dokter + ", notelp_dokter=" + notelp_dokter + ", ket_dokter=" + ket_dokter + '}';
    }
    
    
    
    
    
    

}