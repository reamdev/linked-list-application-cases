/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplelistcases;

import basiclevel.GuestList;
import basiclevel.ShoppingCart;
import basiclevel.ToDoList;
import contactsList.ContactLists;
import java.util.Scanner;
import historial.Historial;
import middlelevel.RegistrosRed;
import middlelevel.RutaEntrega;
import middlelevel.TutorialInteractivo;
import onlinestore.OnlineStore;
import sensorregister.SensorRegister;

/**
 *
 * @author ream_
 */
public class SimpleListCases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;

        do {
            System.out.println("======== Casos de Aplicacion ========");
            System.out.println("1. Lista de Tareas");
            System.out.println("2. Lista de Invitados a un evento");
            System.out.println("3. Carrito de Compras");
            System.out.println("4. Ruta Entrega");
            System.out.println("5. Tutorial Interactivo");
            System.out.println("6. Registros de Red");
            System.out.println("7. Gestion Contactos");
            System.out.println("8. Historial de acciones de editor.");
            System.out.println("9. Tienda Online");
            System.out.println("10. Registro Lecturas de Sensor");
            System.out.println("11. Salir");
            System.out.print("Ingrese la opcion: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n=====================================");
                    System.out.println("TodoList");
                    System.out.println("=====================================\n");
                    ToDoList.main(args);
                    break;
                case 2:
                    System.out.println("\n=====================================");
                    System.out.println("Lista de Invitados a un Evento");
                    System.out.println("=====================================\n");
                    GuestList.main(args);
                    break;
                case 3:
                    System.out.println("\n=====================================");
                    System.out.println("Carrito de Compras");
                    System.out.println("=====================================\n");
                    ShoppingCart.main(args);
                    break;
                case 4:
                    System.out.println("\n=====================================");
                    System.out.println("Ruta Entrega");
                    System.out.println("=====================================\n");
                    RutaEntrega.main(args);
                    break;
                case 5:
                    System.out.println("\n=====================================");
                    System.out.println("Tutorial Interactivo");
                    System.out.println("=====================================\n");
                    TutorialInteractivo.main(args);
                    break;
                case 6:
                    System.out.println("\n=====================================");
                    System.out.println("Registros de Red");
                    System.out.println("=====================================\n");
                    RegistrosRed.main(args);
                    break;
                case 7:
                    System.out.println("\n=====================================");
                    System.out.println("Gestion Contactos");
                    System.out.println("=====================================\n");
                    ContactLists.main(args);
                    break;
                case 8:
                    System.out.println("\n=====================================");
                    System.out.println("Historial Acciones de editor");
                    System.out.println("=====================================");
                    Historial.main(input);
                    break;
                case 9:
                    System.out.println("\n=====================================");
                    System.out.println("Tienda Online");
                    System.out.println("=====================================");
                    OnlineStore.main(input);
                    break;
                case 10:
                    System.out.println("\n=====================================");
                    System.out.println("Registro Lecturas de Sensor");
                    System.out.println("=====================================");
                    SensorRegister.main(input);
                    break;
                case 11:
                    System.out.println("Nos vemos.");
                    break;
                default:
                    System.out.println("Ingrese la opcion correcta");
            }
            System.err.println("");
        } while (op != 11);

        input.close();
    }
}
