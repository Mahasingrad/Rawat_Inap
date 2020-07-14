/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rawat_inap.entity;

/**
 *
 * @author mahas
 */
public class Ruangan {
    private int id_ruangan;
    //-------------------------
    private Object kondisi;
    private Object kelas;

    public Ruangan() {
    }

    public Ruangan(int id_ruangan, Object kondisi, Object kelas) {
        this.id_ruangan = id_ruangan;
        this.kondisi = kondisi;
        this.kelas = kelas;
    }

    public int getIdruangan() {
        return id_ruangan;
    }

    public void setIdruangan(int id_ruangan) {
        this.id_ruangan = id_ruangan;
    }

    public Object getKondisi() {
        return kondisi;
    }

    public void setKondisi(Object kondisi) {
        this.kondisi = kondisi;
    }

    public Object getKelas() {
        return kelas;
    }

    public void setKelas(Object kelas) {
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return "Ruangan{" + "id_ruangan=" + id_ruangan + ", kondisi=" + kondisi + ", kelas=" + kelas + '}';
    }

    
}