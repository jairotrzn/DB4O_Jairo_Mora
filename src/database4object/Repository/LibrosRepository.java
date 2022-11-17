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
import database4object.Recursos.Translations.Translations_ES;
import java.util.ArrayList;
import java.util.List;

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

        if (!librosEncontradas.isEmpty()) {
          
             while (librosEncontradas.hasNext()) {
                 int cont = 1;
                Libro librosEncontrados = (Libro) librosEncontradas.next();
                linea = linea + "\n" +  cont + ". " + librosEncontradas.toString();
                cont++;
        } 
        }else{
              linea = Translations_ES.NO_EXISTEN_LIBROS_ENCONTRADOS;
        }
        dataBase.close();
        return linea;
    }

    public void modificarLibro(String nombreAntiguo,String nuevoNombre,String autor, String fechaPublicacion, List<String> tematicas ,String editorial) {
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DTBLibros);
        Libro libro = new Libro(nombreAntiguo);
        ObjectSet<Libro> librosEncontrados = dataBase.queryByExample(libro);
        
        if(!librosEncontrados.isEmpty()){
            Libro libroEnBD = librosEncontrados.get(0);
            Libro copiaLibro = new Libro(libroEnBD.getId(), nuevoNombre, autor, fechaPublicacion, tematicas, editorial);
                    
            
            dataBase.store(copiaLibro);
            dataBase.delete(libroEnBD);
        }
        dataBase.close();
    }
    
    public ArrayList<Libro> libroEnBD(String nombreLibro){
        ArrayList <Libro> libroEncontrado = new ArrayList<Libro>();
        ObjectSet <Libro> libroEncontradoEnBD;
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),DTBLibros);
        Libro libro = new Libro(nombreLibro);
        libroEncontradoEnBD = dataBase.queryByExample(libro);
        
        while (libroEncontradoEnBD.hasNext()){
            Libro libroEnBD = (Libro) libroEncontradoEnBD.next();
            libroEncontrado.add( libroEnBD);
        }
        dataBase.close();
        return libroEncontrado;
    }

}
