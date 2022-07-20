package EjerciciosSecion4;
import java.util.Scanner;
public class PinDeSeguridad {
    static Scanner sc = new Scanner(System.in);
    static String nombreProducto;
    static float s, r, p;
    static float ingreso, retiro, valorProducto;
    static int opcion;
    public static void main(String[] args) {

        int contrasena;
        int pass;
        int intentos = 0;

        System.out.println("-----------------------------------------------------" +
                "\n-----------------------------------------------------");
        System.out.println("Bienvenido a la App Banca Movil");

        System.out.println("Ingrese su PIN: ");
        contrasena = Integer.parseInt(sc.nextLine());

        System.out.println("Confirme el PIN: ");
        pass = Integer.parseInt(sc.nextLine());

        if (contrasena == pass) {
            System.out.println("PIN registrado, puede continuar\n");

            do {

                System.out.println("""
                        Digite la opción correspondiente:
                        1. Ingresar dinero a la cuenta\s
                        2. Retirar dinero\s
                        3. Añadir productos al carrito de compras\s
                        4. Salir de la App Banca Movil""");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese la cantidad de dinero: ");
                        ingreso = Float.parseFloat(sc.nextLine());
                        s = ingreso;
                        System.out.println("Actualmente tiene en la cuenta el valor de: " + s + "€");
                    }
                    case 2 -> {
                        System.out.println("Ingrese la cantidad a retirar: ");
                        retiro = Float.parseFloat(sc.nextLine());
                        r = s - retiro;
                        if (retiro > s && retiro > r) {
                            System.out.println("Saldo insuficiente para retirar");
                        } else {
                            System.out.println("Saldo actual: " + r + "€");
                        }
                    }
                    case 3 -> {
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreProducto = (sc.nextLine());
                        System.out.println("Ingrese el valor del producto para comprar: ");
                        valorProducto = Float.parseFloat(sc.nextLine());
                        p = s - valorProducto;
                        if (valorProducto > s) {
                            System.out.println("Valor del producto superior al saldo de la App." +
                                    "\nActualmente tiene disponeble: " + s + "€");
                        } else {
                            System.out.println("Usted ha comprado el producto: " + nombreProducto
                                    + "\nPor el valor: " + valorProducto + "€" + "\nSaldo actual en la App: " + p + "€");
                        }
                    }
                    case 4 -> System.out.println("Gracias por usar App Banca Movil");
                    default -> System.out.println("Numero ingresado no disponible");
                }

                System.out.println("-----------------------------------------------------" +
                        "\n-----------------------------------------------------");

            } while (opcion != 4);
        }

        while (contrasena != pass && intentos < 2) {
            System.out.println("\nPIN incorrecto, Intente nuevamente");
            System.out.println("Ingrese el PIN: ");
            contrasena = Integer.parseInt(sc.nextLine());
            System.out.println("Confirme el PIN: ");
            pass = Integer.parseInt(sc.nextLine());
            System.out.println("PIN registrado, puede continuar\n");

            do {

                System.out.println("""
                        Digite la opcion correspondiente:
                        1. Ingresar dinero a la cuenta\s
                        2. Retirar dinero\s
                        3. Añadir productos al carrito de compras\s
                        4. Salir de la App Banca Movil""");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese la cantidad de dinero: ");
                        ingreso = Float.parseFloat(sc.nextLine());
                        s = ingreso;
                        System.out.println("Actualmente tiene en la cuenta el valor de: " + s + "€");
                    }
                    case 2 -> {
                        System.out.println("Ingrese la cantidad a retirar: ");
                        retiro = Float.parseFloat(sc.nextLine());
                        r = s - retiro;
                        if (retiro > s && retiro > r) {
                            System.out.println("Saldo insuficiente para retirar");
                        } else {
                            System.out.println("Saldo actual: " + r + "€");
                        }
                    }
                    case 3 -> {
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreProducto = (sc.nextLine());
                        System.out.println("Ingrese el valor del producto para comprar: ");
                        valorProducto = Float.parseFloat(sc.nextLine());
                        p = s - valorProducto;
                        if (valorProducto > s) {
                            System.out.println("Valor del producto superior al saldo de la App." +
                                    "\nActualmente tiene disponeble: ( " + s + "€)");
                        } else {
                            System.out.println("Usted ha comprado el producto: " + nombreProducto
                                    + "\nPor el valor: " + valorProducto + "€" + "\nSaldo actual en la App: " + p + "€");
                        }
                    }
                    case 4 -> System.out.println("Gracias por usar App Banca Movil");
                    default -> System.out.println("Numero ingresado no disponible");
                }

                System.out.println("-----------------------------------------------------" +
                        "\n-----------------------------------------------------");

            } while (opcion != 4);

            intentos++;
            if (intentos == 2) {
                System.out.println("Se ha bloqueado la cuenta");
            }
        }
    }
}