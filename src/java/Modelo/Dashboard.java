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
public class Dashboard {

    String CantProv,CantProd,CantOrdCompras,CodPro,NomPro,StockPro;
    

    public Dashboard() {
    }

    public Dashboard(String CantProv, String CantProd, String CantOrdCompras, String CodPro, String NomPro, String StockPro) {
        this.CantProv = CantProv;
        this.CantProd = CantProd;
        this.CantOrdCompras = CantOrdCompras;
        this.CodPro = CodPro;
        this.NomPro = NomPro;
        this.StockPro = StockPro;
    }

    public String getCantProv() {
        return CantProv;
    }

    public String getCantProd() {
        return CantProd;
    }

    public String getCantOrdCompras() {
        return CantOrdCompras;
    }

    public String getCodPro() {
        return CodPro;
    }

    public String getNomPro() {
        return NomPro;
    }

    public String getStockPro() {
        return StockPro;
    }

    public void setCantProv(String CantProv) {
        this.CantProv = CantProv;
    }

    public void setCantProd(String CantProd) {
        this.CantProd = CantProd;
    }

    public void setCantOrdCompras(String CantOrdCompras) {
        this.CantOrdCompras = CantOrdCompras;
    }

    public void setCodPro(String CodPro) {
        this.CodPro = CodPro;
    }

    public void setNomPro(String NomPro) {
        this.NomPro = NomPro;
    }

    public void setStockPro(String StockPro) {
        this.StockPro = StockPro;
    }

   

    

  

   
   


    

            
}
