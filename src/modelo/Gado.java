package modelo;

import java.util.Random;
import java.util.Scanner;

public class Gado extends Animal implements ICuidadosMamiferos, ICuidadosGerais {
    boolean gestante = false;
    int numFilhotes = 0;

    public boolean getGestante() {
        if (this.calcularIdadeAnimalAnos() >= 1) {
            return gestante = true;
        } else {
            return gestante = false;
        }
    }

    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }

    public int getNumFilhotes() {
        return numFilhotes;
    }

    public void setNumFilhotes(int numFilhotes) {
        if (this.calcularIdadeAnimalAnos() < 1) {
        } else {
            this.numFilhotes = numFilhotes;
        }
    }

    public void status() {
        if (this.getSexo() == "F") {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("####### STATUS VACA #######");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Sexo: " + this.getSexo());
            System.out.println("Idade: " + this.calcularIdadeAnimalTotal());
            System.out.println("Peso: " + this.getPeso());
            if (this.calcularIdadeAnimalAnos() >= 1) {
                System.out.println("Gravidez: " + this.getGestante());
            } else {
                System.out.println("Idade inferior à 1 ano, não autorizado gestação.");
            }
            if (this.getGestante() == true) {
                System.out.println("Total de filhotes gerados: " + this.getNumFilhotes());
            } else {
                System.out.println("Idade inferior à 1 ano, vaca não gestante.");
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else if (this.getSexo() == "M") {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("####### STATUS BOI #######");
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
    public void pesar() { System.out.println("Animal foi pesado."); }

    @Override
    public void limparHabitat() { System.out.println("Limpeza do habitat realizada.");
    }

    @Override
    public void reproduzir() { int idade = calcularIdadeAnimalAnos();

        if (getSexo() == "F" && idade >= 1) {
            System.out.println("Reproduzação realizada.");
            this.setGestante(true);
        } else {
            System.out.println("Selecione FÊMEA que tenha 1 ano ou mais de vida.");
        }
    }

    @Override
    public void parir() {
        int idade = calcularIdadeAnimalAnos();
        Scanner tc = new Scanner(System.in);

        if (this.getSexo() == "F" && idade >= 1 && this.getGestante() == true){
            Random gerador = new Random();
            System.out.println("Parto realizado com sucesso: " + gerador.nextInt(5) + " filhote(s)");
        } else {
            System.out.println("Parto inviável: Selecione FÊMEA acima de 1 ano de idade.");
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
        if (getPeso() > 500) {
            System.out.println("Animal com " + this.getPeso() + " quilos e pronto para abate.");
        } else {
            System.out.println ("Animal com " + this.getPeso() + " quilos e não autorizado para abate.");
        }
    }

    @Override
    public void sacrificar() {
        System.out.println("Animal sacrificado.");
    }
}
