/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Eduardo
 */
public class Productos {
    int id;
    int stck;
    double pre;
    String cod,nom,cat,mar;
    String fech;

    public Productos() {
    }

    public Productos(int id, int stck, double pre, String cod, String nom, String cat, String mar, String fech) {
        this.id = id;
        this.stck = stck;
        this.pre = pre;
        this.cod = cod;
        this.nom = nom;
        this.cat = cat;
        this.mar = mar;
        this.fech = fech;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
    }

    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStck() {
        return stck;
    }

    public void setStck(int stck) {
        this.stck = stck;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
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

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }
    
}
