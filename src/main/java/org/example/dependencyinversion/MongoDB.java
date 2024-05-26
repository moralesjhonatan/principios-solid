package org.example.dependencyinversion;

public class MongoDB extends BaseDatos {


    @Override
    public void guardar() {
        System.out.println("Datos guardados en MongoDB");
    }

    @Override
    public void leer() {
        System.out.println("Datos leidos de MongoDB.");
    }
}