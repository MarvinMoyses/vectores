package HolaMundoRI;

public class sucecion {
    private int n;

    public sucecion(int n) {
        setN(n);
    }

    public void setN(int n){
        this.n = n<0?1:n;
    }

    public int getN(){
        return n;
    }

    // MODO ITERATIVO
    public String SucI(){
        String m="";
        for (int i = 1; i <= n; i++) {
            m+=i+"\n";
        }
        return m;
    }

    // MODO RECURSIVO
    public void SucR(){
        SucR(n);
    }

    private void SucR(int n){
        if (n>0) {
            System.out.println(n);
            SucR(n-1);
            
        }
    }
}
