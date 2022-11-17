/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Repository;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.collections.ActivatableArrayList;
import database4object.Classes.Tematica;
import database4object.Recursos.Translations.Translations_ES;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author jairo
 */
public class TematicaRepository {

    private static final String BDTematica = "DBTematica.db4o";

    public void guardarTematica(Tematica tematica) {
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDTematica);
        dataBase.store(tematica);
        dataBase.close();
    }

    public String leerTematicas() {
        String linea = "";
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDTematica);
        Tematica tematica = new Tematica();
        ObjectSet<Tematica> tematicasEncontradas = dataBase.queryByExample(tematica);

        if (tematicasEncontradas.isEmpty()) {
            linea = Translations_ES.NO_EXISTEN_TEMATICAS_ENCONTRADAS;
        } else {
            while (tematicasEncontradas.hasNext()) {
                Tematica tematicaEncontrada = (Tematica) tematicasEncontradas.next();
                linea = linea + "\n" + tematicaEncontrada.toString();
                System.out.println(linea);
            }
        }
        dataBase.close();
        return linea;
    }

    public ArrayList<Tematica> obtenerLista() {
        ArrayList<Tematica> arraytematicas = new ArrayList<>();
        ObjectSet<Tematica> listaTematicas;
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDTematica);
        Tematica tematica = new Tematica();
        listaTematicas = dataBase.queryByExample(tematica);
        while (listaTematicas.hasNext()) {
            Tematica tematicaEncontrada = (Tematica) listaTematicas.next();
            arraytematicas.add(tematicaEncontrada);
        }

        dataBase.close();

        return arraytematicas;
    }

    public void modificarTematica(String nombreAntiguo, String nuevoNombre) {
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDTematica);
        Tematica tematica = new Tematica(nombreAntiguo);
        ObjectSet<Tematica> tematicaBaseDatos = dataBase.queryByExample(tematica);
        if (!tematicaBaseDatos.isEmpty()) {
            Tematica tematicaEnBD = tematicaBaseDatos.get(0);
            Tematica copiaTematica = new Tematica(tematicaEnBD.getId(), nuevoNombre, tematicaEnBD.getFechaAlta());

            dataBase.store(copiaTematica);
            dataBase.delete(tematicaEnBD);
        }
        dataBase.close();
    }
    /**
     * Obtengo un arrayList con las tematicas con el nombre que deseo, para llevarlo al services y comprobar si existe o no mi tematica
     * ya en la base de datos y posteriormente dar permiso de crear una tematica.
     * @param nombreTematica
     * @return ArrayList<Tematica> listaTematicaEncontrada, con las tematicas encontradas
     */
    public ArrayList<Tematica> tematicaEncontrada(String nombreTematica){
        ArrayList<Tematica> listaTematicaEncontrada = new ArrayList<>();
        ObjectSet<Tematica> tematicaEncontradaEnBD;
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BDTematica);
        Tematica tematica = new Tematica(nombreTematica);
        System.out.println(tematica.getNombre());
        tematicaEncontradaEnBD = dataBase.queryByExample(tematica);
        
        while(tematicaEncontradaEnBD.hasNext()){
             Tematica tematicaEncontrada = (Tematica) tematicaEncontradaEnBD.next();
             listaTematicaEncontrada.add(tematicaEncontrada);
        }
        dataBase.close();
        return listaTematicaEncontrada;
    }
 

}
