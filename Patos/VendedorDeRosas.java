package Patos;

import ComportamientoGraznido.GraznidoFockYou;
import IComportamientoDeVuelo.VolarVendiendoRosas;

public class VendedorDeRosas extends pato
{
    public VendedorDeRosas()
    {
        establecerComportamientoDeVuelo(new VolarVendiendoRosas());
        establecerComportamientoDeGraznido(new GraznidoFockYou());
    }

    @Override
    public void dibujar()
    {
        System.out.println("Soy el pato vendedor de rosas 🌹");
    }
}