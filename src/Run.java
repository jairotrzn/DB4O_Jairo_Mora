
import database4object.Classes.Tematica;
import database4object.Controllers.MenuPrincipal;
import database4object.Services.TematicaServices;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jairo
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TematicaServices tematica = new TematicaServices();
        tematica.leerTematica();
    }
    
}
