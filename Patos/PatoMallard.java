package Patos;

import ComportamientoGraznido.Quack;
import IComportamientoDeVuelo.VolarConAlas;

public class PatoMallard extends pato
{
    public PatoMallard()
    {
        comportamientoVuelo = new VolarConAlas();
        comportamientoGraznido = new Quack();
    }

    public void dibujar()
    {
        System.out.println("Soy un Pato Mallard");
    }
}