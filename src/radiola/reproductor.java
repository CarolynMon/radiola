/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiola;


import java.util.ArrayList;
import java.util.List;

public class reproductor {
    private lista listaReproduccion;
    private cancion cancionActual;
    private int volumen;
    private boolean reproduciendo;
    private double tiempo;

    public lista getListaReproduccion() {
        return listaReproduccion;
    }

    public cancion getCancionActual() {
        return cancionActual;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean isReproduciendo() {
        return reproduciendo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setListaReproduccion(lista listaReproduccion) {
        this.listaReproduccion = listaReproduccion;
    }

    public void setCancionActual(cancion cancionActual) {
        this.cancionActual = cancionActual;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setReproduciendo(boolean reproduciendo) {
        this.reproduciendo = reproduciendo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public reproductor(lista listaReproduccion, cancion cancionActual, int volumen, boolean reproduciendo, double tiempo) {
        this.listaReproduccion = listaReproduccion;
        this.cancionActual = cancionActual;
        this.volumen = volumen;
        this.reproduciendo = reproduciendo;
        this.tiempo = tiempo;
    }

    public void reproducirCancion(cancion cancion) {
        setCancionActual(cancion);
        setReproduciendo(true);
    }

    public void saltarcancion(lista listaReproduccion, cancion cancionActual) {
        cancion siguiente = listaReproduccion.siguienteCancion();
        if (siguiente != null) {
            setCancionActual(siguiente);
        } else {
            System.out.println("No hay más canciones en la lista de reproducción.");
        }
    }
}