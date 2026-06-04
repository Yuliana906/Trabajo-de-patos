package Patos;

import ComportamientoGraznido.Quack;
import IComportamientoDeVuelo.VolarConAlas;

public class PatoMandarin extends pato
{
    public PatoMandarin()
    {
        establecerComportamientoDeVuelo(
            new VolarConAlas(),
            "VolarConAlas"
        );

        establecerComportamientoDeGraznido(
            new Quack(),
            "Quack"
        );
    }

    @Override
    public void dibujar()
    {
        System.out.println("Soy un Pato Mandarin");
    }
}