package Modelo;


public class Usuario {
    int id;
    String dni,nom,ape,cel,user,contra;

    public Usuario() {
    }

    public Usuario(int id, String dni, String nom, String ape, String cel, String user, String contra) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.ape = ape;
        this.cel = cel;
        this.user = user;
        this.contra = contra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

}