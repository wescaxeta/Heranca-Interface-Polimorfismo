package modelo;

import java.util.Random;

public class Galiforme extends Animal implements ICuidadosAves, ICuidadosGerais {

    public void status() {
        if (this.getSexo() == "F") {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("####### STATUS GALINHA #######");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Sexo: " + this.getSexo());
            System.out.println("Idade: " + this.calcularIdadeAnimalTotal());
            //System.out.println("Total Meses de vida: " + this.calcularIdadeAnimalMeses());
            System.out.println("Peso: " + this.getPeso());
            if (this.calcularIdadeAnimalMeses() >= 6) {
                System.out.println("Aptar para dar ovos.");
            } else {
                System.out.println("Idade inferior à 6 meses completos, não pôe ovos.");
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else if (this.getSexo() == "M") {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("####### STATUS GALO #######");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Sexo: " + this.getSexo());
            System.out.println("Idade: " + this.calcularIdadeAnimalTotal());
            System.out.println("Peso: " + this.getPeso());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else {
            System.out.println("Selecione F para FÊMEA e M para MACHO");
        }
    }

    @Override
    public void alimentar() {
        System.out.println("Ração nova servida no recipiente.");
    }

    @Override
    public void darAguaPotavel() {
        System.out.println("Água nova servida no recipiente.");
    }

    @Override
    public void pesar() {
        System.out.println("Animal foi pesado."); }

    @Override
    public void limparHabitat() {
        System.out.println("Limpeza do habitat realizada.");
    }

    @Override
    public void chocar() {
        int idade = calcularIdadeAnimalMeses();
        if (this.getSexo() == "F" && idade >= 6) {
            Random gerador = new Random();
            System.out.println("Galinha chocou " + gerador.nextInt(5) + " ovo(s).");
        }
    }

    @Override
    public void remediar() {
        System.out.println("Animal remediado.");
    }

    @Override
    public void vacinar() {
        int idadeDias = calcularIdadeAnimalDias();

        if (idadeDias < 30) {
            System.out.println("Vacinação do animal realizada.");
        } else {
            System.out.println("Animal com idade menor de 30 dias, vacinação não autorizada.");
        }
    }

    @Override
    public void abater() {
        if (getPeso() > 2) {
            System.out.println("Animal com " + this.getPeso() + " quilos e pronto para abate.");
            System.out.println("Animal abatido.");
        } else {
            System.out.println ("Animal com " + this.getPeso() + " quilos e não autorizado para abate.");
        }
    }

    @Override
    public void sacrificar() {
        System.out.println("Animal sacrificado.");
    }
}
