/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaby;

/**
 *
 * @author jamas
 */
public class Pelicula extends DatosGenerales implements Oidos {
    
    Pelicula (String nombre, String autor, String duracion, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }
    
     Pelicula (String nombre, String autor, int duracion, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void escuchar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void reproducir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}