package DAW.Programación.Ejercicios.programas.Trim_2.juego;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Dado nuevoDado = new Dado();

        int tirada;

       //nuevoDado.nuevosValores(); ---> pendiente de corrección
       
       //tirada = nuevoDado.tirarDado();
       // System.out.println(tirada);
       // nuevoDado.dibujarDado(tirada);

       Scanner sc = new Scanner(System.in);

       Juego juego_1 = new Juego();


        final int PUNTUACION_FINAL = 20;
        int tusPuntos = 0;
        int iaPuntos = 0;

        int tiradasJugador[] = new int[40];
        int tiradasIa[] = new int[40];
        
        int resultado[] = new int[2];
        int contPosJug = 0;
        int contPosIa = 0;

        String texto = "";

        int turno = 2;

        do {
            if((turno%2) == 0) {
                System.out.println();
                System.out.println();
                texto = "Jugador 1";
                resultado = juego_1.turno(tiradasJugador, contPosJug, texto);
                tusPuntos = tusPuntos + resultado[1];
                contPosJug = contPosJug + resultado[0];
            } else {
                System.out.println();
                System.out.println();
                texto = "Jugador 2";
                resultado = juego_1.turno(tiradasJugador, contPosJug, texto);
                iaPuntos = iaPuntos + resultado[1];
                contPosIa = contPosIa + resultado[0];
            }

            turno++;

            System.out.println("|- - - -PUNTUACIONES- - - - -");
            System.out.println("|      Jugador 1: " + tusPuntos);
            System.out.println("|----------------------------");
            System.out.println("|      Jugador 2: " + iaPuntos);


            System.out.println();
            System.out.println("_____________________________________________");

            System.out.println("PULSA ~ENTER~ PARA PASAR AL SIGUIENTE JUGADOR");
            System.out.println("_____________________________________________");
            sc.nextLine();
            
        } while (tusPuntos < PUNTUACION_FINAL && iaPuntos < PUNTUACION_FINAL);

        if(tusPuntos > PUNTUACION_FINAL) {
            System.out.println();            
            System.out.println();
            System.out.println("_____________________________________________");
            System.out.println("ENHORABUENA HAS GANADO");
            System.out.println("_____________________________________________");
        } else {
            System.out.println();
            System.out.println();
            System.out.println("_____________________________________________");
            System.out.println("VAYA HAS PERDIDO");
            System.out.println("_____________________________________________");
        }

    }
}
