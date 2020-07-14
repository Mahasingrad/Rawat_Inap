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
public class Perawat {
    
    private int id_perawat;
    private String nama_perawat;
    private String alamat_perawat;
    private Date tgllahir_perawat;
    private String notelp_perawat;

    public Perawat() {
    }

    public Perawat(int id_perawat, String nama_perawat, String alamat_perawat, Date tgllahir_perawat, String notelp_perawat) {
        this.id_perawat = id_perawat;
        this.nama_perawat = nama_perawat;
        this.alamat_perawat = alamat_perawat;
        this.tgllahir_perawat = tgllahir_perawat;
        this.notelp_perawat = notelp_perawat;
    }

    public int getIdperawat() {
        return id_perawat;
    }

    public void setIdperawat(int id_perawat) {
        this.id_perawat = id_perawat;
    }

    public String getNamaperawat() {
        return nama_perawat;
    }

    public void setNamaperawat(String nama_perawat) {
        this.nama_perawat = nama_perawat;
    }

    public String getAlamatperawat() {
        return alamat_perawat;
    }

    public void setAlamatperawat(String alamat_perawat) {
        this.alamat_perawat = alamat_perawat;
    }

    public Date getTgllahirperawat() {
        return tgllahir_perawat;
    }

    public void setTgllahirperawat(Date tgllahir_perawat) {
        this.tgllahir_perawat = tgllahir_perawat;
    }

    public String getNotelpperawat() {
        return notelp_perawat;
    }

    public void setNotelpperawat(String notelp_perawat) {
        this.notelp_perawat = notelp_perawat;
    }

    @Override
    public String toString() {
        return "Perawat{" + "id_perawat=" + id_perawat + ", nama_perawat=" + nama_perawat + ", alamat_perawat=" + alamat_perawat + ", tgllahir_perawat=" + tgllahir_perawat + ", notelp_perawat=" + notelp_perawat + '}';
    }
    
    

}