package geometria; // Dichiarazione del pacchetto

/**
 * Questa e' la classe che rappresenta un triangolo.
 * 
 */
public class Triangolo extends Figura {
    /**
     * Sovrascrittura del metodo di disegno per il triangolo.
     */
    @Override
    public void disegna() {
        System.out.println("Disegno un triangolo.");
    }
    
    public int calcolaMassimo(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    
    public int calcolaMinimo(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("L'array non deve essere null o vuoto.");
        }

        int minimo = numeri[0];
        for (int num : numeri) {
            if (num < minimo) {
                minimo = num;
            }
        }
        return minimo;
    }
    
   public void bubbleSort(int[] array) {
       if (array == null) {
           throw new IllegalArgumentException("L'array non deve essere null.");
       }

       int n = array.length;
       boolean scambiato;
       do {
           scambiato = false;
           for (int i = 1; i < n; i++) {
               if (array[i - 1] > array[i]) {
                   // scambia array[i - 1] con array[i]
                   int temp = array[i - 1];
                   array[i - 1] = array[i];
                   array[i] = temp;

                   scambiato = true;
               }
           }
           // Dopo ogni passaggio, il prossimo elemento più grande si trova nella sua posizione finale
           n--;
       } while (scambiato);
   }
}