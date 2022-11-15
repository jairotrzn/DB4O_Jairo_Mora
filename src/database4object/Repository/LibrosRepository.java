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

        if (!librosEncontradas.isEmpty()) {
          
             while (librosEncontradas.hasNext()) {
                Libro librosEncontrados = (Libro) librosEncontradas.next();
                linea = linea + "\n" + librosEncontradas.toString();
        } 
        }else{
              linea = "No existen libros encontrados";
        }
        dataBase.close();
        return linea;
    }

    public void modificarLibro(String nombreAntiguo,String tematica) {
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DTBLibros);
        Libro libro = new Libro(nombreAntiguo);
        ObjectSet<Libro> librosEncontrados = dataBase.queryByExample(libro);
        
        if(!librosEncontrados.isEmpty()){
            Libro libroEnBD = librosEncontrados.get(0);
            Libro copiaLibro = new Libro(libroEnBD.getId(),libroEnBD.getNombre(), libroEnBD.getAutor(), libroEnBD.getFechaPublicacion(), libroEnBD.getEditorial(), tematica);
            
            dataBase.store(copiaLibro);
            dataBase.delete(libroEnBD);
        }

    }
    
    public boolean existeLibroEnBD(String nombreLibro){
        boolean existe = false;
        
        ObjectContainer dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),DTBLibros);
        Libro libro = new Libro(nombreLibro);
        ObjectSet<Libro> librosEnconbtrados = dataBase.queryByExample(libro);
        
        if (!librosEnconbtrados.isEmpty()){
           existe = true;
        }
        dataBase.close();
         return existe;
    }

}
