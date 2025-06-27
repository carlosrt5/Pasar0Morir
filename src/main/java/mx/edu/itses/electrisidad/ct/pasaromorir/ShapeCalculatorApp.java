/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electrisidad.ct.pasaromorir;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cr430
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeCalculatorApp {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        Geometry2D geo2D = new Geometry2D(consoleInput);
        SolidGeometry solidGeo = new SolidGeometry(consoleInput, geo2D);

        System.out.println("--- Cálculos de Formas 2D ---");
        geo2D.calculateCircleProperties();
        System.out.println();
        geo2D.calculateTriangleProperties();
        System.out.println();
        geo2D.calculateSquareProperties();
        System.out.println();
        geo2D.calculateRectangleProperties();
        System.out.println();
        geo2D.calculatePentagonProperties();
        System.out.println();
        geo2D.calculateHexagonProperties();
        System.out.println();

        System.out.println("--- Cálculos de Sólidos 3D ---");
        solidGeo.calculateCubeVolume();
        System.out.println();
        solidGeo.calculateSphereVolume();
        solidGeo.calculateCylinderVolume();
        System.out.println();
        solidGeo.calculateParallelepipedVolume();
        System.out.println();

        consoleInput.close();
        System.out.println("FIN");
    }
}
     
