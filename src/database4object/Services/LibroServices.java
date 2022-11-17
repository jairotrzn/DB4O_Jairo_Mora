/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Services;

import com.db4o.collections.ActivatableArrayList;
import database4object.Classes.Libro;
import database4object.Repository.LibrosRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jairo
 */
public class LibroServices {

    private LibrosRepository libroRepository;

    public LibroServices() {
        this.libroRepository = new LibrosRepository();
    }

    public boolean exixteLibro(String nombre) {
        boolean respuesta = false;
        
        try {
            if(libroRepository.libroEnBD(nombre).get(0).getNombre().equalsIgnoreCase(nombre)){
            respuesta = true;
        }
        } catch (Exception e) {
            respuesta = false;
        }

        return respuesta;
    }

    public String obtenerFechaRegistro() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh-mm-ss");
        Date fecha = new Date();
        return dateFormat.format(fecha);
    }

    public String obtenerId(String nombre) {
        String id;
        return nombre + obtenerFechaRegistro().replace("/", "").replace(" ", "").replace("-", "");
    }

    public String mostrarLibros() {
        return libroRepository.leerLibros();
    }

    public void crearLibro(String nombre, String autor, String fechaPublicacion, String editorial, String tematica) {
        Libro libro = new Libro(nombre, autor, fechaPublicacion, editorial, obtenerArrayTemaicas(tematica));
        libroRepository.guardarLibro(libro);
    }

    public void modificarLibro(String nombreViejo, String nuevoNombre, String autor, String fechaPublicacion, String tematicas, String editorial) {
        libroRepository.modificarLibro(nombreViejo, nuevoNombre, autor, fechaPublicacion, obtenerArrayTemaicas(tematicas), editorial);
    }

    public List<String> obtenerArrayTemaicas(String tematicas) {
        String[] arrayTematicas = tematicas.split("-");

        List<String> nombreTematica = new ActivatableArrayList<>();
        for (int i = 0; i < arrayTematicas.length; i++) {
            nombreTematica.add(arrayTematicas[i]);
        }
        return nombreTematica;
    }
}
