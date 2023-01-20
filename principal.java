package DAW.Programación.Ejercicios.programas.Trim_2.juego;

public class principal {
    public static void main(String[] args) {

        Dado nuevoDado = new Dado();

        int resultado;

       // nuevoDado.nuevosValores();

        for (int i = 0; i < 10; i++) {
            resultado = nuevoDado.tirarDado();
            System.out.println(resultado);
            nuevoDado.dibujarDado(resultado);
        }

    }
}
