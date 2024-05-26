package org.example.dependencyinversion;

public class MySQL extends BaseDatos {

    @Override
    public void guardar() {
        System.out.println("Datos guardados en MySQL");
    }

    @Override
    public void leer() {
        System.out.println("Datos leidos de MySQL.");
    }
}