package HolaMundoRI;

public class sobreN {
    private int n;

    public sobreN(int n){
        setN(n);
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
        for (double i = 1; i <= n; i++) {
                imp+=1/i ;
            
        }
        System.out.println(imp);
    }

    //Modo Recursivo
   

    public double sobRe(double n){
        if (n==1) {
          return 1;
        }else {
                       
            return sobRe(n-1)+(1/n);
        }
    }
}
