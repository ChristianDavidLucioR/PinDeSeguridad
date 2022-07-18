package EjerciciosSecion3;

public class ejercicio3 {

    public static void main (String [] args){

        String [][] cartelera = new String [4][2];

        cartelera [0][0] = "Thor, precio de entrada: \n$35.500";
        cartelera [0][1] = "SpiderMan, precio de entrada: \n$35.000";
        cartelera [1][0] = "Capitan America, precio de entrada: \n$35.00";
        cartelera [1][1] = "Thanos Invensible, precio de entrada: \n$25.650";
        cartelera [2][0] = "Anakin vs Dark, precio de entrada: \n$25.413";
        cartelera [2][1] = "Emet y Lucy, precio de entrada: \n$15.600";
        cartelera [3][0] = "Yoda el sabio, precio de entrada: \n$19.520";

        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 2; j++)
                System.out.println("La programacion de la cartelera es: " + cartelera[i][j]);
        }
        System.out.println("----------------------------------------------------------------");
    }
}
