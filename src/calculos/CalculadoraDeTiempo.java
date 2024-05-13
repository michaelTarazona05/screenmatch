package calculos;

import Modelo.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){

        tiempoTotal = tiempoTotal + titulo.getTiempoDeDuracionEnMinutos();
        //tiempoTotal += titulo.getTiempoDeDuracionEnMinutos();

        System.out.println("Tiempo que necesitas para maratonar tus titulos favoritos " + getTiempoTotal() + " minutos");


    }
}
