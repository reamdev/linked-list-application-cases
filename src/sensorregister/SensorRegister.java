/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensorregister;

import java.util.Scanner;

/**
 *
 * @author ream_
 */
public class SensorRegister {
    public static void main(String[] args) {
        Record record = new Record();
        Scanner input = new Scanner(System.in);
        int op;

        do {
            System.out.println("Que accion va a realizar?");
            System.out.println("1. Registrar Lectura");
            System.out.println("2. Identificar anomalias");
            System.out.println("3. Mostrar Lecturas");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opcion: ");
            op = input.nextInt();
            
            double temperature = 16;
            String hour = "";
            switch(op) {
                case 1:
                    System.out.print("Ingrese la temperatura");
                    temperature = input.nextDouble();
                    
                    System.out.println("Ingrese la hora");
                    hour = input.nextLine();
                    record.addRead(temperature, hour);
                    break;
                case 2:
                    System.out.println("Detectando anomalias (diferencias > 3°C)");
                    record.detectAnomalies(3.0);
                    break;
                case 3:
                    System.out.println("Lectura Registros:");
                    record.showReadings();
                    break;
                case 4:
                    System.out.println("Nos vemos");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!\n");
            }
        } while (op != 4);
    }
}
