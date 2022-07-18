package EjerciciosSecion4;
import java.util.Scanner;

public class PinDeSeguridad {

    public static void main(String[] args) {
        int contrasena;
        int pass;
        int intentos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------" +
                "\n-------------------------------------------------");
        System.out.println("Bienvenido a la App Banca Movil");

            System.out.println("Ingrese su PIN: ");
            contrasena = Integer.parseInt(sc.nextLine());

            System.out.println("Confirme el PIN: ");
            pass = Integer.parseInt(sc.nextLine());

            if (contrasena == pass) {
                System.out.println("PIN registrado, puede continuar");
                System.out.println("-------------------------------------------------" +
                        "\n-------------------------------------------------");
                return;
            }
            while (contrasena != pass && intentos < 2) {
                System.out.println("\nPIN incorrecto, Intente nuevamente");
                System.out.println("Ingrese el PIN: ");
                contrasena = Integer.parseInt(sc.nextLine());
                System.out.println("Confirme el PIN: ");
                pass = Integer.parseInt(sc.nextLine());
                System.out.println("PIN REGRISTRADO EXITOSAMENTE");
                System.out.println("-------------------------------------------------" +
                        "\n-------------------------------------------------");
                intentos++;
                if (intentos == 2) {
                    System.out.println("Se ha bloqueado la cuenta");
                }
            }
        }
    }