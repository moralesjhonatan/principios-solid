package org.example;

import org.example.dependencyinversion.ManejarDatos;
import org.example.dependencyinversion.MongoDB;
import org.example.dependencyinversion.MySQL;
import org.example.interfacesegregation.Perro;
import org.example.interfacesegregation.Vaca;
import org.example.liskovsusbtitution.Cuadrado;
import org.example.liskovsusbtitution.Figura;
import org.example.liskovsusbtitution.Rectangulo;
import org.example.singleresponsibility.Calculadora;

public class Main {
    public static void main(String[] args) {

        //Principio de Responsabilidad Unica
        System.out.println();
        System.out.println("***** PRINCIPIO DE RESPONSABILIDAD UNICA *****");
        Calculadora calculadora = new Calculadora();
        System.out.println("Suma: " + calculadora.sumar(2, 3));
        System.out.println("Resta: " + calculadora.restar(5, 2));
        System.out.println("Multiplicación: " + calculadora.multiplicar(4, 5));
        System.out.println("División: " + calculadora.dividir(10, 2));

        //Principio de Sustitucion de Liskov
        System.out.println();
        System.out.println("***** PRINCIPIO DE SUSTITUCION DE LISKOV *****");
        Figura cuadrado = new Cuadrado(5);
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
        Figura rectangulo = new Rectangulo(4, 6);
        System.out.println("Area del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        //Principio de Segregacion de Interfaces
        System.out.println();
        System.out.println("***** PRINCIPIO DE SEGREGACION DE INTERFACES *****");
        Perro perro = new Perro();
        perro.respirar();
        perro.comer();
        perro.dormir();
        perro.cazar();
        Vaca vaca = new Vaca();
        vaca.respirar();
        vaca.comer();
        vaca.dormir();
        vaca.pastar();

        //Principio de Inversión de Dependencias
        System.out.println();
        System.out.println("***** PRINCIPIO DE INVERSION DE DEPENDENCIAS *****");
        ManejarDatos manejarDatos = new ManejarDatos();
        MySQL mySQL = new MySQL();
        manejarDatos.procesar(mySQL);
        MongoDB mongoDB = new MongoDB();
        manejarDatos.procesar(mongoDB);
    }
}