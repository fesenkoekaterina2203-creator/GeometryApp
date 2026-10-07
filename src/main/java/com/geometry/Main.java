package com.geometry;

import com.geometry.geometry.Circle;
import com.geometry.geometry.Rectangle;
import com.geometry.geometry.Triangle;
import com.geometry.shapes3d.Cube;
import com.geometry.shapes3d.Sphere;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5,4);

        double areaCircle = circle.calculateArea();
        double perimeterCircle = circle.calculatePerimeter();

        System.out.println("Круг: площадь = " + areaCircle + ", периметр = " + perimeterCircle);

        Rectangle rectangle = new Rectangle(12,4);
        double areaRetriengle = rectangle.calculateArea();
        double perimeterRetriangle = rectangle.calculatePerimeter();
        System.out.println("Прямоугольник: площадь = " + areaRetriengle + ", периметр = " + perimeterRetriangle);

        Triangle triangle= new Triangle(5,4,6);
        double triangleArea =triangle.calculateArea();
        double tranglePerimeter =triangle.calculatePerimeter();
        System.out.println("Треугольник: площадь = " + triangleArea + ", периметр = " + tranglePerimeter);

        UnitConverter converter = new UnitConverter();

        double meters = converter.centimetersToMeters(250);

        System.out.println("250 см = " + meters + " м");

        Cube cube = new Cube(4);

        double cubeVolume = cube.calculateVolume();

        System.out.println("Куб со стороной 4: объём = " + cubeVolume);

        Sphere sphere = new Sphere(3);

        double sphereVolume = sphere.calculateVolume();
        double sphereArea = sphere.calculateSurfaceArea();

        System.out.println("Сфера с радиусом 3: объём = " + sphereVolume);
        System.out.println("Сфера с радиусом 3: площадь поверхности = " + sphereArea);



    }




}