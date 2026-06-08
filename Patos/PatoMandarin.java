package Patos;

import ComportamientoGraznido.Quack;
import IComportamientoDeVuelo.VolarConAlas;

public class PatoMandarin extends pato
{
    public PatoMandarin()
    {
        establecerComportamientoDeVuelo(new VolarConAlas());
        establecerComportamientoDeGraznido(new Quack());
    }

    @Override
    public void dibujar()
    {
        System.out.println("Soy un Pato Mandarin");
    }
}