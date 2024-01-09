package geometria;

/**
 * Questa e' la classe base per le forme geometriche.
 */
public class Figura {

    /**
     * Metodo di disegno generico per la classe Figura.
     */
    public void disegna() {
        System.out.println("Disegno una forma generica.");
    }
    
    public int divide(int dividend, int divisor) throws ArithmeticException, IllegalArgumentException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisione per zero non consentita");
        }

        if (dividend < 0 || divisor < 0) {
            throw new IllegalArgumentException("I parametri devono essere positivi");
        }

        return dividend / divisor;
    }
}
