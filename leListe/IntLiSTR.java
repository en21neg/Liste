
/**
 * La classe definisce la struttura interna delle liste di interi 
 * come sequenza dinamica di nodi.
 * 
 * <p>Nella definizione di questa classe
 * si adopera uno stile progettuale prevalentemente imperativo!
 * tale scelta sara' discussa in aula ...
 * </p>
 * 
 * <h2> Esercizio </h2>
 * <p> Controllare (e completare quando serve) specifiche e codice; 
 * aggiungere se necessario algoritmi utili </p>
 *  
 *  Alcuni esercizi sono risolti ...
 * 
 * @author AMPRG2017
 * @version (revisione 2019-05)
 */
class IntLiSTR
{
    /**
     *  Variabili di istanza:
     *  il modificatore 'protected' rende accessibili a tutte le classi 
     *  definite nello stesso pacchetto
     */
    protected int elemento;         // valore del noto
    protected IntLiSTR prossimo;    // puntatore al nodo successivo

    /**
     * COSTRUTTORI
     */

    //    Un costruttore (di default) da evitare! 
    //    public IntLiSTR()
    //     {
    //         elemento = 0;
    //         prossimo =null;
    //     }
    // 
    
    protected IntLiSTR(int n)
    {
        elemento = n;
        prossimo = null;
    }

    protected IntLiSTR(int e, IntLiSTR p)
    {
        elemento = e;
        prossimo = p;
    }
    

    /**
     * METODI STATICI, ovvero DI CLASSE
     */
    
    /**
     * Metodo di test (di classe):
     *
     * @param    n nodo
     * @return     true sse lista collegata e' vuota
     */
    protected static boolean isEmpty(IntLiSTR n)
    {
        return n==null;
    }


    /**
     * Metodo selettore (di classe):
     *
     * @param    n nodo, non nullo
     * @return     il valore contenuto nel nodo
     */
    protected static int head(IntLiSTR n)
    {
        return n.elemento;
    }

    /**
     * Metodo selettore (di classe).
     * ma che succede al nodo di testa?
     *
     * @param    n nodo, non nullo
     * @return     il puntatore al prossimo nodo
     */
    protected static IntLiSTR tail(IntLiSTR n)
    {
        return n.prossimo;
    }

    /**
     * Metodo 'costruttore' (di classe):
     *
     * @param    e elemento
     * @param    b nodo
     * @return     nuovo nodo (a.b)
     */
    protected static IntLiSTR cons(int a, IntLiSTR b)
    {
        IntLiSTR n = new IntLiSTR(a,b);
        return n;
    }

    /**
     * Metodo (di classe): la lunghezza della catena di nodi
     *
     * @param  p   nodo
     * @return     numero di nodi collegati a p (compreso)
     */
    protected static int length(IntLiSTR p)
    {
        if (!isEmpty(p)){
            return (1+length(tail(p)));
            
        }
        return -1;
    }

    /**
     * Metodo (di classe): la stringa che rappresenta la catena di nodi
     *
     * @param  p   nodo
     * @return     stringa ...
     */
    public static String toString(IntLiSTR p)
    {
        String s = "";
        if (!isEmpty(p)) {
            s += head(p)+toString(tail(p));
        }
        return s;
    }

    /**
     * Metodo (di classe): crea una copia identica e distinta (clone) la lista
     *
     * @param  p   nodo
     * @return     lista clonata
     */
    public static IntLiSTR clone(IntLiSTR p)
    {
        // codice DA SCRIVERE!
        return null;
    }

    /**
     * Metodo (di classe): inserimento ordinato ricorsivo
     * 
     * Esercizio: Scrivere specifiche e codice
     */
    public static IntLiSTR insert(IntLiSTR p, int e)
    {
        // DA SCRIVERE!
        return null;
    }

    /**
     * Metodo (di classe): inserimento ordinato iterativo
     * 
     * Esercizio: 
     * - scrivere le specifiche
     * - verificare la correttezza
     */
    public static IntLiSTR iInsert(IntLiSTR p, int e)
    {
        IntLiSTR l = p;
        if (l == null) l = cons(e,null);
        else {
            while (e>head(p)){
                p = p.prossimo;
            }
            p = cons(e,p);
        }
        return l;
    }

    /**
     * Rovesciare una lista su un'altra
     * 
     * Esercizio:
     * - completare le specifiche
     * - dimostrare la correttezza
     * - confrontare e discutere con l'algoritmo proposto a lezione
     *
     * @param  s  (source) lista da rovesciare
     * @param  t  (target) lista "ricevente"     
     * @return    il risultato (da precisare)
     */
    public static IntLiSTR reverse(IntLiSTR s, IntLiSTR t)
    {
        if (!isEmpty(s)) {
            t = reverse(tail(s), cons(head(s),t));
        }
        return t;
    }

}
