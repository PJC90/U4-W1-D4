import entities.Dipartimento;
import entities.Dipendente;
import entities.Livelli;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente operaio = new Dipendente(5554444,12221.1,22, Livelli.operaio, Dipartimento.amministrazione);
        Dipendente impiegato = new Dipendente(5554444,12221.1,22, Livelli.impiegato, Dipartimento.amministrazione);
        Dipendente quadro = new Dipendente(5554444,1500,30, Livelli.quadro, Dipartimento.amministrazione);

        System.out.println(operaio.promuovi());
        System.out.println(impiegato.promuovi());
        System.out.println(quadro.promuovi());

        operaio.stampaDatiDipendente();
        impiegato.stampaDatiDipendente();
        quadro.stampaDatiDipendente();

        double paga1 = Dipendente.calcolaPaga(operaio,100);
        double paga2 = Dipendente.calcolaPaga(impiegato,100);
        double paga3 = Dipendente.calcolaPaga(quadro,100);
        System.out.println("Somma stipendi: "+ (paga1 + paga2 + paga3));


    }
}