package Patos;

import ComportamientoGraznido.Chillido;
import IComportamientoDeVuelo.SinVuelo;

public class PatoDeHule extends pato
{
    public PatoDeHule()
    {
        establecerComportamientoDeVuelo(
            new SinVuelo(),
            "SinVuelo"
        );

        establecerComportamientoDeGraznido(
            new Chillido(),
            "Chillido"
        );
    }

    @Override
    public void dibujar()
    {
        System.out.println("Soy un Pato de Hule");
    }
}