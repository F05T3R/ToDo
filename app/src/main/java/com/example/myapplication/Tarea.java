package com.example.myapplication;

public class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    public String getNombre() {

        return nombre;
    }

    public boolean estaCompletada() {

        return completada;
    }

    public void completar() {

        completada = true;
    }
}

