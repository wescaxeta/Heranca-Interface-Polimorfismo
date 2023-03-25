package modelo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    private String sexo;
    private double peso;
    private LocalDate dtNasc;
    Period dias;
    Period meses;
    Period anos;
    private boolean saudavel = true;


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Period getDias() {
        return dias;
    }

    public void setDias(Period dias) {
        this.dias = dias;
    }

    public Period getMeses() {
        return meses;
    }

    public void setMeses(Period meses) {
        this.meses = meses;
    }

    public Period getAnos() {
        return anos;
    }

    public void setAnos(Period anos) {
        this.anos = anos;
    }

    public boolean getSaudavel() {
        return saudavel;
    }

    public void setSaudavel(boolean saudavel) {
        this.saudavel = saudavel;
    }

    public int calcularIdadeAnimalAnos() {
        LocalDate hoje = LocalDate.now();

        if ((dtNasc != null) && (hoje != null)) {
            return Period.between(dtNasc, hoje).getYears();
        } else {
            return -1;
        }
    }

    public int calcularIdadeAnimalMeses() {
        LocalDate hoje = LocalDate.now();

        if ((dtNasc != null) && (hoje != null)) {
            return Period.between(dtNasc, hoje).getMonths();
        } else {
            return -1;
        }
    }

    public int calcularIdadeAnimalDias() {
        LocalDate hoje = LocalDate.now();

        if ((dtNasc != null) && (hoje != null)) {
            return Period.between(dtNasc, hoje).getDays();
        } else {
            return -1;
        }
    }

    public String calcularIdadeAnimalTotal() {
        LocalDate hoje = LocalDate.now();

        if ((dtNasc != null) && (hoje != null)) {
            Period periodoCompleto = Period.between(this.getDtNasc(), hoje);
            String mensagem = periodoCompleto.getYears() + " anos, " + periodoCompleto.getMonths() + " meses e " + periodoCompleto.getDays() + " dias.";
            return mensagem;
        } else {
            System.out.println("Data de nascimento está sem informação.");
        }
        return "0";
    }
}
