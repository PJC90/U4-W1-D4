package entities;

public class Dipendente {
    private double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livelli tipoLiv;
    private Dipartimento tipoDip;

    public Dipendente(int matricola, Dipartimento tipoDip) {
        this.matricola = matricola;
        this.tipoDip = tipoDip;
        this.stipendio = this.stipendioBase;
        this.importoOrarioStraordinario = 30;

        this.tipoLiv = Livelli.operaio;
    }

    public Dipendente(double stipendioBase, int matricola, double stipendio, double importoOrarioStraordinario, Livelli tipoLiv, Dipartimento tipoDip) {
        this.stipendioBase = stipendioBase;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.tipoLiv = tipoLiv;
        this.tipoDip = tipoDip;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livelli getTipoLiv() {
        return tipoLiv;
    }

    public Dipartimento getTipoDip() {
        return tipoDip;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setTipoDip(Dipartimento tipoDip) {
        this.tipoDip = tipoDip;
    }
}
