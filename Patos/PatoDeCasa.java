package Patos;

import ComportamientoGraznido.Quack;
import IComportamientoDeVuelo.SinVuelo;

public class PatoDeCasa extends pato
{
    public PatoDeCasa()
    {
        establecerComportamientoDeVuelo(new SinVuelo());
        establecerComportamientoDeGraznido(new Quack());
    }

    @Override
    public void dibujar()
    {
        System.out.println("Soy un Pato de Casa");
    }
}