package Patos;

import ComportamientoGraznido.ComportamientodeGraznido;
import IComportamientoDeVuelo.ComportamientoDeVuelo;

public abstract class pato
{
    protected ComportamientoDeVuelo comportamientoVuelo;
    protected ComportamientodeGraznido comportamientoGraznido;

    public void nadar()
    {
        System.out.println("Todos los patos nadan.");
    }

    public void hacerQuack()
    {
        comportamientoGraznido.quack();
    }

    public void emprenderVuelo()
    {
        comportamientoVuelo.volar();
    }

    public void establecerComportamientoDeVuelo(
            ComportamientoDeVuelo comportamientoVuelo)
    {
        this.comportamientoVuelo = comportamientoVuelo;
    }

    public void establecerComportamientoDeGraznido(
            ComportamientodeGraznido comportamientoGraznido)
    {
        this.comportamientoGraznido = comportamientoGraznido;
    }

    public abstract void dibujar();
}