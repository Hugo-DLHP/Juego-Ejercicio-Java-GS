package DAW.Programación.Ejercicios.programas.Trim_2.juego;

import java.util.Scanner;

public class Juego {


    Jugadores vector[];

    public void crearJugadores(int numeroJugadores, Scanner sc) {

        this.vector = new Jugadores[numeroJugadores];
        for (int i = 0; i < numeroJugadores; i++) {
            System.out.println("Introduzca el nombre:");
            String dato = sc.nextLine();
            vector[i] = new Jugadores(dato);
        }
    }


    public int[] turno(int array[], int posicion, String texto) {        
        Dado nuevoDado = new Dado();
        int tirada = nuevoDado.tirarDado();
        
        int datos[] = {0, 0}; 
        //Primera posicion-->[0] es la posicion del array y la segunda posicion-->[1] es la suma de los puntos
        int contPos = 0;

        array[posicion] = tirada;

        System.out.println("En la tirada de " + texto + " ha salido un " + array[posicion]);
        
        nuevoDado.dibujarDado(tirada);
        datos[1] = datos[1] + array[posicion];
        posicion ++;
        contPos++;
        datos[0] = contPos;

        return datos;
    }

    public boolean comprobarGanador(Jugadores jugadores) {
        if (jugadores.getPuntosJugador() >= principal.PUNTUACION_FINAL) {
            return true;
        } else {
            return false;
        }        
    }
}
