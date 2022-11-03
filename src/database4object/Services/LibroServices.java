/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Services;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jairo
 */
public class LibroServices {
       
    public LibroServices(String nombre) {
        
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
}
