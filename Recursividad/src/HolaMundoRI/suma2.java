package HolaMundoRI;

public class suma2 {
    private int n;

    public suma2(int n) {
        setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n >= 1) ? n : 1;
    }

    // MODO ITERATIVO
    public double suma_I() {
        double result = 0;
        while (n > 0) {
            result += n;
            n--;
        }
        return result;
    }

    // MODO RECURSIVO
    public double suma_R() {
        return suma(n);
    }

    private double suma(int n) {
        if (n > 0) {
            return n + suma(n - 1);
        } else {
            return n;
        }
    }
}
