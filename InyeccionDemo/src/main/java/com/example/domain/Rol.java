package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rol {

    @Id
    private Long id;
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "{" + "id: " + id + ", descripcion: " + descripcion + "}";
    }
    
    
}
