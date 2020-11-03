/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author guillermosq
 */
public class Memoria implements Serializable{
    private String id_memoria;
    private String id_peticion;
    private String espacio;
    private String estado;
    private String direccion_de_memoria;

    public Memoria(String id_memoria, String id_peticion, String espacio, String estado, String direccion_de_memoria) {
        this.id_memoria = id_memoria;
        this.id_peticion = id_peticion;
        this.espacio = espacio;
        this.estado = estado;
        this.direccion_de_memoria = direccion_de_memoria;
    }

    public String getId_memoria() {
        return id_memoria;
    }

    public void setId_memoria(String id_memoria) {
        this.id_memoria = id_memoria;
    }

    public String getId_peticion() {
        return id_peticion;
    }

    public void setId_peticion(String id_peticion) {
        this.id_peticion = id_peticion;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion_de_memoria() {
        return direccion_de_memoria;
    }

    public void setDireccion_de_memoria(String direccion_de_memoria) {
        this.direccion_de_memoria = direccion_de_memoria;
    }
}
