package geometria; // Dichiarazione del pacchetto

/**
 * Questa e' la classe che rappresenta un cerchio.
 * 
 * <p>Ecco un esempio di come utilizzare il tag {@code @code}:</p>
 *
 * FAI ESEMPIO
 * 
 */
public class Cerchio extends Figura {

	/**
	 * PERCHE SE TOLGO IL COMMENTO JAVADOC QUI NON HO UN ERRORE????
	 * 
	 */
    @Override
    public void disegna() {
        System.out.println("Disegno un cerchio.");
    }
    
    /**
     * Questo metodo esegue un'operazione specifica.
     *
     * QUALE TAG DEVO USARE????????
     */
    @Deprecated
    public void oldMethod() {
        // Implementazione del metodo
    }

    /**
     * Questo e' un nuovo metodo aggiunto per sostituire oldMethod.
     */
    public void newMethod() {
        // Implementazione del nuovo metodo
    }
}