package com.SummerTime.SummerTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "notas")
public class Nota {

    @Id
    private int id;

    private String titulo;

    @Column(name = "textonota", columnDefinition = "TEXT")
    private String textoNota;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTextoNota() {
        return this.textoNota;
    }

    public void setTextoNota(String textoNota) {
        this.textoNota = textoNota;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Nota id(int id) {
        setId(id);
        return this;
    }

    public Nota titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Nota textoNota(String textoNota) {
        setTextoNota(textoNota);
        return this;
    }

    public Nota usuario(Usuario usuario) {
        setUsuario(usuario);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Nota)) {
            return false;
        }
        Nota nota = (Nota) o;
        return id == nota.id && Objects.equals(titulo, nota.titulo) && Objects.equals(textoNota, nota.textoNota)
                && Objects.equals(usuario, nota.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, textoNota, usuario);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", titulo='" + getTitulo() + "'" +
                ", textoNota='" + getTextoNota() + "'" +
                ", usuario='" + getUsuario() + "'" +
                "}";
    }

    // Getters y setters

    // Constructor vacío
    public Nota() {
    }

    // Constructor con parámetros
    public Nota(int id, String titulo, String textoNota, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.textoNota = textoNota;
        this.usuario = usuario;
    }
}
