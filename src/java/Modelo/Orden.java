
package Modelo;


public class Orden {
    Integer id,item,idusu,idprove,idprod;
    String numse,nomp,fecha1,fecha2,fecha3,ruc;//numse=N_compra
    Double pre,sub,tota;//sub total //total
    Integer IdOrd;
    Double igv;
    Integer cant;
    String est;
    String cod;
    String dentre;//direccion
    String nomemple;//nombre
   
    public Orden() {
    }

    public Orden( String cod, Integer IdOrd, String nomp, Integer cant, Double pre, String numse,Double igv, Double sub, Double tota) {
        this.cod = cod;
        this.IdOrd = IdOrd;
        this.nomp = nomp;
        this.cant = cant;
        this.pre = pre;
        this.numse = numse;
        this.igv = igv;
        this.sub = sub;
        this.tota = tota;
    }

    
   
    public Orden(String numse,String fecha1, String fecha2, String fecha3, String dentre,String nomemp, String ruc, Double igv, Double sub, Double tota) {
        this.numse = numse;
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
        this.fecha3 = fecha3;
        this.dentre = dentre;
        this.nomemple = nomemp;
        this.ruc = ruc;
        this.igv = igv;
        this.sub = sub;
        this.tota = tota;
        
    }

    public Orden(Integer idprod, String nomp, Integer cant, Double pre, String numse, Double igv, Double sub, Double tota) {
        this.idprod = idprod;
        this.nomp = nomp;
        this.cant = cant;
        this.pre = pre;
        this.numse = numse;
        this.igv = igv;
        this.sub = sub;
        this.tota = tota;
        
    }
    
    
    
    public Orden(int id, int item, int idusu, int idprove, int idprod, String numse, String nomp, String fecha1, String fecha2, String fecha3, String ruc, double pre, double sub, double tota, int cant, String est, String cod, String dentre, String nomemple) {
        this.id = id;
        this.item = item;
        this.idusu = idusu;
        this.idprove = idprove;
        this.idprod = idprod;
        this.numse = numse;
        this.nomp = nomp;
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
        this.fecha3 = fecha3;
        this.ruc = ruc;
        this.pre = pre;
        this.sub = sub;
        this.tota = tota;
        this.cant = cant;
        this.est = est;
        this.cod = cod;
        this.dentre = dentre;
        this.nomemple = nomemple;
    }

    public Integer getIdOrd() {
        return IdOrd;
    }

    public void setIdOrd(Integer IdOrd) {
        this.IdOrd = IdOrd;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public String getNomemple() {
        return nomemple;
    }

    public void setNomemple(String nomemple) {
        this.nomemple = nomemple;
    }
    

    public String getDentre() {
        return dentre;
    }

    public void setDentre(String dentre) {
        this.dentre = dentre;
    }
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdusu() {
        return idusu;
    }

    public void setIdusu(int idusu) {
        this.idusu = idusu;
    }

    public int getIdprove() {
        return idprove;
    }

    public void setIdprove(int idprove) {
        this.idprove = idprove;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public String getNumse() {
        return numse;
    }

    public void setNumse(String numse) {
        this.numse = numse;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public String getFecha3() {
        return fecha3;
    }

    public void setFecha3(String fecha3) {
        this.fecha3 = fecha3;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public double getTota() {
        return tota;
    }

    public void setTota(double tota) {
        this.tota = tota;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }
    
}
