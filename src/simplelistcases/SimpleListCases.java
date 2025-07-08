/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplelistcases;

import java.util.Scanner;
import historial.Historial;

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
            System.out.print("======== Casos de Aplicacion ========");
            System.out.println("1. Historial de acciones de editor.");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11. Salir");
            System.out.print("Ingrese la opcion: ");
            op = input.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("\n=====================================");
                    System.out.print("Historial Acciones de editor");
                    System.out.print("=====================================");
                    Historial.main(args);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
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
