/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Memoria;
import Modelo.Position;
import Modelo.Usuario;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;

/**
 *
 * @author guillermosq
 */
public class ControladorDatos {
    
Boolean tipousuario = false;
Boolean tipomemoria = false;
Boolean tipoposicion = false;
    public void generarFichero() throws FileNotFoundException, IOException{
        
        if (tipousuario == true) {
            File fichero = new File("Usuario.dat");
            FileOutputStream fileout = new FileOutputStream(fichero, true);
            ObjectOutputStream dataOS = new ObjectOutputStream(fileout);

            String login[] = {"Djguilley"};
            String nombre[] = {"Guillermo"};
            String apellidos[] = {"Santamaria"};
            String email[] = {"Djguilleyps@gmail.com"};
            String tipo[] = {"user"};

            for (int i = 0; i < login.length; i++) {
                Usuario nuevousuario = new Usuario(login[i], nombre[i], apellidos[i], email[i], tipo[i]);
                dataOS.writeObject(nuevousuario);
            }
                dataOS.close();  
        }
        
        if (tipomemoria == true) {
            File fichero = new File("Memoria.dat");
            FileOutputStream fileout = new FileOutputStream(fichero, true);
            ObjectOutputStream dataOS = new ObjectOutputStream(fileout);

            String id_memoria[] = {"AF344"};
            String id_peticion[] = {"IS37HJ"};
            String espacio[] = {"123"};
            String estado[] = {"En uso"};
            String direccion_de_memoria[] = {"0x1121344"};

            for (int i = 0; i < id_memoria.length; i++) {
                Memoria nuevamemoria = new Memoria(id_memoria[i], id_peticion[i], espacio[i], estado[i], direccion_de_memoria[i]);
                dataOS.writeObject(nuevamemoria);
            }
            
            dataOS.close();
        }
        
        if (tipoposicion == true) {
            File fichero = new File("Peticion.dat");
            FileOutputStream fileout = new FileOutputStream(fichero, true);
            ObjectOutputStream dataOS = new ObjectOutputStream(fileout);

            String id_peticion[] = {"IS37HJ"};
            String login[] = {"Djguilleyps"};
            String estado[] = {"Procesandose"};
            String curso[] = {"En uso"};
            String propuesta_python[] = {"Makefile"};

            for (int i = 0; i < id_peticion.length; i++) {
                Position nuevapeticion = new Position(id_peticion[i], login[i], estado[i], curso[i], propuesta_python[i]);
                dataOS.writeObject(nuevapeticion);
            }
            
            dataOS.close();
        }

    }

    
    public void leerArchivo(ArrayList tipoarray) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        if (this.tipousuario == true) {
            File fichero = new File("Usuario.dat");
            ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream(fichero));

            try{
                while(true){
                    Usuario nuevousuario = (Usuario) dataIS.readObject();
                    tipoarray.add(nuevousuario);
                }
            }catch(EOFException eo){

            }catch(StreamCorruptedException x){

            }
                    
            dataIS.close();
        }
        
        if (this.tipomemoria == true) {
            File fichero = new File("Memoria.dat");
            ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream(fichero));
            int i = 1;

            try{
                while(true){
                    Memoria nuevamemoria = (Memoria) dataIS.readObject();
                    i++;
                    tipoarray.add(nuevamemoria);
                }
            }catch(EOFException eo){

            }catch(StreamCorruptedException x){
            
            }
                    
            dataIS.close();
        }
        
        if (this.tipoposicion == true) {
            File fichero = new File("Peticion.dat");
            ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream(fichero));
            int i = 1;

            try{
                while(true){
                    Position nuevapeticion = (Position) dataIS.readObject();
                    i++;
                    tipoarray.add(nuevapeticion);
                }
            }catch(EOFException eo){

            }catch(StreamCorruptedException x){
            
            }
                    
            dataIS.close();
        }
    }
    
    public void meterDatosEnFichero(ArrayList tipoarray) throws FileNotFoundException, IOException{
        String ficheroALeer = "";
        if (this.tipousuario == true) {
            ficheroALeer = "Usuario.dat";
        }
        
        if (this.tipomemoria == true) {
            ficheroALeer = "Memoria.dat";
        }
        
                
        if (this.tipoposicion == true) {
            ficheroALeer = "Peticion.dat";
        }
        
        File fichero = new File(ficheroALeer);
        ObjectOutputStream dataOS = new ObjectOutputStream(new FileOutputStream(fichero));

        for (int j = 0; j < tipoarray.size(); j++) {
            dataOS.writeObject(tipoarray.get(j));
        }

        dataOS.close();
    }
}
