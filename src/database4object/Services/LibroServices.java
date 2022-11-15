/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Services;

import database4object.Classes.Libro;
import database4object.Repository.LibrosRepository;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jairo
 */
public class LibroServices {
       private LibrosRepository libroRepository;
       
    public LibroServices() {
        this.libroRepository = new LibrosRepository();
    }
    
    public boolean exixteLibro(String nombre){
        return libroRepository.existeLibroEnBD(nombre);
    }
        
    public String obtenerFechaRegistro(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh-mm-ss");
        Date fecha = new Date();
        return dateFormat.format(fecha);
    }
    
    public String obtenerId(String nombre){ 
        String id;
        return nombre + obtenerFechaRegistro().replace("/", "").replace(" ", "").replace("-", "");
    }
    
    public String mostrarLibros(){
        return libroRepository.leerLibros();
    }

    public void crearLibro(String nombre,String autor,String fechaPublicacion,String editorial,String tematica) {
      Libro libro = new Libro(nombre, autor, fechaPublicacion, editorial, tematica);
      libroRepository.guardarLibro(libro);
    }
}
