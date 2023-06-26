package utils;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL_conection {
    final String DBNAME = "pelisplus",
    USER = "root", PASSWORD = "root",
    TIMEZONE = "America/Mexico_City",
    USESSL = "false", PUBLICEY = "true",
    DDLAUTO = "true", HOST = "Localhost";

    public Connection connect(){
        String dataSource = String.format(
                "jdbc:mysql://%s:3306/%s?user=%s&password=%s&serverTimezone=%s&useSSL=%s&allowPublicKeyRetrieval=%s&createDataBaseIfNotFound=%s&",
                HOST,DBNAME,USER,PASSWORD,TIMEZONE,USESSL,PUBLICEY,DDLAUTO);
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(dataSource);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
            try {
                Connection conn = new MySQL_conection().connect();
                if (conn != null) {
                    System.out.println("Conexion exitosa");
                    conn.close();
                }else {
                    System.out.println("Conexion fallida");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
}
