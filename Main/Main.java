package Main;

import Patos.PatoDeCasa;
import Patos.PatoDeHule;
import Patos.PatoMallard;
import Patos.PatoMandarin;
import Patos.pato;

public class Main
{
    public static void main(String[] args)
    {
        pato pato1 = new PatoMallard();

        pato1.dibujar();
        pato1.emprenderVuelo();
        pato1.hacerQuack();

        System.out.println();

        pato pato2 = new PatoDeHule();

        pato2.dibujar();
        pato2.emprenderVuelo();
        pato2.hacerQuack();

        System.out.println();

        pato pato3 = new PatoDeCasa();

        pato3.dibujar();
        pato3.emprenderVuelo();
        pato3.hacerQuack();

        System.out.println();

        pato pato4 = new PatoMandarin();

        pato4.dibujar();
        pato4.emprenderVuelo();
        pato4.hacerQuack();
    }
}