/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Utils.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class ProveedorDAO {
    ConexionDB cn=new ConexionDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int ans;
    public List listar(){
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
    }
    public int Adicionar(Proveedor pro){
        String sql="insert into proveedor(CodPro,NomProv,ApeProv,Telefono,CelPro,Correo,EmpresaPro,FechaRegis,RucPro)values(?,?,?,?,?,?,?,?,?)";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, pro.getCod());
            ps.setString(2, pro.getNom());
            ps.setString(3, pro.getApe());
            ps.setString(4, pro.getTel());
            ps.setString(5, pro.getCel());
            ps.setString(6, pro.getCorreo());
            ps.setString(7, pro.getEmpre());
            ps.setString(8, pro.getFe());
            ps.setString(9, pro.getRuc());
            ps.executeUpdate();
        }catch(Exception e){
        
        }
        return ans;
    }
    public Proveedor listarCod(int id){
        Proveedor pro=new Proveedor();
        String sql="select * from proveedor where IdPro="+id;
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                pro.setCod(rs.getString(2));
                pro.setNom(rs.getString(3));
                pro.setApe(rs.getString(4));
                pro.setTel(rs.getString(5));
                pro.setCel(rs.getString(6));
                pro.setCorreo(rs.getString(7));
                pro.setEmpre(rs.getString(8));
                pro.setFe(rs.getString(9));
                pro.setRuc(rs.getString(10));
            }
        } catch (Exception e) {
        }
        return pro;
    }
    public int Actualizar(Proveedor pro){
         String sql="update proveedor set CodPro=?,NomProv=?,ApeProv=?,Telefono=?,CelPro=?,Correo=?,EmpresaPro=?, FechaRegis=?, RucPro=? where IdPro=?";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, pro.getCod());
            ps.setString(2, pro.getNom());
            ps.setString(3, pro.getApe());
            ps.setString(4, pro.getTel());
            ps.setString(5, pro.getCel());
            ps.setString(6, pro.getCorreo());
            ps.setString(7, pro.getEmpre());
            ps.setString(8, pro.getFe());
            ps.setString(9, pro.getRuc());
            ps.setInt(10, pro.getId());
            ps.executeUpdate();
        }catch(Exception e){
        
        }
        return ans;
    }
    public void Eliminar(int id){
        String sql="delete from proveedor where IdPro="+id;
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
