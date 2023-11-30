package entities;

public class Dipendente {
    public static final double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livelli livelli;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livelli = Livelli.operaio;
    }

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livelli livelli, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livelli = livelli;
        this.dipartimento = dipartimento;
    }
    //Metodi non statici
    public void stampaDatiDipendente(){
        System.out.println("sono:"+ this.matricola + "guadagno:"+this.stipendio);
    }
    public Livelli promuovi(){
    switch (this.livelli){
        case operaio -> {
            this.livelli = Livelli.impiegato;
            this.stipendio = this.stipendio * 1.2;
        }
        case impiegato -> {
            this.livelli = Livelli.quadro;
            this.stipendio = this.stipendio * 1.5;
        }
        case quadro -> {
            this.livelli = Livelli.dirigente;
            this.stipendio = this.stipendio * 2;
        }
        default -> System.out.println("Non si promuove un dirigente");
    }
    return this.livelli;
    }
    //Metodi Statici
    public static double calcolaPaga(Dipendente dipendente){
    return dipendente.stipendio;
    }
    public  static double calcolaPaga(Dipendente dipendente, int oreStraordinario){
    return dipendente.stipendio + dipendente.importoOrarioStraordinario * oreStraordinario;
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

    public Livelli getLivelli() {
        return livelli;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setTipoDip(Dipartimento tipoDip) {
        this.livelli = livelli;
    }

}
