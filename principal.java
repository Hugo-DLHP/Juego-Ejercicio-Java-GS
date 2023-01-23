package DAW.Programación.Ejercicios.programas.Trim_2.juego;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       
        final int PUNTUACION_FINAL = 100;

        Juego juego_1 = new Juego();     
        int resultado[] = new int[2];
        int numeroJugadores;
        System.out.println("Cuantos jugadores sois");
        numeroJugadores = sc.nextInt();
        sc.nextLine();
        juego_1.crearJugadores(numeroJugadores, sc);


        do {
            for (Jugadores jugadores : juego_1.vector) {                    
                System.out.println();
                System.out.println();                
                resultado = juego_1.turno(jugadores.getTiradasJugador(), jugadores.getContPosJugador(), jugadores.getNombreJugador());
                jugadores.setPuntosJugador(jugadores.getPuntosJugador() + resultado[1]);
                jugadores.setContPosJugador(jugadores.getContPosJugador() + resultado[0]);
            }

            for (Jugadores jugadores : juego_1.vector) {
                System.out.println("|- - - -PUNTUACIONES- - - - -");
                System.out.println("|      " + jugadores.getNombreJugador() + ": " + jugadores.getPuntosJugador());
                System.out.println("|----------------------------");
            }
    
            System.out.println();
            System.out.println("_____________________________________________");
            System.out.println("PULSA ~ENTER~ PARA PASAR AL SIGUIENTE JUGADOR");
            System.out.println("_____________________________________________");
            sc.nextLine();
            
    

        } while ();

    }
}
