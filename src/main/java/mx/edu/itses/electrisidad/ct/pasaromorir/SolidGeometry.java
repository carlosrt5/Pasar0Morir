/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.electrisidad.ct.pasaromorir;

import java.util.Scanner;

/**
 *
 * @author cr430
 */
public class SolidGeometry {
     private Scanner inputScanner;
    private Geometry2D geometry2DCalculator;

    public SolidGeometry(Scanner scanner, Geometry2D geometry2DCalculator) {
        this.inputScanner = scanner;
        this.geometry2DCalculator = geometry2DCalculator;
    }

    public void calculateCubeVolume() {
        System.out.print("Para calcular el volumen de un cubo, por favor, ingresa su altura: ");
        double height = inputScanner.nextDouble();
        double squareBaseArea = geometry2DCalculator.calculateSquareProperties();
        double cubeVolume = squareBaseArea * height;
        System.out.println("El volumen del cubo = " + cubeVolume);
    }

    public void calculateSphereVolume() {
        double radius = geometry2DCalculator.calculateCircleProperties();
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("El volumen de la esfera = " + sphereVolume);
    }

    public void calculateCylinderVolume() {
        double radius = geometry2DCalculator.calculateCircleProperties();
        System.out.print("Para calcular el volumen de un cilindro, por favor, ingresa su altura: ");
        double height = inputScanner.nextDouble();
        double cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("El volumen del cilindro = " + cylinderVolume);
    }

    public void calculateParallelepipedVolume() {
        System.out.print("Para calcular el volumen de un paralelepípedo, por favor, ingresa su altura: ");
        double height = inputScanner.nextDouble();
        double baseArea = geometry2DCalculator.calculateRectangleProperties();
        double parallelepipedVolume = height * baseArea;
        System.out.println("El volumen del paralelepípedo = " + parallelepipedVolume);
    }

    
}
