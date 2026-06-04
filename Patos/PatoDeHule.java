package Patos;

import ComportamientoGraznido.Chillido;
import IComportamientoDeVuelo.SinVuelo;


public class PatoDeHule extends pato
{
    public PatoDeHule()
    {
        comportamientoVuelo = new SinVuelo();
        comportamientoGraznido = new Chillido();
    }

 
    public void dibujar()
    {
        System.out.println("Soy un Pato de Hule");
    }
}