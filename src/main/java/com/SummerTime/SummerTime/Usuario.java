package com.SummerTime.SummerTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    private int id;

    private String nombre_usuario;

    private String mail;

    private String contraseña;

    // Getters y setters

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return this.nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario id(int id) {
        setId(id);
        return this;
    }

    public Usuario nombre_usuario(String nombre_usuario) {
        setNombre_usuario(nombre_usuario);
        return this;
    }

    public Usuario mail(String mail) {
        setMail(mail);
        return this;
    }

    public Usuario contraseña(String contraseña) {
        setContraseña(contraseña);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nombre_usuario, usuario.nombre_usuario)
                && Objects.equals(mail, usuario.mail) && Objects.equals(contraseña, usuario.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre_usuario, mail, contraseña);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre_usuario='" + getNombre_usuario() + "'" +
                ", mail='" + getMail() + "'" +
                ", contraseña='" + getContraseña() + "'" +
                "}";
    }

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(int id, String nombre_usuario, String mail, String contraseña) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.mail = mail;
        this.contraseña = contraseña;
    }
}
