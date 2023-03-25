package modelo;

import java.time.LocalDate;
import java.util.Scanner;

public class FarmLand {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        Gado g1 = new Gado();

        g1.setPeso(85.800);
        g1.setSexo("F");
        g1.setDtNasc(LocalDate.of(2020, 5, 8));
        g1.setGestante(true);
        g1.status();
        g1.vacinar();
        g1.remediar();
        g1.alimentar();
        g1.darAguaPotavel();
        g1.pesar();
        g1.limparHabitat();
        g1.reproduzir();
        g1.parir();
        g1.abater();
        g1.sacrificar();



        Galiforme f1 = new Galiforme();

        f1.setPeso(3);
        f1.setSexo("M");
        f1.setDtNasc(LocalDate.of(2021, 1, 8));
        f1.setGestante(true);
        f1.status();
        f1.vacinar();
        f1.remediar();
        f1.alimentar();
        f1.darAguaPotavel();
        f1.pesar();
        f1.limparHabitat();
        f1.chocar();
        f1.abater();
        f1.sacrificar();

        Suino s1 = new Suino();

        s1.setPeso(85.800);
        s1.setSexo("F");
        s1.setDtNasc(LocalDate.of(2020, 5, 8));
        s1.setGestante(true);
        s1.status();
        s1.vacinar();
        s1.remediar();
        s1.alimentar();
        s1.darAguaPotavel();
        s1.pesar();
        s1.limparHabitat();
        s1.reproduzir();
        s1.parir();
        s1.abater();
        s1.sacrificar();

    }
}
