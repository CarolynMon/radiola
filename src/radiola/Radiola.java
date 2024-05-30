/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiola;

import java.util.Scanner;

public class Radiola {
    private final Scanner sc = new Scanner(System.in);
    private static misdiscoss misdiscoss;
    private lista listaReproduccion;
    private reproductor reproductor;

    public Radiola() {
        misdiscoss = new misdiscoss("Nombre del Disco");
        listaReproduccion = new lista();
        reproductor = new reproductor(listaReproduccion, null, 0, false, 0.0);
    }

    public static void main(String[] args) {
        Radiola obj = new Radiola();

        do {
            obj.mostrarOpciones();
            int opcionSeleccionada = Integer.parseInt(obj.sc.nextLine());
            obj.ejecutarOpciones(opcionSeleccionada);
        } while (true);
    }

    private void mostrarOpciones() {
        System.out.println("---Bienvenido a tu Radiola---");
        System.out.println("0. Salir.");
        System.out.println("1. Crear cancion ");
        System.out.println("2. Agregar cancion a la biblioteca");
        System.out.println("3. Listar canciones .");
        System.out.println("4. Reproducir cancion ");
        System.out.println("5. Pausar y reanudar la reproducción: .");
        System.out.println("6. Avanzar y retroceder en la cancion: .");
        System.out.println("7. Control volumen.");
        System.out.println("8. Salir de la aplicacion");
        System.out.print("Ingrese su opción: ");
    }

    private void ejecutarOpciones(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                System.out.print("Ingresa el título de la canción: ");
                String titulo = sc.nextLine();
                System.out.print("Ingresa el artista: ");
                String artista = sc.nextLine();
                System.out.print("Ingresa el álbum: ");
                String album = sc.nextLine();
                System.out.print("Ingresa el género: ");
                String genero = sc.nextLine();
                cancion nuevaCancion = new cancion(titulo, artista, album, genero);
                misdiscoss.getCanciones().add(nuevaCancion);
                System.out.println("Canción creada exitosamente: " + nuevaCancion);
                break;
            case 2:
                System.out.print("Ingresa el título de la canción a agregar: ");
                String tituloCancion = sc.nextLine();
                cancion cancionEncontrada = null;
                for (cancion c : misdiscoss.getCanciones()) {
                    if (c.getNombre().equalsIgnoreCase(tituloCancion)) {
                        cancionEncontrada = c;
                        break;
                    }
                }
                if (cancionEncontrada != null) {
                    listaReproduccion.agregarcancion(misdiscoss.getListaReproduccion().getCanciones(), cancionEncontrada);
                    System.out.println("Canción agregada a la biblioteca: " + cancionEncontrada);
                } else {
                    System.out.println("No se encontró la canción en la biblioteca.");
                }
                break;
            case 3:
                System.out.println("Canciones en la biblioteca:");
                for (cancion c : misdiscoss.getCanciones()) {
                    System.out.println(c);
                }
                break;
            case 4:
                System.out.print("Ingresa el título de la canción a reproducir: ");
                String tituloCancionReproducir = sc.nextLine();
                cancion cancionAReproducir = null;
                for (cancion c : misdiscoss.getCanciones()) {
                    if (c.getNombre().equalsIgnoreCase(tituloCancionReproducir)) {
                        cancionAReproducir = c;
                        break;
                    }
                }
                if (cancionAReproducir != null) {
                    reproductor.reproducirCancion(cancionAReproducir);
                    System.out.println("Reproduciendo: " + cancionAReproducir);
                } else {
                    System.out.println("No se encontró la canción en la biblioteca.");
                }
                break;
            case 5:
                if (reproductor.isReproduciendo()) {
                    reproductor.setReproduciendo(false);
                    System.out.println("Reproducción pausada.");
                } else {
                    reproductor.setReproduciendo(true);
                    System.out.println("Reproducción reanudada.");
                }
                break;
            case 6:
                System.out.print("Ingresa 1 para avanzar o 2 para retroceder: ");
                int accion = Integer.parseInt(sc.nextLine());
                if (accion == 1) {
                    reproductor.saltarcancion(reproductor.getListaReproduccion(), reproductor.getCancionActual());
                    System.out.println("Avanzando a la siguiente canción.");
                } else if (accion == 2) {
                    // Implementar lógica para retroceder en la canción
                    System.out.println("Retrocediendo en la canción.");
                } else {
                    System.out.println("Opción inválida.");
                }
                break;
            case 7:
                System.out.print("Ingresa el nuevo nivel de volumen (0-100): ");
                int nuevoVolumen = Integer.parseInt(sc.nextLine());
                reproductor.setVolumen(nuevoVolumen);
                System.out.println("Volumen establecido en: " + nuevoVolumen);
                break;
            case 8:
                System.out.println("¡Hasta luego!");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida. Intenta de nuevo.");
        }
    }
}