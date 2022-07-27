
package Modelo;


public class detalleOrden {
    
    String cod, nomp, numse;
    Integer IdOrd, cant;
    Double pre, igv, sub, tota;
    
        public detalleOrden(){
        }

    public detalleOrden( String cod, Integer IdOrd, String nomp, Integer cant, Double pre, String numse,Double igv, Double sub, Double tota) {
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

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public String getNumse() {
        return numse;
    }

    public void setNumse(String numse) {
        this.numse = numse;
    }

    public Integer getIdOrd() {
        return IdOrd;
    }

    public void setIdOrd(Integer IdOrd) {
        this.IdOrd = IdOrd;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public Double getPre() {
        return pre;
    }

    public void setPre(Double pre) {
        this.pre = pre;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public Double getSub() {
        return sub;
    }

    public void setSub(Double sub) {
        this.sub = sub;
    }

    public Double getTota() {
        return tota;
    }

    public void setTota(Double tota) {
        this.tota = tota;
    }
     
     
}
