package DAW.Programación.Ejercicios.programas.Trim_2.juego;

public class Juego {

    public int[] turno(int array[], int posicion, String texto) {

        
        Dado nuevoDado = new Dado();
        int tirada = nuevoDado.tirarDado();
        
        int datos[] = {0, 0}; 
        //Primera posicion-->[0] es la posicion del array y la segunda posicion-->[1] es la suma de los puntos
        int contPos = 0;

        array[posicion] = tirada;

        System.out.println("En la tirada del " + texto + " ha salido un " + array[posicion]);
        
        nuevoDado.dibujarDado(tirada);
        datos[1] = datos[1] + array[posicion];
        posicion ++;
        contPos++;
        datos[0] = contPos;

        return datos;
    }
}
