package EjerciciosSecion3;

public class ejercicio2 {

    public static void main (String [] args){
        double precioAlimento = 4.56;
        final double impuesto = 0.7;
        int precioFinal = (int) (precioAlimento * impuesto);
        double resultado = precioAlimento + precioFinal;
        double descuentoAlimento = resultado * 85 /100;
        System.out.println("------------------------------------------------------");
        System.out.println("Bienvenido a la tienda IBM");
        System.out.println("El valor del alimento esta en: "+precioAlimento+ "€");
        System.out.println("El impuesto del alimento es del 7%");
        System.out.println("El valor final es de: "+resultado + "€");
        System.out.println("Con descuesto queda en: "+descuentoAlimento + "€");
        System.out.println("------------------------------------------------------");
    }
}
