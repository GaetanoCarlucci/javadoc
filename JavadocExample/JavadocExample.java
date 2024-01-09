package JavadocExample;

import geometria.*; // Importa la classe Figura dalla sottocartella "geometria"

/**
 * Questa e' la classe principale dell'esempio.
 *
 */
public class JavadocExample {
    /**
     * Il metodo principale dell'applicazione.
     * 
     * Se vuoi visalizzare dettagli sulla metodo disegna della classe Rettangolo clicca qui 
     * {USA IL TAG LINK OPPORTUNAMENTE disegna}
     * 
     * USA IL TAG SEE PER INSERIRE UN COLLEGAMENTE AL SITO https://docs.oracle.com/en/java/ con tag html opportuni  
     *
     */
    public static void main(String[] args) {
        /**
         * ?
         */
        Figura[] figure = new Figura[3];

        // Istanziazione delle tre classi
        figure[0] = new geometria.Triangolo(); // Usa il percorso completo per le classi dalla sottocartella
        figure[1] = new geometria.Rettangolo();
        figure[2] = new geometria.Cerchio();

        // Chiamata ai metodi di disegno per ciascuna figura nell'array
        for (int i=0; i < figure.length; i++) {
            figure[i].disegna();
        }
    }
}