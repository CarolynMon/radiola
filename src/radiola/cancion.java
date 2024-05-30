/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiola;

import java.util.logging.Logger;

/**
import java.util.ArrayList;
import java.util.List;

/**
 * @author USUARIO
 */
public class cancion {
    private String nombre;
    private String autor;
    private String album;
    private String genero;

    public cancion(String nombre, String autor, String album, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.album = album;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void reproducirCancion() {
        
    }

    @Override
    public String toString() {
        return "cancion{" + "nombre=" + nombre + ", autor=" + autor + ", album=" + album + ", genero=" + genero + '}';
    }
}