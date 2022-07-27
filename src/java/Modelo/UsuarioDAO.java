/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Utils.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author giane
 */
public class UsuarioDAO {
    ConexionDB cn= new ConexionDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuario Validar(String user, String contra){
        Usuario us = new Usuario();
        String sql="select * from usuario where User=? and Contra=?";
        con=cn.getConexion();
        try{

            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, contra);
            rs=ps.executeQuery();
            while(rs.next()){
                us.setId(rs.getInt("IdUser"));
                us.setUser(rs.getString("User"));
                us.setContra(rs.getString("Contra"));
                us.setNom(rs.getString("Nombres"));
                us.setApe(rs.getString("Apellidos"));
            }
        }catch(Exception e){


        }
        return us;
    }
}
