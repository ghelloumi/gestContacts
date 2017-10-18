package com.ghassen.contacts.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contact implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dataNaissance;
    private String email;
    private long tel;
    private String photo;

    public Contact() {
        super();
    }


    public Contact(String nom, String prenom, Date dataNaissance, String email, long tel, String photo) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.dataNaissance = dataNaissance;
        this.email = email;
        this.tel = tel;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDataNaissance() {
        return dataNaissance;
    }

    public void setDataNaissance(Date dataNaissance) {
        this.dataNaissance = dataNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
