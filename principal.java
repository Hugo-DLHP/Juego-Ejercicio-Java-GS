package DAW.Programación.Ejercicios.programas.Trim_2.juego;

public class principal {
    public static void main(String[] args) {

        Dado nuevDado = new Dado();

        int resultado;

        nuevDado.nuevosValores();

        for (int i = 0; i < 20; i++) {
            resultado = nuevDado.tirarDado();
            System.out.print(resultado + "-");
        }

    }
}
