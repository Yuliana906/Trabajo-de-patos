package Patos;



import ComportamientoGraznido.Mudo;
import IComportamientoDeVuelo.SinVuelo;

public class PatoDeCasa extends pato
{
    public PatoDeCasa()
    {
        comportamientoVuelo = new SinVuelo();
        comportamientoGraznido = new Mudo();
    }

 
    public void dibujar()
    {
        System.out.println("Soy un Pato de Casa");
    }
}