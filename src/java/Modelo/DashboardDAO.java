/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Utils.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class DashboardDAO {
    ConexionDB cn=new ConexionDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int ans;



   /* public List listar(){
        String sql="select * from proveedor";
        List<Proveedor>lista=new ArrayList<>();
        try{
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Proveedor pro=new Proveedor();
                pro.setId(rs.getInt(1));
                pro.setCod(rs.getString(2));
                pro.setNom(rs.getString(3));
                pro.setApe(rs.getString(4));
                pro.setTel(rs.getString(5));
                pro.setCel(rs.getString(6));
                pro.setCorreo(rs.getString(7));
                pro.setEmpre(rs.getString(8));
                pro.setFe(rs.getString(9));
                pro.setRuc(rs.getString(10));
                lista.add(pro);
            }
        }catch(Exception e){
            
        }
        return lista;
    }*/
 
      public Dashboard ListarCantProv() {
        Dashboard dash = new Dashboard();
        String sql = "SELECT count(*) as CantProveedores FROM proveedor;";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
               
                dash.setCantProv(rs.getString(1));

            }
        } catch (Exception e) {
           
        }
        return dash;

    }
  

       public Dashboard ListarCantProductos() {
        Dashboard dash = new Dashboard();
        String sql = "SELECT count(*) as CantProd FROM producto;";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
               
                dash.setCantProd(rs.getString(1));

            }
        } catch (Exception e) {
           
        }
        return dash;

    }

   public Dashboard ListarCantOrdCom() {
        Dashboard dash = new Dashboard();
        String sql = "SELECT count(*) as CantOrdCompras FROM ordcompra;";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
               
                dash.setCantOrdCompras(rs.getString(1));

            }
        } catch (Exception e) {
           
        }
        return dash;

    }


   public List ListarStock() {
        String sql = "select CodPRo,NomPro,Stock from producto where Stock<15;";
        List<Dashboard> lista1 = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Dashboard d = new Dashboard();
                d.setCodPro(rs.getString(1));
                d.setNomPro(rs.getString(2));
                d.setStockPro(rs.getString(3));
              
                lista1.add(d);
            }
        } catch (SQLException e) {

        }
        return lista1;
    }


}
