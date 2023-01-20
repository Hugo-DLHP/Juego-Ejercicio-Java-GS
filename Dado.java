package DAW.Programación.Ejercicios.programas.Trim_2.juego;

import java.util.Scanner;

public class Dado {

    int minimo = 1;
    int maximo = 6;

    public int GetMaximo() {
        return this.maximo;

    }

    public int GetMinimo() {
        return this.minimo;
        
    }

    public void SetMaximo(int nuevo_maximo) {
        this.maximo = nuevo_maximo;
    }

    public void SetMinimo(int nuevo_minimo) {
        this.minimo = nuevo_minimo;
    }

    public void nuevosValores() {
        
        Scanner sc = new Scanner(System.in);        
        String condicion;
        String dato1;
        int dato2;

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                dato1 = "Maximo";
                dato2 = GetMaximo();
            } else {
                dato1 = "Minimo";
                dato2 = GetMinimo();
            }
            System.out.println("Quieres cambiar el numero " + dato1 + " del dado(actualmente tiene un valor de " + dato2 + ")");
            condicion = sc.next().toLowerCase();
            System.out.println();

            if (condicion.equals("si")) {
                System.out.println("cual es el nuevo " + dato1 + " de tu dado");
                if (dato1.equals("Maximo")) {
                    SetMaximo(sc.nextInt());
                    condicion = "";
                    System.out.println();
                } else {
                    SetMinimo(sc.nextInt());
                    condicion = "";
                    System.out.println();
                }            
            }

            if(GetMinimo() >= GetMaximo()) {
                System.out.println("No puedes poner un valor minimo mayor que el valor maximo");
                i = 0;
                System.out.println();
            }  


        }
    }

    public int tirarDado() {  
        int resultado =  (int) (Math.random()*((GetMaximo() - GetMinimo()) + 1) + GetMinimo());    
        return resultado;
    }

    public void dibujarDado(int resultado) {

        switch (resultado) {
            case 1:
                System.out.println(" --------- \n|         |\n|    +    |\n|         |\n --------- ");
                break;

            case 2:
                System.out.println(" --------- \n|       + |\n|         |\n| +       |\n --------- ");
                break;

            case 3:
                System.out.println(" --------- \n|       + |\n|    +    |\n| +       |\n --------- ");
                break;

            case 4:
                System.out.println(" --------- \n| +     + |\n|         |\n| +     + |\n --------- ");
                break;

            case 5:
                System.out.println(" --------- \n| +     + |\n|    +    |\n| +     + |\n --------- ");
                break;

            case 6:
                System.out.println(" --------- \n| +     + |\n| +     + |\n| +     + |\n --------- ");
                
                break;
        
            default:
                break;
        }
    }
}
