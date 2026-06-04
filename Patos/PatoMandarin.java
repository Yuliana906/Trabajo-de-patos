package Patos;

import ComportamientoGraznido.Quack;
import IComportamientoDeVuelo.VolarConAlas;

public class PatoMandarin extends pato
{
    public PatoMandarin()
    {
        comportamientoVuelo = new VolarConAlas();
        comportamientoGraznido = new Quack();
    }

    public void dibujar()
    {
        System.out.println("Soy un Pato Mandarin");
    }
}
