package database4object.Services;

import com.db4o.ObjectSet;
import database4object.Classes.Tematica;
import database4object.Repository.TematicaRepository;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jairo
 */
public class TematicaServices {

    private TematicaRepository tematicaRepository;
    
    public TematicaServices() {
        this.tematicaRepository = new TematicaRepository();
    }
    
    public boolean existeTematica(String nombre){
        return tematicaRepository.exixteTematica(nombre);
    }
    public void modificarTematica(String nombreAntiguo,String nombreNuevo){
        tematicaRepository.modificarTematica(nombreAntiguo, nombreNuevo);
    }
    public void crearTematica(String nombre){
        Tematica tematica = new Tematica(nombre);
        tematicaRepository.guardarTematica(tematica);
    }
    
    public void leerTematica(){
        tematicaRepository.leerTematicas();
    }
    
    public String obtenerDatosTematica(){
        return tematicaRepository.leerTematicas();
    }
    public String obtenerFecha(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        return format.format(new Date());
    }
   
    public  ArrayList<Tematica> almacenarTematicas(){
      
        return tematicaRepository.obtenerLista();
    } 
}
   
