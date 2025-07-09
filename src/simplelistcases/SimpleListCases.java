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
            System.out.println("7. Historial de acciones de editor.");
            System.out.println("8. Tienda Online");
            System.out.println("9. Registro Lecturas de Sensor");
            System.out.println("10. Gestion Contactos");
            System.out.println("11. Salir");
            System.out.print("Ingrese la opcion: ");
            op = input.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("\n=====================================");
                    System.out.print("TodoList");
                    System.out.print("=====================================");
                    ToDoList.main(args);
                    break;
                case 2:
                    System.out.print("\n=====================================");
                    System.out.print("Lista de Invitados a un Evento");
                    System.out.print("=====================================");
                    GuestList.main(args);
                    break;
                case 3:
                    System.out.print("\n=====================================");
                    System.out.print("Carrito de Compras");
                    System.out.print("=====================================");
                    ShoppingCart.main(args);
                    break;
                case 4:
                    System.out.print("\n=====================================");
                    System.out.print("Ruta Entrega");
                    System.out.print("=====================================");
                    RutaEntrega.main(args);
                    break;
                case 5:
                    System.out.print("\n=====================================");
                    System.out.print("Tutorial Interactivo");
                    System.out.print("=====================================");
                    TutorialInteractivo.main(args);
                    break;
                case 6:
                    System.out.print("\n=====================================");
                    System.out.print("Registros de Red");
                    System.out.print("=====================================");
                    RegistrosRed.main(args);
                    break;
                case 7:
                    System.out.print("\n=====================================");
                    System.out.print("Gestion Contactos");
                    System.out.print("=====================================");
                    ContactLists.main(args);
                    break;
                case 8:
                    System.out.print("\n=====================================");
                    System.out.print("Historial Acciones de editor");
                    System.out.print("=====================================");
                    Historial.main(args);
                    break;
                case 9:
                    System.out.print("\n=====================================");
                    System.out.print("Tienda Online");
                    System.out.print("=====================================");
                    OnlineStore.main(args);
                    break;
                case 10:
                    System.out.print("\n=====================================");
                    System.out.print("Registro Lecturas de Sensor");
                    System.out.print("=====================================");
                    SensorRegister.main(args);
                    break;
                case 11:
                    System.out.println("Nos vemos.");
                    break;
                default:
                    System.out.println("Ingrese la opcion correcta");
            }
        } while (op != 11);
    }
    
}
