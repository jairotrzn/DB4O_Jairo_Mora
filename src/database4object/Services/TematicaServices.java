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
    /**
     * 
     * @param nombre
     * @return respuesta boolean, si existe una tematica con el mismo nombre en la BD devuelve true, asi controlo que pueda o no crearse o modificarse.
     */
    public boolean existeTematica(String nombre) {

        boolean respuesta = false;
        try {
            ArrayList<Tematica> tematicaEncotradaEnBD = tematicaRepository.tematicaEncontrada(nombre);
            Tematica tematica = tematicaEncotradaEnBD.get(0);
            if (nombre.equalsIgnoreCase(tematica.getNombre())) {
                respuesta = true;
            }
        } catch (Exception e) {
            respuesta = false;
        }

        return respuesta;
    }

    public void modificarTematica(String nombreAntiguo, String nombreNuevo) {
        tematicaRepository.modificarTematica(nombreAntiguo, nombreNuevo);
    }

    public void crearTematica(String nombre, String fechaCreacion) {
        Tematica tematica = new Tematica(nombre, fechaCreacion);
        tematicaRepository.guardarTematica(tematica);
    }

    public void leerTematica() {
        tematicaRepository.leerTematicas();
    }

    public String obtenerDatosTematica() {
        return tematicaRepository.leerTematicas();
    }

    public String obtenerFecha() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        return format.format(new Date());
    }

    public ArrayList<Tematica> almacenarTematicas() {

        return tematicaRepository.obtenerLista();
    }

}
