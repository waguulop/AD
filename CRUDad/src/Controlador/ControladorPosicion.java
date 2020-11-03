/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Position;
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
public class ControladorPosicion implements ActionListener{
    private DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Position> arrayPeticiones = new ArrayList<>();
    private Boolean eliminarPeticion = false;
    private Boolean aniadirPeticion = false;
    private Boolean modificar = false;
    private VistaCRUD vistaprincipal;
    private ControladorDatos ctrDatosPeticion;
    private ControladorUsuario ctrUsuario;
    private ControladorMemoria ctrMem;

    public ControladorPosicion(VistaCRUD vistaprincipal, ControladorDatos ctrD, ControladorUsuario us) {
        this.vistaprincipal = vistaprincipal;
        this.ctrDatosPeticion = ctrD;
        this.ctrUsuario = us;
        this.vistaprincipal.botonAceptarTablaPeticion.addActionListener(this);
        this.vistaprincipal.botonAniadirTablaPeticion.addActionListener(this);
        this.vistaprincipal.botonModificarTablaPeticion.addActionListener(this);
        this.vistaprincipal.botonCancelarTablaPeticion.addActionListener(this);
        this.vistaprincipal.botonEliminarTablaPeticion.addActionListener(this);
        
        this.vistaprincipal.cajaCurso_tabla_Peticion.addActionListener(this);
        this.vistaprincipal.cajaId_peticion_Tabla_peticion.addActionListener(this);
        this.vistaprincipal.cajaEstado_Tabla_peticion.addActionListener(this);
        this.vistaprincipal.cajaLogin_Tabla_peticion.addActionListener(this);
        this.vistaprincipal.cajaPropuesta_python.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == this.vistaprincipal.botonModificarTablaPeticion) {
            this.objetosVisibles(true);
            this.modificar = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonAniadirTablaPeticion) {
            this.objetosVisibles(true);
            this.aniadirPeticion = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonEliminarTablaPeticion) {
            this.objetosVisibles(true);
            this.eliminarPeticion = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonAceptarTablaPeticion) {
            if (this.aniadirPeticion == true) {
                this.aniadirPeticion();
                this.actualizarTabla();
            }
            this.aniadirPeticion = false;
            
            
            if (this.eliminarPeticion == true) {
                this.eliminarPeticion();
            }
            this.eliminarPeticion = false;
            
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
        
        if (evento.getSource() == this.vistaprincipal.botonCancelarTablaPeticion) {
            this.objetosVisibles(false);
        }
        this.actualizarTabla();
    }
    
    public void objetosVisibles(Boolean visible){
        this.vistaprincipal.botonAceptarTablaPeticion.setVisible(visible);
        this.vistaprincipal.botonCancelarTablaPeticion.setVisible(visible);
    }
    
    public void modificar(){
        Position positionmodificada = new Position(
            this.vistaprincipal.cajaId_peticion_Tabla_peticion.getText(),
            this.vistaprincipal.cajaLogin_Tabla_peticion.getText(),
            this.vistaprincipal.cajaEstado_Tabla_peticion.getText(),
            this.vistaprincipal.cajaCurso_tabla_Peticion.getText(),
            this.vistaprincipal.cajaPropuesta_python.getText()
        );
        
        this.arrayPeticiones.set(this.vistaprincipal.seleccion, positionmodificada);
        this.ctrMem.rellenarComboBox();
    }

    public void actualizarTabla(){
        modelo = (DefaultTableModel)vistaprincipal.tablaPeticion.getModel();

        Object[]columna = new Object[5];

        modelo.setRowCount(0);

        for (int i = 0; i < this.arrayPeticiones.size(); i++) {
            columna[0] = this.arrayPeticiones.get(i).getId_peticion();
            columna[1] = this.arrayPeticiones.get(i).getLogin();
            columna[2] = this.arrayPeticiones.get(i).getEstado();
            columna[3] = this.arrayPeticiones.get(i).getCurso();
            columna[4] = this.arrayPeticiones.get(i).getPropuesta_python();
            modelo.addRow(columna);
        }

        this.vistaprincipal.tablaPeticion.setModel(modelo);
    }
    
    public void aniadirPeticion(){
        Position nuevapeticion = new Position(
            this.vistaprincipal.cajaId_peticion_Tabla_peticion.getText(),
            this.vistaprincipal.cajaLogin_Tabla_peticion.getText(),
            this.vistaprincipal.cajaEstado_Tabla_peticion.getText(),
            this.vistaprincipal.cajaCurso_tabla_Peticion.getText(),
            this.vistaprincipal.cajaPropuesta_python.getText()
        );
        
        this.arrayPeticiones.add(nuevapeticion);
        this.ctrMem.rellenarComboBox();
    }
    
    public void eliminarPeticion(){
        
        for (int i = 0; i < this.ctrMem.arrayMemorias.size(); i++) {
            if (this.ctrMem.arrayMemorias.get(i).getId_peticion().equals(this.vistaprincipal.cajaId_peticion_Tabla_peticion.getText())) {
                this.ctrMem.arrayMemorias.remove(i);
                i--;
            }
        }
        
        this.ctrMem.actualizarTabla();
        
        
        for (int i = 0; i < this.arrayPeticiones.size(); i++) {
            if (this.arrayPeticiones.get(i).getId_peticion().equals(this.vistaprincipal.cajaId_peticion_Tabla_peticion.getText())) {
                this.arrayPeticiones.remove(i);
            }
        }
        this.ctrMem.rellenarComboBox();
    }
    
    public void leerFichero() throws IOException, FileNotFoundException, ClassNotFoundException{
        this.ctrDatosPeticion.tipoposicion = true;
        this.ctrDatosPeticion.leerArchivo(this.arrayPeticiones);
        this.ctrDatosPeticion.tipoposicion = false;
    }
    
    public void sobreEscribirFichero() throws IOException{
        this.ctrDatosPeticion.tipoposicion = true;
        this.ctrDatosPeticion.meterDatosEnFichero(this.arrayPeticiones);
        this.ctrDatosPeticion.tipoposicion = false;
    }
    
    public void rellenarComboBox(){
        
        this.vistaprincipal.cBPeticion.removeAllItems();
        
        for (int i = 0; i < this.ctrUsuario.arrayUsuarios.size(); i++) {
            this.vistaprincipal.cBPeticion.addItem(this.ctrUsuario.arrayUsuarios.get(i).getLogin());
        }      
    }
    
    public void obtenerCtrs(ControladorMemoria ctrm){
        this.ctrMem = ctrm;
    }
        
}
