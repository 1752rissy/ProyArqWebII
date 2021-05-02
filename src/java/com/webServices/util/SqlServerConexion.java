/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webServices.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author agutierrez752
 */
public class SqlServerConexion {
    
     static {
        try {
            // CARGAR EL CONTROLADOR DE BD
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            System.out.println("[SqlServerConexion] Error al cargar el driver de conexión");
            e.printStackTrace();
        }
    }
 
    public static Connection obtenerConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://DESKTOP-IJN6793:1433;databaseName=Universidad", "rissy", "123");
        } catch (Exception e) {
            System.out.println("[SqlServerConexion] Error al obtener la conexión");
            e.printStackTrace();
        }
        return con;
    }
    
}
