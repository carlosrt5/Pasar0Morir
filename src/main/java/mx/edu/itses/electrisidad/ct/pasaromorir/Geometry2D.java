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
public class Geometry2D {
        private Scanner inputScanner;

    public Geometry2D(Scanner scanner) {
        this.inputScanner = scanner;
    }

    public double calculateCircleProperties() {
        System.out.print("Para calcular el área y el perímetro de un círculo, por favor, ingresa el radio: ");
        double radius = inputScanner.nextDouble();
        double circleArea = Math.PI * (Math.pow(radius, 2));
        double circlePerimeter = Math.PI * (2 * radius);
        System.out.println("El área del círculo = " + circleArea);
        System.out.println("El perímetro del círculo = " + circlePerimeter);
        return radius;
    }

    public void calculateTriangleProperties() {
        System.out.print("Para calcular el área de un triángulo, por favor, ingresa la base: ");
        double base = inputScanner.nextDouble();
        System.out.print("Para calcular el área de un triángulo, por favor, ingresa la altura: ");
        double height = inputScanner.nextDouble();
        double triangleArea = (base * height) / 2;
        double trianglePerimeter = base * 3;
        System.out.println("El área del triángulo = " + triangleArea);
        System.out.println("El perímetro del triángulo = " + trianglePerimeter);
    }

    public double calculateSquareProperties() {
        System.out.print("Para calcular el área y el perímetro de un cuadrado, por favor, ingresa la longitud del lado: ");
        double side = inputScanner.nextDouble();
        double squareArea = Math.pow(side, 2);
        double squarePerimeter = side * 4;
        System.out.println("El área del cuadrado = " + squareArea);
        System.out.println("El perímetro del cuadrado = " + squarePerimeter);
        return squareArea;
    }

    public double calculateRectangleProperties() {
        System.out.print("Para calcular el área del rectángulo, por favor, ingresa la altura: ");
        double height = inputScanner.nextDouble();
        System.out.print("Para calcular el área del rectángulo, por favor, ingresa la base: ");
        double base = inputScanner.nextDouble();
        double rectangleArea = height * base;
        double rectanglePerimeter = (height * 2) + (base * 2);
        System.out.println("El área del rectángulo = " + rectangleArea);
        System.out.println("El perímetro = " + rectanglePerimeter);
        return rectangleArea;
    }

    public void calculatePentagonProperties() {
        System.out.print("Para calcular el área del pentágono, por favor, ingresa la longitud de un lado: ");
        double side = inputScanner.nextDouble();
        System.out.print("Para calcular el área del pentágono, por favor, ingresa la apotema: ");
        double apothem = inputScanner.nextDouble();

        double pentagonPerimeter = side * 5;
        double pentagonArea = (pentagonPerimeter * apothem) / 2;

        System.out.println("El área del pentágono = " + pentagonArea);
        System.out.println("El perímetro del pentágono = " + pentagonPerimeter);
    }

    public void calculateHexagonProperties() {
        System.out.print("Para calcular el área del hexágono, por favor, ingresa la longitud de un lado: ");
        double side = inputScanner.nextDouble();
        System.out.print("Para calcular el área del hexágono, por favor, ingresa la apotema: ");
        double apothem = inputScanner.nextDouble();

        double hexagonPerimeter = side * 6;
        double hexagonArea = (hexagonPerimeter * apothem) / 2;

        System.out.println("El área del hexágono = " + hexagonArea);
        System.out.println("El perímetro del hexágono = " + hexagonPerimeter);
    }

}
