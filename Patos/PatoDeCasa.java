package Patos;

import ComportamientoGraznido.Mudo;
import IComportamientoDeVuelo.SinVuelo;

public class PatoDeCasa extends pato
{
    public PatoDeCasa()
    {
        establecerComportamientoDeVuelo(
            new SinVuelo(),
            "SinVuelo"
        );

        establecerComportamientoDeGraznido(
            new Mudo(),
            "Mudo"
        );
    }

    @Override
    public void dibujar()
    {
        System.out.println("Soy un Pato de Casa");
    }
}