/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import crudad.VistaCRUD;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author guillermosq
 */
public class ControladorVista {
    
    ControladorUsuario ctrU; 
    ControladorPosicion ctrP; 
    ControladorMemoria ctrM;
    ControladorDatos ctrD = new ControladorDatos();
    VistaCRUD vistaprincipal;
    
    public ControladorVista(VistaCRUD vistaprincipal) throws IOException{
        this.ctrU = new ControladorUsuario(vistaprincipal, ctrD);
        this.vistaprincipal = vistaprincipal;
        //this.ctrD.generarFichero();  
    }
    
    public void iniciarVista() throws IOException, FileNotFoundException, ClassNotFoundException{
        this.vistaprincipal.setVisible(true);
        this.ctrU.leerFichero();
        this.ctrP = new ControladorPosicion(vistaprincipal, ctrD, ctrU);
        this.ctrP.leerFichero();
        this.ctrM = new ControladorMemoria(vistaprincipal, ctrD, ctrP);
        this.ctrM.leerFichero();
        
        this.ctrU.objetosVisibles(false);
        this.ctrP.objetosVisibles(false);
        this.ctrM.objetosVisibles(false);
        
        this.ctrP.rellenarComboBox();
        this.ctrM.rellenarComboBox();
        
        this.ctrU.actualizarTabla();
        this.ctrP.actualizarTabla();
        this.ctrM.actualizarTabla();
        
        this.ctrU.obtenerCtrs(ctrM, ctrP);
        this.ctrP.obtenerCtrs(ctrM);
    }
}
