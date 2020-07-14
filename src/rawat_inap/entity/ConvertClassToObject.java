/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rawat_inap.entity;

import rawat_inap.exec.ExecuteInap;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mahas
 */
public class ConvertClassToObject {
    
    public String[][] getAllPasien(){
        List<Pasien> myPasien = new ArrayList<Pasien>();
        ExecuteInap ePasien = new ExecuteInap();
        myPasien = ePasien.getPasien();
        String[][] dataPasien = new String[myPasien.size()][7];
        int i=0;
        for(Pasien pas : myPasien){
            dataPasien[i][0] = ""+pas.getIdpasien();
            dataPasien[i][1] =    pas.getNamapasien();
            dataPasien[i][2] =    pas.getAlamatpasien();
            dataPasien[i][3] = ""+pas.getTgllahirpasien();
            dataPasien[i][4] =    pas.getNotelppasien();
            dataPasien[i][5] = ""+pas.getGoldarahpasien();
            dataPasien[i][6] =    pas.getKetpasien();
            i++;
        }
        return dataPasien;
    }
    
        public String[][] getAllPerawat(){
        List<Perawat> myPerawat = new ArrayList<Perawat>();
        ExecuteInap ePerawat = new ExecuteInap();
        myPerawat = ePerawat.getPerawat();
        String[][] dataPerawat = new String[myPerawat.size()][5];
        int i=0;
        for(Perawat per : myPerawat){
            dataPerawat[i][0] = ""+per.getIdperawat();
            dataPerawat[i][1] =    per.getNamaperawat();
            dataPerawat[i][2] =    per.getAlamatperawat();
            dataPerawat[i][3] = ""+per.getTgllahirperawat();
            dataPerawat[i][4] =    per.getNotelpperawat();
            i++;
        }
        return dataPerawat;
    }
    
        public String[][] getAllDokter(){
        List<Dokter> myDokter = new ArrayList<Dokter>();
        ExecuteInap eDokter = new ExecuteInap();
        myDokter = eDokter.getDokter();
        String[][] dataDokter = new String[myDokter.size()][6];
        int i=0;
        for(Dokter dok : myDokter){
            dataDokter[i][0] = ""+dok.getIddokter();
            dataDokter[i][1] =    dok.getNamadokter();
            dataDokter[i][2] =    dok.getAlamatdokter();
            dataDokter[i][3] = ""+dok.getTgllahirdokter();
            dataDokter[i][4] =    dok.getNotelpdokter();
            dataDokter[i][5] = ""+dok.getKetdokter();
            i++;
        }
        return dataDokter;
    }
        
        public String[][] getAllLaporanInap(){
        List<LaporanInap> myLaporan = new ArrayList<LaporanInap>();
        ExecuteInap eLaporan = new ExecuteInap();
        myLaporan = eLaporan.getLaporan();
        String[][] dataLaporan = new String[myLaporan.size()][7];
        int i=0;
        for(LaporanInap lap : myLaporan){
            dataLaporan[i][0] = ""+lap.getIdlaporan();
            dataLaporan[i][1] = ""+lap.getIdpasien();
            dataLaporan[i][2] = ""+lap.getIddokter();
            dataLaporan[i][3] = ""+lap.getIdperawat();
            dataLaporan[i][4] = ""+lap.getIdruangan();
            dataLaporan[i][5] =    lap.getTglinap();
            dataLaporan[i][6] =    lap.getRincianinap();
            i++;
        }
        return dataLaporan;
    }
    
        public String[][] getAllRuangan(){
        List<Ruangan> myRuangan = new ArrayList<Ruangan>();
        ExecuteInap eRuangan = new ExecuteInap();
        myRuangan = eRuangan.getRuangan();
        String[][] dataRuangan = new String[myRuangan.size()][3];
        int i=0;
        for(Ruangan rua : myRuangan){
            dataRuangan[i][0] =""+rua.getIdruangan();
            dataRuangan[i][1] =""+rua.getKondisi();
            dataRuangan[i][2] =""+rua.getKelas();
            i++;
        }
        return dataRuangan;
    }
       
    
}
