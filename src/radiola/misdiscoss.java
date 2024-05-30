/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package radiola;

import java.util.ArrayList;
import java.util.List;

public class misdiscoss {
    String nombreDiscoNuevo;
    List<cancion> canciones = new ArrayList<cancion>();

    public misdiscoss(String nombreDiscoNuevo) {
        this.nombreDiscoNuevo = nombreDiscoNuevo;
    }

    public void setNombreDiscoNuevo(String nombreDiscoNuevo) {
        this.nombreDiscoNuevo = nombreDiscoNuevo;
    }

    public void setCanciones(List<cancion> canciones) {
        this.canciones = canciones;
    }

    public String getNombreDiscoNuevo() {
        return nombreDiscoNuevo;
    }

    public List<cancion> getCanciones() {
        return canciones;
    }

    public lista getListaReproduccion() {
        return new lista();
    }
}