package Modelo;

import Utils.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class OrdenDAO {
    Connection con;
    ConexionDB cn=new ConexionDB();
    PreparedStatement ps;
    ResultSet rs;
    Integer r;
    int ans;
    public String GenerarOr(){
        String ns="";
        String sql="select max(N_Compra) from ordcompra";
        
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                ns=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return ns;
    }
    public String IdOrde(){
        String idorden="";
        String sql="select max(IdOrd) from ordcompra";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                idorden=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idorden;
    }
    public int GuardarOrden(Orden or){
        String sql="insert into ordcompra (N_Compra,FechaOrden,FechaEntre,FechaPago,DireEntre,NomEmple,Ruc,Igv,SubTotal,Total) values(?,?,?,?,?,?,?,?,?,?)";
        int rows = 0;
        try{
          con=cn.getConexion();
          ps=con.prepareStatement(sql); 
          ps.setString(1, or.getNumse());
          ps.setString(2, or.getFecha1());
          ps.setString(3, or.getFecha2());
          ps.setString(4, or.getFecha3());
          ps.setString(5, or.getDentre());
          ps.setString(6, or.getNomemple());
          ps.setString(7, or.getRuc());
          ps.setDouble(8, or.getIgv());
          ps.setDouble(9, or.getSub());
          ps.setDouble(10, or.getTota());
          ps.executeUpdate(); 
        }catch(SQLException e){
            
        }
        return ans;
    }
    public int DetallOrden(detalleOrden orde){
        String sql="insert into detalleordcom(CodPro,IdOrd,NomPro,CantPro,PreUnit,N_Compra,Igv,SubTotal,Total) values(?,?,?,?,?,?,?,?,?)";
        int rows = 0;
        try{
          con=cn.getConexion();
          ps=con.prepareStatement(sql);
          ps.setString(1, orde.getCod());
          ps.setInt(2, orde.getIdOrd());
          ps.setString(3, orde.getNomp());
          ps.setInt(4, orde.getCant());
          ps.setDouble(5, orde.getPre());
          ps.setString(6, orde.getNumse());
          ps.setDouble(7, orde.getIgv());
          ps.setDouble(8, orde.getSub());
          ps.setDouble(9, orde.getTota());
           rows= ps.executeUpdate(); 
        }catch(SQLException e){
            
        }
        return rows;
    }
    public List listarOr() {
        String sql = "select * from ordcompra";
        List<Orden> lista1 = new ArrayList<>();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Orden pro = new Orden();
                pro.setId(rs.getInt(1));
                pro.setNumse(rs.getString(2));
                pro.setFecha1(rs.getString(3));
                pro.setFecha2(rs.getString(4));
                pro.setFecha3(rs.getString(5));
                pro.setDentre(rs.getString(6));
                pro.setNomemple(rs.getString(7));
                pro.setRuc(rs.getString(8));
                pro.setIgv(rs.getDouble(9));
                pro.setSub(rs.getDouble(10));
                pro.setTota(rs.getDouble(11));
                lista1.add(pro);
            }
        } catch (SQLException e) {

        }
        return lista1;
    }
}
