/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Eduardo
 */
public class Proveedor {
    int id;
    String cod,nom,ape,tel,cel,correo,empre,ruc;
    String fe;
   
    public Proveedor() {
  
    }

    public Proveedor(int id, String cod, String nom, String ape, String tel, String cel, String correo, String empre, String ruc, String fe) {
     
            this.id = id;
            this.cod = cod;
            this.nom = nom;
            this.ape = ape;
            this.tel = tel;
            this.cel = cel;
            this.correo = correo;
            this.empre = empre;
            this.ruc = ruc;
            this.fe = fe;
     
      
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getFe() {
        return fe;
    }

    public void setFe(String fe) {
        this.fe = fe;
    }

  
  

  
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpre() {
        return empre;
    }

    public void setEmpre(String empre) {
        this.empre = empre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    

            
}
