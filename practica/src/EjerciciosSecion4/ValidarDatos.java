package EjerciciosSecion4;

import java.util.Scanner;

public class ValidarDatos {

    public static void main(String[] args) {

        int Edad;

        Scanner Input = new Scanner(System.in);

        do {

            System.out.println("Ingrese su edad: ");

            while ( !Input.hasNextInt ()){
                String next = Input.next();
                System.out.println(next + " - No es un número valido");
                System.out.println("Ingrese su edad: ");

            }
            Edad = Input.nextInt();
            break;

        } while (true);

        System.out.println("La edad ingresada es: "+Edad);
    }

}
