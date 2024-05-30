/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiola;


import java.util.ArrayList;
import java.util.List;

public class lista {
    List<cancion> canciones = new ArrayList<cancion>();
    private int indiceActual;

    public lista() {
        this.canciones = new ArrayList<>();
        this.indiceActual = 0;
    }

    public void setCanciones(List<cancion> canciones) {
        this.canciones = canciones;
    }

    public List<cancion> getCanciones() {
        return canciones;
    }

    public void agregarcancion(List<cancion> canciones, cancion cancion) {
        canciones.add(cancion);
        System.out.println("Se agrego la cancion exitosamente: " + cancion);
    }

    public cancion siguienteCancion() {
        if (indiceActual < canciones.size()) {
            cancion siguiente = canciones.get(indiceActual);
            indiceActual++;
            return siguiente;
        } else {
            System.out.println("Has llegado al final de la lista de reproducción.");
            return null;
        }
    }
}