/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Memoria;
import crudad.VistaCRUD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guillermosq
 */
public class ControladorMemoria implements ActionListener{
    private DefaultTableModel modelo = new DefaultTableModel();
    private VistaCRUD vistaprincipal;
    ArrayList<Memoria> arrayMemorias = new ArrayList<>();
    private Boolean eliminarMemoria = false;
    private Boolean aniadirMemoria = false;
    private Boolean modificar = false;
    private ControladorDatos ctrDatosPeticion;
    private ControladorPosicion ctrPosicion;

    public ControladorMemoria(VistaCRUD vistaprincipal, ControladorDatos ctrD, ControladorPosicion pos) {
        this.vistaprincipal = vistaprincipal;
        this.ctrDatosPeticion = ctrD;
        this.ctrPosicion = pos;
        this.vistaprincipal.botonAceptarTablaMemoria.addActionListener(this);
        this.vistaprincipal.botonModificarTablaMemoria.addActionListener(this);
        this.vistaprincipal.botonAniadirTablaMemoria.addActionListener(this);
        this.vistaprincipal.botonCancelarTablaMemoria.addActionListener(this);
        this.vistaprincipal.botonEliminarTablaMemoria.addActionListener(this);
        
        this.vistaprincipal.cajaDireccion_de_memoria.addActionListener(this);
        this.vistaprincipal.cajaId_memoria.addActionListener(this);
        this.vistaprincipal.cajaId_peticion.addActionListener(this);
        this.vistaprincipal.cajaEspacio.addActionListener(this);
        this.vistaprincipal.cajaEstado.addActionListener(this);      
    }
    
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == this.vistaprincipal.botonModificarTablaMemoria) {
            this.objetosVisibles(true);
            this.modificar = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonAniadirTablaMemoria) {
            this.objetosVisibles(true);
            this.aniadirMemoria = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonEliminarTablaMemoria) {
            this.objetosVisibles(true);
            this.eliminarMemoria = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonAceptarTablaMemoria) {
            if (this.aniadirMemoria == true) {
                this.aniadirMemoria();
                this.actualizarTabla();
            }
            this.aniadirMemoria = false;
            
            
            if (this.eliminarMemoria == true) {
                this.eliminarMemoria();
            }
            this.eliminarMemoria = false;
            
            if (this.modificar == true) {
                this.modificar();
                this.actualizarTabla();
            }
            
            try {
                this.sobreEscribirFichero();
            } catch (IOException ex) {
                Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.objetosVisibles(false);
        }
        
        if (evento.getSource() == this.vistaprincipal.botonCancelarTablaMemoria) {
            this.objetosVisibles(false);
        }
        
        this.actualizarTabla();
    }
    
    public void objetosVisibles(Boolean visible){
        this.vistaprincipal.botonAceptarTablaMemoria.setVisible(visible);
        this.vistaprincipal.botonCancelarTablaMemoria.setVisible(visible);
    }

    public void modificar(){
        Memoria memoriamodificada = new Memoria(
            this.vistaprincipal.cajaId_memoria.getText(),
            this.vistaprincipal.cajaId_peticion.getText(),
            this.vistaprincipal.cajaEspacio.getText(),
            this.vistaprincipal.cajaEstado.getText(),
            this.vistaprincipal.cajaDireccion_de_memoria.getText()
        );
        
        this.arrayMemorias.set(this.vistaprincipal.seleccion, memoriamodificada);
    }
    
    public void actualizarTabla(){
        modelo = (DefaultTableModel)vistaprincipal.tablaMemoria.getModel();

        Object[]columna = new Object[5];

        modelo.setRowCount(0);

        for (int i = 0; i < this.arrayMemorias.size(); i++) {
            columna[0] = this.arrayMemorias.get(i).getId_memoria();
            columna[1] = this.arrayMemorias.get(i).getId_peticion();
            columna[2] = this.arrayMemorias.get(i).getEspacio();
            columna[3] = this.arrayMemorias.get(i).getEstado();
            columna[4] = this.arrayMemorias.get(i).getDireccion_de_memoria();
            modelo.addRow(columna);
        }

        this.vistaprincipal.tablaMemoria.setModel(modelo);
    }
    
    public void aniadirMemoria(){
        Memoria nuevamemoria = new Memoria(
            this.vistaprincipal.cajaId_memoria.getText(),
            this.vistaprincipal.cajaId_peticion.getText(),
            this.vistaprincipal.cajaEspacio.getText(),
            this.vistaprincipal.cajaEstado.getText(),
            this.vistaprincipal.cajaDireccion_de_memoria.getText()
        );
                
        this.arrayMemorias.add(nuevamemoria);
    }
    
    public void eliminarMemoria(){
        for (int i = 0; i < this.arrayMemorias.size(); i++) {
            if (this.arrayMemorias.get(i).getId_memoria().equals(this.vistaprincipal.cajaId_memoria.getText())) {
                this.arrayMemorias.remove(i);
            }
        }
    }
    
    public void leerFichero() throws IOException, FileNotFoundException, ClassNotFoundException{
        this.ctrDatosPeticion.tipomemoria = true;
        this.ctrDatosPeticion.leerArchivo(this.arrayMemorias);
        this.ctrDatosPeticion.tipomemoria = false;
    }
    
    public void sobreEscribirFichero() throws IOException{
        this.ctrDatosPeticion.tipomemoria = true;
        this.ctrDatosPeticion.meterDatosEnFichero(this.arrayMemorias);
        this.ctrDatosPeticion.tipomemoria = false;
    }
    
    public void rellenarComboBox(){
        
        this.vistaprincipal.cbMemoria.removeAllItems();
        
        for (int i = 0; i < this.ctrPosicion.arrayPeticiones.size(); i++) {
            this.vistaprincipal.cbMemoria.addItem(this.ctrPosicion.arrayPeticiones.get(i).getId_peticion());
        }      
    }
}
