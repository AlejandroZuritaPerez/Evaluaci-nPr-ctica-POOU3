/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class UsoRectángulo {
    public static void main(String[] args) {
        Rectángulo rectangulo1 = new Rectángulo(20, 35);

        System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Área: " + rectangulo1.calcularArea());
        System.out.println("---------------------------------------------");
        Rectángulo rectangulo2 = new Rectángulo(50, 65);

        System.out.println("Perímetro: " + rectangulo2.calcularPerimetro());
        System.out.println("Área: " + rectangulo2.calcularArea());
    }
}
