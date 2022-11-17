/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author jairo
 */
public class Tematica {
    private String id;
    private String nombre;
    private String fechaAlta;
    private String fechaModificacion;

    public Tematica(){}
    public Tematica(String nombreTematica){
        this.nombre = nombreTematica;
    }
    public Tematica(String id, String nombre,String fechaAlta){
        this.id = id;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        fechaModificacion = obtenerFecha();
    }
    public Tematica(String nombre,String fechaCreacion) {
        this.nombre = nombre;
        this.fechaAlta = fechaCreacion;
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

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public String obtenerFecha(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd hh-mm-ss");
        return formato.format(new Date());
    }
    @Override
    public String toString() {
        
        return (nombre + " - " + fechaAlta) ;
    }

   
    
}
