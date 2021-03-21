package com.cieep;

public class Persona {

    private String nombre;
    private int numVotos;

    public Persona(String nombre, int numVotoos) {
        this.nombre = nombre;
        this.numVotos = numVotos;
    }
    public Persona(){

    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void setNumVotoos(int numVotos) {
        this.numVotos = numVotos;
    }
    public void incrementaVotos(){
        numVotos++;
    }
}
