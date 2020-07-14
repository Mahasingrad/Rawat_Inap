package rawat_inap.exec;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rawat_inap.db.ConnectionManager;
import rawat_inap.entity.Pasien;
import rawat_inap.entity.Ruangan;
import rawat_inap.entity.LaporanInap;
import rawat_inap.entity.Dokter;
import rawat_inap.entity.Perawat;
/**
 *
 * @author Marsa Mahasin
 */
public class ExecuteInap {
    
    public List<Pasien> getPasien(){
        List<Pasien> listPasien = new ArrayList<>();
        String query = "select * from pasien";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Pasien pas = new Pasien();
                pas.setIdpasien(rs.getInt("id_pasien"));
                pas.setNamapasien(rs.getString("nama_pasien"));
                pas.setAlamatpasien(rs.getString("alamat_pasien"));
                pas.setTgllahirpasien(rs.getDate("tgllahir_pasien"));
                pas.setNotelppasien(rs.getString("notelp_pasien"));
                pas.setGoldarahpasien(rs.getObject("goldarah_pasien"));
                pas.setKetpasien(rs.getString("ket_pasien"));
                listPasien.add(pas);
            }
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listPasien;
    }
    
        public List<Dokter> getDokter(){
        List<Dokter> listDokter = new ArrayList<>();
        String query = "select * from dokter";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Dokter dok = new Dokter();
                dok.setIddokter(rs.getInt("id_dokter"));
                dok.setNamadokter(rs.getString("nama_dokter"));
                dok.setAlamatdokter(rs.getString("alamat_dokter"));
                dok.setTgllahirdokter(rs.getDate("tgllahir_dokter"));
                dok.setNotelpdokter(rs.getString("notelp_dokter"));
                dok.setKetdokter(rs.getObject("ket_dokter"));
                listDokter.add(dok);
            }
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listDokter;
    }
        
        public List<Perawat> getPerawat(){
        List<Perawat> listPerawat = new ArrayList<>();
        String query = "select * from perawat";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Perawat per = new Perawat();
                per.setIdperawat(rs.getInt("id_perawat"));
                per.setNamaperawat(rs.getString("nama_perawat"));
                per.setAlamatperawat(rs.getString("alamat_perawat"));
                per.setTgllahirperawat(rs.getDate("tgllahir_perawat"));
                per.setNotelpperawat(rs.getString("notelp_perawat"));
                listPerawat.add(per);
            }
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listPerawat;
    }
    
        public List<Ruangan> getRuangan(){
        List<Ruangan> listRuangan = new ArrayList<>();
        String query = "select * from ruangan";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Ruangan rua = new Ruangan();
                rua.setIdruangan(rs.getInt("id_ruangan"));
                rua.setKondisi(rs.getObject("kondisi"));
                rua.setKelas(rs.getObject("kelas"));
                listRuangan.add(rua);
            }
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listRuangan;
    }
        
        public List<LaporanInap> getLaporan(){
        List<LaporanInap> listLaporan = new ArrayList<>();
        String query = "select * from laporan_inap";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                LaporanInap lap = new LaporanInap();
                lap.setIdlaporan(rs.getInt("id_laporan"));
                lap.setIdpasien(rs.getInt("id_pasien"));
                lap.setIddokter(rs.getInt("id_dokter"));
                lap.setIdperawat(rs.getInt("id_perawat"));
                lap.setIdruangan(rs.getInt("id_ruangan"));
                lap.setTglinap(rs.getString("tgl_inap"));
                lap.setRincianinap(rs.getString("rincian_inap"));

                listLaporan.add(lap);
            }
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listLaporan;
    }
    
    public int insertLaporan(LaporanInap InsertLaporan){
        int hasil = 0;
        String query = "Insert into laporan_inap(id_pasien,id_dokter,id_perawat,id_ruangan,tgl_inap,rincian_inap)" + 
                       "value("+InsertLaporan.getIdpasien()+","+InsertLaporan.getIddokter()+","+InsertLaporan.getIdperawat()+","+InsertLaporan.getIdruangan()+",'"
                       +InsertLaporan.getTglinap()+"','"+InsertLaporan.getRincianinap()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deleteLaporan( String DeleteLaporan){
        int hasil = 0;
        String query = "delete from laporan_inap where id_laporan="+ DeleteLaporan+"";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateLaporan(LaporanInap newLaporan){
        int hasil = 0;
        String query = "update laporan_inap set id_pasien="
                +newLaporan.getIdpasien()+",id_dokter="
                +newLaporan.getIddokter()+",id_perawat="
                +newLaporan.getIdperawat()+",id_ruangan="
                +newLaporan.getIdruangan()+",tgl_inap='"
                +newLaporan.getTglinap()+"',rincian_inap='"
                +newLaporan.getRincianinap()+"' where id_laporan = "
                +newLaporan.getIdlaporan() + "";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
        public int updateRuanganToIsi(String updateToIsi){
        int hasil = 0;
        String query = "update ruangan set kondisi = 'Isi' where id_ruangan = "+updateToIsi+ "";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
        
        public int updateRuanganToKosong(String updateToKosong){
        int hasil = 0;
        String query = "update ruangan set kondisi = 'Kosong' where id_ruangan = "+updateToKosong+ "";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger
        (ExecuteInap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
    //-------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------
    
 