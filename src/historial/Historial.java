/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historial;

import java.util.Scanner;

/**
 *
 * @author ream_
 */
public class Historial {
    public static void main(Scanner input) {
        HistorialSimpleList historial = new HistorialSimpleList();
        int op;

        do {
            System.out.println("\nQue accion va a realizar?");
            System.out.println("1. Escribir");
            System.out.println("2. Insertar linea");
            System.out.println("3. Eliminar");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opcion: ");
            op = input.nextInt();
            input.nextLine();

            String texto = "";
            switch(op) {
                case 1:
                    System.out.print("Ingrese el texto que va a escribir: ");
                    texto = input.nextLine();
                    historial.addToTail("Escribio '" + texto +"'");
                    break;
                case 2:
                    historial.addToTail("Inserto una nueva linea");
                    break;
                case 3:
                    System.out.print("Ingrese el texto a eliminar: ");
                    texto = input.nextLine();
                    historial.addToTail("Elimino '" + texto + "'");
                    break;
                case 4:
                    historial.showHistory();
                    break;
                case 5:
                    System.out.println("Nos vemos");
                    historial.addToTail("Salio de la apliacion");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!\n");
            }
        } while (op != 5);
    }
}
