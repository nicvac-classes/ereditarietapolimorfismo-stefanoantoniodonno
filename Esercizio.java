//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {

    class Partita {
        protected float stamina;
        protected boolean cambi;
        protected int goal;
        protected int assist;
        protected boolean infortuni;
        protected int gialli;
        protected int rossi;

    }
    class Squadra extends Partita {
        protected string nome;
        protected string ruoli;
        protected int numerimaglia;
        protected float modulo;
    }
    class Giocatore extends Squadra {
        protected string nazionalita;
        protected int eta;
        protected string piedpreferito;

    }
    

    
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {

        //Creo l'oggetto in per l'input da tastiera
        Scanner in = new Scanner( System.in );

    }
}
