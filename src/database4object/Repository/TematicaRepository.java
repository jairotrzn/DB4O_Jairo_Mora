/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Repository;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import database4object.Classes.Tematica;

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
            linea = "No existen tematicas encontradas";
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

    public ObjectSet<Tematica> obtenerLista() {
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDTematica);
        Tematica tematica = new Tematica();
        return dataBase.queryByExample(tematica);
    }
    
    public void modificarTematica(String nombre){
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BDTematica);
        Tematica tematica = new Tematica(nombre);
        ObjectSet<Tematica> tematicaBaseDatos = dataBase.queryByExample(tematica);
        
        if (tematicaBaseDatos.isEmpty()){
            System.err.println(" No hay libros encontrados ");
        }else{
            Tematica tematicaEnBD = tematicaBaseDatos.get(0);
        }   
    }
}
