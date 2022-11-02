package HolaMundoRI;

import ejemplo1.factorial;

public class divicion {
    private int n;
    private factorial objFact;
    private double e;

    

    public divicion(int n) {
        setN(n);
        e=1;
        objFact = new factorial(n);
    }

    public void setN(int n) {
        this.n = (n >= 1) ? n : 1;
    }

    public int getN() {
        return n;
    }
    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }
    // METODO ITERATIVO
    // public double Calcular(){
    // double z=0;

    // for (int i = 1; i <= n; i++) {
    // z+=1/fact(i);
    // }

    // return z;
    // }
    // private long fact(int n){
    // int fact=1;
    // for (int i = 1; i <= n; i++) {
    // fact*=i;
    // }
    // return fact;
    // }

    // * OTRA FORMA MODO "ITERATIVO"
    public double Calcular2() {
        double z = 0;

        for (double i = 1; i <= n; i++) {
            objFact.setX(i);
            z += i / objFact.FactIterativo();
        }
        return z;
    }

    // MODO RECURSIVO
    public double Division_R() {
        return suma(n);
    }

    private double suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            objFact.setX(n);
            e+= n / objFact.FactIterativo();
            suma(n-1);

            return e;
        }
    }

}
