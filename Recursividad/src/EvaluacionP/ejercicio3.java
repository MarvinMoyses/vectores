package EvaluacionP;



public class ejercicio3 {
    private int n;
    private int a;
    private double c;

    public ejercicio3(int n){
        setN(n);
        a=2;
        c=2;
    }

    public void setN(int n){
        this.n = n >= 0 ? n : 1;
    }

    public int getN(){
        return n;
    }

    // MODO ITERATIVO
    public void sobI(){
        double imp=0;
        double a=1, cs=1, b=2, c=2;
        for (double i = 1; i <= n; i++) {
            cs=cs*b;
            a=a*c;
            c=a;
            imp+=c/cs;
        }
        System.out.println(c +" / "+ cs +" resul  "+ imp);
    }

    //Modo Recursivo
   

    public double sobRe(double n){
        if (n==1) {
          return 1;
        }else {
        a*=2;
        c= Math.pow(c,2);
        return c/a +sobRe(n-1);
        }
    }
}
