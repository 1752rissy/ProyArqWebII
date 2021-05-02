/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.webServices.util.SqlServerConexion;
import entity.Universidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agutierrez752
 */
public class UniversidadDAO {
    
    public List<Universidad> ListarUniversidades() throws SQLException
    {
        List<Universidad> lstUniversidad = new ArrayList<Universidad>();
        Connection cn = SqlServerConexion.obtenerConexion();
        String query = "SELECT * FROM UNIVERSIDAD";
        PreparedStatement ps = cn.prepareCall(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            Universidad universidad = new Universidad();
            universidad.setIdUniversidad(rs.getInt("idUniversidad"));
            universidad.setNombreUniversidad(rs.getString("NombreUniversidad"));
            universidad.setUbicacionUniversidad(rs.getString("UbicacionUniversidad"));
            lstUniversidad.add(universidad);
        }
        return lstUniversidad;
    }
    
    public int AñadirUniversidad(Universidad universidad) throws SQLException
    {
        String sql = "INSERT INTO universidad(NombreUniversidad,UbicacionUniversidad) VALUES(?,?)";
        Connection cn = SqlServerConexion.obtenerConexion();
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1,universidad.getNombreUniversidad());
        ps.setString(2,universidad.getUbicacionUniversidad());
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
}
