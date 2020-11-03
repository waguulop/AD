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
public class Position implements Serializable{
    private String id_peticion;
    private String login;
    private String estado;
    private String curso;
    private String propuesta_python;

    public Position(String id_peticion, String login, String estado, String curso, String propuesta_python) {
        this.id_peticion = id_peticion;
        this.login = login;
        this.estado = estado;
        this.curso = curso;
        this.propuesta_python = propuesta_python;
    }

    public String getId_peticion() {
        return id_peticion;
    }

    public void setId_peticion(String id_peticion) {
        this.id_peticion = id_peticion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPropuesta_python() {
        return propuesta_python;
    }

    public void setPropuesta_python(String propuesta_python) {
        this.propuesta_python = propuesta_python;
    }
}
