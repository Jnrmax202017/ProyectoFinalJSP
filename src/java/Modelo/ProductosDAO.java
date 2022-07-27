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

/**
 *
 * @author Eduardo
 */
public class ProductosDAO {

    ConexionDB cn = new ConexionDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int ans1;

    public Productos buscar(String cod) {
        Productos prs = new Productos();
        String sql = "SELECT  NomPro, CatPro, Stock FROM producto where CodPro in ('"+cod+"')";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                prs.setCod(cod);
                prs.setNom(rs.getString(1));
                prs.setCat(rs.getString(2));
                prs.setStck(rs.getInt(3));
            }else{
                
            }
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return prs;
    }
    public Productos buscar2(String cod) {
        Productos prst = new Productos();
        String sql = "SELECT NomPro, CatPro, PrecioPro, Stock FROM producto WHERE CodPro in ('"+cod+"')";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                prst.setCod(cod);
                prst.setNom(rs.getString(1));
                prst.setCat(rs.getString(2));
                prst.setPre(rs.getDouble(3));
                prst.setStck(rs.getInt(4));
            }else{
                
            }
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return prst;
    }

    //OPERACIONES CRUD
    public List listarP() {
        String sql = "select * from producto";
        List<Productos> lista1 = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos pro = new Productos();
                pro.setId(rs.getInt(1));
                pro.setFech(rs.getString(2));
                pro.setCod(rs.getString(3));
                pro.setNom(rs.getString(4));
                pro.setCat(rs.getString(5));
                pro.setMar(rs.getString(6));
                pro.setPre(rs.getDouble(7));
                pro.setStck(rs.getInt(8));
                lista1.add(pro);
            }
        } catch (SQLException e) {

        }
        return lista1;
    }

    public int Adicionar1(Productos pro) {
        String sql = "insert into producto(Fecha,CodPro,NomPro,CatPro,MarcaPro,PrecioPro,Stock)values(?,?,?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getFech());
            ps.setString(2, pro.getCod());
            ps.setString(3, pro.getNom());
            ps.setString(4, pro.getCat());
            ps.setString(5, pro.getMar());
            ps.setDouble(6, pro.getPre());
            ps.setInt(7, pro.getStck());
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return ans1;
    }

    public Productos listarId(int id) {
        Productos pro = new Productos();
        String sql = "select * from producto where IdProd=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pro.setFech(rs.getString(2));
                pro.setCod(rs.getString(3));
                pro.setNom(rs.getString(4));
                pro.setCat(rs.getString(5));
                pro.setMar(rs.getString(6));
                pro.setPre(rs.getDouble(7));
                pro.setStck(rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return pro;
    }

    public int Actualizar(Productos pro) {
        String sql = "update producto set Fecha=?,CodPro=?,NomPro=?,CatPro=?,MarcaPro=?,PrecioPro=?,Stock=? where IdProd=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getFech());
            ps.setString(2, pro.getCod());
            ps.setString(3, pro.getNom());
            ps.setString(4, pro.getCat());
            ps.setString(5, pro.getMar());
            ps.setDouble(6, pro.getPre());
            ps.setInt(7, pro.getStck());
            ps.setInt(8, pro.getId());
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return ans1;
    }

    public void Eliminar(int id) {
        String sql = "delete from producto where IdProd=" + id;
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
