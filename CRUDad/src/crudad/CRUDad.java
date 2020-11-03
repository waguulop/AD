/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudad;

import Controlador.ControladorMemoria;
import Controlador.ControladorPosicion;
import Controlador.ControladorUsuario;
import Controlador.ControladorVista;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author guillermosq
 */
public class CRUDad {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        VistaCRUD vistaprincipal = new VistaCRUD();
        ControladorVista controladorV = new ControladorVista(vistaprincipal);
        controladorV.iniciarVista();
    }
    
}
