/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensorregister;

import simplelistcases.structure.Node;
import simplelistcases.structure.SimpleList;

/**
 *
 * @author ream_
 */
public class Record extends SimpleList<Read> {
    public void addRead(double temperature, String hour) {
        Node newNode = new Node(new Read(temperature, hour));
        if (this.head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
    }
    
    // Detectar anomalías (diferencia mayor a X entre lecturas consecutivas)
    public void detectAnomalies(double maxDiferences) {
        if (this.head == null || this.head.next == null) {
            System.out.println("No hay suficientes lecturas para comparar.");
            return;
        }

        Node current = this.head;
        while (current.next != null) {
            Read data = (Read) current.getData();
            Read nextData = (Read) current.next.getData();

            double diference = Math.abs(data.temperature - nextData.temperature);
            if (diference > maxDiferences) {
                System.out.println("Anomalía detectada entre " + data.hour + " (" + data.temperature +
                        "°C) y " + nextData.hour + " (" + nextData.temperature + "°C)");
            }
            current = current.next;
        }
    }
    
    // Mostrar lecturas
    public void showReadings() {
        Node current = this.head;
        if (current == null) {
            System.out.println("No hay lecturas.");
            return;
        }
        while (current != null) {
            Read data = (Read) current.getData();
            System.out.println("Hora: " + data.hour + ", Temperatura: " + data.temperature + "°C");
            current = current.next;
        }
    }
}
