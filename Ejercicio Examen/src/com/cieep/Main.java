package com.cieep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     * FASE 1: Crear la Clase (24 Personas)
     * Fase 2: Preguntar votos
     * Fase 3: Recuento votos
     */
    private static Persona[] clase;

    private static void rellenaClase(){
        for (int i = 1; i <= clase.length ; i++) {
            //Persona p = new Persona("Alumno"+i,0);
            clase[i-1] = new Persona("Alumno"+i,0);
        }
    }

    /**
     * Preguntar a los 24 alumnos
     * 1. A quien votan
     * 2. Voto correcto (1-24) y no su numero
     * 3. Aumentar el numero de votos del Alumno
     */

    private static void votar() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < clase.length; i++) {
            System.out.println("Dime el numero a quien quieres votar(1-24)");
            try {
                int voto = scanner.nextInt();
                if (voto >= 1 && voto <= 24 && voto != i + 1) {
                    clase[voto - 1].incrementaVotos();
                }
            }
            catch (InputMismatchException ex) {
            }
        }
    }

    /**
     * 1. Recorro array para obtener el numero mas alto de votos
     * 2. Recorro el array para mostrar los nombres de los alumnos con ese numero de votos
     *
     */

    private static void comprobarVotos(){
        int maxVotos = 0;
        for (int i = 0; i < clase.length; i++) {
            if(clase[i].getNumVotos() > maxVotos){
                maxVotos = clase[i].getNumVotos();
            }
        }
        for (int i = 0; i < clase.length; i++) {
            if (clase[i].getNumVotos() == maxVotos){
                System.out.println(clase[i].getNombre());
            }
        }
    }

    public static void main(String[] args) {

        clase = new Persona[24];
        rellenaClase();
        votar();
        comprobarVotos();
    }
}
