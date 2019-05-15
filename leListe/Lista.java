/**
 * Interfaccia per liste di numeri interi
 * Nota: questa interfaccia potrebbe essere migliorata ...
 * 
 * @author AMPRG2017 (U. Solitro) 
 * @version (2019-05)
 */
public interface Lista
{    
    /**
     * Metodo:
     * verifica se la lista e' vuota
     *
     * @param l    una lista correttamente formata
     * @return     true se la lista e' vuota, false altrimenti
     */
     boolean isEmpty();
    
    /**
     * Metodo:
     * restituisce il primo elemento della lista
     * Esercizio: correggere le specifiche!
     *
     * @param l    lista esistente e correttamente formata
     * @return     head(e.l) = e
     */
     int head();
    
    /**
     * Metodo:
     * restituisce la 'coda' della lista
     * Esercizio: correggere le specifiche!
     *
     * @param l    lista esistente e correttamente formata
     * @return     tail(e.l) = l
     */
    Lista tail();
    
    /**
     * Metodo:
     * aggiunge un nuovo elemento in testa alla lista
     *
     * @param e    nuovo elemento della lista
     * @return     la lista modificata \egrave cons(e,l) = (e.l)
     */
    void add(int e);
    
    /**
     * Metodo:
     * ... (descrizione)
     */
    String toString();

}
