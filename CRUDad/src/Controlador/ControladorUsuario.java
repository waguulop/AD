/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
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
public class ControladorUsuario implements ActionListener{

    private DefaultTableModel modelo = new DefaultTableModel();
    private VistaCRUD vistaprincipal;
    private ControladorDatos ctrDatosUsuario;
    private Boolean eliminarUsuario = false;
    private Boolean aniadirUsuario = false;
    private Boolean modificar = false;
    ArrayList<Usuario> arrayUsuarios = new ArrayList<>();
    private ControladorPosicion ctrPos;
    private ControladorMemoria ctrMem;

    public ControladorUsuario(VistaCRUD vistaprincipal, ControladorDatos ctrDatos) {
        this.vistaprincipal = vistaprincipal;
        this.ctrDatosUsuario = ctrDatos;
        this.vistaprincipal.botonModificar.addActionListener(this);
        this.vistaprincipal.botonAniadir.addActionListener(this);
        this.vistaprincipal.botonEliminar.addActionListener(this);
        this.vistaprincipal.botonAceptar.addActionListener(this);
        this.vistaprincipal.botonCancelar.addActionListener(this);
        this.vistaprincipal.cajaLogin.addActionListener(this);
        this.vistaprincipal.cajaApellidos.addActionListener(this);
        this.vistaprincipal.cajaNombre.addActionListener(this);
        this.vistaprincipal.cajaTipo.addActionListener(this);
        this.vistaprincipal.cajaEmail.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == this.vistaprincipal.botonModificar) {
            this.objetosVisibles(true);
            this.modificar = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonAniadir) {
            this.objetosVisibles(true);
            this.aniadirUsuario = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonEliminar) {
            this.objetosVisibles(true);
            this.eliminarUsuario = true;
        }
        
        if (evento.getSource() == this.vistaprincipal.botonAceptar) {
            if (this.aniadirUsuario == true) {
                this.aniadirUsuario();
            }
            this.aniadirUsuario = false;
            
            
            if (this.eliminarUsuario == true) {
                this.eliminarUsuario();
            }
            this.eliminarUsuario = false;
            
            if (this.modificar == true) {
                this.modificar();
                this.actualizarTabla();
            }
            
            this.objetosVisibles(false);
            
            try {
                this.sobreEscribirFichero();
            } catch (IOException ex) {
                Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (evento.getSource() == this.vistaprincipal.botonCancelar) {
            this.objetosVisibles(false);
        }
        
        this.actualizarTabla();
        
    }
   
    public void modificar(){
        Usuario usermodificado = new Usuario(
            this.vistaprincipal.cajaLogin.getText(),
            this.vistaprincipal.cajaNombre.getText(),
            this.vistaprincipal.cajaApellidos.getText(),
            this.vistaprincipal.cajaEmail.getText(),
            this.vistaprincipal.cajaTipo.getText()
        );
        
        this.arrayUsuarios.set(this.vistaprincipal.seleccion, usermodificado);
        this.ctrPos.rellenarComboBox();
    }
    
    public void objetosVisibles(Boolean visible){
        this.vistaprincipal.botonAceptar.setVisible(visible);
        this.vistaprincipal.botonCancelar.setVisible(visible);
    }
    
    
    public void actualizarTabla(){
              
        modelo = (DefaultTableModel)vistaprincipal.tablaUsuario.getModel();

        Object[]columna = new Object[5];

        modelo.setRowCount(0);

        for (int i = 0; i < this.arrayUsuarios.size(); i++) {
            columna[0] = this.arrayUsuarios.get(i).getLogin();
            columna[1] = this.arrayUsuarios.get(i).getNombre();
            columna[2] = this.arrayUsuarios.get(i).getApellidos();
            columna[3] = this.arrayUsuarios.get(i).getEmail();
            columna[4] = this.arrayUsuarios.get(i).getTipo();
            modelo.addRow(columna);
        }

        this.vistaprincipal.tablaUsuario.setModel(modelo);
    }
    
    public void aniadirUsuario(){
        
            Usuario nuevousuario = new Usuario(
            this.vistaprincipal.cajaLogin.getText(),
            this.vistaprincipal.cajaNombre.getText(),
            this.vistaprincipal.cajaApellidos.getText(),
            this.vistaprincipal.cajaEmail.getText(),
            this.vistaprincipal.cajaTipo.getText()
        );
        
        this.arrayUsuarios.add(nuevousuario);
        this.ctrPos.rellenarComboBox();
    }
    
    public void eliminarUsuario(){
        
        String id_peticion = "";
        
        for (int i = 0; i < this.ctrPos.arrayPeticiones.size(); i++) {
            if (this.ctrPos.arrayPeticiones.get(i).getLogin().equals(this.vistaprincipal.cajaLogin.getText())) {
                id_peticion = this.ctrPos.arrayPeticiones.get(i).getId_peticion();
                this.ctrPos.arrayPeticiones.remove(i);
                i--;
            }
        }
        
        this.ctrPos.actualizarTabla();
        
        for (int i = 0; i < this.ctrMem.arrayMemorias.size(); i++) {
            if (this.ctrMem.arrayMemorias.get(i).getId_peticion().equals(id_peticion)) {
                this.ctrMem.arrayMemorias.remove(i);
                i--;
            }
        }
        
        this.ctrMem.actualizarTabla();
        
        for (int i = 0; i < this.arrayUsuarios.size(); i++) {
            if (this.arrayUsuarios.get(i).getLogin().equals(this.vistaprincipal.cajaLogin.getText())) {
                this.arrayUsuarios.remove(i);
            }
        }
        this.ctrPos.rellenarComboBox();
    }
    
    public void leerFichero() throws IOException, FileNotFoundException, ClassNotFoundException{
        this.ctrDatosUsuario.tipousuario = true;
        this.ctrDatosUsuario.leerArchivo(this.arrayUsuarios);
        this.ctrDatosUsuario.tipousuario = false;
    }
    
    public void sobreEscribirFichero() throws IOException{
        this.ctrDatosUsuario.tipousuario = true;
        this.ctrDatosUsuario.meterDatosEnFichero(this.arrayUsuarios);
        this.ctrDatosUsuario.tipousuario = false;
    }
    
    public void obtenerCtrs(ControladorMemoria ctrm, ControladorPosicion ctrp){
        this.ctrMem = ctrm;
        this.ctrPos = ctrp;
    }
   
}
