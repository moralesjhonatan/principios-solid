package org.example.dependencyinversion;

public class ManejarDatos {

    public void procesar(BaseDatos baseDatos) {
        baseDatos.guardar();
        baseDatos.leer();
    }
}