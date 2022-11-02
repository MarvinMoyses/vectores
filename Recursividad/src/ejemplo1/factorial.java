package ejemplo1;

public class factorial {
    private double x;

    public factorial(double x) {
        setX(x);
    }

    public void setX(double x){
        this.x = x<0?0:x;
    }

    public double getX(){
        return x;
    }

    // METODO ITERATIVO
    public double FactIterativo(){
        double fact=1;
        for (double i = 1; i <= x; i++) {
            fact*=i;
        }
        return fact;
    }


    // METODO RECURSIVO
    public double factRecursivo(){
        return fact(x);
    }

    private double fact(double n){
        if (n == 1 || n==0) {
            // Caso Base
            return 1;
        }else{
            // Caso General
            return n*fact(n-1);
        }
    }

    @Override
    public String toString() {
        return "El valor de n es: "+x;
    }
}
