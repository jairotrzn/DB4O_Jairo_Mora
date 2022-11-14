/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Classes;

import com.db4o.collections.ActivatableArrayList;
import java.rmi.server.UID;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author jairo
 */
public class Libro {
    private String id;
    private String nombre;
    private String autor;
    private String fechaPublicacion;
    private String editorial;
    private List <String> nombreTematica = new ActivatableArrayList<>();
    
    public Libro (){
    
    }
    
    public Libro(String nombreLibro){
        this.nombre = nombreLibro;
    }
    
    public Libro(String id,String nombre, String autor, String fechaPublicacion, String editorial,String tematica){
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.nombreTematica.add(tematica);
    }
    public Libro(String nombre, String autor, String fechaPublicacion, String editorial,String tematica){
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.nombreTematica.add(tematica);
    }

    @Override
    public String toString() {
        return  (nombre + " - " + autor + " - " + fechaPublicacion + " - " );
    }
    
    public void addTematica(String tematica){
        this.nombreTematica.add(tematica);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<String> getIdTematicas() {
        return nombreTematica;
    }

    public void setIdTematicas(List<String> nombreTematica) {
        this.nombreTematica = nombreTematica;
    }

}
