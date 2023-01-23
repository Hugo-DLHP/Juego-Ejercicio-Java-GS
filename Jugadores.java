package DAW.Programación.Ejercicios.programas.Trim_2.juego;

public class Jugadores {
    private int tiradasJugador[] = new int[40];
    private int puntosJugador = 0;
    private int contPosJugador = 0;
    private String nombreJugador = "Jugador 1";



    public Jugadores() {
        this.setContPosJugador(contPosJugador);
        this.setPuntosJugador(puntosJugador);
        this.setTiradasJugador(tiradasJugador);
        this.setNombreJugador(nombreJugador);
    }

    public Jugadores(String nombreJugador) {
        this.setContPosJugador(contPosJugador);
        this.setPuntosJugador(puntosJugador);
        this.setTiradasJugador(tiradasJugador);
        this.setNombreJugador(nombreJugador);
    }



    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public void setTiradasJugador(int[] tiradasJugador) {
        this.tiradasJugador = tiradasJugador;
    }

    public void setPuntosJugador(int puntosJugador) {
        this.puntosJugador = puntosJugador;
    }

    public void setContPosJugador(int contPosJugador) {
        this.contPosJugador = contPosJugador;
    }



    public int[] getTiradasJugador() {
        return tiradasJugador;
    }

    public int getPuntosJugador() {
        return puntosJugador;
    }

    public int getContPosJugador() {
        return contPosJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }
    
}
