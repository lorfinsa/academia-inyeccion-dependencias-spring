package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Persona {

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Id
    private Long id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Persona{" + "id:" + id + ", nombre:" + nombre + ", rol=" + rol + "}";
    }

}
