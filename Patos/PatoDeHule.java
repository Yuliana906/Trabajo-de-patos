package Patos;

import ComportamientoGraznido.Mudo;
import IComportamientoDeVuelo.SinVuelo;

public class PatoDeHule extends pato
{
    public PatoDeHule()
    {
        establecerComportamientoDeVuelo(new SinVuelo());
        establecerComportamientoDeGraznido(new Mudo());
    }

    @Override
    public void dibujar()
    {
        System.out.println("Soy un Pato de Hule");
    }
}