/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rawat_inap.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/rawatinap";  // myDB --> nama database kita
    private String username = "root";       // user name DMBS
    private String password = "";    // pswd DMBS kosongin aja

    public Connection logOn(){
        try {
            //Load JDBC Driver
            Class.forName( driver ).newInstance();
            //Buat object Connection
            con = DriverManager.getConnection( url, username, password );
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }

    public void logOff(){
        try {
            //Tutup Koneksi
            con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
