package DAW.Programación.Ejercicios.programas.Trim_2.juego;

import java.util.Scanner;

public class principal {
    
    final static int PUNTUACION_FINAL = 50;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Juego juego_1 = new Juego();     
        int resultado[] = new int[2];
        int numeroJugadores;
        System.out.println("Cuantos jugadores sois");
        numeroJugadores = sc.nextInt();
        sc.nextLine();
        juego_1.crearJugadores(numeroJugadores, sc);

        boolean condicion = false;
        int contador;


        do {            
            contador = -1;
            for (int i = 0; i < juego_1.vector.length; i++) {
                System.out.println();
                System.out.println();                
                resultado = juego_1.turno(juego_1.vector[i].getTiradasJugador(), juego_1.vector[i].getContPosJugador(), juego_1.vector[i].getNombreJugador());
                juego_1.vector[i].setPuntosJugador(juego_1.vector[i].getPuntosJugador() + resultado[1]);
                juego_1.vector[i].setContPosJugador(juego_1.vector[i].getContPosJugador() + resultado[0]);
                condicion = juego_1.comprobarGanador(juego_1.vector[i]);
                contador++;
                if (condicion == true) {
                    i = juego_1.vector.length;
                }
            }
            //for (Jugadores jugadores : juego_1.vector) {                    
            //    System.out.println();
            //    System.out.println();                
            //    resultado = juego_1.turno(jugadores.getTiradasJugador(), jugadores.getContPosJugador(), jugadores.getNombreJugador());
            //    jugadores.setPuntosJugador(jugadores.getPuntosJugador() + resultado[1]);
            //    jugadores.setContPosJugador(jugadores.getContPosJugador() + resultado[0]);
            //    condicion = juego_1.comprobarGanador(jugadores);
            //    contador++;
            //}

            System.out.println("|- - - -PUNTUACIONES- - - - -");
            for (Jugadores jugadores : juego_1.vector) {
                System.out.println("|      " + jugadores.getNombreJugador() + ": " + jugadores.getPuntosJugador());
                System.out.println("|----------------------------");
            }
    
            System.out.println();
            System.out.println("_____________________________________________");
            System.out.println("PULSA ~ENTER~ PARA PASAR AL SIGUIENTE JUGADOR");
            System.out.println("_____________________________________________");
            sc.nextLine();

        } while ( condicion != true);

        System.out.println("El ganador es " + juego_1.vector[contador].getNombreJugador());

    }
}
