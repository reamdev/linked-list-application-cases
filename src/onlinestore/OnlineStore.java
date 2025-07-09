/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore;

import java.util.Scanner;

/**
 *
 * @author ream_
 */
public class OnlineStore {
    public static void main(Scanner input) {
        CategoryList categoryList = new CategoryList();
        int op;

        do {
            System.out.println("\nQue accion va a realizar?");
            System.out.println("1. Registrar Categoria");
            System.out.println("2. Filtrar categorias por cantidad de productos");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opcion: ");
            op = input.nextInt();
            input.nextLine();

            String nombreCategoria = "";
            int cantidadProducto = 1;
            switch(op) {
                case 1:
                    System.out.print("Ingrese el nombre de la categoria: ");
                    nombreCategoria = input.nextLine();

                    System.out.println("Ingrese la cantidad de productos que tiene la categoria categorias");
                    cantidadProducto = input.nextInt();
                    input.nextLine();
                    categoryList.addCategory(nombreCategoria, cantidadProducto);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de productos que debe tener como minimo una categoria:");
                    cantidadProducto = input.nextInt();
                    input.nextLine();
                    categoryList.filtrarPorProductos(cantidadProducto);
                    categoryList.showCategories();
                    break;
                case 3:
                    System.out.println("Nos vemos");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!\n");
            }
        } while (op != 3);
    }
}
