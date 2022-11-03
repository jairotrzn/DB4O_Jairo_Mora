package database4object.Services;

import database4object.Classes.Tematica;
import database4object.Repository.TematicaRepository;

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
    
    public void crearTematica(String nombre){
        Tematica tematica = new Tematica(nombre);
        tematicaRepository.guardarTematica(tematica);
    }
    
    public void leerTematica(){
        tematicaRepository.leerTematicas();
    }
    
   
}
   
