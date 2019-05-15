
/**
 * Classe (involucro) che difinisce le liste come ...
 * <p> Questa classe e' definita in uno stile piu' propriamente a oggetti:
 * in altre parole gli algoritmi sono (quando possibile e sensato) metodi propri,
 * ossi appartengono agli oggetti.
 * </p>
 * <h2> Esercizi </h2>
 * <p> Controllare (e completare) specifiche e codice; 
 * aggiungere se necessario algoritmi utili </p>
 * 
 * @author AMPRG2017 
 * @version (2018-05)
 */
public class IntLista implements Lista
{
    private IntLiSTR lista;
    private int dimensione;

    /**
     * Constructors for objects of class IntLista
     * Esercizio: descrivere meglio i costruttori.
     */
    
    public IntLista()
    {
        // initialize instance variables
        lista = null;
        dimensione = 0;
    }

    public IntLista(IntLiSTR p)
    {
        // initialize instance variables
        lista = p;
        dimensione = -1; // da calcolare
    }
    
    /**
     * Metodo:
     * verifica se la lista e' vuota
     *
     * @param l    una lista correttamente formata
     * @return     true se la lista e' vuota, false altrimenti
     */
     public boolean isEmpty(){
        return true;
    }
    
    /**
     * Metodo:
     * costruisce una nuova lista a partire da un elemento e una lista
     *
     * @param e    nuovo elemento della lista
     * @param l    lista esistente e correttamente formata
     * @return     cons(e,l) = (e.l)
     */
     public void add(int e){
        return;
    }
    
    /**
     * Metodo:
     * restituisce il primo elemento della lista
     * Esercizio: correggere le specifiche!
     *
     * @param l    lista esistente e correttamente formata
     * @return     head(e.l) = e
     */
     public int head(){
        return 0;
    }
    
    /**
     * Metodo:
     * restituisce la 'coda' della lista
     * Esercizio: correggere le specifiche!
     *
     * @param l    lista esistente e correttamente formata
     * @return     tail(e.l) = l
     */
     public IntLista tail(){
        return null;
    }
    
     /**
     * Metodo di classe:
     * costruisce una nuova lista a partire da un elemento e una lista
     *
     * @param e    nuovo elemento della lista
     * @param l    lista esistente e correttamente formata
     * @return     cons(e,l) = (e.l)
     */
    public static IntLista cons(int e, IntLista l){
        // DA RISCRIVERE
        return null;
    }

    // /**
     // * Metodo di istanza:
     // * ...
     // *
     // */
    // public String toString(){
        // return null;
    // }

}
