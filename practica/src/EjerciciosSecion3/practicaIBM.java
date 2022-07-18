package EjerciciosSecion3;

import javax.swing.*;

public class practicaIBM {

    public static void main (String args []) {

        String equipoLocal = "RMA";
        String equipoVisitante = "BYM";

        int golesVisitante = 0;
        int golesLocal = 0;

        golesLocal = golesLocal +1;
        //golesLocal ++;
        //golesLocal --;

        golesVisitante = golesVisitante +1;
        golesVisitante ++;
        //golesVisitante --;

        System.out.println("Los equipos que estan Jugando son: " +equipoLocal + " vs " + equipoVisitante);
        System.out.println("El resultado del marcador es: " +golesLocal + " - " +golesVisitante);
    }
}
