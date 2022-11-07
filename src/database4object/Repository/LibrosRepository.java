/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Repository;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import database4object.Classes.Libro;
import database4object.Classes.Tematica;

/**
 *
 * @author jairo
 */
public class LibrosRepository {

    private final String DTBLibros = "DTBLibros.db4o";

    public void guardarLibro(Libro libro) {
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DTBLibros);
        dataBase.store(libro);
        dataBase.close();
    }

    public String leerLibros() {
        String linea = "";
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DTBLibros);
        Libro libro = new Libro();
        ObjectSet<Libro> librosEncontradas = dataBase.queryByExample(libro);

        if (librosEncontradas.isEmpty()) {
            linea = "No existen libros encontrados";
        } else {
            while (librosEncontradas.hasNext()) {
                Libro librosEncontrados = (Libro) librosEncontradas.next();
                linea = linea + "\n" + librosEncontradas.toString();
            }
        }
        dataBase.close();
        return linea;
    }

    public void modificarLibro() {
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DTBLibros);

    }

}
