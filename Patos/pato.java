package Patos;

import ComportamientoGraznido.ComportamientodeGraznido;
import IComportamientoDeVuelo.ComportamientoDeVuelo;

public abstract class pato
{
    private ComportamientoDeVuelo comportamientoVuelo;
    private ComportamientodeGraznido comportamientoGraznido;

    private String tipoVuelo;
    private String tipoGraznido;

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
            ComportamientoDeVuelo comportamientoVuelo,
            String tipoVuelo)
    {
        this.comportamientoVuelo = comportamientoVuelo;
        this.tipoVuelo = tipoVuelo;
    }

    public void establecerComportamientoDeGraznido(
            ComportamientodeGraznido comportamientoGraznido,
            String tipoGraznido)
    {
        this.comportamientoGraznido = comportamientoGraznido;
        this.tipoGraznido = tipoGraznido;
    }

    public String getTipoVuelo()
    {
        return tipoVuelo;
    }

    public String getTipoGraznido()
    {
        return tipoGraznido;
    }

    public abstract void dibujar();
}