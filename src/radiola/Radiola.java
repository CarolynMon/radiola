/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiola;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Radiola {
 private final Scanner sc = new Scanner(System.in);
    private static misdiscoss misdiscos;
    
     public Radiola() {
    misdiscos = new misdiscoss();
   
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
        desplegarMenu();
    }
    private void ejecutarOpciones(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            
        }
        
}
     private void desplegarMenu() {
        System.out.println("---Sistema parqueadero---");
        System.out.println("0. Salir.");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. .");
        System.out.println("4. ");
        System.out.println("5. .");
        System.out.println("6. .");
        System.out.print("Ingrese su opción: ");
    }
}